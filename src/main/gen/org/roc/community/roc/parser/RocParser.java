// This is a generated file. Not intended for manual editing.
package org.roc.community.roc.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static org.roc.community.roc.psi.RocTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class RocParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return root(b, l + 1);
  }

  /* ********************************************************** */
  // LBRACE | RBRACE | LPAREN | NO_SPACE_LPAREN | RPAREN | LBRACK | RBRACK | COMMA
  //     | OP_ARROW | OP_FAT_ARROW | OP_PIZZA | OP_ASSIGN | OP_EQUALS | OP_COLON
  //     | OP_COLON_EQUAL | OP_DOUBLE_COLON | OP_NOT_EQUALS | OP_BANG | OP_AMPERSAND
  //     | OP_DOUBLE_QUESTION | OP_QUESTION | NO_SPACE_OP_QUESTION | OP_BAR | OP_PLUS
  //     | OP_STAR | OP_DOUBLE_SLASH | OP_SLASH | OP_BACKSLASH | OP_PERCENT | OP_CARET
  //     | OP_GREATER_THAN_OR_EQ | OP_GREATER_THAN | OP_LESS_THAN_OR_EQ | OP_BACK_ARROW
  //     | OP_LESS_THAN | OP_BINARY_MINUS | OP_UNARY_MINUS
  //     | DOT | DOUBLE_DOT | TRIPLE_DOT | DOT_STAR | DOT_INT | DOT_LOWER_IDENT
  //     | DOT_UPPER_IDENT | NO_SPACE_DOT_INT | NO_SPACE_DOT_LOWER_IDENT
  //     | NO_SPACE_DOT_UPPER_IDENT
  //     | LOWER_IDENT | UPPER_IDENT | INT | FLOAT | SINGLE_QUOTE | UNDERSCORE
  //     | NAMED_UNDERSCORE | OPAQUE_NAME
  //     | STRING_START | STRING_END | STRING_PART | MULTILINE_STRING_START
  //     | OPEN_STRING_INTERPOLATION | CLOSE_STRING_INTERPOLATION
  //     | COMMENT
  //     | AND | APP | AS | CRASH | DBG | ELSE | EXPECT | EXPOSES | EXPOSING | FOR
  //     | GENERATES | HAS | HOSTED | IF | IMPLEMENTS | IMPORT | IMPORTS | IN
  //     | INTERFACE | MATCH | MODULE | OR | PACKAGE | PACKAGES | PLATFORM
  //     | PROVIDES | REQUIRES | RETURN | TARGETS | VAR | WHERE | WHILE | WITH | BREAK
  static boolean anyToken(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anyToken")) return false;
    boolean r;
    r = consumeToken(b, LBRACE);
    if (!r) r = consumeToken(b, RBRACE);
    if (!r) r = consumeToken(b, LPAREN);
    if (!r) r = consumeToken(b, NO_SPACE_LPAREN);
    if (!r) r = consumeToken(b, RPAREN);
    if (!r) r = consumeToken(b, LBRACK);
    if (!r) r = consumeToken(b, RBRACK);
    if (!r) r = consumeToken(b, COMMA);
    if (!r) r = consumeToken(b, OP_ARROW);
    if (!r) r = consumeToken(b, OP_FAT_ARROW);
    if (!r) r = consumeToken(b, OP_PIZZA);
    if (!r) r = consumeToken(b, OP_ASSIGN);
    if (!r) r = consumeToken(b, OP_EQUALS);
    if (!r) r = consumeToken(b, OP_COLON);
    if (!r) r = consumeToken(b, OP_COLON_EQUAL);
    if (!r) r = consumeToken(b, OP_DOUBLE_COLON);
    if (!r) r = consumeToken(b, OP_NOT_EQUALS);
    if (!r) r = consumeToken(b, OP_BANG);
    if (!r) r = consumeToken(b, OP_AMPERSAND);
    if (!r) r = consumeToken(b, OP_DOUBLE_QUESTION);
    if (!r) r = consumeToken(b, OP_QUESTION);
    if (!r) r = consumeToken(b, NO_SPACE_OP_QUESTION);
    if (!r) r = consumeToken(b, OP_BAR);
    if (!r) r = consumeToken(b, OP_PLUS);
    if (!r) r = consumeToken(b, OP_STAR);
    if (!r) r = consumeToken(b, OP_DOUBLE_SLASH);
    if (!r) r = consumeToken(b, OP_SLASH);
    if (!r) r = consumeToken(b, OP_BACKSLASH);
    if (!r) r = consumeToken(b, OP_PERCENT);
    if (!r) r = consumeToken(b, OP_CARET);
    if (!r) r = consumeToken(b, OP_GREATER_THAN_OR_EQ);
    if (!r) r = consumeToken(b, OP_GREATER_THAN);
    if (!r) r = consumeToken(b, OP_LESS_THAN_OR_EQ);
    if (!r) r = consumeToken(b, OP_BACK_ARROW);
    if (!r) r = consumeToken(b, OP_LESS_THAN);
    if (!r) r = consumeToken(b, OP_BINARY_MINUS);
    if (!r) r = consumeToken(b, OP_UNARY_MINUS);
    if (!r) r = consumeToken(b, DOT);
    if (!r) r = consumeToken(b, DOUBLE_DOT);
    if (!r) r = consumeToken(b, TRIPLE_DOT);
    if (!r) r = consumeToken(b, DOT_STAR);
    if (!r) r = consumeToken(b, DOT_INT);
    if (!r) r = consumeToken(b, DOT_LOWER_IDENT);
    if (!r) r = consumeToken(b, DOT_UPPER_IDENT);
    if (!r) r = consumeToken(b, NO_SPACE_DOT_INT);
    if (!r) r = consumeToken(b, NO_SPACE_DOT_LOWER_IDENT);
    if (!r) r = consumeToken(b, NO_SPACE_DOT_UPPER_IDENT);
    if (!r) r = consumeToken(b, LOWER_IDENT);
    if (!r) r = consumeToken(b, UPPER_IDENT);
    if (!r) r = consumeToken(b, INT);
    if (!r) r = consumeToken(b, FLOAT);
    if (!r) r = consumeToken(b, SINGLE_QUOTE);
    if (!r) r = consumeToken(b, UNDERSCORE);
    if (!r) r = consumeToken(b, NAMED_UNDERSCORE);
    if (!r) r = consumeToken(b, OPAQUE_NAME);
    if (!r) r = consumeToken(b, STRING_START);
    if (!r) r = consumeToken(b, STRING_END);
    if (!r) r = consumeToken(b, STRING_PART);
    if (!r) r = consumeToken(b, MULTILINE_STRING_START);
    if (!r) r = consumeToken(b, OPEN_STRING_INTERPOLATION);
    if (!r) r = consumeToken(b, CLOSE_STRING_INTERPOLATION);
    if (!r) r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, AND);
    if (!r) r = consumeToken(b, APP);
    if (!r) r = consumeToken(b, AS);
    if (!r) r = consumeToken(b, CRASH);
    if (!r) r = consumeToken(b, DBG);
    if (!r) r = consumeToken(b, ELSE);
    if (!r) r = consumeToken(b, EXPECT);
    if (!r) r = consumeToken(b, EXPOSES);
    if (!r) r = consumeToken(b, EXPOSING);
    if (!r) r = consumeToken(b, FOR);
    if (!r) r = consumeToken(b, GENERATES);
    if (!r) r = consumeToken(b, HAS);
    if (!r) r = consumeToken(b, HOSTED);
    if (!r) r = consumeToken(b, IF);
    if (!r) r = consumeToken(b, IMPLEMENTS);
    if (!r) r = consumeToken(b, IMPORT);
    if (!r) r = consumeToken(b, IMPORTS);
    if (!r) r = consumeToken(b, IN);
    if (!r) r = consumeToken(b, INTERFACE);
    if (!r) r = consumeToken(b, MATCH);
    if (!r) r = consumeToken(b, MODULE);
    if (!r) r = consumeToken(b, OR);
    if (!r) r = consumeToken(b, PACKAGE);
    if (!r) r = consumeToken(b, PACKAGES);
    if (!r) r = consumeToken(b, PLATFORM);
    if (!r) r = consumeToken(b, PROVIDES);
    if (!r) r = consumeToken(b, REQUIRES);
    if (!r) r = consumeToken(b, RETURN);
    if (!r) r = consumeToken(b, TARGETS);
    if (!r) r = consumeToken(b, VAR);
    if (!r) r = consumeToken(b, WHERE);
    if (!r) r = consumeToken(b, WHILE);
    if (!r) r = consumeToken(b, WITH);
    if (!r) r = consumeToken(b, BREAK);
    return r;
  }

  /* ********************************************************** */
  // anyToken*
  static boolean root(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root")) return false;
    while (true) {
      int c = current_position_(b);
      if (!anyToken(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "root", c)) break;
    }
    return true;
  }

}
