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
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
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

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(BINARY_EXPR, BLOCK_EXPR, CALL_EXPR, CHAR_LITERAL,
      ELLIPSIS_EXPR, EXPR, FIELD_ACCESS_EXPR, FLOAT_LITERAL,
      FOR_EXPR, IDENT_EXPR, IF_EXPR, INT_LITERAL,
      LAMBDA_EXPR, LIST_EXPR, MATCH_EXPR, METHOD_CALL_EXPR,
      QUALIFIED_NAME_EXPR, QUESTION_SUFFIX_EXPR, RECORD_EXPR, STRING,
      TAG_EXPR, TUPLE_ACCESS_EXPR, TUPLE_EXPR, UNARY_EXPR),
  };

  /* ********************************************************** */
  // patternPrimary (OP_BAR patternPrimary)+
  public static boolean alternativesPattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alternativesPattern")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ALTERNATIVES_PATTERN, "<alternatives pattern>");
    r = patternPrimary(b, l + 1);
    r = r && alternativesPattern_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (OP_BAR patternPrimary)+
  private static boolean alternativesPattern_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alternativesPattern_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = alternativesPattern_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!alternativesPattern_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "alternativesPattern_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_BAR patternPrimary
  private static boolean alternativesPattern_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alternativesPattern_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_BAR);
    r = r && patternPrimary(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
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
  // patternPrimary KW_AS LOWER_IDENT
  public static boolean asPattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asPattern")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, AS_PATTERN, "<as pattern>");
    r = patternPrimary(b, l + 1);
    r = r && consumeTokens(b, 0, KW_AS, LOWER_IDENT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // OP_STAR | OP_SLASH | OP_DOUBLE_SLASH | OP_PERCENT | OP_PLUS
  //                    | OP_BINARY_MINUS | OP_DOUBLE_QUESTION | OP_QUESTION | OP_EQUALS
  //                    | OP_NOT_EQUALS | OP_LESS_THAN | OP_GREATER_THAN | OP_LESS_THAN_OR_EQ
  //                    | OP_GREATER_THAN_OR_EQ | KW_AND | KW_OR
  static boolean binaryOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binaryOp")) return false;
    boolean r;
    r = consumeToken(b, OP_STAR);
    if (!r) r = consumeToken(b, OP_SLASH);
    if (!r) r = consumeToken(b, OP_DOUBLE_SLASH);
    if (!r) r = consumeToken(b, OP_PERCENT);
    if (!r) r = consumeToken(b, OP_PLUS);
    if (!r) r = consumeToken(b, OP_BINARY_MINUS);
    if (!r) r = consumeToken(b, OP_DOUBLE_QUESTION);
    if (!r) r = consumeToken(b, OP_QUESTION);
    if (!r) r = consumeToken(b, OP_EQUALS);
    if (!r) r = consumeToken(b, OP_NOT_EQUALS);
    if (!r) r = consumeToken(b, OP_LESS_THAN);
    if (!r) r = consumeToken(b, OP_GREATER_THAN);
    if (!r) r = consumeToken(b, OP_LESS_THAN_OR_EQ);
    if (!r) r = consumeToken(b, OP_GREATER_THAN_OR_EQ);
    if (!r) r = consumeToken(b, KW_AND);
    if (!r) r = consumeToken(b, KW_OR);
    return r;
  }

  /* ********************************************************** */
  // valueDecl | valueAnnotation | expr
  static boolean blockStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "blockStmt")) return false;
    boolean r;
    r = valueDecl(b, l + 1);
    if (!r) r = valueAnnotation(b, l + 1);
    if (!r) r = expr(b, l + 1, -1);
    return r;
  }

  /* ********************************************************** */
  // NO_SPACE_LPAREN (expr (COMMA expr)* COMMA?)? RPAREN
  static boolean callArgs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callArgs")) return false;
    if (!nextTokenIs(b, NO_SPACE_LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NO_SPACE_LPAREN);
    r = r && callArgs_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // (expr (COMMA expr)* COMMA?)?
  private static boolean callArgs_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callArgs_1")) return false;
    callArgs_1_0(b, l + 1);
    return true;
  }

  // expr (COMMA expr)* COMMA?
  private static boolean callArgs_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callArgs_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1, -1);
    r = r && callArgs_1_0_1(b, l + 1);
    r = r && callArgs_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA expr)*
  private static boolean callArgs_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callArgs_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!callArgs_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "callArgs_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA expr
  private static boolean callArgs_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callArgs_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean callArgs_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callArgs_1_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
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
  // string KW_AS LOWER_IDENT OP_COLON typeAnno
  static boolean fileImport(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fileImport")) return false;
    if (!nextTokenIs(b, STRING_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = string(b, l + 1);
    r = r && consumeTokens(b, 0, KW_AS, LOWER_IDENT, OP_COLON);
    r = r && typeAnno(b, l + 1);
    exit_section_(b, m, null, r);
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
  // appHeader | moduleHeader | packageHeader | hostedHeader | platformHeader
  public static boolean header(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "header")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, HEADER, "<header>");
    r = appHeader(b, l + 1);
    if (!r) r = moduleHeader(b, l + 1);
    if (!r) r = packageHeader(b, l + 1);
    if (!r) r = hostedHeader(b, l + 1);
    if (!r) r = platformHeader(b, l + 1);
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
  // LOWER_IDENT | NAMED_UNDERSCORE
  public static boolean identPattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identPattern")) return false;
    if (!nextTokenIs(b, "<ident pattern>", LOWER_IDENT, NAMED_UNDERSCORE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENT_PATTERN, "<ident pattern>");
    r = consumeToken(b, LOWER_IDENT);
    if (!r) r = consumeToken(b, NAMED_UNDERSCORE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KW_AS UPPER_IDENT
  public static boolean importAlias(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importAlias")) return false;
    if (!nextTokenIs(b, KW_AS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_AS, UPPER_IDENT);
    exit_section_(b, m, IMPORT_ALIAS, r);
    return r;
  }

  /* ********************************************************** */
  // KW_EXPOSING exposedList
  public static boolean importExposing(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importExposing")) return false;
    if (!nextTokenIs(b, KW_EXPOSING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_EXPOSING);
    r = r && exposedList(b, l + 1);
    exit_section_(b, m, IMPORT_EXPOSING, r);
    return r;
  }

  /* ********************************************************** */
  // KW_IMPORT (fileImport | moduleImport)
  public static boolean importStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importStatement")) return false;
    if (!nextTokenIs(b, KW_IMPORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_IMPORT);
    r = r && importStatement_1(b, l + 1);
    exit_section_(b, m, IMPORT_STATEMENT, r);
    return r;
  }

  // fileImport | moduleImport
  private static boolean importStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importStatement_1")) return false;
    boolean r;
    r = fileImport(b, l + 1);
    if (!r) r = moduleImport(b, l + 1);
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
  // LBRACK (listPatternElem (COMMA listPatternElem)* COMMA?)? RBRACK
  public static boolean listPattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "listPattern")) return false;
    if (!nextTokenIs(b, LBRACK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACK);
    r = r && listPattern_1(b, l + 1);
    r = r && consumeToken(b, RBRACK);
    exit_section_(b, m, LIST_PATTERN, r);
    return r;
  }

  // (listPatternElem (COMMA listPatternElem)* COMMA?)?
  private static boolean listPattern_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "listPattern_1")) return false;
    listPattern_1_0(b, l + 1);
    return true;
  }

  // listPatternElem (COMMA listPatternElem)* COMMA?
  private static boolean listPattern_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "listPattern_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = listPatternElem(b, l + 1);
    r = r && listPattern_1_0_1(b, l + 1);
    r = r && listPattern_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA listPatternElem)*
  private static boolean listPattern_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "listPattern_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!listPattern_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "listPattern_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA listPatternElem
  private static boolean listPattern_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "listPattern_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && listPatternElem(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean listPattern_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "listPattern_1_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // listRestPattern | pattern
  static boolean listPatternElem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "listPatternElem")) return false;
    boolean r;
    r = listRestPattern(b, l + 1);
    if (!r) r = pattern(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // DOUBLE_DOT (KW_AS LOWER_IDENT)?
  public static boolean listRestPattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "listRestPattern")) return false;
    if (!nextTokenIs(b, DOUBLE_DOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOUBLE_DOT);
    r = r && listRestPattern_1(b, l + 1);
    exit_section_(b, m, LIST_REST_PATTERN, r);
    return r;
  }

  // (KW_AS LOWER_IDENT)?
  private static boolean listRestPattern_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "listRestPattern_1")) return false;
    listRestPattern_1_0(b, l + 1);
    return true;
  }

  // KW_AS LOWER_IDENT
  private static boolean listRestPattern_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "listRestPattern_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_AS, LOWER_IDENT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // INT | FLOAT | SINGLE_QUOTE
  public static boolean literalPattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalPattern")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL_PATTERN, "<literal pattern>");
    r = consumeToken(b, INT);
    if (!r) r = consumeToken(b, FLOAT);
    if (!r) r = consumeToken(b, SINGLE_QUOTE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // pattern (KW_IF expr)? OP_FAT_ARROW expr
  public static boolean matchBranch(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchBranch")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MATCH_BRANCH, "<match branch>");
    r = pattern(b, l + 1);
    r = r && matchBranch_1(b, l + 1);
    r = r && consumeToken(b, OP_FAT_ARROW);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (KW_IF expr)?
  private static boolean matchBranch_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchBranch_1")) return false;
    matchBranch_1_0(b, l + 1);
    return true;
  }

  // KW_IF expr
  private static boolean matchBranch_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchBranch_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_IF);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
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
  // moduleName importAlias? importExposing?
  static boolean moduleImport(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "moduleImport")) return false;
    if (!nextTokenIs(b, "", LOWER_IDENT, UPPER_IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = moduleName(b, l + 1);
    r = r && moduleImport_1(b, l + 1);
    r = r && moduleImport_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // importAlias?
  private static boolean moduleImport_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "moduleImport_1")) return false;
    importAlias(b, l + 1);
    return true;
  }

  // importExposing?
  private static boolean moduleImport_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "moduleImport_2")) return false;
    importExposing(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // UPPER_IDENT  (NO_SPACE_DOT_UPPER_IDENT | DOT_UPPER_IDENT)*
  //              | LOWER_IDENT (NO_SPACE_DOT_UPPER_IDENT | DOT_UPPER_IDENT)+
  public static boolean moduleName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "moduleName")) return false;
    if (!nextTokenIs(b, "<module name>", LOWER_IDENT, UPPER_IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MODULE_NAME, "<module name>");
    r = moduleName_0(b, l + 1);
    if (!r) r = moduleName_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // UPPER_IDENT  (NO_SPACE_DOT_UPPER_IDENT | DOT_UPPER_IDENT)*
  private static boolean moduleName_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "moduleName_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, UPPER_IDENT);
    r = r && moduleName_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (NO_SPACE_DOT_UPPER_IDENT | DOT_UPPER_IDENT)*
  private static boolean moduleName_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "moduleName_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!moduleName_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "moduleName_0_1", c)) break;
    }
    return true;
  }

  // NO_SPACE_DOT_UPPER_IDENT | DOT_UPPER_IDENT
  private static boolean moduleName_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "moduleName_0_1_0")) return false;
    boolean r;
    r = consumeToken(b, NO_SPACE_DOT_UPPER_IDENT);
    if (!r) r = consumeToken(b, DOT_UPPER_IDENT);
    return r;
  }

  // LOWER_IDENT (NO_SPACE_DOT_UPPER_IDENT | DOT_UPPER_IDENT)+
  private static boolean moduleName_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "moduleName_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LOWER_IDENT);
    r = r && moduleName_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (NO_SPACE_DOT_UPPER_IDENT | DOT_UPPER_IDENT)+
  private static boolean moduleName_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "moduleName_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = moduleName_1_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!moduleName_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "moduleName_1_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // NO_SPACE_DOT_UPPER_IDENT | DOT_UPPER_IDENT
  private static boolean moduleName_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "moduleName_1_1_0")) return false;
    boolean r;
    r = consumeToken(b, NO_SPACE_DOT_UPPER_IDENT);
    if (!r) r = consumeToken(b, DOT_UPPER_IDENT);
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
  // alternativesPattern | asPattern | patternPrimary
  static boolean pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pattern")) return false;
    boolean r;
    r = alternativesPattern(b, l + 1);
    if (!r) r = asPattern(b, l + 1);
    if (!r) r = patternPrimary(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // asPattern | patternPrimary
  static boolean patternNoAlts(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "patternNoAlts")) return false;
    boolean r;
    r = asPattern(b, l + 1);
    if (!r) r = patternPrimary(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // varPattern
  //                          | underscorePattern
  //                          | identPattern
  //                          | tagPattern
  //                          | literalPattern
  //                          | string
  //                          | listPattern
  //                          | recordPattern
  //                          | tuplePattern
  static boolean patternPrimary(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "patternPrimary")) return false;
    boolean r;
    r = varPattern(b, l + 1);
    if (!r) r = underscorePattern(b, l + 1);
    if (!r) r = identPattern(b, l + 1);
    if (!r) r = tagPattern(b, l + 1);
    if (!r) r = literalPattern(b, l + 1);
    if (!r) r = string(b, l + 1);
    if (!r) r = listPattern(b, l + 1);
    if (!r) r = recordPattern(b, l + 1);
    if (!r) r = tuplePattern(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // KW_PLATFORM string
  //                    KW_REQUIRES platformRequires
  //                    KW_EXPOSES  exposes
  //                    KW_PACKAGES packages
  //                    KW_PROVIDES platformProvides
  //                    platformTargets?
  public static boolean platformHeader(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "platformHeader")) return false;
    if (!nextTokenIs(b, KW_PLATFORM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_PLATFORM);
    r = r && string(b, l + 1);
    r = r && consumeToken(b, KW_REQUIRES);
    r = r && platformRequires(b, l + 1);
    r = r && consumeToken(b, KW_EXPOSES);
    r = r && exposes(b, l + 1);
    r = r && consumeToken(b, KW_PACKAGES);
    r = r && packages(b, l + 1);
    r = r && consumeToken(b, KW_PROVIDES);
    r = r && platformProvides(b, l + 1);
    r = r && platformHeader_10(b, l + 1);
    exit_section_(b, m, PLATFORM_HEADER, r);
    return r;
  }

  // platformTargets?
  private static boolean platformHeader_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "platformHeader_10")) return false;
    platformTargets(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // LBRACE (platformProvidesField (COMMA platformProvidesField)* COMMA?)? RBRACE
  public static boolean platformProvides(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "platformProvides")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && platformProvides_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, PLATFORM_PROVIDES, r);
    return r;
  }

  // (platformProvidesField (COMMA platformProvidesField)* COMMA?)?
  private static boolean platformProvides_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "platformProvides_1")) return false;
    platformProvides_1_0(b, l + 1);
    return true;
  }

  // platformProvidesField (COMMA platformProvidesField)* COMMA?
  private static boolean platformProvides_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "platformProvides_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = platformProvidesField(b, l + 1);
    r = r && platformProvides_1_0_1(b, l + 1);
    r = r && platformProvides_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA platformProvidesField)*
  private static boolean platformProvides_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "platformProvides_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!platformProvides_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "platformProvides_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA platformProvidesField
  private static boolean platformProvides_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "platformProvides_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && platformProvidesField(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean platformProvides_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "platformProvides_1_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // LOWER_IDENT (OP_COLON expr)?
  public static boolean platformProvidesField(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "platformProvidesField")) return false;
    if (!nextTokenIs(b, LOWER_IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LOWER_IDENT);
    r = r && platformProvidesField_1(b, l + 1);
    exit_section_(b, m, PLATFORM_PROVIDES_FIELD, r);
    return r;
  }

  // (OP_COLON expr)?
  private static boolean platformProvidesField_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "platformProvidesField_1")) return false;
    platformProvidesField_1_0(b, l + 1);
    return true;
  }

  // OP_COLON expr
  private static boolean platformProvidesField_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "platformProvidesField_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COLON);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LBRACE RBRACE LBRACE requiresEntries? RBRACE
  //                    | LBRACE requiresEntries? RBRACE
  public static boolean platformRequires(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "platformRequires")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = platformRequires_0(b, l + 1);
    if (!r) r = platformRequires_1(b, l + 1);
    exit_section_(b, m, PLATFORM_REQUIRES, r);
    return r;
  }

  // LBRACE RBRACE LBRACE requiresEntries? RBRACE
  private static boolean platformRequires_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "platformRequires_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LBRACE, RBRACE, LBRACE);
    r = r && platformRequires_0_3(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // requiresEntries?
  private static boolean platformRequires_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "platformRequires_0_3")) return false;
    requiresEntries(b, l + 1);
    return true;
  }

  // LBRACE requiresEntries? RBRACE
  private static boolean platformRequires_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "platformRequires_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && platformRequires_1_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // requiresEntries?
  private static boolean platformRequires_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "platformRequires_1_1")) return false;
    requiresEntries(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // KW_TARGETS OP_COLON LBRACE (targetsField (COMMA targetsField)* COMMA?)? RBRACE
  public static boolean platformTargets(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "platformTargets")) return false;
    if (!nextTokenIs(b, KW_TARGETS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_TARGETS, OP_COLON, LBRACE);
    r = r && platformTargets_3(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, PLATFORM_TARGETS, r);
    return r;
  }

  // (targetsField (COMMA targetsField)* COMMA?)?
  private static boolean platformTargets_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "platformTargets_3")) return false;
    platformTargets_3_0(b, l + 1);
    return true;
  }

  // targetsField (COMMA targetsField)* COMMA?
  private static boolean platformTargets_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "platformTargets_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = targetsField(b, l + 1);
    r = r && platformTargets_3_0_1(b, l + 1);
    r = r && platformTargets_3_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA targetsField)*
  private static boolean platformTargets_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "platformTargets_3_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!platformTargets_3_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "platformTargets_3_0_1", c)) break;
    }
    return true;
  }

  // COMMA targetsField
  private static boolean platformTargets_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "platformTargets_3_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && targetsField(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean platformTargets_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "platformTargets_3_0_2")) return false;
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
  static boolean qualChainSeg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualChainSeg")) return false;
    if (!nextTokenIs(b, "", NO_SPACE_DOT_LOWER_IDENT, NO_SPACE_DOT_UPPER_IDENT)) return false;
    boolean r;
    r = consumeToken(b, NO_SPACE_DOT_UPPER_IDENT);
    if (!r) r = consumeToken(b, NO_SPACE_DOT_LOWER_IDENT);
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
  // recordExprExt COMMA (recordExprField (COMMA recordExprField)* COMMA?)?
  //                          | recordExprField (COMMA recordExprField)* COMMA?
  static boolean recordExprBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordExprBody")) return false;
    if (!nextTokenIs(b, "", DOUBLE_DOT, LOWER_IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = recordExprBody_0(b, l + 1);
    if (!r) r = recordExprBody_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // recordExprExt COMMA (recordExprField (COMMA recordExprField)* COMMA?)?
  private static boolean recordExprBody_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordExprBody_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = recordExprExt(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && recordExprBody_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (recordExprField (COMMA recordExprField)* COMMA?)?
  private static boolean recordExprBody_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordExprBody_0_2")) return false;
    recordExprBody_0_2_0(b, l + 1);
    return true;
  }

  // recordExprField (COMMA recordExprField)* COMMA?
  private static boolean recordExprBody_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordExprBody_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = recordExprField(b, l + 1);
    r = r && recordExprBody_0_2_0_1(b, l + 1);
    r = r && recordExprBody_0_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA recordExprField)*
  private static boolean recordExprBody_0_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordExprBody_0_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!recordExprBody_0_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "recordExprBody_0_2_0_1", c)) break;
    }
    return true;
  }

  // COMMA recordExprField
  private static boolean recordExprBody_0_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordExprBody_0_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && recordExprField(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean recordExprBody_0_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordExprBody_0_2_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  // recordExprField (COMMA recordExprField)* COMMA?
  private static boolean recordExprBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordExprBody_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = recordExprField(b, l + 1);
    r = r && recordExprBody_1_1(b, l + 1);
    r = r && recordExprBody_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA recordExprField)*
  private static boolean recordExprBody_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordExprBody_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!recordExprBody_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "recordExprBody_1_1", c)) break;
    }
    return true;
  }

  // COMMA recordExprField
  private static boolean recordExprBody_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordExprBody_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && recordExprField(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean recordExprBody_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordExprBody_1_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // DOUBLE_DOT expr
  public static boolean recordExprExt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordExprExt")) return false;
    if (!nextTokenIs(b, DOUBLE_DOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOUBLE_DOT);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, RECORD_EXPR_EXT, r);
    return r;
  }

  /* ********************************************************** */
  // LOWER_IDENT (OP_COLON expr)?
  public static boolean recordExprField(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordExprField")) return false;
    if (!nextTokenIs(b, LOWER_IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LOWER_IDENT);
    r = r && recordExprField_1(b, l + 1);
    exit_section_(b, m, RECORD_EXPR_FIELD, r);
    return r;
  }

  // (OP_COLON expr)?
  private static boolean recordExprField_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordExprField_1")) return false;
    recordExprField_1_0(b, l + 1);
    return true;
  }

  // OP_COLON expr
  private static boolean recordExprField_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordExprField_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COLON);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LBRACE (recordPatternField (COMMA recordPatternField)* COMMA?)? RBRACE
  public static boolean recordPattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordPattern")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && recordPattern_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, RECORD_PATTERN, r);
    return r;
  }

  // (recordPatternField (COMMA recordPatternField)* COMMA?)?
  private static boolean recordPattern_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordPattern_1")) return false;
    recordPattern_1_0(b, l + 1);
    return true;
  }

  // recordPatternField (COMMA recordPatternField)* COMMA?
  private static boolean recordPattern_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordPattern_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = recordPatternField(b, l + 1);
    r = r && recordPattern_1_0_1(b, l + 1);
    r = r && recordPattern_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA recordPatternField)*
  private static boolean recordPattern_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordPattern_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!recordPattern_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "recordPattern_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA recordPatternField
  private static boolean recordPattern_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordPattern_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && recordPatternField(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean recordPattern_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordPattern_1_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // DOUBLE_DOT LOWER_IDENT?
  //                      | LOWER_IDENT (OP_COLON pattern)?
  public static boolean recordPatternField(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordPatternField")) return false;
    if (!nextTokenIs(b, "<record pattern field>", DOUBLE_DOT, LOWER_IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RECORD_PATTERN_FIELD, "<record pattern field>");
    r = recordPatternField_0(b, l + 1);
    if (!r) r = recordPatternField_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // DOUBLE_DOT LOWER_IDENT?
  private static boolean recordPatternField_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordPatternField_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOUBLE_DOT);
    r = r && recordPatternField_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LOWER_IDENT?
  private static boolean recordPatternField_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordPatternField_0_1")) return false;
    consumeToken(b, LOWER_IDENT);
    return true;
  }

  // LOWER_IDENT (OP_COLON pattern)?
  private static boolean recordPatternField_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordPatternField_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LOWER_IDENT);
    r = r && recordPatternField_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OP_COLON pattern)?
  private static boolean recordPatternField_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordPatternField_1_1")) return false;
    recordPatternField_1_1_0(b, l + 1);
    return true;
  }

  // OP_COLON pattern
  private static boolean recordPatternField_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordPatternField_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COLON);
    r = r && pattern(b, l + 1);
    exit_section_(b, m, null, r);
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
  // requiresEntry (COMMA requiresEntry)* COMMA?
  static boolean requiresEntries(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "requiresEntries")) return false;
    if (!nextTokenIs(b, "", LBRACK, LOWER_IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = requiresEntry(b, l + 1);
    r = r && requiresEntries_1(b, l + 1);
    r = r && requiresEntries_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA requiresEntry)*
  private static boolean requiresEntries_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "requiresEntries_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!requiresEntries_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "requiresEntries_1", c)) break;
    }
    return true;
  }

  // COMMA requiresEntry
  private static boolean requiresEntries_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "requiresEntries_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && requiresEntry(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean requiresEntries_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "requiresEntries_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // requiresForClause? LOWER_IDENT OP_COLON typeAnno
  public static boolean requiresEntry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "requiresEntry")) return false;
    if (!nextTokenIs(b, "<requires entry>", LBRACK, LOWER_IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, REQUIRES_ENTRY, "<requires entry>");
    r = requiresEntry_0(b, l + 1);
    r = r && consumeTokens(b, 0, LOWER_IDENT, OP_COLON);
    r = r && typeAnno(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // requiresForClause?
  private static boolean requiresEntry_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "requiresEntry_0")) return false;
    requiresForClause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // UPPER_IDENT OP_COLON LOWER_IDENT
  public static boolean requiresForAlias(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "requiresForAlias")) return false;
    if (!nextTokenIs(b, UPPER_IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, UPPER_IDENT, OP_COLON, LOWER_IDENT);
    exit_section_(b, m, REQUIRES_FOR_ALIAS, r);
    return r;
  }

  /* ********************************************************** */
  // LBRACK requiresForAlias (COMMA requiresForAlias)* RBRACK KW_FOR
  public static boolean requiresForClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "requiresForClause")) return false;
    if (!nextTokenIs(b, LBRACK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACK);
    r = r && requiresForAlias(b, l + 1);
    r = r && requiresForClause_2(b, l + 1);
    r = r && consumeTokens(b, 0, RBRACK, KW_FOR);
    exit_section_(b, m, REQUIRES_FOR_CLAUSE, r);
    return r;
  }

  // (COMMA requiresForAlias)*
  private static boolean requiresForClause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "requiresForClause_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!requiresForClause_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "requiresForClause_2", c)) break;
    }
    return true;
  }

  // COMMA requiresForAlias
  private static boolean requiresForClause_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "requiresForClause_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && requiresForAlias(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // header? topLevelItem*
  static boolean root(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = root_0(b, l + 1);
    r = r && root_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // header?
  private static boolean root_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_0")) return false;
    header(b, l + 1);
    return true;
  }

  // topLevelItem*
  private static boolean root_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!topLevelItem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "root_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // importStatement | valueAnnotation | typeDecl | valueDecl
  static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    r = importStatement(b, l + 1);
    if (!r) r = valueAnnotation(b, l + 1);
    if (!r) r = typeDecl(b, l + 1);
    if (!r) r = valueDecl(b, l + 1);
    return r;
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
  // UPPER_IDENT NO_SPACE_DOT_UPPER_IDENT* tagPatternArgs?
  public static boolean tagPattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tagPattern")) return false;
    if (!nextTokenIs(b, UPPER_IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, UPPER_IDENT);
    r = r && tagPattern_1(b, l + 1);
    r = r && tagPattern_2(b, l + 1);
    exit_section_(b, m, TAG_PATTERN, r);
    return r;
  }

  // NO_SPACE_DOT_UPPER_IDENT*
  private static boolean tagPattern_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tagPattern_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NO_SPACE_DOT_UPPER_IDENT)) break;
      if (!empty_element_parsed_guard_(b, "tagPattern_1", c)) break;
    }
    return true;
  }

  // tagPatternArgs?
  private static boolean tagPattern_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tagPattern_2")) return false;
    tagPatternArgs(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // NO_SPACE_LPAREN (pattern (COMMA pattern)* COMMA?)? RPAREN
  public static boolean tagPatternArgs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tagPatternArgs")) return false;
    if (!nextTokenIs(b, NO_SPACE_LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NO_SPACE_LPAREN);
    r = r && tagPatternArgs_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, TAG_PATTERN_ARGS, r);
    return r;
  }

  // (pattern (COMMA pattern)* COMMA?)?
  private static boolean tagPatternArgs_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tagPatternArgs_1")) return false;
    tagPatternArgs_1_0(b, l + 1);
    return true;
  }

  // pattern (COMMA pattern)* COMMA?
  private static boolean tagPatternArgs_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tagPatternArgs_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = pattern(b, l + 1);
    r = r && tagPatternArgs_1_0_1(b, l + 1);
    r = r && tagPatternArgs_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA pattern)*
  private static boolean tagPatternArgs_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tagPatternArgs_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!tagPatternArgs_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tagPatternArgs_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA pattern
  private static boolean tagPatternArgs_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tagPatternArgs_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && pattern(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean tagPatternArgs_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tagPatternArgs_1_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
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
  // string | LOWER_IDENT | KW_APP
  public static boolean targetFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "targetFile")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TARGET_FILE, "<target file>");
    r = string(b, l + 1);
    if (!r) r = consumeToken(b, LOWER_IDENT);
    if (!r) r = consumeToken(b, KW_APP);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LOWER_IDENT OP_COLON LBRACK (targetFile (COMMA targetFile)* COMMA?)? RBRACK
  public static boolean targetLinkEntry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "targetLinkEntry")) return false;
    if (!nextTokenIs(b, LOWER_IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LOWER_IDENT, OP_COLON, LBRACK);
    r = r && targetLinkEntry_3(b, l + 1);
    r = r && consumeToken(b, RBRACK);
    exit_section_(b, m, TARGET_LINK_ENTRY, r);
    return r;
  }

  // (targetFile (COMMA targetFile)* COMMA?)?
  private static boolean targetLinkEntry_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "targetLinkEntry_3")) return false;
    targetLinkEntry_3_0(b, l + 1);
    return true;
  }

  // targetFile (COMMA targetFile)* COMMA?
  private static boolean targetLinkEntry_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "targetLinkEntry_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = targetFile(b, l + 1);
    r = r && targetLinkEntry_3_0_1(b, l + 1);
    r = r && targetLinkEntry_3_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA targetFile)*
  private static boolean targetLinkEntry_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "targetLinkEntry_3_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!targetLinkEntry_3_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "targetLinkEntry_3_0_1", c)) break;
    }
    return true;
  }

  // COMMA targetFile
  private static boolean targetLinkEntry_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "targetLinkEntry_3_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && targetFile(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean targetLinkEntry_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "targetLinkEntry_3_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // LBRACE (targetLinkEntry (COMMA targetLinkEntry)* COMMA?)? RBRACE
  public static boolean targetLinkType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "targetLinkType")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && targetLinkType_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, TARGET_LINK_TYPE, r);
    return r;
  }

  // (targetLinkEntry (COMMA targetLinkEntry)* COMMA?)?
  private static boolean targetLinkType_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "targetLinkType_1")) return false;
    targetLinkType_1_0(b, l + 1);
    return true;
  }

  // targetLinkEntry (COMMA targetLinkEntry)* COMMA?
  private static boolean targetLinkType_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "targetLinkType_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = targetLinkEntry(b, l + 1);
    r = r && targetLinkType_1_0_1(b, l + 1);
    r = r && targetLinkType_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA targetLinkEntry)*
  private static boolean targetLinkType_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "targetLinkType_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!targetLinkType_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "targetLinkType_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA targetLinkEntry
  private static boolean targetLinkType_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "targetLinkType_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && targetLinkEntry(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean targetLinkType_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "targetLinkType_1_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // LOWER_IDENT OP_COLON (string | targetLinkType)
  public static boolean targetsField(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "targetsField")) return false;
    if (!nextTokenIs(b, LOWER_IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LOWER_IDENT, OP_COLON);
    r = r && targetsField_2(b, l + 1);
    exit_section_(b, m, TARGETS_FIELD, r);
    return r;
  }

  // string | targetLinkType
  private static boolean targetsField_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "targetsField_2")) return false;
    boolean r;
    r = string(b, l + 1);
    if (!r) r = targetLinkType(b, l + 1);
    return r;
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
  // statement | throwaway
  static boolean topLevelItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "topLevelItem")) return false;
    boolean r;
    r = statement(b, l + 1);
    if (!r) r = throwaway(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // (NO_SPACE_LPAREN | LPAREN) (pattern (COMMA pattern)* COMMA?)? RPAREN
  public static boolean tuplePattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuplePattern")) return false;
    if (!nextTokenIs(b, "<tuple pattern>", LPAREN, NO_SPACE_LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TUPLE_PATTERN, "<tuple pattern>");
    r = tuplePattern_0(b, l + 1);
    r = r && tuplePattern_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // NO_SPACE_LPAREN | LPAREN
  private static boolean tuplePattern_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuplePattern_0")) return false;
    boolean r;
    r = consumeToken(b, NO_SPACE_LPAREN);
    if (!r) r = consumeToken(b, LPAREN);
    return r;
  }

  // (pattern (COMMA pattern)* COMMA?)?
  private static boolean tuplePattern_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuplePattern_1")) return false;
    tuplePattern_1_0(b, l + 1);
    return true;
  }

  // pattern (COMMA pattern)* COMMA?
  private static boolean tuplePattern_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuplePattern_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = pattern(b, l + 1);
    r = r && tuplePattern_1_0_1(b, l + 1);
    r = r && tuplePattern_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA pattern)*
  private static boolean tuplePattern_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuplePattern_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!tuplePattern_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tuplePattern_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA pattern
  private static boolean tuplePattern_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuplePattern_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && pattern(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean tuplePattern_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuplePattern_1_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
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
  // typeHeader (OP_COLON | OP_COLON_EQUAL | OP_DOUBLE_COLON) typeAnno whereClause?
  public static boolean typeDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDecl")) return false;
    if (!nextTokenIs(b, UPPER_IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeHeader(b, l + 1);
    r = r && typeDecl_1(b, l + 1);
    r = r && typeAnno(b, l + 1);
    r = r && typeDecl_3(b, l + 1);
    exit_section_(b, m, TYPE_DECL, r);
    return r;
  }

  // OP_COLON | OP_COLON_EQUAL | OP_DOUBLE_COLON
  private static boolean typeDecl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDecl_1")) return false;
    boolean r;
    r = consumeToken(b, OP_COLON);
    if (!r) r = consumeToken(b, OP_COLON_EQUAL);
    if (!r) r = consumeToken(b, OP_DOUBLE_COLON);
    return r;
  }

  // whereClause?
  private static boolean typeDecl_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDecl_3")) return false;
    whereClause(b, l + 1);
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
  // UPPER_IDENT typeHeaderArgs?
  public static boolean typeHeader(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeHeader")) return false;
    if (!nextTokenIs(b, UPPER_IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, UPPER_IDENT);
    r = r && typeHeader_1(b, l + 1);
    exit_section_(b, m, TYPE_HEADER, r);
    return r;
  }

  // typeHeaderArgs?
  private static boolean typeHeader_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeHeader_1")) return false;
    typeHeaderArgs(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (NO_SPACE_LPAREN | LPAREN) (typeParam (COMMA typeParam)* COMMA?)? RPAREN
  public static boolean typeHeaderArgs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeHeaderArgs")) return false;
    if (!nextTokenIs(b, "<type header args>", LPAREN, NO_SPACE_LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_HEADER_ARGS, "<type header args>");
    r = typeHeaderArgs_0(b, l + 1);
    r = r && typeHeaderArgs_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // NO_SPACE_LPAREN | LPAREN
  private static boolean typeHeaderArgs_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeHeaderArgs_0")) return false;
    boolean r;
    r = consumeToken(b, NO_SPACE_LPAREN);
    if (!r) r = consumeToken(b, LPAREN);
    return r;
  }

  // (typeParam (COMMA typeParam)* COMMA?)?
  private static boolean typeHeaderArgs_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeHeaderArgs_1")) return false;
    typeHeaderArgs_1_0(b, l + 1);
    return true;
  }

  // typeParam (COMMA typeParam)* COMMA?
  private static boolean typeHeaderArgs_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeHeaderArgs_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeParam(b, l + 1);
    r = r && typeHeaderArgs_1_0_1(b, l + 1);
    r = r && typeHeaderArgs_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA typeParam)*
  private static boolean typeHeaderArgs_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeHeaderArgs_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!typeHeaderArgs_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "typeHeaderArgs_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA typeParam
  private static boolean typeHeaderArgs_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeHeaderArgs_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && typeParam(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean typeHeaderArgs_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeHeaderArgs_1_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
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
  // LOWER_IDENT | NAMED_UNDERSCORE | UNDERSCORE
  public static boolean typeParam(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeParam")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_PARAM, "<type param>");
    r = consumeToken(b, LOWER_IDENT);
    if (!r) r = consumeToken(b, NAMED_UNDERSCORE);
    if (!r) r = consumeToken(b, UNDERSCORE);
    exit_section_(b, l, m, r, false, null);
    return r;
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

  /* ********************************************************** */
  // UNDERSCORE
  public static boolean underscorePattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "underscorePattern")) return false;
    if (!nextTokenIs(b, UNDERSCORE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, UNDERSCORE);
    exit_section_(b, m, UNDERSCORE_PATTERN, r);
    return r;
  }

  /* ********************************************************** */
  // (LOWER_IDENT | NAMED_UNDERSCORE) OP_COLON typeAnno whereClause?
  public static boolean valueAnnotation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueAnnotation")) return false;
    if (!nextTokenIs(b, "<value annotation>", LOWER_IDENT, NAMED_UNDERSCORE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE_ANNOTATION, "<value annotation>");
    r = valueAnnotation_0(b, l + 1);
    r = r && consumeToken(b, OP_COLON);
    r = r && typeAnno(b, l + 1);
    r = r && valueAnnotation_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LOWER_IDENT | NAMED_UNDERSCORE
  private static boolean valueAnnotation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueAnnotation_0")) return false;
    boolean r;
    r = consumeToken(b, LOWER_IDENT);
    if (!r) r = consumeToken(b, NAMED_UNDERSCORE);
    return r;
  }

  // whereClause?
  private static boolean valueAnnotation_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueAnnotation_3")) return false;
    whereClause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // patternNoAlts OP_ASSIGN expr
  public static boolean valueDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueDecl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE_DECL, "<value decl>");
    r = patternNoAlts(b, l + 1);
    r = r && consumeToken(b, OP_ASSIGN);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KW_VAR LOWER_IDENT
  public static boolean varPattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varPattern")) return false;
    if (!nextTokenIs(b, KW_VAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_VAR, LOWER_IDENT);
    exit_section_(b, m, VAR_PATTERN, r);
    return r;
  }

  /* ********************************************************** */
  // LOWER_IDENT (NO_SPACE_DOT_UPPER_IDENT | DOT_UPPER_IDENT)
  public static boolean whereAlias(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whereAlias")) return false;
    if (!nextTokenIs(b, LOWER_IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LOWER_IDENT);
    r = r && whereAlias_1(b, l + 1);
    exit_section_(b, m, WHERE_ALIAS, r);
    return r;
  }

  // NO_SPACE_DOT_UPPER_IDENT | DOT_UPPER_IDENT
  private static boolean whereAlias_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whereAlias_1")) return false;
    boolean r;
    r = consumeToken(b, NO_SPACE_DOT_UPPER_IDENT);
    if (!r) r = consumeToken(b, DOT_UPPER_IDENT);
    return r;
  }

  /* ********************************************************** */
  // KW_WHERE LBRACK whereClauseItem (COMMA whereClauseItem)* COMMA? RBRACK
  public static boolean whereClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whereClause")) return false;
    if (!nextTokenIs(b, KW_WHERE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_WHERE, LBRACK);
    r = r && whereClauseItem(b, l + 1);
    r = r && whereClause_3(b, l + 1);
    r = r && whereClause_4(b, l + 1);
    r = r && consumeToken(b, RBRACK);
    exit_section_(b, m, WHERE_CLAUSE, r);
    return r;
  }

  // (COMMA whereClauseItem)*
  private static boolean whereClause_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whereClause_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!whereClause_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "whereClause_3", c)) break;
    }
    return true;
  }

  // COMMA whereClauseItem
  private static boolean whereClause_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whereClause_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && whereClauseItem(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean whereClause_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whereClause_4")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // whereMethod | whereAlias
  static boolean whereClauseItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whereClauseItem")) return false;
    if (!nextTokenIs(b, LOWER_IDENT)) return false;
    boolean r;
    r = whereMethod(b, l + 1);
    if (!r) r = whereAlias(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // LOWER_IDENT (NO_SPACE_DOT_LOWER_IDENT | DOT_LOWER_IDENT) OP_COLON typeAnno
  public static boolean whereMethod(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whereMethod")) return false;
    if (!nextTokenIs(b, LOWER_IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LOWER_IDENT);
    r = r && whereMethod_1(b, l + 1);
    r = r && consumeToken(b, OP_COLON);
    r = r && typeAnno(b, l + 1);
    exit_section_(b, m, WHERE_METHOD, r);
    return r;
  }

  // NO_SPACE_DOT_LOWER_IDENT | DOT_LOWER_IDENT
  private static boolean whereMethod_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whereMethod_1")) return false;
    boolean r;
    r = consumeToken(b, NO_SPACE_DOT_LOWER_IDENT);
    if (!r) r = consumeToken(b, DOT_LOWER_IDENT);
    return r;
  }

  /* ********************************************************** */
  // Expression root: expr
  // Operator priority table:
  // 0: BINARY(orExpr)
  // 1: BINARY(andExpr)
  // 2: BINARY(comparisonExpr)
  // 3: BINARY(binQuestionExpr)
  // 4: BINARY(coalesceExpr)
  // 5: BINARY(addExpr)
  // 6: BINARY(modExpr)
  // 7: BINARY(intDivExpr)
  // 8: BINARY(divExpr)
  // 9: BINARY(mulExpr)
  // 10: PREFIX(unaryExpr)
  // 11: POSTFIX(callExpr)
  // 12: POSTFIX(methodCallExpr)
  // 13: POSTFIX(fieldAccessExpr)
  // 14: POSTFIX(tupleAccessExpr)
  // 15: POSTFIX(questionSuffixExpr)
  // 16: ATOM(intLiteral)
  // 17: ATOM(floatLiteral)
  // 18: ATOM(charLiteral)
  // 19: ATOM(string)
  // 20: ATOM(qualifiedNameExpr)
  // 21: ATOM(tagExpr)
  // 22: ATOM(identExpr)
  // 23: ATOM(ellipsisExpr)
  // 24: ATOM(ifExpr)
  // 25: PREFIX(matchExpr)
  // 26: ATOM(forExpr)
  // 27: ATOM(lambdaExpr)
  // 28: ATOM(listExpr)
  // 29: ATOM(tupleExpr)
  // 30: ATOM(recordExpr)
  // 31: ATOM(blockExpr)
  public static boolean expr(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "expr")) return false;
    addVariant(b, "<expr>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<expr>");
    r = unaryExpr(b, l + 1);
    if (!r) r = intLiteral(b, l + 1);
    if (!r) r = floatLiteral(b, l + 1);
    if (!r) r = charLiteral(b, l + 1);
    if (!r) r = string(b, l + 1);
    if (!r) r = qualifiedNameExpr(b, l + 1);
    if (!r) r = tagExpr(b, l + 1);
    if (!r) r = identExpr(b, l + 1);
    if (!r) r = ellipsisExpr(b, l + 1);
    if (!r) r = ifExpr(b, l + 1);
    if (!r) r = matchExpr(b, l + 1);
    if (!r) r = forExpr(b, l + 1);
    if (!r) r = lambdaExpr(b, l + 1);
    if (!r) r = listExpr(b, l + 1);
    if (!r) r = tupleExpr(b, l + 1);
    if (!r) r = recordExpr(b, l + 1);
    if (!r) r = blockExpr(b, l + 1);
    p = r;
    r = r && expr_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean expr_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "expr_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 0 && consumeTokenSmart(b, KW_OR)) {
        r = expr(b, l, -1);
        exit_section_(b, l, m, BINARY_EXPR, r, true, null);
      }
      else if (g < 1 && consumeTokenSmart(b, KW_AND)) {
        r = expr(b, l, 0);
        exit_section_(b, l, m, BINARY_EXPR, r, true, null);
      }
      else if (g < 2 && comparisonExpr_0(b, l + 1)) {
        r = expr(b, l, 2);
        exit_section_(b, l, m, BINARY_EXPR, r, true, null);
      }
      else if (g < 3 && consumeTokenSmart(b, OP_QUESTION)) {
        r = expr(b, l, 3);
        exit_section_(b, l, m, BINARY_EXPR, r, true, null);
      }
      else if (g < 4 && consumeTokenSmart(b, OP_DOUBLE_QUESTION)) {
        r = expr(b, l, 4);
        exit_section_(b, l, m, BINARY_EXPR, r, true, null);
      }
      else if (g < 5 && addExpr_0(b, l + 1)) {
        r = expr(b, l, 5);
        exit_section_(b, l, m, BINARY_EXPR, r, true, null);
      }
      else if (g < 6 && consumeTokenSmart(b, OP_PERCENT)) {
        r = expr(b, l, 6);
        exit_section_(b, l, m, BINARY_EXPR, r, true, null);
      }
      else if (g < 7 && consumeTokenSmart(b, OP_DOUBLE_SLASH)) {
        r = expr(b, l, 7);
        exit_section_(b, l, m, BINARY_EXPR, r, true, null);
      }
      else if (g < 8 && consumeTokenSmart(b, OP_SLASH)) {
        r = expr(b, l, 8);
        exit_section_(b, l, m, BINARY_EXPR, r, true, null);
      }
      else if (g < 9 && consumeTokenSmart(b, OP_STAR)) {
        r = expr(b, l, 9);
        exit_section_(b, l, m, BINARY_EXPR, r, true, null);
      }
      else if (g < 11 && callArgs(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, CALL_EXPR, r, true, null);
      }
      else if (g < 12 && methodCallExpr_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, METHOD_CALL_EXPR, r, true, null);
      }
      else if (g < 13 && fieldAccessExpr_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, FIELD_ACCESS_EXPR, r, true, null);
      }
      else if (g < 14 && tupleAccessExpr_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, TUPLE_ACCESS_EXPR, r, true, null);
      }
      else if (g < 15 && consumeTokenSmart(b, NO_SPACE_OP_QUESTION)) {
        r = true;
        exit_section_(b, l, m, QUESTION_SUFFIX_EXPR, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  // OP_EQUALS | OP_NOT_EQUALS | OP_LESS_THAN | OP_GREATER_THAN
  //                           | OP_LESS_THAN_OR_EQ | OP_GREATER_THAN_OR_EQ
  private static boolean comparisonExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparisonExpr_0")) return false;
    boolean r;
    r = consumeTokenSmart(b, OP_EQUALS);
    if (!r) r = consumeTokenSmart(b, OP_NOT_EQUALS);
    if (!r) r = consumeTokenSmart(b, OP_LESS_THAN);
    if (!r) r = consumeTokenSmart(b, OP_GREATER_THAN);
    if (!r) r = consumeTokenSmart(b, OP_LESS_THAN_OR_EQ);
    if (!r) r = consumeTokenSmart(b, OP_GREATER_THAN_OR_EQ);
    return r;
  }

  // OP_PLUS | OP_BINARY_MINUS
  private static boolean addExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "addExpr_0")) return false;
    boolean r;
    r = consumeTokenSmart(b, OP_PLUS);
    if (!r) r = consumeTokenSmart(b, OP_BINARY_MINUS);
    return r;
  }

  public static boolean unaryExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryExpr")) return false;
    if (!nextTokenIsSmart(b, OP_BANG, OP_UNARY_MINUS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = unaryExpr_0(b, l + 1);
    p = r;
    r = p && expr(b, l, 10);
    exit_section_(b, l, m, UNARY_EXPR, r, p, null);
    return r || p;
  }

  // OP_UNARY_MINUS | OP_BANG
  private static boolean unaryExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryExpr_0")) return false;
    boolean r;
    r = consumeTokenSmart(b, OP_UNARY_MINUS);
    if (!r) r = consumeTokenSmart(b, OP_BANG);
    return r;
  }

  // (NO_SPACE_DOT_LOWER_IDENT | DOT_LOWER_IDENT) callArgs
  private static boolean methodCallExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCallExpr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = methodCallExpr_0_0(b, l + 1);
    r = r && callArgs(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NO_SPACE_DOT_LOWER_IDENT | DOT_LOWER_IDENT
  private static boolean methodCallExpr_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCallExpr_0_0")) return false;
    boolean r;
    r = consumeTokenSmart(b, NO_SPACE_DOT_LOWER_IDENT);
    if (!r) r = consumeTokenSmart(b, DOT_LOWER_IDENT);
    return r;
  }

  // NO_SPACE_DOT_LOWER_IDENT | DOT_LOWER_IDENT
  private static boolean fieldAccessExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fieldAccessExpr_0")) return false;
    boolean r;
    r = consumeTokenSmart(b, NO_SPACE_DOT_LOWER_IDENT);
    if (!r) r = consumeTokenSmart(b, DOT_LOWER_IDENT);
    return r;
  }

  // NO_SPACE_DOT_INT | DOT_INT
  private static boolean tupleAccessExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tupleAccessExpr_0")) return false;
    boolean r;
    r = consumeTokenSmart(b, NO_SPACE_DOT_INT);
    if (!r) r = consumeTokenSmart(b, DOT_INT);
    return r;
  }

  // INT
  public static boolean intLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "intLiteral")) return false;
    if (!nextTokenIsSmart(b, INT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, INT);
    exit_section_(b, m, INT_LITERAL, r);
    return r;
  }

  // FLOAT
  public static boolean floatLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "floatLiteral")) return false;
    if (!nextTokenIsSmart(b, FLOAT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, FLOAT);
    exit_section_(b, m, FLOAT_LITERAL, r);
    return r;
  }

  // SINGLE_QUOTE
  public static boolean charLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "charLiteral")) return false;
    if (!nextTokenIsSmart(b, SINGLE_QUOTE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, SINGLE_QUOTE);
    exit_section_(b, m, CHAR_LITERAL, r);
    return r;
  }

  // STRING_START stringElement* STRING_END
  public static boolean string(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string")) return false;
    if (!nextTokenIsSmart(b, STRING_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, STRING_START);
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

  // UPPER_IDENT qualChainSeg+
  public static boolean qualifiedNameExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedNameExpr")) return false;
    if (!nextTokenIsSmart(b, UPPER_IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, UPPER_IDENT);
    r = r && qualifiedNameExpr_1(b, l + 1);
    exit_section_(b, m, QUALIFIED_NAME_EXPR, r);
    return r;
  }

  // qualChainSeg+
  private static boolean qualifiedNameExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedNameExpr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qualChainSeg(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!qualChainSeg(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "qualifiedNameExpr_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // UPPER_IDENT
  public static boolean tagExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tagExpr")) return false;
    if (!nextTokenIsSmart(b, UPPER_IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, UPPER_IDENT);
    exit_section_(b, m, TAG_EXPR, r);
    return r;
  }

  // LOWER_IDENT | NAMED_UNDERSCORE
  public static boolean identExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identExpr")) return false;
    if (!nextTokenIsSmart(b, LOWER_IDENT, NAMED_UNDERSCORE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENT_EXPR, "<ident expr>");
    r = consumeTokenSmart(b, LOWER_IDENT);
    if (!r) r = consumeTokenSmart(b, NAMED_UNDERSCORE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // TRIPLE_DOT
  public static boolean ellipsisExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ellipsisExpr")) return false;
    if (!nextTokenIsSmart(b, TRIPLE_DOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, TRIPLE_DOT);
    exit_section_(b, m, ELLIPSIS_EXPR, r);
    return r;
  }

  // KW_IF expr expr (KW_ELSE expr)?
  public static boolean ifExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifExpr")) return false;
    if (!nextTokenIsSmart(b, KW_IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, KW_IF);
    r = r && expr(b, l + 1, -1);
    r = r && expr(b, l + 1, -1);
    r = r && ifExpr_3(b, l + 1);
    exit_section_(b, m, IF_EXPR, r);
    return r;
  }

  // (KW_ELSE expr)?
  private static boolean ifExpr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifExpr_3")) return false;
    ifExpr_3_0(b, l + 1);
    return true;
  }

  // KW_ELSE expr
  private static boolean ifExpr_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifExpr_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, KW_ELSE);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  public static boolean matchExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchExpr")) return false;
    if (!nextTokenIsSmart(b, KW_MATCH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, KW_MATCH);
    p = r;
    r = p && expr(b, l, 25);
    r = p && report_error_(b, matchExpr_1(b, l + 1)) && r;
    exit_section_(b, l, m, MATCH_EXPR, r, p, null);
    return r || p;
  }

  // LBRACE matchBranch (COMMA? matchBranch)* COMMA? RBRACE
  private static boolean matchExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchExpr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && matchBranch(b, l + 1);
    r = r && matchExpr_1_2(b, l + 1);
    r = r && matchExpr_1_3(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA? matchBranch)*
  private static boolean matchExpr_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchExpr_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!matchExpr_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "matchExpr_1_2", c)) break;
    }
    return true;
  }

  // COMMA? matchBranch
  private static boolean matchExpr_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchExpr_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = matchExpr_1_2_0_0(b, l + 1);
    r = r && matchBranch(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean matchExpr_1_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchExpr_1_2_0_0")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  // COMMA?
  private static boolean matchExpr_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchExpr_1_3")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  // KW_FOR patternNoAlts KW_IN expr expr
  public static boolean forExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forExpr")) return false;
    if (!nextTokenIsSmart(b, KW_FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, KW_FOR);
    r = r && patternNoAlts(b, l + 1);
    r = r && consumeToken(b, KW_IN);
    r = r && expr(b, l + 1, -1);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, FOR_EXPR, r);
    return r;
  }

  // OP_BAR (patternNoAlts (COMMA patternNoAlts)* COMMA?)? OP_BAR expr
  public static boolean lambdaExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambdaExpr")) return false;
    if (!nextTokenIsSmart(b, OP_BAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, OP_BAR);
    r = r && lambdaExpr_1(b, l + 1);
    r = r && consumeToken(b, OP_BAR);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, LAMBDA_EXPR, r);
    return r;
  }

  // (patternNoAlts (COMMA patternNoAlts)* COMMA?)?
  private static boolean lambdaExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambdaExpr_1")) return false;
    lambdaExpr_1_0(b, l + 1);
    return true;
  }

  // patternNoAlts (COMMA patternNoAlts)* COMMA?
  private static boolean lambdaExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambdaExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = patternNoAlts(b, l + 1);
    r = r && lambdaExpr_1_0_1(b, l + 1);
    r = r && lambdaExpr_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA patternNoAlts)*
  private static boolean lambdaExpr_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambdaExpr_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!lambdaExpr_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "lambdaExpr_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA patternNoAlts
  private static boolean lambdaExpr_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambdaExpr_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, COMMA);
    r = r && patternNoAlts(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean lambdaExpr_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambdaExpr_1_0_2")) return false;
    consumeTokenSmart(b, COMMA);
    return true;
  }

  // LBRACK (expr (COMMA expr)* COMMA?)? RBRACK
  public static boolean listExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "listExpr")) return false;
    if (!nextTokenIsSmart(b, LBRACK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LBRACK);
    r = r && listExpr_1(b, l + 1);
    r = r && consumeToken(b, RBRACK);
    exit_section_(b, m, LIST_EXPR, r);
    return r;
  }

  // (expr (COMMA expr)* COMMA?)?
  private static boolean listExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "listExpr_1")) return false;
    listExpr_1_0(b, l + 1);
    return true;
  }

  // expr (COMMA expr)* COMMA?
  private static boolean listExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "listExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1, -1);
    r = r && listExpr_1_0_1(b, l + 1);
    r = r && listExpr_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA expr)*
  private static boolean listExpr_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "listExpr_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!listExpr_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "listExpr_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA expr
  private static boolean listExpr_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "listExpr_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, COMMA);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean listExpr_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "listExpr_1_0_2")) return false;
    consumeTokenSmart(b, COMMA);
    return true;
  }

  // (NO_SPACE_LPAREN | LPAREN) (expr (COMMA expr)* COMMA?)? RPAREN
  public static boolean tupleExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tupleExpr")) return false;
    if (!nextTokenIsSmart(b, LPAREN, NO_SPACE_LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TUPLE_EXPR, "<tuple expr>");
    r = tupleExpr_0(b, l + 1);
    r = r && tupleExpr_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // NO_SPACE_LPAREN | LPAREN
  private static boolean tupleExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tupleExpr_0")) return false;
    boolean r;
    r = consumeTokenSmart(b, NO_SPACE_LPAREN);
    if (!r) r = consumeTokenSmart(b, LPAREN);
    return r;
  }

  // (expr (COMMA expr)* COMMA?)?
  private static boolean tupleExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tupleExpr_1")) return false;
    tupleExpr_1_0(b, l + 1);
    return true;
  }

  // expr (COMMA expr)* COMMA?
  private static boolean tupleExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tupleExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1, -1);
    r = r && tupleExpr_1_0_1(b, l + 1);
    r = r && tupleExpr_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA expr)*
  private static boolean tupleExpr_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tupleExpr_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!tupleExpr_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tupleExpr_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA expr
  private static boolean tupleExpr_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tupleExpr_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, COMMA);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean tupleExpr_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tupleExpr_1_0_2")) return false;
    consumeTokenSmart(b, COMMA);
    return true;
  }

  // LBRACE recordExprBody? RBRACE
  public static boolean recordExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordExpr")) return false;
    if (!nextTokenIsSmart(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LBRACE);
    r = r && recordExpr_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, RECORD_EXPR, r);
    return r;
  }

  // recordExprBody?
  private static boolean recordExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordExpr_1")) return false;
    recordExprBody(b, l + 1);
    return true;
  }

  // LBRACE blockStmt+ RBRACE
  public static boolean blockExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "blockExpr")) return false;
    if (!nextTokenIsSmart(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LBRACE);
    r = r && blockExpr_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, BLOCK_EXPR, r);
    return r;
  }

  // blockStmt+
  private static boolean blockExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "blockExpr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = blockStmt(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!blockStmt(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "blockExpr_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

}
