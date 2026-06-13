package org.roc.community.roc.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import static org.roc.community.roc.psi.RocTypes.*;

%%

%class RocLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType

%{
  // --- Whitespace-sensitivity & previous-token tracking (mirrors tokenize.zig sawWhitespace / lastTokenTag) ---
  // True if the token we are about to read was immediately preceded by whitespace,
  // a comment, a newline, or the start of file
  private boolean sawSpace = true;
  // The last *real* (non-trivia) token returned
  private IElementType lastToken = null;

  // --- String-interpolation stack (mirrors tokenize.zig string_interpolation_stack, plus Kotlin-style brace depth) ---
  // Each entry is one of: STR_SINGLE / STR_MULTI for an open `${`, or BRACE for a `{` opened inside an interpolation.
  private static final int STR_SINGLE = 0;
  private static final int STR_MULTI  = 1;
  private static final int BRACE      = 2;
  private final java.util.ArrayDeque<Integer> interpStack = new java.util.ArrayDeque<>();

  // TODO(incremental-lexing): sawSpace / lastToken / interpStack are NOT saved or
  // restored across IntelliJ's incremental relex — FlexAdapter persists only
  // yystate(). A relex that restarts mid-stream can mis-pick a NO_SPACE_* / minus
  // variant near the edit, and deep interpolation nesting isn't perfectly
  // restartable. Self-heals for highlighting; revisit if it becomes visible.
  // Possible fixes:
  //   1. Encode sawSpace into dedicated JFlex states (e.g. AFTER_SPACE vs
  //      AFTER_TOKEN) so it rides inside yystate() and is saved automatically.
  //   2. Replace FlexAdapter with a custom restartable Lexer that snapshots these
  //      fields into its saved state (how Kotlin's lexer handles template nesting).
  //   3. Move the whitespace-sensitive decisions to the parser via PsiBuilder
  //      rawLookup predicates (the OP_MINUS / single-LPAREN alternative we weighed).

  // Return a real token: record it and clear the "saw space" flag.
  private IElementType tok(IElementType type) { lastToken = type; sawSpace = false; return type; }
  // Return trivia (whitespace/comment): mark that the next token is preceded by space,
  // but do NOT touch lastToken (Roc's minus looks at the last *real* token, not whitespace).
  private IElementType trivia(IElementType type) { sawSpace = true; return type; }

  // Peek the input char just after the current match (uses JFlex internals).
  private char peekChar() { return zzMarkedPos < zzEndRead ? zzBuffer.charAt(zzMarkedPos) : '\0'; }

  // tokenize.zig:322 canEndExpression — if the previous token can end an expression,
  // a following `-` with no leading space is binary (x-1), otherwise unary.
  private boolean prevCanEndExpr() {
    IElementType t = lastToken;
    return t == LOWER_IDENT || t == UPPER_IDENT || t == INT || t == FLOAT
        || t == RPAREN || t == RBRACK || t == RBRACE
        || t == STRING_END || t == SINGLE_QUOTE
        || t == DOT_INT || t == DOT_LOWER_IDENT || t == DOT_UPPER_IDENT
        || t == NO_SPACE_DOT_INT || t == NO_SPACE_DOT_LOWER_IDENT || t == NO_SPACE_DOT_UPPER_IDENT
        || t == NAMED_UNDERSCORE || t == OPAQUE_NAME || t == CLOSE_STRING_INTERPOLATION;
  }

  // tokenize.zig:1252 minus handling, with the sign kept as a separate token (the
  // number is lexed independently — cleaner for an IntelliJ parser).
  private IElementType minusType() {
    char n = peekChar();
    if (n == '\0' || n == ' ' || n == '\t' || n == '\n' || n == '\r' || n == '#') return OP_BINARY_MINUS;
    if (n >= '0' && n <= '9') return (!sawSpace && prevCanEndExpr()) ? OP_BINARY_MINUS : OP_UNARY_MINUS;
    if ((n >= 'a' && n <= 'z') || (n >= 'A' && n <= 'Z') || n == '_' || n == '(' || n >= 0x80) return OP_UNARY_MINUS;
    return OP_BINARY_MINUS;
  }

  // tokenize.zig:1453 close_curly — a `}` may close a record/lambda OR an interpolation.
  private IElementType closeCurly() {
    if (!interpStack.isEmpty()) {
      int top = interpStack.pop();
      if (top == BRACE) return tok(RBRACE);                 // inner record/lambda brace
      yybegin(top == STR_MULTI ? IN_MULTILINE_STRING : IN_STRING);
      return tok(CLOSE_STRING_INTERPOLATION);               // closes the `${ ... }`
    }
    return tok(RBRACE);
  }
%}

