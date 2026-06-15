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
    create_token_set_(ARROW_CALL_EXPR, BINARY_EXPR, BLOCK_EXPR, CALL_EXPR,
      CHAR_LITERAL, DBG_EXPR, ELLIPSIS_EXPR, EXPR,
      FIELD_ACCESS_EXPR, FLOAT_LITERAL, FOR_EXPR, IDENT_EXPR,
      IF_EXPR, INT_LITERAL, LAMBDA_EXPR, LIST_EXPR,
      MATCH_EXPR, METHOD_CALL_EXPR, MULTILINE_STRING_EXPR, QUALIFIED_NAME_EXPR,
      QUESTION_SUFFIX_EXPR, RECORD_EXPR, STRING, TAG_EXPR,
      TUPLE_ACCESS_EXPR, TUPLE_EXPR, TYPED_FLOAT_LITERAL, TYPED_INT_LITERAL,
      UNARY_EXPR),
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
  // (qualifiedNameExpr | tagExpr | identExpr | tupleExpr) callArgs*
  static boolean arrowCallTarget(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrowCallTarget")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = arrowCallTarget_0(b, l + 1);
    r = r && arrowCallTarget_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // qualifiedNameExpr | tagExpr | identExpr | tupleExpr
  private static boolean arrowCallTarget_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrowCallTarget_0")) return false;
    boolean r;
    r = qualifiedNameExpr(b, l + 1);
    if (!r) r = tagExpr(b, l + 1);
    if (!r) r = identExpr(b, l + 1);
    if (!r) r = tupleExpr(b, l + 1);
    return r;
  }

  // callArgs*
  private static boolean arrowCallTarget_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrowCallTarget_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!callArgs(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "arrowCallTarget_1", c)) break;
    }
    return true;
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
  // DOT LBRACE associatedItemElem* RBRACE
  public static boolean associatedBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "associatedBlock")) return false;
    if (!nextTokenIs(b, DOT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ASSOCIATED_BLOCK, null);
    r = consumeTokens(b, 2, DOT, LBRACE);
    p = r; // pin = 2
    r = r && report_error_(b, associatedBlock_2(b, l + 1));
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // associatedItemElem*
  private static boolean associatedBlock_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "associatedBlock_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!associatedItemElem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "associatedBlock_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // valueAnnotation | typeDecl | valueDecl
  static boolean associatedItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "associatedItem")) return false;
    boolean r;
    r = valueAnnotation(b, l + 1);
    if (!r) r = typeDecl(b, l + 1);
    if (!r) r = valueDecl(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // !RBRACE associatedItem
  static boolean associatedItemElem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "associatedItemElem")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = associatedItemElem_0(b, l + 1);
    p = r; // pin = 1
    r = r && associatedItem(b, l + 1);
    exit_section_(b, l, m, r, p, RocParser::associatedItemRecover);
    return r || p;
  }

  // !RBRACE
  private static boolean associatedItemElem_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "associatedItemElem_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // !(RBRACE | KW_VAR | patternFirst)
  static boolean associatedItemRecover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "associatedItemRecover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !associatedItemRecover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // RBRACE | KW_VAR | patternFirst
  private static boolean associatedItemRecover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "associatedItemRecover_0")) return false;
    boolean r;
    r = consumeToken(b, RBRACE);
    if (!r) r = consumeToken(b, KW_VAR);
    if (!r) r = patternFirst(b, l + 1);
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
  // keywordStmt | valueAnnotation | varDecl | valueDecl | expr
  static boolean blockStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "blockStmt")) return false;
    boolean r;
    r = keywordStmt(b, l + 1);
    if (!r) r = valueAnnotation(b, l + 1);
    if (!r) r = varDecl(b, l + 1);
    if (!r) r = valueDecl(b, l + 1);
    if (!r) r = expr(b, l + 1, -1);
    return r;
  }

  /* ********************************************************** */
  // !RBRACE blockStmt
  static boolean blockStmtElem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "blockStmtElem")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = blockStmtElem_0(b, l + 1);
    p = r; // pin = 1
    r = r && blockStmt(b, l + 1);
    exit_section_(b, l, m, r, p, RocParser::blockStmtRecover);
    return r || p;
  }

  // !RBRACE
  private static boolean blockStmtElem_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "blockStmtElem_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // !(RBRACE | statementFirst)
  static boolean blockStmtRecover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "blockStmtRecover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !blockStmtRecover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // RBRACE | statementFirst
  private static boolean blockStmtRecover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "blockStmtRecover_0")) return false;
    boolean r;
    r = consumeToken(b, RBRACE);
    if (!r) r = statementFirst(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // !(RBRACE | LOWER_IDENT)
  static boolean braceLowerIdentRecover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "braceLowerIdentRecover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !braceLowerIdentRecover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // RBRACE | LOWER_IDENT
  private static boolean braceLowerIdentRecover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "braceLowerIdentRecover_0")) return false;
    boolean r;
    r = consumeToken(b, RBRACE);
    if (!r) r = consumeToken(b, LOWER_IDENT);
    return r;
  }

  /* ********************************************************** */
  // KW_BREAK
  public static boolean breakStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "breakStmt")) return false;
    if (!nextTokenIs(b, KW_BREAK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_BREAK);
    exit_section_(b, m, BREAK_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // !RPAREN expr (COMMA | &RPAREN)
  static boolean callArg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callArg")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = callArg_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, expr(b, l + 1, -1));
    r = p && callArg_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, RocParser::exprParenRecover);
    return r || p;
  }

  // !RPAREN
  private static boolean callArg_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callArg_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COMMA | &RPAREN
  private static boolean callArg_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callArg_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    if (!r) r = callArg_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &RPAREN
  private static boolean callArg_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callArg_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = consumeToken(b, RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // NO_SPACE_LPAREN callArg* RPAREN
  static boolean callArgs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callArgs")) return false;
    if (!nextTokenIs(b, NO_SPACE_LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, NO_SPACE_LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, callArgs_1(b, l + 1));
    r = p && consumeToken(b, RPAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // callArg*
  private static boolean callArgs_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callArgs_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!callArg(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "callArgs_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KW_CRASH  expr
  public static boolean crashStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "crashStmt")) return false;
    if (!nextTokenIs(b, KW_CRASH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_CRASH);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, CRASH_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // KW_EXPECT expr
  public static boolean expectStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expectStmt")) return false;
    if (!nextTokenIs(b, KW_EXPECT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_EXPECT);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, EXPECT_STMT, r);
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
  // LOWER_IDENT | UPPER_IDENT
  static boolean exposedItemFirst(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exposedItemFirst")) return false;
    if (!nextTokenIs(b, "", LOWER_IDENT, UPPER_IDENT)) return false;
    boolean r;
    r = consumeToken(b, LOWER_IDENT);
    if (!r) r = consumeToken(b, UPPER_IDENT);
    return r;
  }

  /* ********************************************************** */
  // !(RBRACK | exposedItemFirst)
  static boolean exposedItemRecover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exposedItemRecover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !exposedItemRecover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // RBRACK | exposedItemFirst
  private static boolean exposedItemRecover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exposedItemRecover_0")) return false;
    boolean r;
    r = consumeToken(b, RBRACK);
    if (!r) r = exposedItemFirst(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // LBRACK exposedListElem* RBRACK
  static boolean exposedList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exposedList")) return false;
    if (!nextTokenIs(b, LBRACK)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, LBRACK);
    p = r; // pin = 1
    r = r && report_error_(b, exposedList_1(b, l + 1));
    r = p && consumeToken(b, RBRACK) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // exposedListElem*
  private static boolean exposedList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exposedList_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!exposedListElem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "exposedList_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // !RBRACK exposedItem (COMMA | &RBRACK)
  static boolean exposedListElem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exposedListElem")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = exposedListElem_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, exposedItem(b, l + 1));
    r = p && exposedListElem_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, RocParser::exposedItemRecover);
    return r || p;
  }

  // !RBRACK
  private static boolean exposedListElem_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exposedListElem_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, RBRACK);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COMMA | &RBRACK
  private static boolean exposedListElem_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exposedListElem_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    if (!r) r = exposedListElem_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &RBRACK
  private static boolean exposedListElem_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exposedListElem_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = consumeToken(b, RBRACK);
    exit_section_(b, l, m, r, false, null);
    return r;
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
  // !(RBRACK | exprFirst)
  static boolean exprBracketRecover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprBracketRecover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !exprBracketRecover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // RBRACK | exprFirst
  private static boolean exprBracketRecover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprBracketRecover_0")) return false;
    boolean r;
    r = consumeToken(b, RBRACK);
    if (!r) r = exprFirst(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // INT | FLOAT | SINGLE_QUOTE | STRING_START | MULTILINE_STRING_START
  //                     | LOWER_IDENT | UPPER_IDENT | NAMED_UNDERSCORE | TRIPLE_DOT
  //                     | KW_IF | KW_MATCH | KW_FOR | KW_DBG | OP_BAR
  //                     | OP_UNARY_MINUS | OP_BANG
  //                     | LBRACK | LBRACE | NO_SPACE_LPAREN | LPAREN
  static boolean exprFirst(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprFirst")) return false;
    boolean r;
    r = consumeToken(b, INT);
    if (!r) r = consumeToken(b, FLOAT);
    if (!r) r = consumeToken(b, SINGLE_QUOTE);
    if (!r) r = consumeToken(b, STRING_START);
    if (!r) r = consumeToken(b, MULTILINE_STRING_START);
    if (!r) r = consumeToken(b, LOWER_IDENT);
    if (!r) r = consumeToken(b, UPPER_IDENT);
    if (!r) r = consumeToken(b, NAMED_UNDERSCORE);
    if (!r) r = consumeToken(b, TRIPLE_DOT);
    if (!r) r = consumeToken(b, KW_IF);
    if (!r) r = consumeToken(b, KW_MATCH);
    if (!r) r = consumeToken(b, KW_FOR);
    if (!r) r = consumeToken(b, KW_DBG);
    if (!r) r = consumeToken(b, OP_BAR);
    if (!r) r = consumeToken(b, OP_UNARY_MINUS);
    if (!r) r = consumeToken(b, OP_BANG);
    if (!r) r = consumeToken(b, LBRACK);
    if (!r) r = consumeToken(b, LBRACE);
    if (!r) r = consumeToken(b, NO_SPACE_LPAREN);
    if (!r) r = consumeToken(b, LPAREN);
    return r;
  }

  /* ********************************************************** */
  // !(RPAREN | exprFirst)
  static boolean exprParenRecover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprParenRecover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !exprParenRecover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // RPAREN | exprFirst
  private static boolean exprParenRecover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprParenRecover_0")) return false;
    boolean r;
    r = consumeToken(b, RPAREN);
    if (!r) r = exprFirst(b, l + 1);
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
  // expectStmt | crashStmt | returnStmt | whileStmt | breakStmt
  static boolean keywordStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "keywordStmt")) return false;
    boolean r;
    r = expectStmt(b, l + 1);
    if (!r) r = crashStmt(b, l + 1);
    if (!r) r = returnStmt(b, l + 1);
    if (!r) r = whileStmt(b, l + 1);
    if (!r) r = breakStmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // COMMENT | OPAQUE_NAME | OP_BACKSLASH
  static boolean lexerOnlyTokens(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lexerOnlyTokens")) return false;
    boolean r;
    r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, OPAQUE_NAME);
    if (!r) r = consumeToken(b, OP_BACKSLASH);
    return r;
  }

  /* ********************************************************** */
  // !RBRACK expr (COMMA | &RBRACK)
  static boolean listExprElem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "listExprElem")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = listExprElem_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, expr(b, l + 1, -1));
    r = p && listExprElem_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, RocParser::exprBracketRecover);
    return r || p;
  }

  // !RBRACK
  private static boolean listExprElem_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "listExprElem_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, RBRACK);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COMMA | &RBRACK
  private static boolean listExprElem_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "listExprElem_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    if (!r) r = listExprElem_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &RBRACK
  private static boolean listExprElem_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "listExprElem_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = consumeToken(b, RBRACK);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LBRACK listPatternElem* RBRACK
  public static boolean listPattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "listPattern")) return false;
    if (!nextTokenIs(b, LBRACK)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LIST_PATTERN, null);
    r = consumeToken(b, LBRACK);
    p = r; // pin = 1
    r = r && report_error_(b, listPattern_1(b, l + 1));
    r = p && consumeToken(b, RBRACK) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // listPatternElem*
  private static boolean listPattern_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "listPattern_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!listPatternElem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "listPattern_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // !RBRACK (listRestPattern | pattern) (COMMA | &RBRACK)
  static boolean listPatternElem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "listPatternElem")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = listPatternElem_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, listPatternElem_1(b, l + 1));
    r = p && listPatternElem_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, RocParser::patternBracketRecover);
    return r || p;
  }

  // !RBRACK
  private static boolean listPatternElem_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "listPatternElem_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, RBRACK);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // listRestPattern | pattern
  private static boolean listPatternElem_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "listPatternElem_1")) return false;
    boolean r;
    r = listRestPattern(b, l + 1);
    if (!r) r = pattern(b, l + 1);
    return r;
  }

  // COMMA | &RBRACK
  private static boolean listPatternElem_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "listPatternElem_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    if (!r) r = listPatternElem_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &RBRACK
  private static boolean listPatternElem_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "listPatternElem_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = consumeToken(b, RBRACK);
    exit_section_(b, l, m, r, false, null);
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
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, MATCH_BRANCH, "<match branch>");
    r = pattern(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, matchBranch_1(b, l + 1));
    r = p && report_error_(b, consumeToken(b, OP_FAT_ARROW)) && r;
    r = p && expr(b, l + 1, -1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
  // !RBRACE matchBranch COMMA?
  static boolean matchBranchElem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchBranchElem")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = matchBranchElem_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, matchBranch(b, l + 1));
    r = p && matchBranchElem_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, RocParser::matchBranchRecover);
    return r || p;
  }

  // !RBRACE
  private static boolean matchBranchElem_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchBranchElem_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COMMA?
  private static boolean matchBranchElem_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchBranchElem_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // !(RBRACE | patternFirst)
  static boolean matchBranchRecover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchBranchRecover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !matchBranchRecover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // RBRACE | patternFirst
  private static boolean matchBranchRecover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchBranchRecover_0")) return false;
    boolean r;
    r = consumeToken(b, RBRACE);
    if (!r) r = patternFirst(b, l + 1);
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
  // STRING_PART | stringInterpolation | MULTILINE_STRING_START
  static boolean multilineStringPart(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multilineStringPart")) return false;
    boolean r;
    r = consumeToken(b, STRING_PART);
    if (!r) r = stringInterpolation(b, l + 1);
    if (!r) r = consumeToken(b, MULTILINE_STRING_START);
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
  // LBRACE packagesElem* RBRACE
  public static boolean packages(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "packages")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PACKAGES, null);
    r = consumeToken(b, LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, packages_1(b, l + 1));
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // packagesElem*
  private static boolean packages_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "packages_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!packagesElem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "packages_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // !RBRACE packageEntry (COMMA | &RBRACE)
  static boolean packagesElem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "packagesElem")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = packagesElem_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, packageEntry(b, l + 1));
    r = p && packagesElem_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, RocParser::braceLowerIdentRecover);
    return r || p;
  }

  // !RBRACE
  private static boolean packagesElem_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "packagesElem_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COMMA | &RBRACE
  private static boolean packagesElem_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "packagesElem_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    if (!r) r = packagesElem_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &RBRACE
  private static boolean packagesElem_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "packagesElem_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
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
  // !(RBRACK | DOUBLE_DOT | patternFirst)
  static boolean patternBracketRecover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "patternBracketRecover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !patternBracketRecover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // RBRACK | DOUBLE_DOT | patternFirst
  private static boolean patternBracketRecover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "patternBracketRecover_0")) return false;
    boolean r;
    r = consumeToken(b, RBRACK);
    if (!r) r = consumeToken(b, DOUBLE_DOT);
    if (!r) r = patternFirst(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // UNDERSCORE | LOWER_IDENT | NAMED_UNDERSCORE | UPPER_IDENT
  //                        | INT | FLOAT | SINGLE_QUOTE | STRING_START
  //                        | LBRACK | LBRACE | NO_SPACE_LPAREN | LPAREN
  static boolean patternFirst(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "patternFirst")) return false;
    boolean r;
    r = consumeToken(b, UNDERSCORE);
    if (!r) r = consumeToken(b, LOWER_IDENT);
    if (!r) r = consumeToken(b, NAMED_UNDERSCORE);
    if (!r) r = consumeToken(b, UPPER_IDENT);
    if (!r) r = consumeToken(b, INT);
    if (!r) r = consumeToken(b, FLOAT);
    if (!r) r = consumeToken(b, SINGLE_QUOTE);
    if (!r) r = consumeToken(b, STRING_START);
    if (!r) r = consumeToken(b, LBRACK);
    if (!r) r = consumeToken(b, LBRACE);
    if (!r) r = consumeToken(b, NO_SPACE_LPAREN);
    if (!r) r = consumeToken(b, LPAREN);
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
  // !(RPAREN | patternFirst)
  static boolean patternParenRecover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "patternParenRecover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !patternParenRecover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // RPAREN | patternFirst
  private static boolean patternParenRecover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "patternParenRecover_0")) return false;
    boolean r;
    r = consumeToken(b, RPAREN);
    if (!r) r = patternFirst(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // underscorePattern
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
    r = underscorePattern(b, l + 1);
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
  // LBRACE platformProvidesElem* RBRACE
  public static boolean platformProvides(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "platformProvides")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PLATFORM_PROVIDES, null);
    r = consumeToken(b, LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, platformProvides_1(b, l + 1));
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // platformProvidesElem*
  private static boolean platformProvides_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "platformProvides_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!platformProvidesElem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "platformProvides_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // !RBRACE platformProvidesField (COMMA | &RBRACE)
  static boolean platformProvidesElem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "platformProvidesElem")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = platformProvidesElem_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, platformProvidesField(b, l + 1));
    r = p && platformProvidesElem_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, RocParser::braceLowerIdentRecover);
    return r || p;
  }

  // !RBRACE
  private static boolean platformProvidesElem_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "platformProvidesElem_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COMMA | &RBRACE
  private static boolean platformProvidesElem_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "platformProvidesElem_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    if (!r) r = platformProvidesElem_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &RBRACE
  private static boolean platformProvidesElem_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "platformProvidesElem_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
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
  // LBRACE RBRACE requiresBrace | requiresBrace
  public static boolean platformRequires(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "platformRequires")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = platformRequires_0(b, l + 1);
    if (!r) r = requiresBrace(b, l + 1);
    exit_section_(b, m, PLATFORM_REQUIRES, r);
    return r;
  }

  // LBRACE RBRACE requiresBrace
  private static boolean platformRequires_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "platformRequires_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LBRACE, RBRACE);
    r = r && requiresBrace(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_TARGETS OP_COLON LBRACE targetsElem* RBRACE
  public static boolean platformTargets(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "platformTargets")) return false;
    if (!nextTokenIs(b, KW_TARGETS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PLATFORM_TARGETS, null);
    r = consumeTokens(b, 3, KW_TARGETS, OP_COLON, LBRACE);
    p = r; // pin = 3
    r = r && report_error_(b, platformTargets_3(b, l + 1));
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // targetsElem*
  private static boolean platformTargets_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "platformTargets_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!targetsElem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "platformTargets_3", c)) break;
    }
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
  // LBRACE recordPatternElem* RBRACE
  public static boolean recordPattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordPattern")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, RECORD_PATTERN, null);
    r = consumeToken(b, LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, recordPattern_1(b, l + 1));
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // recordPatternElem*
  private static boolean recordPattern_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordPattern_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!recordPatternElem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "recordPattern_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // !RBRACE recordPatternField (COMMA | &RBRACE)
  static boolean recordPatternElem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordPatternElem")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = recordPatternElem_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, recordPatternField(b, l + 1));
    r = p && recordPatternElem_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, RocParser::recordPatternRecover);
    return r || p;
  }

  // !RBRACE
  private static boolean recordPatternElem_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordPatternElem_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COMMA | &RBRACE
  private static boolean recordPatternElem_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordPatternElem_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    if (!r) r = recordPatternElem_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &RBRACE
  private static boolean recordPatternElem_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordPatternElem_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
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
  // !(RBRACE | DOUBLE_DOT | LOWER_IDENT)
  static boolean recordPatternRecover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordPatternRecover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !recordPatternRecover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // RBRACE | DOUBLE_DOT | LOWER_IDENT
  private static boolean recordPatternRecover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordPatternRecover_0")) return false;
    boolean r;
    r = consumeToken(b, RBRACE);
    if (!r) r = consumeToken(b, DOUBLE_DOT);
    if (!r) r = consumeToken(b, LOWER_IDENT);
    return r;
  }

  /* ********************************************************** */
  // LBRACE recordTypeElem* (recordTypeExt COMMA?)? RBRACE
  public static boolean recordType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordType")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, RECORD_TYPE, null);
    r = consumeToken(b, LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, recordType_1(b, l + 1));
    r = p && report_error_(b, recordType_2(b, l + 1)) && r;
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // recordTypeElem*
  private static boolean recordType_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordType_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!recordTypeElem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "recordType_1", c)) break;
    }
    return true;
  }

  // (recordTypeExt COMMA?)?
  private static boolean recordType_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordType_2")) return false;
    recordType_2_0(b, l + 1);
    return true;
  }

  // recordTypeExt COMMA?
  private static boolean recordType_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordType_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = recordTypeExt(b, l + 1);
    r = r && recordType_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean recordType_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordType_2_0_1")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // !(RBRACE | DOUBLE_DOT) recordTypeField (COMMA | &(RBRACE | DOUBLE_DOT))
  static boolean recordTypeElem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordTypeElem")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = recordTypeElem_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, recordTypeField(b, l + 1));
    r = p && recordTypeElem_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, RocParser::recordTypeFieldRecover);
    return r || p;
  }

  // !(RBRACE | DOUBLE_DOT)
  private static boolean recordTypeElem_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordTypeElem_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !recordTypeElem_0_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // RBRACE | DOUBLE_DOT
  private static boolean recordTypeElem_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordTypeElem_0_0")) return false;
    boolean r;
    r = consumeToken(b, RBRACE);
    if (!r) r = consumeToken(b, DOUBLE_DOT);
    return r;
  }

  // COMMA | &(RBRACE | DOUBLE_DOT)
  private static boolean recordTypeElem_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordTypeElem_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    if (!r) r = recordTypeElem_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &(RBRACE | DOUBLE_DOT)
  private static boolean recordTypeElem_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordTypeElem_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = recordTypeElem_2_1_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // RBRACE | DOUBLE_DOT
  private static boolean recordTypeElem_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordTypeElem_2_1_0")) return false;
    boolean r;
    r = consumeToken(b, RBRACE);
    if (!r) r = consumeToken(b, DOUBLE_DOT);
    return r;
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
  // !(RBRACE | DOUBLE_DOT | LOWER_IDENT)
  static boolean recordTypeFieldRecover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordTypeFieldRecover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !recordTypeFieldRecover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // RBRACE | DOUBLE_DOT | LOWER_IDENT
  private static boolean recordTypeFieldRecover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordTypeFieldRecover_0")) return false;
    boolean r;
    r = consumeToken(b, RBRACE);
    if (!r) r = consumeToken(b, DOUBLE_DOT);
    if (!r) r = consumeToken(b, LOWER_IDENT);
    return r;
  }

  /* ********************************************************** */
  // LBRACE requiresElem* RBRACE
  static boolean requiresBrace(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "requiresBrace")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, requiresBrace_1(b, l + 1));
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // requiresElem*
  private static boolean requiresBrace_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "requiresBrace_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!requiresElem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "requiresBrace_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // !RBRACE requiresEntry (COMMA | &RBRACE)
  static boolean requiresElem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "requiresElem")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = requiresElem_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, requiresEntry(b, l + 1));
    r = p && requiresElem_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, RocParser::requiresRecover);
    return r || p;
  }

  // !RBRACE
  private static boolean requiresElem_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "requiresElem_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COMMA | &RBRACE
  private static boolean requiresElem_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "requiresElem_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    if (!r) r = requiresElem_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &RBRACE
  private static boolean requiresElem_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "requiresElem_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
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
  // LBRACK requiresForElem+ RBRACK KW_FOR
  public static boolean requiresForClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "requiresForClause")) return false;
    if (!nextTokenIs(b, LBRACK)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, REQUIRES_FOR_CLAUSE, null);
    r = consumeToken(b, LBRACK);
    p = r; // pin = 1
    r = r && report_error_(b, requiresForClause_1(b, l + 1));
    r = p && report_error_(b, consumeTokens(b, -1, RBRACK, KW_FOR)) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // requiresForElem+
  private static boolean requiresForClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "requiresForClause_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = requiresForElem(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!requiresForElem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "requiresForClause_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // !RBRACK requiresForAlias (COMMA | &RBRACK)
  static boolean requiresForElem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "requiresForElem")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = requiresForElem_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, requiresForAlias(b, l + 1));
    r = p && requiresForElem_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, RocParser::requiresForRecover);
    return r || p;
  }

  // !RBRACK
  private static boolean requiresForElem_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "requiresForElem_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, RBRACK);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COMMA | &RBRACK
  private static boolean requiresForElem_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "requiresForElem_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    if (!r) r = requiresForElem_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &RBRACK
  private static boolean requiresForElem_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "requiresForElem_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = consumeToken(b, RBRACK);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // !(RBRACK | UPPER_IDENT)
  static boolean requiresForRecover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "requiresForRecover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !requiresForRecover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // RBRACK | UPPER_IDENT
  private static boolean requiresForRecover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "requiresForRecover_0")) return false;
    boolean r;
    r = consumeToken(b, RBRACK);
    if (!r) r = consumeToken(b, UPPER_IDENT);
    return r;
  }

  /* ********************************************************** */
  // !(RBRACE | LBRACK | LOWER_IDENT)
  static boolean requiresRecover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "requiresRecover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !requiresRecover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // RBRACE | LBRACK | LOWER_IDENT
  private static boolean requiresRecover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "requiresRecover_0")) return false;
    boolean r;
    r = consumeToken(b, RBRACE);
    if (!r) r = consumeToken(b, LBRACK);
    if (!r) r = consumeToken(b, LOWER_IDENT);
    return r;
  }

  /* ********************************************************** */
  // KW_RETURN expr
  public static boolean returnStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "returnStmt")) return false;
    if (!nextTokenIs(b, KW_RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_RETURN);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, RETURN_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // header? rootStmt*
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

  // rootStmt*
  private static boolean root_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!rootStmt(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "root_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // !<<eof>> statement
  static boolean rootStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rootStmt")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = rootStmt_0(b, l + 1);
    p = r; // pin = 1
    r = r && statement(b, l + 1);
    exit_section_(b, l, m, r, p, RocParser::rootStmtRecover);
    return r || p;
  }

  // !<<eof>>
  private static boolean rootStmt_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rootStmt_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !eof(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // !statementFirst
  static boolean rootStmtRecover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rootStmtRecover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !statementFirst(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // importStatement | keywordStmt | valueAnnotation | typeDecl | varDecl | valueDecl | expr
  static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    r = importStatement(b, l + 1);
    if (!r) r = keywordStmt(b, l + 1);
    if (!r) r = valueAnnotation(b, l + 1);
    if (!r) r = typeDecl(b, l + 1);
    if (!r) r = varDecl(b, l + 1);
    if (!r) r = valueDecl(b, l + 1);
    if (!r) r = expr(b, l + 1, -1);
    return r;
  }

  /* ********************************************************** */
  // KW_IMPORT | KW_EXPECT | KW_CRASH | KW_RETURN | KW_WHILE | KW_BREAK
  //                          | KW_VAR | UNDERSCORE | exprFirst
  static boolean statementFirst(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statementFirst")) return false;
    boolean r;
    r = consumeToken(b, KW_IMPORT);
    if (!r) r = consumeToken(b, KW_EXPECT);
    if (!r) r = consumeToken(b, KW_CRASH);
    if (!r) r = consumeToken(b, KW_RETURN);
    if (!r) r = consumeToken(b, KW_WHILE);
    if (!r) r = consumeToken(b, KW_BREAK);
    if (!r) r = consumeToken(b, KW_VAR);
    if (!r) r = consumeToken(b, UNDERSCORE);
    if (!r) r = exprFirst(b, l + 1);
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
  // OPEN_STRING_INTERPOLATION expr CLOSE_STRING_INTERPOLATION
  public static boolean stringInterpolation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stringInterpolation")) return false;
    if (!nextTokenIs(b, OPEN_STRING_INTERPOLATION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_STRING_INTERPOLATION);
    r = r && expr(b, l + 1, -1);
    r = r && consumeToken(b, CLOSE_STRING_INTERPOLATION);
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
  // !RPAREN pattern (COMMA | &RPAREN)
  static boolean tagPatternArg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tagPatternArg")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = tagPatternArg_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, pattern(b, l + 1));
    r = p && tagPatternArg_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, RocParser::patternParenRecover);
    return r || p;
  }

  // !RPAREN
  private static boolean tagPatternArg_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tagPatternArg_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COMMA | &RPAREN
  private static boolean tagPatternArg_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tagPatternArg_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    if (!r) r = tagPatternArg_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &RPAREN
  private static boolean tagPatternArg_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tagPatternArg_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = consumeToken(b, RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // NO_SPACE_LPAREN tagPatternArg* RPAREN
  public static boolean tagPatternArgs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tagPatternArgs")) return false;
    if (!nextTokenIs(b, NO_SPACE_LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TAG_PATTERN_ARGS, null);
    r = consumeToken(b, NO_SPACE_LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, tagPatternArgs_1(b, l + 1));
    r = p && consumeToken(b, RPAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // tagPatternArg*
  private static boolean tagPatternArgs_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tagPatternArgs_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!tagPatternArg(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tagPatternArgs_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // !(RBRACK | DOUBLE_DOT) tagUnionMember (COMMA | &(RBRACK | DOUBLE_DOT))
  static boolean tagUnionElem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tagUnionElem")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = tagUnionElem_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, tagUnionMember(b, l + 1));
    r = p && tagUnionElem_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, RocParser::tagUnionMemberRecover);
    return r || p;
  }

  // !(RBRACK | DOUBLE_DOT)
  private static boolean tagUnionElem_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tagUnionElem_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !tagUnionElem_0_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // RBRACK | DOUBLE_DOT
  private static boolean tagUnionElem_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tagUnionElem_0_0")) return false;
    boolean r;
    r = consumeToken(b, RBRACK);
    if (!r) r = consumeToken(b, DOUBLE_DOT);
    return r;
  }

  // COMMA | &(RBRACK | DOUBLE_DOT)
  private static boolean tagUnionElem_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tagUnionElem_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    if (!r) r = tagUnionElem_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &(RBRACK | DOUBLE_DOT)
  private static boolean tagUnionElem_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tagUnionElem_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = tagUnionElem_2_1_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // RBRACK | DOUBLE_DOT
  private static boolean tagUnionElem_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tagUnionElem_2_1_0")) return false;
    boolean r;
    r = consumeToken(b, RBRACK);
    if (!r) r = consumeToken(b, DOUBLE_DOT);
    return r;
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
  // !(RBRACK | DOUBLE_DOT | UPPER_IDENT)
  static boolean tagUnionMemberRecover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tagUnionMemberRecover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !tagUnionMemberRecover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // RBRACK | DOUBLE_DOT | UPPER_IDENT
  private static boolean tagUnionMemberRecover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tagUnionMemberRecover_0")) return false;
    boolean r;
    r = consumeToken(b, RBRACK);
    if (!r) r = consumeToken(b, DOUBLE_DOT);
    if (!r) r = consumeToken(b, UPPER_IDENT);
    return r;
  }

  /* ********************************************************** */
  // LBRACK tagUnionElem* (tagUnionExt COMMA?)? RBRACK
  public static boolean tagUnionType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tagUnionType")) return false;
    if (!nextTokenIs(b, LBRACK)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TAG_UNION_TYPE, null);
    r = consumeToken(b, LBRACK);
    p = r; // pin = 1
    r = r && report_error_(b, tagUnionType_1(b, l + 1));
    r = p && report_error_(b, tagUnionType_2(b, l + 1)) && r;
    r = p && consumeToken(b, RBRACK) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // tagUnionElem*
  private static boolean tagUnionType_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tagUnionType_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!tagUnionElem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tagUnionType_1", c)) break;
    }
    return true;
  }

  // (tagUnionExt COMMA?)?
  private static boolean tagUnionType_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tagUnionType_2")) return false;
    tagUnionType_2_0(b, l + 1);
    return true;
  }

  // tagUnionExt COMMA?
  private static boolean tagUnionType_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tagUnionType_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tagUnionExt(b, l + 1);
    r = r && tagUnionType_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean tagUnionType_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tagUnionType_2_0_1")) return false;
    consumeToken(b, COMMA);
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
  // !RBRACK targetFile (COMMA | &RBRACK)
  static boolean targetFileElem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "targetFileElem")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = targetFileElem_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, targetFile(b, l + 1));
    r = p && targetFileElem_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, RocParser::targetFileRecover);
    return r || p;
  }

  // !RBRACK
  private static boolean targetFileElem_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "targetFileElem_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, RBRACK);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COMMA | &RBRACK
  private static boolean targetFileElem_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "targetFileElem_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    if (!r) r = targetFileElem_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &RBRACK
  private static boolean targetFileElem_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "targetFileElem_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = consumeToken(b, RBRACK);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // !(RBRACK | STRING_START | LOWER_IDENT | KW_APP)
  static boolean targetFileRecover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "targetFileRecover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !targetFileRecover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // RBRACK | STRING_START | LOWER_IDENT | KW_APP
  private static boolean targetFileRecover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "targetFileRecover_0")) return false;
    boolean r;
    r = consumeToken(b, RBRACK);
    if (!r) r = consumeToken(b, STRING_START);
    if (!r) r = consumeToken(b, LOWER_IDENT);
    if (!r) r = consumeToken(b, KW_APP);
    return r;
  }

  /* ********************************************************** */
  // !RBRACE targetLinkEntry (COMMA | &RBRACE)
  static boolean targetLinkElem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "targetLinkElem")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = targetLinkElem_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, targetLinkEntry(b, l + 1));
    r = p && targetLinkElem_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, RocParser::braceLowerIdentRecover);
    return r || p;
  }

  // !RBRACE
  private static boolean targetLinkElem_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "targetLinkElem_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COMMA | &RBRACE
  private static boolean targetLinkElem_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "targetLinkElem_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    if (!r) r = targetLinkElem_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &RBRACE
  private static boolean targetLinkElem_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "targetLinkElem_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LOWER_IDENT OP_COLON LBRACK targetFileElem* RBRACK
  public static boolean targetLinkEntry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "targetLinkEntry")) return false;
    if (!nextTokenIs(b, LOWER_IDENT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TARGET_LINK_ENTRY, null);
    r = consumeTokens(b, 3, LOWER_IDENT, OP_COLON, LBRACK);
    p = r; // pin = 3
    r = r && report_error_(b, targetLinkEntry_3(b, l + 1));
    r = p && consumeToken(b, RBRACK) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // targetFileElem*
  private static boolean targetLinkEntry_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "targetLinkEntry_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!targetFileElem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "targetLinkEntry_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LBRACE targetLinkElem* RBRACE
  public static boolean targetLinkType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "targetLinkType")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TARGET_LINK_TYPE, null);
    r = consumeToken(b, LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, targetLinkType_1(b, l + 1));
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // targetLinkElem*
  private static boolean targetLinkType_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "targetLinkType_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!targetLinkElem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "targetLinkType_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // !RBRACE targetsField (COMMA | &RBRACE)
  static boolean targetsElem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "targetsElem")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = targetsElem_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, targetsField(b, l + 1));
    r = p && targetsElem_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, RocParser::braceLowerIdentRecover);
    return r || p;
  }

  // !RBRACE
  private static boolean targetsElem_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "targetsElem_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COMMA | &RBRACE
  private static boolean targetsElem_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "targetsElem_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    if (!r) r = targetsElem_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &RBRACE
  private static boolean targetsElem_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "targetsElem_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
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
  // !RPAREN expr (COMMA | &RPAREN)
  static boolean tupleExprElem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tupleExprElem")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = tupleExprElem_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, expr(b, l + 1, -1));
    r = p && tupleExprElem_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, RocParser::exprParenRecover);
    return r || p;
  }

  // !RPAREN
  private static boolean tupleExprElem_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tupleExprElem_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COMMA | &RPAREN
  private static boolean tupleExprElem_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tupleExprElem_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    if (!r) r = tupleExprElem_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &RPAREN
  private static boolean tupleExprElem_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tupleExprElem_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = consumeToken(b, RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (NO_SPACE_LPAREN | LPAREN) tuplePatternElem* RPAREN
  public static boolean tuplePattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuplePattern")) return false;
    if (!nextTokenIs(b, "<tuple pattern>", LPAREN, NO_SPACE_LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _COLLAPSE_, TUPLE_PATTERN, "<tuple pattern>");
    r = tuplePattern_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, tuplePattern_1(b, l + 1));
    r = p && consumeToken(b, RPAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // NO_SPACE_LPAREN | LPAREN
  private static boolean tuplePattern_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuplePattern_0")) return false;
    boolean r;
    r = consumeToken(b, NO_SPACE_LPAREN);
    if (!r) r = consumeToken(b, LPAREN);
    return r;
  }

  // tuplePatternElem*
  private static boolean tuplePattern_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuplePattern_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!tuplePatternElem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tuplePattern_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // !RPAREN pattern (COMMA | &RPAREN)
  static boolean tuplePatternElem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuplePatternElem")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = tuplePatternElem_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, pattern(b, l + 1));
    r = p && tuplePatternElem_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, RocParser::patternParenRecover);
    return r || p;
  }

  // !RPAREN
  private static boolean tuplePatternElem_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuplePatternElem_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COMMA | &RPAREN
  private static boolean tuplePatternElem_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuplePatternElem_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    if (!r) r = tuplePatternElem_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &RPAREN
  private static boolean tuplePatternElem_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuplePatternElem_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = consumeToken(b, RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (NO_SPACE_LPAREN | LPAREN) tupleTypeElem* RPAREN
  public static boolean tupleType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tupleType")) return false;
    if (!nextTokenIs(b, "<tuple type>", LPAREN, NO_SPACE_LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _COLLAPSE_, TUPLE_TYPE, "<tuple type>");
    r = tupleType_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, tupleType_1(b, l + 1));
    r = p && consumeToken(b, RPAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // NO_SPACE_LPAREN | LPAREN
  private static boolean tupleType_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tupleType_0")) return false;
    boolean r;
    r = consumeToken(b, NO_SPACE_LPAREN);
    if (!r) r = consumeToken(b, LPAREN);
    return r;
  }

  // tupleTypeElem*
  private static boolean tupleType_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tupleType_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!tupleTypeElem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tupleType_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // !RPAREN typeAnno (COMMA | &RPAREN)
  static boolean tupleTypeElem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tupleTypeElem")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = tupleTypeElem_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, typeAnno(b, l + 1));
    r = p && tupleTypeElem_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, RocParser::typeAnnoParenRecover);
    return r || p;
  }

  // !RPAREN
  private static boolean tupleTypeElem_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tupleTypeElem_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COMMA | &RPAREN
  private static boolean tupleTypeElem_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tupleTypeElem_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    if (!r) r = tupleTypeElem_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &RPAREN
  private static boolean tupleTypeElem_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tupleTypeElem_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = consumeToken(b, RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
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
  // UPPER_IDENT | LOWER_IDENT | UNDERSCORE | NAMED_UNDERSCORE
  //                         | LBRACE | LBRACK | NO_SPACE_LPAREN | LPAREN
  static boolean typeAnnoFirst(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeAnnoFirst")) return false;
    boolean r;
    r = consumeToken(b, UPPER_IDENT);
    if (!r) r = consumeToken(b, LOWER_IDENT);
    if (!r) r = consumeToken(b, UNDERSCORE);
    if (!r) r = consumeToken(b, NAMED_UNDERSCORE);
    if (!r) r = consumeToken(b, LBRACE);
    if (!r) r = consumeToken(b, LBRACK);
    if (!r) r = consumeToken(b, NO_SPACE_LPAREN);
    if (!r) r = consumeToken(b, LPAREN);
    return r;
  }

  /* ********************************************************** */
  // !(RPAREN | typeAnnoFirst)
  static boolean typeAnnoParenRecover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeAnnoParenRecover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !typeAnnoParenRecover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // RPAREN | typeAnnoFirst
  private static boolean typeAnnoParenRecover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeAnnoParenRecover_0")) return false;
    boolean r;
    r = consumeToken(b, RPAREN);
    if (!r) r = typeAnnoFirst(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // !RPAREN typeAnno (COMMA | &RPAREN)
  static boolean typeArgument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeArgument")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = typeArgument_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, typeAnno(b, l + 1));
    r = p && typeArgument_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, RocParser::typeAnnoParenRecover);
    return r || p;
  }

  // !RPAREN
  private static boolean typeArgument_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeArgument_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COMMA | &RPAREN
  private static boolean typeArgument_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeArgument_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    if (!r) r = typeArgument_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &RPAREN
  private static boolean typeArgument_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeArgument_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = consumeToken(b, RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // NO_SPACE_LPAREN typeArgument* RPAREN
  public static boolean typeArguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeArguments")) return false;
    if (!nextTokenIs(b, NO_SPACE_LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TYPE_ARGUMENTS, null);
    r = consumeToken(b, NO_SPACE_LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, typeArguments_1(b, l + 1));
    r = p && consumeToken(b, RPAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // typeArgument*
  private static boolean typeArguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeArguments_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!typeArgument(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "typeArguments_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // typeHeader (OP_COLON | OP_COLON_EQUAL | OP_DOUBLE_COLON) typeAnno whereClause? associatedBlock?
  public static boolean typeDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDecl")) return false;
    if (!nextTokenIs(b, UPPER_IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeHeader(b, l + 1);
    r = r && typeDecl_1(b, l + 1);
    r = r && typeAnno(b, l + 1);
    r = r && typeDecl_3(b, l + 1);
    r = r && typeDecl_4(b, l + 1);
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

  // associatedBlock?
  private static boolean typeDecl_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDecl_4")) return false;
    associatedBlock(b, l + 1);
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
  // !RPAREN typeParam (COMMA | &RPAREN)
  static boolean typeHeaderArg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeHeaderArg")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = typeHeaderArg_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, typeParam(b, l + 1));
    r = p && typeHeaderArg_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, RocParser::typeParamParenRecover);
    return r || p;
  }

  // !RPAREN
  private static boolean typeHeaderArg_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeHeaderArg_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COMMA | &RPAREN
  private static boolean typeHeaderArg_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeHeaderArg_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    if (!r) r = typeHeaderArg_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &RPAREN
  private static boolean typeHeaderArg_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeHeaderArg_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = consumeToken(b, RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (NO_SPACE_LPAREN | LPAREN) typeHeaderArg* RPAREN
  public static boolean typeHeaderArgs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeHeaderArgs")) return false;
    if (!nextTokenIs(b, "<type header args>", LPAREN, NO_SPACE_LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TYPE_HEADER_ARGS, "<type header args>");
    r = typeHeaderArgs_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, typeHeaderArgs_1(b, l + 1));
    r = p && consumeToken(b, RPAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // NO_SPACE_LPAREN | LPAREN
  private static boolean typeHeaderArgs_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeHeaderArgs_0")) return false;
    boolean r;
    r = consumeToken(b, NO_SPACE_LPAREN);
    if (!r) r = consumeToken(b, LPAREN);
    return r;
  }

  // typeHeaderArg*
  private static boolean typeHeaderArgs_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeHeaderArgs_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!typeHeaderArg(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "typeHeaderArgs_1", c)) break;
    }
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
  // LOWER_IDENT | NAMED_UNDERSCORE | UNDERSCORE
  static boolean typeParamFirst(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeParamFirst")) return false;
    boolean r;
    r = consumeToken(b, LOWER_IDENT);
    if (!r) r = consumeToken(b, NAMED_UNDERSCORE);
    if (!r) r = consumeToken(b, UNDERSCORE);
    return r;
  }

  /* ********************************************************** */
  // !(RPAREN | typeParamFirst)
  static boolean typeParamParenRecover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeParamParenRecover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !typeParamParenRecover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // RPAREN | typeParamFirst
  private static boolean typeParamParenRecover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeParamParenRecover_0")) return false;
    boolean r;
    r = consumeToken(b, RPAREN);
    if (!r) r = typeParamFirst(b, l + 1);
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
  // KW_VAR? (LOWER_IDENT | NAMED_UNDERSCORE) OP_COLON typeAnno whereClause?
  public static boolean valueAnnotation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueAnnotation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE_ANNOTATION, "<value annotation>");
    r = valueAnnotation_0(b, l + 1);
    r = r && valueAnnotation_1(b, l + 1);
    r = r && consumeToken(b, OP_COLON);
    r = r && typeAnno(b, l + 1);
    r = r && valueAnnotation_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KW_VAR?
  private static boolean valueAnnotation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueAnnotation_0")) return false;
    consumeToken(b, KW_VAR);
    return true;
  }

  // LOWER_IDENT | NAMED_UNDERSCORE
  private static boolean valueAnnotation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueAnnotation_1")) return false;
    boolean r;
    r = consumeToken(b, LOWER_IDENT);
    if (!r) r = consumeToken(b, NAMED_UNDERSCORE);
    return r;
  }

  // whereClause?
  private static boolean valueAnnotation_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueAnnotation_4")) return false;
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
  // KW_VAR LOWER_IDENT OP_ASSIGN expr
  public static boolean varDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varDecl")) return false;
    if (!nextTokenIs(b, KW_VAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_VAR, LOWER_IDENT, OP_ASSIGN);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, VAR_DECL, r);
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
  // KW_WHERE LBRACK whereClauseElem+ RBRACK
  public static boolean whereClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whereClause")) return false;
    if (!nextTokenIs(b, KW_WHERE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, WHERE_CLAUSE, null);
    r = consumeTokens(b, 2, KW_WHERE, LBRACK);
    p = r; // pin = 2
    r = r && report_error_(b, whereClause_2(b, l + 1));
    r = p && consumeToken(b, RBRACK) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // whereClauseElem+
  private static boolean whereClause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whereClause_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = whereClauseElem(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!whereClauseElem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "whereClause_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // !RBRACK whereClauseItem (COMMA | &RBRACK)
  static boolean whereClauseElem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whereClauseElem")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = whereClauseElem_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, whereClauseItem(b, l + 1));
    r = p && whereClauseElem_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, RocParser::whereClauseRecover);
    return r || p;
  }

  // !RBRACK
  private static boolean whereClauseElem_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whereClauseElem_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, RBRACK);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COMMA | &RBRACK
  private static boolean whereClauseElem_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whereClauseElem_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    if (!r) r = whereClauseElem_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &RBRACK
  private static boolean whereClauseElem_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whereClauseElem_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = consumeToken(b, RBRACK);
    exit_section_(b, l, m, r, false, null);
    return r;
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
  // !(RBRACK | LOWER_IDENT)
  static boolean whereClauseRecover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whereClauseRecover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !whereClauseRecover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // RBRACK | LOWER_IDENT
  private static boolean whereClauseRecover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whereClauseRecover_0")) return false;
    boolean r;
    r = consumeToken(b, RBRACK);
    if (!r) r = consumeToken(b, LOWER_IDENT);
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
  // KW_WHILE  expr expr
  public static boolean whileStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whileStmt")) return false;
    if (!nextTokenIs(b, KW_WHILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_WHILE);
    r = r && expr(b, l + 1, -1);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, WHILE_STMT, r);
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
  // 15: POSTFIX(arrowCallExpr)
  // 16: POSTFIX(questionSuffixExpr)
  // 17: ATOM(typedIntLiteral)
  // 18: ATOM(typedFloatLiteral)
  // 19: ATOM(intLiteral)
  // 20: ATOM(floatLiteral)
  // 21: ATOM(charLiteral)
  // 22: ATOM(string)
  // 23: ATOM(multilineStringExpr)
  // 24: ATOM(qualifiedNameExpr)
  // 25: ATOM(tagExpr)
  // 26: ATOM(identExpr)
  // 27: ATOM(ellipsisExpr)
  // 28: ATOM(ifExpr)
  // 29: PREFIX(matchExpr)
  // 30: ATOM(forExpr)
  // 31: ATOM(lambdaExpr)
  // 32: PREFIX(dbgExpr)
  // 33: ATOM(listExpr)
  // 34: ATOM(tupleExpr)
  // 35: ATOM(recordExpr)
  // 36: ATOM(blockExpr)
  public static boolean expr(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "expr")) return false;
    addVariant(b, "<expr>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<expr>");
    r = unaryExpr(b, l + 1);
    if (!r) r = typedIntLiteral(b, l + 1);
    if (!r) r = typedFloatLiteral(b, l + 1);
    if (!r) r = intLiteral(b, l + 1);
    if (!r) r = floatLiteral(b, l + 1);
    if (!r) r = charLiteral(b, l + 1);
    if (!r) r = string(b, l + 1);
    if (!r) r = multilineStringExpr(b, l + 1);
    if (!r) r = qualifiedNameExpr(b, l + 1);
    if (!r) r = tagExpr(b, l + 1);
    if (!r) r = identExpr(b, l + 1);
    if (!r) r = ellipsisExpr(b, l + 1);
    if (!r) r = ifExpr(b, l + 1);
    if (!r) r = matchExpr(b, l + 1);
    if (!r) r = forExpr(b, l + 1);
    if (!r) r = lambdaExpr(b, l + 1);
    if (!r) r = dbgExpr(b, l + 1);
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
      else if (g < 15 && arrowCallExpr_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, ARROW_CALL_EXPR, r, true, null);
      }
      else if (g < 16 && consumeTokenSmart(b, NO_SPACE_OP_QUESTION)) {
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

  // OP_ARROW arrowCallTarget
  private static boolean arrowCallExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrowCallExpr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, OP_ARROW);
    r = r && arrowCallTarget(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // INT   NO_SPACE_DOT_UPPER_IDENT
  public static boolean typedIntLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedIntLiteral")) return false;
    if (!nextTokenIsSmart(b, INT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, INT, NO_SPACE_DOT_UPPER_IDENT);
    exit_section_(b, m, TYPED_INT_LITERAL, r);
    return r;
  }

  // FLOAT NO_SPACE_DOT_UPPER_IDENT
  public static boolean typedFloatLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedFloatLiteral")) return false;
    if (!nextTokenIsSmart(b, FLOAT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, FLOAT, NO_SPACE_DOT_UPPER_IDENT);
    exit_section_(b, m, TYPED_FLOAT_LITERAL, r);
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

  // MULTILINE_STRING_START multilineStringPart*
  public static boolean multilineStringExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multilineStringExpr")) return false;
    if (!nextTokenIsSmart(b, MULTILINE_STRING_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, MULTILINE_STRING_START);
    r = r && multilineStringExpr_1(b, l + 1);
    exit_section_(b, m, MULTILINE_STRING_EXPR, r);
    return r;
  }

  // multilineStringPart*
  private static boolean multilineStringExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multilineStringExpr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!multilineStringPart(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "multilineStringExpr_1", c)) break;
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
    r = p && expr(b, l, 29);
    r = p && report_error_(b, matchExpr_1(b, l + 1)) && r;
    exit_section_(b, l, m, MATCH_EXPR, r, p, null);
    return r || p;
  }

  // LBRACE matchBranchElem+ RBRACE
  private static boolean matchExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchExpr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && matchExpr_1_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // matchBranchElem+
  private static boolean matchExpr_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchExpr_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = matchBranchElem(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!matchBranchElem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "matchExpr_1_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
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

  public static boolean dbgExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dbgExpr")) return false;
    if (!nextTokenIsSmart(b, KW_DBG)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, KW_DBG);
    p = r;
    r = p && expr(b, l, 32);
    exit_section_(b, l, m, DBG_EXPR, r, p, null);
    return r || p;
  }

  // LBRACK listExprElem* RBRACK
  public static boolean listExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "listExpr")) return false;
    if (!nextTokenIsSmart(b, LBRACK)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LIST_EXPR, null);
    r = consumeTokenSmart(b, LBRACK);
    p = r; // pin = 1
    r = r && report_error_(b, listExpr_1(b, l + 1));
    r = p && consumeToken(b, RBRACK) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // listExprElem*
  private static boolean listExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "listExpr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!listExprElem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "listExpr_1", c)) break;
    }
    return true;
  }

  // (NO_SPACE_LPAREN | LPAREN) tupleExprElem* RPAREN
  public static boolean tupleExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tupleExpr")) return false;
    if (!nextTokenIsSmart(b, LPAREN, NO_SPACE_LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _COLLAPSE_, TUPLE_EXPR, "<tuple expr>");
    r = tupleExpr_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, tupleExpr_1(b, l + 1));
    r = p && consumeToken(b, RPAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // NO_SPACE_LPAREN | LPAREN
  private static boolean tupleExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tupleExpr_0")) return false;
    boolean r;
    r = consumeTokenSmart(b, NO_SPACE_LPAREN);
    if (!r) r = consumeTokenSmart(b, LPAREN);
    return r;
  }

  // tupleExprElem*
  private static boolean tupleExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tupleExpr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!tupleExprElem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tupleExpr_1", c)) break;
    }
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

  // LBRACE blockStmtElem+ RBRACE
  public static boolean blockExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "blockExpr")) return false;
    if (!nextTokenIsSmart(b, LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_EXPR, null);
    r = consumeTokenSmart(b, LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, blockExpr_1(b, l + 1));
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // blockStmtElem+
  private static boolean blockExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "blockExpr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = blockStmtElem(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!blockStmtElem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "blockExpr_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

}
