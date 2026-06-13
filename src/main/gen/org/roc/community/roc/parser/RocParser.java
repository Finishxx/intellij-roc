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
  // APP provides packages
  public static boolean appHeader(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "appHeader")) return false;
    if (!nextTokenIs(b, APP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, APP);
    r = r && provides_$(b, l + 1);
    r = r && packages(b, l + 1);
    exit_section_(b, m, APP_HEADER, r);
    return r;
  }

  /* ********************************************************** */
  // LOWER_IDENT (AS LOWER_IDENT)?
  //                 | UPPER_IDENT (AS UPPER_IDENT | DOT_STAR)?
  public static boolean exposedItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exposedItem")) return false;
    if (!nextTokenIs(b, "<exposed item>", LOWER_IDENT, UPPER_IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPOSED_ITEM, "<exposed item>");
    r = exposedItem_0(b, l + 1);
    if (!r) r = exposedItem_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LOWER_IDENT (AS LOWER_IDENT)?
  private static boolean exposedItem_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exposedItem_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LOWER_IDENT);
    r = r && exposedItem_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (AS LOWER_IDENT)?
  private static boolean exposedItem_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exposedItem_0_1")) return false;
    exposedItem_0_1_0(b, l + 1);
    return true;
  }

  // AS LOWER_IDENT
  private static boolean exposedItem_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exposedItem_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, AS, LOWER_IDENT);
    exit_section_(b, m, null, r);
    return r;
  }

  // UPPER_IDENT (AS UPPER_IDENT | DOT_STAR)?
  private static boolean exposedItem_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exposedItem_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, UPPER_IDENT);
    r = r && exposedItem_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (AS UPPER_IDENT | DOT_STAR)?
  private static boolean exposedItem_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exposedItem_1_1")) return false;
    exposedItem_1_1_0(b, l + 1);
    return true;
  }

  // AS UPPER_IDENT | DOT_STAR
  private static boolean exposedItem_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exposedItem_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseTokens(b, 0, AS, UPPER_IDENT);
    if (!r) r = consumeToken(b, DOT_STAR);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // appHeader
  public static boolean header(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "header")) return false;
    if (!nextTokenIs(b, APP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = appHeader(b, l + 1);
    exit_section_(b, m, HEADER, r);
    return r;
  }

  /* ********************************************************** */
  // LOWER_IDENT OP_COLON PLATFORM? string
  public static boolean packageEntry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "packageEntry")) return false;
    if (!nextTokenIs(b, LOWER_IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LOWER_IDENT, OP_COLON);
    r = r && packageEntry_2(b, l + 1);
    r = r && string(b, l + 1);
    exit_section_(b, m, PACKAGE_ENTRY, r);
    return r;
  }

  // PLATFORM?
  private static boolean packageEntry_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "packageEntry_2")) return false;
    consumeToken(b, PLATFORM);
    return true;
  }

  /* ********************************************************** */
  // LBRACE (packageEntry (COMMA packageEntry)*)? RBRACE
  public static boolean packages(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "packages")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && packages_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, PACKAGES, r);
    return r;
  }

  // (packageEntry (COMMA packageEntry)*)?
  private static boolean packages_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "packages_1")) return false;
    packages_1_0(b, l + 1);
    return true;
  }

  // packageEntry (COMMA packageEntry)*
  private static boolean packages_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "packages_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = packageEntry(b, l + 1);
    r = r && packages_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA packageEntry)*
  private static boolean packages_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "packages_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!packages_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "packages_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA packageEntry
  private static boolean packages_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "packages_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && packageEntry(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LBRACK (exposedItem (COMMA exposedItem)*)? RBRACK
  public static boolean provides_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "provides_$")) return false;
    if (!nextTokenIs(b, LBRACK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACK);
    r = r && provides_1(b, l + 1);
    r = r && consumeToken(b, RBRACK);
    exit_section_(b, m, PROVIDES, r);
    return r;
  }

  // (exposedItem (COMMA exposedItem)*)?
  private static boolean provides_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "provides_1")) return false;
    provides_1_0(b, l + 1);
    return true;
  }

  // exposedItem (COMMA exposedItem)*
  private static boolean provides_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "provides_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exposedItem(b, l + 1);
    r = r && provides_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA exposedItem)*
  private static boolean provides_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "provides_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!provides_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "provides_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA exposedItem
  private static boolean provides_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "provides_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && exposedItem(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // header
  static boolean root(PsiBuilder b, int l) {
    return header(b, l + 1);
  }

  /* ********************************************************** */
  // STRING_START stringElement* STRING_END
  public static boolean string(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string")) return false;
    if (!nextTokenIs(b, STRING_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_START);
    r = r && string_1(b, l + 1);
    r = r && consumeToken(b, STRING_END);
    exit_section_(b, m, STRING, r);
    return r;
  }

  // stringElement*
  private static boolean string_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!stringElement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "string_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // STRING_PART | stringInterpolation
  static boolean stringElement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stringElement")) return false;
    if (!nextTokenIs(b, "", OPEN_STRING_INTERPOLATION, STRING_PART)) return false;
    boolean r;
    r = consumeToken(b, STRING_PART);
    if (!r) r = stringInterpolation(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // OPEN_STRING_INTERPOLATION CLOSE_STRING_INTERPOLATION
  public static boolean stringInterpolation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stringInterpolation")) return false;
    if (!nextTokenIs(b, OPEN_STRING_INTERPOLATION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPEN_STRING_INTERPOLATION, CLOSE_STRING_INTERPOLATION);
    exit_section_(b, m, STRING_INTERPOLATION, r);
    return r;
  }

}
