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
  // OP_ARROW | LBRACE | RBRACE | LPAREN | RPAREN | LBRACK | RBRACK | COMMENT
  //     | AND | APP | AS | CRASH | DBG | ELSE | EXPECT | EXPOSES | EXPOSING | FOR
  //     | GENERATES | HAS | HOSTED | IF | IMPLEMENTS | IMPORT | IMPORTS | IN
  //     | INTERFACE | MATCH | MODULE | OR | PACKAGE | PACKAGES | PLATFORM
  //     | PROVIDES | REQUIRES | RETURN | TARGETS | VAR | WHERE | WHILE | WITH | BREAK
  static boolean anyToken(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anyToken")) return false;
    boolean r;
    r = consumeToken(b, OP_ARROW);
    if (!r) r = consumeToken(b, LBRACE);
    if (!r) r = consumeToken(b, RBRACE);
    if (!r) r = consumeToken(b, LPAREN);
    if (!r) r = consumeToken(b, RPAREN);
    if (!r) r = consumeToken(b, LBRACK);
    if (!r) r = consumeToken(b, RBRACK);
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
