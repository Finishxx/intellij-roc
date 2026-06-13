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
  // KW_APP provides packages
  public static boolean appHeader(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "appHeader")) return false;
    if (!nextTokenIs(b, KW_APP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_APP);
    r = r && provides_$(b, l + 1);
    r = r && packages(b, l + 1);
    exit_section_(b, m, APP_HEADER, r);
    return r;
  }

  /* ********************************************************** */
  // LOWER_IDENT (KW_AS LOWER_IDENT)?
  //               | UPPER_IDENT (KW_AS UPPER_IDENT | DOT_STAR)?
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

  // LOWER_IDENT (KW_AS LOWER_IDENT)?
  private static boolean exposedItem_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exposedItem_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LOWER_IDENT);
    r = r && exposedItem_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (KW_AS LOWER_IDENT)?
  private static boolean exposedItem_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exposedItem_0_1")) return false;
    exposedItem_0_1_0(b, l + 1);
    return true;
  }

  // KW_AS LOWER_IDENT
  private static boolean exposedItem_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exposedItem_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_AS, LOWER_IDENT);
    exit_section_(b, m, null, r);
    return r;
  }

  // UPPER_IDENT (KW_AS UPPER_IDENT | DOT_STAR)?
  private static boolean exposedItem_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exposedItem_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, UPPER_IDENT);
    r = r && exposedItem_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (KW_AS UPPER_IDENT | DOT_STAR)?
  private static boolean exposedItem_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exposedItem_1_1")) return false;
    exposedItem_1_1_0(b, l + 1);
    return true;
  }

  // KW_AS UPPER_IDENT | DOT_STAR
  private static boolean exposedItem_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exposedItem_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseTokens(b, 0, KW_AS, UPPER_IDENT);
    if (!r) r = consumeToken(b, DOT_STAR);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LBRACK (exposedItem (COMMA exposedItem)* COMMA?)? RBRACK
  static boolean exposedList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exposedList")) return false;
    if (!nextTokenIs(b, LBRACK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACK);
    r = r && exposedList_1(b, l + 1);
    r = r && consumeToken(b, RBRACK);
    exit_section_(b, m, null, r);
    return r;
  }

  // (exposedItem (COMMA exposedItem)* COMMA?)?
  private static boolean exposedList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exposedList_1")) return false;
    exposedList_1_0(b, l + 1);
    return true;
  }

  // exposedItem (COMMA exposedItem)* COMMA?
  private static boolean exposedList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exposedList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exposedItem(b, l + 1);
    r = r && exposedList_1_0_1(b, l + 1);
    r = r && exposedList_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA exposedItem)*
  private static boolean exposedList_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exposedList_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!exposedList_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "exposedList_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA exposedItem
  private static boolean exposedList_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exposedList_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && exposedItem(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean exposedList_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exposedList_1_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // exposedList
  public static boolean exposes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exposes")) return false;
    if (!nextTokenIs(b, LBRACK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exposedList(b, l + 1);
    exit_section_(b, m, EXPOSES, r);
    return r;
  }

  /* ********************************************************** */
  // typeFnArgs (OP_ARROW | OP_FAT_ARROW) typeAnno
  public static boolean functionType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, FUNCTION_TYPE, "<function type>");
    r = typeFnArgs(b, l + 1);
    r = r && functionType_1(b, l + 1);
    r = r && typeAnno(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // OP_ARROW | OP_FAT_ARROW
  private static boolean functionType_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionType_1")) return false;
    boolean r;
    r = consumeToken(b, OP_ARROW);
    if (!r) r = consumeToken(b, OP_FAT_ARROW);
    return r;
  }

  /* ********************************************************** */
  // appHeader | moduleHeader | packageHeader | hostedHeader
  public static boolean header(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "header")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, HEADER, "<header>");
    r = appHeader(b, l + 1);
    if (!r) r = moduleHeader(b, l + 1);
    if (!r) r = packageHeader(b, l + 1);
    if (!r) r = hostedHeader(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KW_HOSTED exposes
  public static boolean hostedHeader(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hostedHeader")) return false;
    if (!nextTokenIs(b, KW_HOSTED)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_HOSTED);
    r = r && exposes(b, l + 1);
    exit_section_(b, m, HOSTED_HEADER, r);
    return r;
  }

  /* ********************************************************** */
  // UNDERSCORE
  public static boolean inferredType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inferredType")) return false;
    if (!nextTokenIs(b, UNDERSCORE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, UNDERSCORE);
    exit_section_(b, m, INFERRED_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // NAMED_UNDERSCORE
  public static boolean inferredTypeVar(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inferredTypeVar")) return false;
    if (!nextTokenIs(b, NAMED_UNDERSCORE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAMED_UNDERSCORE);
    exit_section_(b, m, INFERRED_TYPE_VAR, r);
    return r;
  }

  /* ********************************************************** */
  // KW_MODULE exposes
  public static boolean moduleHeader(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "moduleHeader")) return false;
    if (!nextTokenIs(b, KW_MODULE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_MODULE);
    r = r && exposes(b, l + 1);
    exit_section_(b, m, MODULE_HEADER, r);
    return r;
  }

  /* ********************************************************** */
  // LOWER_IDENT OP_COLON KW_PLATFORM? string
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

  // KW_PLATFORM?
  private static boolean packageEntry_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "packageEntry_2")) return false;
    consumeToken(b, KW_PLATFORM);
    return true;
  }

  /* ********************************************************** */
  // KW_PACKAGE exposes packages
  public static boolean packageHeader(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "packageHeader")) return false;
    if (!nextTokenIs(b, KW_PACKAGE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_PACKAGE);
    r = r && exposes(b, l + 1);
    r = r && packages(b, l + 1);
    exit_section_(b, m, PACKAGE_HEADER, r);
    return r;
  }

  /* ********************************************************** */
  // LBRACE (packageEntry (COMMA packageEntry)* COMMA?)? RBRACE
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

  // (packageEntry (COMMA packageEntry)* COMMA?)?
  private static boolean packages_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "packages_1")) return false;
    packages_1_0(b, l + 1);
    return true;
  }

  // packageEntry (COMMA packageEntry)* COMMA?
  private static boolean packages_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "packages_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = packageEntry(b, l + 1);
    r = r && packages_1_0_1(b, l + 1);
    r = r && packages_1_0_2(b, l + 1);
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

  // COMMA?
  private static boolean packages_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "packages_1_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // typeReference
  //                       | tupleType
  //                       | recordType
  //                       | tagUnionType
  //                       | inferredType
  //                       | inferredTypeVar
  static boolean primaryType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primaryType")) return false;
    boolean r;
    r = typeReference(b, l + 1);
    if (!r) r = tupleType(b, l + 1);
    if (!r) r = recordType(b, l + 1);
    if (!r) r = tagUnionType(b, l + 1);
    if (!r) r = inferredType(b, l + 1);
    if (!r) r = inferredTypeVar(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // exposedList
  public static boolean provides_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "provides_$")) return false;
    if (!nextTokenIs(b, LBRACK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exposedList(b, l + 1);
    exit_section_(b, m, PROVIDES, r);
    return r;
  }

  /* ********************************************************** */
  // NO_SPACE_DOT_UPPER_IDENT | NO_SPACE_DOT_LOWER_IDENT
  static boolean qualifierSegment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifierSegment")) return false;
    if (!nextTokenIs(b, "", NO_SPACE_DOT_LOWER_IDENT, NO_SPACE_DOT_UPPER_IDENT)) return false;
    boolean r;
    r = consumeToken(b, NO_SPACE_DOT_UPPER_IDENT);
    if (!r) r = consumeToken(b, NO_SPACE_DOT_LOWER_IDENT);
    return r;
  }

  /* ********************************************************** */
  // LBRACE recordTypeBody? RBRACE
  public static boolean recordType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordType")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && recordType_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, RECORD_TYPE, r);
    return r;
  }

  // recordTypeBody?
  private static boolean recordType_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordType_1")) return false;
    recordTypeBody(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // recordTypeField (COMMA recordTypeField)* (COMMA recordTypeExt)? COMMA?
  //                          | recordTypeExt
  static boolean recordTypeBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordTypeBody")) return false;
    if (!nextTokenIs(b, "", DOUBLE_DOT, LOWER_IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = recordTypeBody_0(b, l + 1);
    if (!r) r = recordTypeExt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // recordTypeField (COMMA recordTypeField)* (COMMA recordTypeExt)? COMMA?
  private static boolean recordTypeBody_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordTypeBody_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = recordTypeField(b, l + 1);
    r = r && recordTypeBody_0_1(b, l + 1);
    r = r && recordTypeBody_0_2(b, l + 1);
    r = r && recordTypeBody_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA recordTypeField)*
  private static boolean recordTypeBody_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordTypeBody_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!recordTypeBody_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "recordTypeBody_0_1", c)) break;
    }
    return true;
  }

  // COMMA recordTypeField
  private static boolean recordTypeBody_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordTypeBody_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && recordTypeField(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA recordTypeExt)?
  private static boolean recordTypeBody_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordTypeBody_0_2")) return false;
    recordTypeBody_0_2_0(b, l + 1);
    return true;
  }

  // COMMA recordTypeExt
  private static boolean recordTypeBody_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordTypeBody_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && recordTypeExt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean recordTypeBody_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordTypeBody_0_3")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // DOUBLE_DOT (LOWER_IDENT | NAMED_UNDERSCORE)?
  public static boolean recordTypeExt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordTypeExt")) return false;
    if (!nextTokenIs(b, DOUBLE_DOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOUBLE_DOT);
    r = r && recordTypeExt_1(b, l + 1);
    exit_section_(b, m, RECORD_TYPE_EXT, r);
    return r;
  }

  // (LOWER_IDENT | NAMED_UNDERSCORE)?
  private static boolean recordTypeExt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordTypeExt_1")) return false;
    recordTypeExt_1_0(b, l + 1);
    return true;
  }

  // LOWER_IDENT | NAMED_UNDERSCORE
  private static boolean recordTypeExt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordTypeExt_1_0")) return false;
    boolean r;
    r = consumeToken(b, LOWER_IDENT);
    if (!r) r = consumeToken(b, NAMED_UNDERSCORE);
    return r;
  }

  /* ********************************************************** */
  // LOWER_IDENT OP_COLON typeAnno
  public static boolean recordTypeField(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordTypeField")) return false;
    if (!nextTokenIs(b, LOWER_IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LOWER_IDENT, OP_COLON);
    r = r && typeAnno(b, l + 1);
    exit_section_(b, m, RECORD_TYPE_FIELD, r);
    return r;
  }

  /* ********************************************************** */
  // header | typeAnno | throwaway
  static boolean root(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root")) return false;
    boolean r;
    r = header(b, l + 1);
    if (!r) r = typeAnno(b, l + 1);
    if (!r) r = throwaway(b, l + 1);
    return r;
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

  /* ********************************************************** */
  // tagUnionMember (COMMA tagUnionMember)* (COMMA tagUnionExt)? COMMA?
  //                        | tagUnionExt
  static boolean tagUnionBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tagUnionBody")) return false;
    if (!nextTokenIs(b, "", DOUBLE_DOT, UPPER_IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tagUnionBody_0(b, l + 1);
    if (!r) r = tagUnionExt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tagUnionMember (COMMA tagUnionMember)* (COMMA tagUnionExt)? COMMA?
  private static boolean tagUnionBody_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tagUnionBody_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tagUnionMember(b, l + 1);
    r = r && tagUnionBody_0_1(b, l + 1);
    r = r && tagUnionBody_0_2(b, l + 1);
    r = r && tagUnionBody_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA tagUnionMember)*
  private static boolean tagUnionBody_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tagUnionBody_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!tagUnionBody_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tagUnionBody_0_1", c)) break;
    }
    return true;
  }

  // COMMA tagUnionMember
  private static boolean tagUnionBody_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tagUnionBody_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && tagUnionMember(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA tagUnionExt)?
  private static boolean tagUnionBody_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tagUnionBody_0_2")) return false;
    tagUnionBody_0_2_0(b, l + 1);
    return true;
  }

  // COMMA tagUnionExt
  private static boolean tagUnionBody_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tagUnionBody_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && tagUnionExt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean tagUnionBody_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tagUnionBody_0_3")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // DOUBLE_DOT (LOWER_IDENT | NAMED_UNDERSCORE)?
  public static boolean tagUnionExt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tagUnionExt")) return false;
    if (!nextTokenIs(b, DOUBLE_DOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOUBLE_DOT);
    r = r && tagUnionExt_1(b, l + 1);
    exit_section_(b, m, TAG_UNION_EXT, r);
    return r;
  }

  // (LOWER_IDENT | NAMED_UNDERSCORE)?
  private static boolean tagUnionExt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tagUnionExt_1")) return false;
    tagUnionExt_1_0(b, l + 1);
    return true;
  }

  // LOWER_IDENT | NAMED_UNDERSCORE
  private static boolean tagUnionExt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tagUnionExt_1_0")) return false;
    boolean r;
    r = consumeToken(b, LOWER_IDENT);
    if (!r) r = consumeToken(b, NAMED_UNDERSCORE);
    return r;
  }

  /* ********************************************************** */
  // UPPER_IDENT typeArguments?
  public static boolean tagUnionMember(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tagUnionMember")) return false;
    if (!nextTokenIs(b, UPPER_IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, UPPER_IDENT);
    r = r && tagUnionMember_1(b, l + 1);
    exit_section_(b, m, TAG_UNION_MEMBER, r);
    return r;
  }

  // typeArguments?
  private static boolean tagUnionMember_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tagUnionMember_1")) return false;
    typeArguments(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // LBRACK tagUnionBody? RBRACK
  public static boolean tagUnionType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tagUnionType")) return false;
    if (!nextTokenIs(b, LBRACK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACK);
    r = r && tagUnionType_1(b, l + 1);
    r = r && consumeToken(b, RBRACK);
    exit_section_(b, m, TAG_UNION_TYPE, r);
    return r;
  }

  // tagUnionBody?
  private static boolean tagUnionType_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tagUnionType_1")) return false;
    tagUnionBody(b, l + 1);
    return true;
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
  static boolean throwaway(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "throwaway")) return false;
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
    return r;
  }

  /* ********************************************************** */
  // (NO_SPACE_LPAREN | LPAREN) (typeAnno (COMMA typeAnno)* COMMA?)? RPAREN
  public static boolean tupleType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tupleType")) return false;
    if (!nextTokenIs(b, "<tuple type>", LPAREN, NO_SPACE_LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TUPLE_TYPE, "<tuple type>");
    r = tupleType_0(b, l + 1);
    r = r && tupleType_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // NO_SPACE_LPAREN | LPAREN
  private static boolean tupleType_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tupleType_0")) return false;
    boolean r;
    r = consumeToken(b, NO_SPACE_LPAREN);
    if (!r) r = consumeToken(b, LPAREN);
    return r;
  }

  // (typeAnno (COMMA typeAnno)* COMMA?)?
  private static boolean tupleType_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tupleType_1")) return false;
    tupleType_1_0(b, l + 1);
    return true;
  }

  // typeAnno (COMMA typeAnno)* COMMA?
  private static boolean tupleType_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tupleType_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeAnno(b, l + 1);
    r = r && tupleType_1_0_1(b, l + 1);
    r = r && tupleType_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA typeAnno)*
  private static boolean tupleType_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tupleType_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!tupleType_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tupleType_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA typeAnno
  private static boolean tupleType_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tupleType_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && typeAnno(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean tupleType_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tupleType_1_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // functionType | primaryType
  static boolean typeAnno(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeAnno")) return false;
    boolean r;
    r = functionType(b, l + 1);
    if (!r) r = primaryType(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // NO_SPACE_LPAREN (typeAnno (COMMA typeAnno)* COMMA?)? RPAREN
  public static boolean typeArguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeArguments")) return false;
    if (!nextTokenIs(b, NO_SPACE_LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NO_SPACE_LPAREN);
    r = r && typeArguments_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, TYPE_ARGUMENTS, r);
    return r;
  }

  // (typeAnno (COMMA typeAnno)* COMMA?)?
  private static boolean typeArguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeArguments_1")) return false;
    typeArguments_1_0(b, l + 1);
    return true;
  }

  // typeAnno (COMMA typeAnno)* COMMA?
  private static boolean typeArguments_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeArguments_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeAnno(b, l + 1);
    r = r && typeArguments_1_0_1(b, l + 1);
    r = r && typeArguments_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA typeAnno)*
  private static boolean typeArguments_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeArguments_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!typeArguments_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "typeArguments_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA typeAnno
  private static boolean typeArguments_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeArguments_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && typeAnno(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean typeArguments_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeArguments_1_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // primaryType (COMMA primaryType)*
  static boolean typeFnArgs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeFnArgs")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = primaryType(b, l + 1);
    r = r && typeFnArgs_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA primaryType)*
  private static boolean typeFnArgs_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeFnArgs_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!typeFnArgs_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "typeFnArgs_1", c)) break;
    }
    return true;
  }

  // COMMA primaryType
  private static boolean typeFnArgs_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeFnArgs_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && primaryType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (UPPER_IDENT | LOWER_IDENT) qualifierSegment*
  static boolean typeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeName")) return false;
    if (!nextTokenIs(b, "", LOWER_IDENT, UPPER_IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeName_0(b, l + 1);
    r = r && typeName_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // UPPER_IDENT | LOWER_IDENT
  private static boolean typeName_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeName_0")) return false;
    boolean r;
    r = consumeToken(b, UPPER_IDENT);
    if (!r) r = consumeToken(b, LOWER_IDENT);
    return r;
  }

  // qualifierSegment*
  private static boolean typeName_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeName_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!qualifierSegment(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "typeName_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // typeName typeArguments?
  public static boolean typeReference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeReference")) return false;
    if (!nextTokenIs(b, "<type reference>", LOWER_IDENT, UPPER_IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_REFERENCE, "<type reference>");
    r = typeName(b, l + 1);
    r = r && typeReference_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // typeArguments?
  private static boolean typeReference_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeReference_1")) return false;
    typeArguments(b, l + 1);
    return true;
  }

}