// ---- whitespace / comment ----
LINE_WS      = [ \t\f]
EOL          = \r\n | \n | \r
WHITE_SPACE  = ({LINE_WS} | {EOL})+
LINE_COMMENT = "#" [^\r\n]*

// ---- identifiers (Roc idents allow ! and $; tokenize.zig:838) ----
LOWER_IDENT_M = [a-z][a-zA-Z0-9_!$]*
UPPER_IDENT_M = [A-Z][a-zA-Z0-9_!$]*

// ---- numbers (tokenize.zig:605) ----
DEC_DIGITS    = [0-9][0-9_]*
HEX_LITERAL   = "0x" [0-9a-fA-F_]+
OCT_LITERAL   = "0o" [0-7_]+
BIN_LITERAL   = "0b" [01_]+
EXPONENT      = [eE] [-+]? [0-9_]+
NUM_SUFFIX    = [a-zA-Z][a-zA-Z0-9]*
INT_LITERAL   = {HEX_LITERAL} | {OCT_LITERAL} | {BIN_LITERAL} | {DEC_DIGITS}
// A decimal is a Float when it has a fractional part (digit required after the dot) or an exponent.
FLOAT_LITERAL = {DEC_DIGITS} ( "." [0-9][0-9_]* {EXPONENT}? | {EXPONENT} )

