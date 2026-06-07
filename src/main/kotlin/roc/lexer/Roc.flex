package org.roc.community.lexer.roc;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import org.roc.community.roc.psi.RocTypes;
import com.intellij.psi.TokenType;

%%

%class RocLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{ return;
%eof}

// Whitespaces
EOL_WS           = \n | \r | \r\n
LINE_WS          = [\ \t]
WHITE_SPACE_CHAR = {EOL_WS} | {LINE_WS}
WHITE_SPACE      = {WHITE_SPACE_CHAR}+

// Identifiers
LOWER_IDENT = [a-z][a-zA-Z0-9_!]*
UPPER_IDENT = [A-Z][a-zA-Z0-9_!]*
// Represents roc-lang/roc/src/parse/tokenize.zig#valid_number_suffixes
SUFFIX     = {IDENTIFIER}

// Literals

EXPONENT      = [eE] [-+]? [0-9_]+

INT_LITERAL = ( {DEC_LITERAL}
              | {HEX_LITERAL}
              | {OCT_LITERAL}
              | {BIN_LITERAL} ) {EXPONENT}? {SUFFIX}?
DEC_LITERAL = [0-9] [0-9_]*
HEX_LITERAL = "0x" [a-fA-F0-9_]*
OCT_LITERAL = "0o" [0-7_]*
BIN_LITERAL = "0b" [01_]*
FLOAT_LITERAL = [0-9_]+ \. [0-9_]+ {EXPONENT}?
%%


"{"                 { return LBRACE; }
"}"                 { return RBRACE; }
"("                 { return LPAREN; }
")"                 { return RPAREN; }
"["                 { return LBRACK; }
"]"                 { return RBRACK; }

// Taken from roc-lang/roc/src/parse/tokenize.zig#keywords
"and"               { return AND; }
"app"               { return APP; }
"as"                { return AS; }
"crash"             { return CRASH; }
"dbg"               { return DBG; }
"else"              { return ELSE; }
"expect"            { return EXPECT; }
"exposes"           { return EXPOSES; }
"exposing"          { return EXPOSING; }
"for"               { return FOR; }
"generates"         { return GENERATES; }
"has"               { return HAS; }
"hosted"            { return HOSTED; }
"if"                { return IF; }
"implements"        { return IMPLEMENTS; }
"import"            { return IMPORT; }
"imports"           { return IMPORTS; }
"in"                { return IN; }
"interface"         { return INTERFACE; }
"match"             { return MATCH; }
"module"            { return MODULE; }
"or"                { return OR; }
"package"           { return PACKAGE; }
"packages"          { return PACKAGES; }
"platform"          { return PLATFORM; }
"provides"          { return PROVIDES; }
"requires"          { return REQUIRES; }
"return"            { return RETURN; }
"targets"           { return TARGETS; }
"var"               { return VAR; }
"where"             { return WHERE; }
"while"             { return WHILE; }
"with"              { return WITH; }
"break"             { return BREAK; }


// TODO: Identifier after keywords

{WHITE_SPACE}       { return TokenType.WHITE_SPACE; }
"" [<\R]*           { return COMMENT; }
[^]                 { return TokenType.BAD_CHARACTER; }