// ---- char literal (tokenize.zig:954) ----
ESCAPE        = "\\" ( "u(" [0-9a-fA-F]+ ")" | [^\n] )
CHAR_LITERAL  = "'" ( {ESCAPE} | [^'\\\n] ) "'"

// String bodies are exclusive states so YYINITIAL operator rules don't leak in.
%xstate IN_STRING, IN_MULTILINE_STRING

%%

<YYINITIAL> {
  {WHITE_SPACE}        { return trivia(TokenType.WHITE_SPACE); }
  {LINE_COMMENT}       { return trivia(COMMENT); }

  // string / multiline-string openers (longest match picks """ over ", and \\ over \)
  \"\"\"               { yybegin(IN_MULTILINE_STRING); return tok(MULTILINE_STRING_START); }
  \\\\                 { yybegin(IN_MULTILINE_STRING); return tok(MULTILINE_STRING_START); }
  \"                   { yybegin(IN_STRING);           return tok(STRING_START); }

  {CHAR_LITERAL}       { return tok(SINGLE_QUOTE); }

  // numbers — FLOAT before INT (no tie; longest match handles 1.5 vs 1)
  {FLOAT_LITERAL}{NUM_SUFFIX}?  { return tok(FLOAT); }
  {INT_LITERAL}{NUM_SUFFIX}?    { return tok(INT); }

  // brackets / punctuation
  "{"                  { if (!interpStack.isEmpty()) interpStack.push(BRACE); return tok(LBRACE); }
  "}"                  { return closeCurly(); }
  "("                  { return tok(sawSpace ? LPAREN : NO_SPACE_LPAREN); }
  ")"                  { return tok(RPAREN); }
  "["                  { return tok(LBRACK); }
  "]"                  { return tok(RBRACK); }
  ","                  { return tok(COMMA); }

  // dot family — longest first
  "..."                { return tok(TRIPLE_DOT); }
  ".."                 { return tok(DOUBLE_DOT); }
  ".*"                 { return tok(DOT_STAR); }
  "."{LOWER_IDENT_M}   { return tok(sawSpace ? DOT_LOWER_IDENT : NO_SPACE_DOT_LOWER_IDENT); }
  "."{UPPER_IDENT_M}   { return tok(sawSpace ? DOT_UPPER_IDENT : NO_SPACE_DOT_UPPER_IDENT); }
  "."[0-9]+            { return tok(sawSpace ? DOT_INT : NO_SPACE_DOT_INT); }
  "."                  { return tok(DOT); }

  // multi-char operators must precede their single-char prefixes
  "->"                 { return tok(OP_ARROW); }
  "=>"                 { return tok(OP_FAT_ARROW); }
  "=="                 { return tok(OP_EQUALS); }
  "="                  { return tok(OP_ASSIGN); }
  ":="                 { return tok(OP_COLON_EQUAL); }
  "::"                 { return tok(OP_DOUBLE_COLON); }
  ":"                  { return tok(OP_COLON); }
  "!="                 { return tok(OP_NOT_EQUALS); }
  "!"                  { return tok(OP_BANG); }
  "&"                  { return tok(OP_AMPERSAND); }
  "??"                 { return tok(OP_DOUBLE_QUESTION); }
  "?"                  { return tok(sawSpace ? OP_QUESTION : NO_SPACE_OP_QUESTION); }
  "|>"                 { return tok(OP_PIZZA); }
  "|"                  { return tok(OP_BAR); }
  "+"                  { return tok(OP_PLUS); }
  "*"                  { return tok(OP_STAR); }
  "//"                 { return tok(OP_DOUBLE_SLASH); }
  "/"                  { return tok(OP_SLASH); }
  "\\"                 { return tok(OP_BACKSLASH); }
  "%"                  { return tok(OP_PERCENT); }
  "^"                  { return tok(OP_CARET); }
  ">="                 { return tok(OP_GREATER_THAN_OR_EQ); }
  ">"                  { return tok(OP_GREATER_THAN); }
  "<="                 { return tok(OP_LESS_THAN_OR_EQ); }
  "<-"                 { return tok(OP_BACK_ARROW); }
  "<"                  { return tok(OP_LESS_THAN); }
  "-"                  { return tok(minusType()); }

  // keywords BEFORE the identifier rule (ties resolve to the earlier rule;
  // a longer ident like `apple` still beats `app` by longest match). and/or are operators in Roc.
  "and"                { return tok(AND); }
  "or"                 { return tok(OR); }
  "app"                { return tok(APP); }
  "as"                 { return tok(AS); }
  "crash"              { return tok(CRASH); }
  "dbg"                { return tok(DBG); }
  "else"               { return tok(ELSE); }
  "expect"             { return tok(EXPECT); }
  "exposes"            { return tok(EXPOSES); }
  "exposing"           { return tok(EXPOSING); }
  "for"                { return tok(FOR); }
  "generates"          { return tok(GENERATES); }
  "has"                { return tok(HAS); }
  "hosted"             { return tok(HOSTED); }
  "if"                 { return tok(IF); }
  "implements"         { return tok(IMPLEMENTS); }
  "import"             { return tok(IMPORT); }
  "imports"            { return tok(IMPORTS); }
  "in"                 { return tok(IN); }
  "interface"          { return tok(INTERFACE); }
  "match"              { return tok(MATCH); }
  "module"             { return tok(MODULE); }
  "package"            { return tok(PACKAGE); }
  "packages"           { return tok(PACKAGES); }
  "platform"           { return tok(PLATFORM); }
  "provides"           { return tok(PROVIDES); }
  "requires"           { return tok(REQUIRES); }
  "return"             { return tok(RETURN); }
  "targets"            { return tok(TARGETS); }
  "var"                { return tok(VAR); }
  "where"              { return tok(WHERE); }
  "while"              { return tok(WHILE); }
  "with"               { return tok(WITH); }
  "break"              { return tok(BREAK); }

  // identifiers (+ the `$name` reusable-ident form, tokenize.zig:1509)
  {LOWER_IDENT_M}      { return tok(LOWER_IDENT); }
  {UPPER_IDENT_M}      { return tok(UPPER_IDENT); }
  "$"{LOWER_IDENT_M}   { return tok(LOWER_IDENT); }
  "$"{UPPER_IDENT_M}   { return tok(UPPER_IDENT); }

  // underscore / opaque name
  "_"[a-zA-Z0-9][a-zA-Z0-9_!]*  { return tok(NAMED_UNDERSCORE); }
  "_"                  { return tok(UNDERSCORE); }
  "@"[a-zA-Z0-9_][a-zA-Z0-9_!]* { return tok(OPAQUE_NAME); }

  [^]                  { return tok(TokenType.BAD_CHARACTER); }
}

<IN_STRING> {
  \"                   { yybegin(YYINITIAL); return tok(STRING_END); }
  "${"                 { interpStack.push(STR_SINGLE); yybegin(YYINITIAL); return tok(OPEN_STRING_INTERPOLATION); }
  {EOL}                { yybegin(YYINITIAL); return trivia(TokenType.WHITE_SPACE); }  // unclosed; line ends it
  "\\"[^\n]            { return tok(STRING_PART); }     // escape sequence
  [^\"\\\n$]+          { return tok(STRING_PART); }     // run of plain chars
  [^]                  { return tok(STRING_PART); }     // lone $ or dangling backslash
}

<IN_MULTILINE_STRING> {
  // Roc multiline strings are line-oriented: """ / \\ open a line that runs to EOL,
  // and consecutive lines are stitched by the parser (tokenize.zig:1641 never closes on ").
  "${"                 { interpStack.push(STR_MULTI); yybegin(YYINITIAL); return tok(OPEN_STRING_INTERPOLATION); }
  {EOL}                { yybegin(YYINITIAL); return trivia(TokenType.WHITE_SPACE); }
  "\\"[^\n]            { return tok(STRING_PART); }
  [^\n$]+              { return tok(STRING_PART); }
  [^]                  { return tok(STRING_PART); }
}
