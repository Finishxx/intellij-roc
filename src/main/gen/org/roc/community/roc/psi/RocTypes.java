// This is a generated file. Not intended for manual editing.
package org.roc.community.roc.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.roc.community.roc.psi.impl.*;

public interface RocTypes {

  IElementType ALTERNATIVES_PATTERN = new RocElementType("ALTERNATIVES_PATTERN");
  IElementType APP_HEADER = new RocElementType("APP_HEADER");
  IElementType ARROW_CALL_EXPR = new RocElementType("ARROW_CALL_EXPR");
  IElementType ASSOCIATED_BLOCK = new RocElementType("ASSOCIATED_BLOCK");
  IElementType AS_PATTERN = new RocElementType("AS_PATTERN");
  IElementType BINARY_EXPR = new RocElementType("BINARY_EXPR");
  IElementType BLOCK_EXPR = new RocElementType("BLOCK_EXPR");
  IElementType BREAK_STMT = new RocElementType("BREAK_STMT");
  IElementType CALL_EXPR = new RocElementType("CALL_EXPR");
  IElementType CHAR_LITERAL = new RocElementType("CHAR_LITERAL");
  IElementType CRASH_STMT = new RocElementType("CRASH_STMT");
  IElementType DBG_EXPR = new RocElementType("DBG_EXPR");
  IElementType ELLIPSIS_EXPR = new RocElementType("ELLIPSIS_EXPR");
  IElementType EXPECT_STMT = new RocElementType("EXPECT_STMT");
  IElementType EXPOSED_ITEM = new RocElementType("EXPOSED_ITEM");
  IElementType EXPOSES = new RocElementType("EXPOSES");
  IElementType EXPR = new RocElementType("EXPR");
  IElementType FIELD_ACCESS_EXPR = new RocElementType("FIELD_ACCESS_EXPR");
  IElementType FLOAT_LITERAL = new RocElementType("FLOAT_LITERAL");
  IElementType FOR_EXPR = new RocElementType("FOR_EXPR");
  IElementType FUNCTION_TYPE = new RocElementType("FUNCTION_TYPE");
  IElementType HEADER = new RocElementType("HEADER");
  IElementType HOSTED_HEADER = new RocElementType("HOSTED_HEADER");
  IElementType IDENT_EXPR = new RocElementType("IDENT_EXPR");
  IElementType IDENT_PATTERN = new RocElementType("IDENT_PATTERN");
  IElementType IF_EXPR = new RocElementType("IF_EXPR");
  IElementType IMPORT_ALIAS = new RocElementType("IMPORT_ALIAS");
  IElementType IMPORT_EXPOSING = new RocElementType("IMPORT_EXPOSING");
  IElementType IMPORT_STATEMENT = new RocElementType("IMPORT_STATEMENT");
  IElementType INFERRED_TYPE = new RocElementType("INFERRED_TYPE");
  IElementType INFERRED_TYPE_VAR = new RocElementType("INFERRED_TYPE_VAR");
  IElementType INT_LITERAL = new RocElementType("INT_LITERAL");
  IElementType LAMBDA_EXPR = new RocElementType("LAMBDA_EXPR");
  IElementType LIST_EXPR = new RocElementType("LIST_EXPR");
  IElementType LIST_PATTERN = new RocElementType("LIST_PATTERN");
  IElementType LIST_REST_PATTERN = new RocElementType("LIST_REST_PATTERN");
  IElementType LITERAL_PATTERN = new RocElementType("LITERAL_PATTERN");
  IElementType MATCH_BRANCH = new RocElementType("MATCH_BRANCH");
  IElementType MATCH_EXPR = new RocElementType("MATCH_EXPR");
  IElementType METHOD_CALL_EXPR = new RocElementType("METHOD_CALL_EXPR");
  IElementType MODULE_HEADER = new RocElementType("MODULE_HEADER");
  IElementType MODULE_NAME = new RocElementType("MODULE_NAME");
  IElementType MULTILINE_STRING_EXPR = new RocElementType("MULTILINE_STRING_EXPR");
  IElementType PACKAGES = new RocElementType("PACKAGES");
  IElementType PACKAGE_ENTRY = new RocElementType("PACKAGE_ENTRY");
  IElementType PACKAGE_HEADER = new RocElementType("PACKAGE_HEADER");
  IElementType PLATFORM_HEADER = new RocElementType("PLATFORM_HEADER");
  IElementType PLATFORM_PROVIDES = new RocElementType("PLATFORM_PROVIDES");
  IElementType PLATFORM_PROVIDES_FIELD = new RocElementType("PLATFORM_PROVIDES_FIELD");
  IElementType PLATFORM_REQUIRES = new RocElementType("PLATFORM_REQUIRES");
  IElementType PLATFORM_TARGETS = new RocElementType("PLATFORM_TARGETS");
  IElementType PROVIDES = new RocElementType("PROVIDES");
  IElementType QUALIFIED_NAME_EXPR = new RocElementType("QUALIFIED_NAME_EXPR");
  IElementType QUESTION_SUFFIX_EXPR = new RocElementType("QUESTION_SUFFIX_EXPR");
  IElementType RECORD_EXPR = new RocElementType("RECORD_EXPR");
  IElementType RECORD_EXPR_EXT = new RocElementType("RECORD_EXPR_EXT");
  IElementType RECORD_EXPR_FIELD = new RocElementType("RECORD_EXPR_FIELD");
  IElementType RECORD_PATTERN = new RocElementType("RECORD_PATTERN");
  IElementType RECORD_PATTERN_FIELD = new RocElementType("RECORD_PATTERN_FIELD");
  IElementType RECORD_TYPE = new RocElementType("RECORD_TYPE");
  IElementType RECORD_TYPE_EXT = new RocElementType("RECORD_TYPE_EXT");
  IElementType RECORD_TYPE_FIELD = new RocElementType("RECORD_TYPE_FIELD");
  IElementType REQUIRES_ENTRY = new RocElementType("REQUIRES_ENTRY");
  IElementType REQUIRES_FOR_ALIAS = new RocElementType("REQUIRES_FOR_ALIAS");
  IElementType REQUIRES_FOR_CLAUSE = new RocElementType("REQUIRES_FOR_CLAUSE");
  IElementType RETURN_STMT = new RocElementType("RETURN_STMT");
  IElementType STRING = new RocElementType("STRING");
  IElementType STRING_INTERPOLATION = new RocElementType("STRING_INTERPOLATION");
  IElementType TAG_EXPR = new RocElementType("TAG_EXPR");
  IElementType TAG_PATTERN = new RocElementType("TAG_PATTERN");
  IElementType TAG_PATTERN_ARGS = new RocElementType("TAG_PATTERN_ARGS");
  IElementType TAG_UNION_EXT = new RocElementType("TAG_UNION_EXT");
  IElementType TAG_UNION_MEMBER = new RocElementType("TAG_UNION_MEMBER");
  IElementType TAG_UNION_TYPE = new RocElementType("TAG_UNION_TYPE");
  IElementType TARGETS_FIELD = new RocElementType("TARGETS_FIELD");
  IElementType TARGET_FILE = new RocElementType("TARGET_FILE");
  IElementType TARGET_LINK_ENTRY = new RocElementType("TARGET_LINK_ENTRY");
  IElementType TARGET_LINK_TYPE = new RocElementType("TARGET_LINK_TYPE");
  IElementType TUPLE_ACCESS_EXPR = new RocElementType("TUPLE_ACCESS_EXPR");
  IElementType TUPLE_EXPR = new RocElementType("TUPLE_EXPR");
  IElementType TUPLE_PATTERN = new RocElementType("TUPLE_PATTERN");
  IElementType TUPLE_TYPE = new RocElementType("TUPLE_TYPE");
  IElementType TYPED_FLOAT_LITERAL = new RocElementType("TYPED_FLOAT_LITERAL");
  IElementType TYPED_INT_LITERAL = new RocElementType("TYPED_INT_LITERAL");
  IElementType TYPE_ARGUMENTS = new RocElementType("TYPE_ARGUMENTS");
  IElementType TYPE_DECL = new RocElementType("TYPE_DECL");
  IElementType TYPE_HEADER = new RocElementType("TYPE_HEADER");
  IElementType TYPE_HEADER_ARGS = new RocElementType("TYPE_HEADER_ARGS");
  IElementType TYPE_PARAM = new RocElementType("TYPE_PARAM");
  IElementType TYPE_REFERENCE = new RocElementType("TYPE_REFERENCE");
  IElementType UNARY_EXPR = new RocElementType("UNARY_EXPR");
  IElementType UNDERSCORE_PATTERN = new RocElementType("UNDERSCORE_PATTERN");
  IElementType VALUE_ANNOTATION = new RocElementType("VALUE_ANNOTATION");
  IElementType VALUE_DECL = new RocElementType("VALUE_DECL");
  IElementType VAR_DECL = new RocElementType("VAR_DECL");
  IElementType WHERE_ALIAS = new RocElementType("WHERE_ALIAS");
  IElementType WHERE_CLAUSE = new RocElementType("WHERE_CLAUSE");
  IElementType WHERE_METHOD = new RocElementType("WHERE_METHOD");
  IElementType WHILE_STMT = new RocElementType("WHILE_STMT");

  IElementType CLOSE_STRING_INTERPOLATION = new RocTokenType("CLOSE_STRING_INTERPOLATION");
  IElementType COMMA = new RocTokenType(",");
  IElementType COMMENT = new RocTokenType("COMMENT");
  IElementType DOT = new RocTokenType(".");
  IElementType DOT_INT = new RocTokenType("DOT_INT");
  IElementType DOT_LOWER_IDENT = new RocTokenType("DOT_LOWER_IDENT");
  IElementType DOT_STAR = new RocTokenType(".*");
  IElementType DOT_UPPER_IDENT = new RocTokenType("DOT_UPPER_IDENT");
  IElementType DOUBLE_DOT = new RocTokenType("..");
  IElementType FLOAT = new RocTokenType("FLOAT");
  IElementType INT = new RocTokenType("INT");
  IElementType KW_AND = new RocTokenType("and");
  IElementType KW_APP = new RocTokenType("app");
  IElementType KW_AS = new RocTokenType("as");
  IElementType KW_BREAK = new RocTokenType("break");
  IElementType KW_CRASH = new RocTokenType("crash");
  IElementType KW_DBG = new RocTokenType("dbg");
  IElementType KW_ELSE = new RocTokenType("else");
  IElementType KW_EXPECT = new RocTokenType("expect");
  IElementType KW_EXPOSES = new RocTokenType("exposes");
  IElementType KW_EXPOSING = new RocTokenType("exposing");
  IElementType KW_FOR = new RocTokenType("for");
  IElementType KW_GENERATES = new RocTokenType("generates");
  IElementType KW_HAS = new RocTokenType("has");
  IElementType KW_HOSTED = new RocTokenType("hosted");
  IElementType KW_IF = new RocTokenType("if");
  IElementType KW_IMPLEMENTS = new RocTokenType("implements");
  IElementType KW_IMPORT = new RocTokenType("import");
  IElementType KW_IMPORTS = new RocTokenType("imports");
  IElementType KW_IN = new RocTokenType("in");
  IElementType KW_INTERFACE = new RocTokenType("interface");
  IElementType KW_MATCH = new RocTokenType("match");
  IElementType KW_MODULE = new RocTokenType("module");
  IElementType KW_OR = new RocTokenType("or");
  IElementType KW_PACKAGE = new RocTokenType("package");
  IElementType KW_PACKAGES = new RocTokenType("packages");
  IElementType KW_PLATFORM = new RocTokenType("platform");
  IElementType KW_PROVIDES = new RocTokenType("provides");
  IElementType KW_REQUIRES = new RocTokenType("requires");
  IElementType KW_RETURN = new RocTokenType("return");
  IElementType KW_TARGETS = new RocTokenType("targets");
  IElementType KW_VAR = new RocTokenType("var");
  IElementType KW_WHERE = new RocTokenType("where");
  IElementType KW_WHILE = new RocTokenType("while");
  IElementType KW_WITH = new RocTokenType("with");
  IElementType LBRACE = new RocTokenType("{");
  IElementType LBRACK = new RocTokenType("[");
  IElementType LOWER_IDENT = new RocTokenType("LOWER_IDENT");
  IElementType LPAREN = new RocTokenType("(");
  IElementType MULTILINE_STRING_START = new RocTokenType("MULTILINE_STRING_START");
  IElementType NAMED_UNDERSCORE = new RocTokenType("NAMED_UNDERSCORE");
  IElementType NO_SPACE_DOT_INT = new RocTokenType("NO_SPACE_DOT_INT");
  IElementType NO_SPACE_DOT_LOWER_IDENT = new RocTokenType("NO_SPACE_DOT_LOWER_IDENT");
  IElementType NO_SPACE_DOT_UPPER_IDENT = new RocTokenType("NO_SPACE_DOT_UPPER_IDENT");
  IElementType NO_SPACE_LPAREN = new RocTokenType("NO_SPACE_LPAREN");
  IElementType NO_SPACE_OP_QUESTION = new RocTokenType("NO_SPACE_OP_QUESTION");
  IElementType OPAQUE_NAME = new RocTokenType("OPAQUE_NAME");
  IElementType OPEN_STRING_INTERPOLATION = new RocTokenType("OPEN_STRING_INTERPOLATION");
  IElementType OP_AMPERSAND = new RocTokenType("&");
  IElementType OP_ARROW = new RocTokenType("->");
  IElementType OP_ASSIGN = new RocTokenType("=");
  IElementType OP_BACKSLASH = new RocTokenType("OP_BACKSLASH");
  IElementType OP_BACK_ARROW = new RocTokenType("<-");
  IElementType OP_BANG = new RocTokenType("!");
  IElementType OP_BAR = new RocTokenType("|");
  IElementType OP_BINARY_MINUS = new RocTokenType("OP_BINARY_MINUS");
  IElementType OP_CARET = new RocTokenType("^");
  IElementType OP_COLON = new RocTokenType(":");
  IElementType OP_COLON_EQUAL = new RocTokenType(":=");
  IElementType OP_DOUBLE_COLON = new RocTokenType("::");
  IElementType OP_DOUBLE_QUESTION = new RocTokenType("??");
  IElementType OP_DOUBLE_SLASH = new RocTokenType("//");
  IElementType OP_EQUALS = new RocTokenType("==");
  IElementType OP_FAT_ARROW = new RocTokenType("=>");
  IElementType OP_GREATER_THAN = new RocTokenType(">");
  IElementType OP_GREATER_THAN_OR_EQ = new RocTokenType(">=");
  IElementType OP_LESS_THAN = new RocTokenType("<");
  IElementType OP_LESS_THAN_OR_EQ = new RocTokenType("<=");
  IElementType OP_NOT_EQUALS = new RocTokenType("!=");
  IElementType OP_PERCENT = new RocTokenType("%");
  IElementType OP_PIZZA = new RocTokenType("|>");
  IElementType OP_PLUS = new RocTokenType("+");
  IElementType OP_QUESTION = new RocTokenType("?");
  IElementType OP_SLASH = new RocTokenType("/");
  IElementType OP_STAR = new RocTokenType("*");
  IElementType OP_UNARY_MINUS = new RocTokenType("OP_UNARY_MINUS");
  IElementType RBRACE = new RocTokenType("}");
  IElementType RBRACK = new RocTokenType("]");
  IElementType RPAREN = new RocTokenType(")");
  IElementType SINGLE_QUOTE = new RocTokenType("SINGLE_QUOTE");
  IElementType STRING_END = new RocTokenType("STRING_END");
  IElementType STRING_PART = new RocTokenType("STRING_PART");
  IElementType STRING_START = new RocTokenType("STRING_START");
  IElementType TRIPLE_DOT = new RocTokenType("...");
  IElementType UNDERSCORE = new RocTokenType("_");
  IElementType UPPER_IDENT = new RocTokenType("UPPER_IDENT");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ALTERNATIVES_PATTERN) {
        return new RocAlternativesPatternImpl(node);
      }
      else if (type == APP_HEADER) {
        return new RocAppHeaderImpl(node);
      }
      else if (type == ARROW_CALL_EXPR) {
        return new RocArrowCallExprImpl(node);
      }
      else if (type == ASSOCIATED_BLOCK) {
        return new RocAssociatedBlockImpl(node);
      }
      else if (type == AS_PATTERN) {
        return new RocAsPatternImpl(node);
      }
      else if (type == BINARY_EXPR) {
        return new RocBinaryExprImpl(node);
      }
      else if (type == BLOCK_EXPR) {
        return new RocBlockExprImpl(node);
      }
      else if (type == BREAK_STMT) {
        return new RocBreakStmtImpl(node);
      }
      else if (type == CALL_EXPR) {
        return new RocCallExprImpl(node);
      }
      else if (type == CHAR_LITERAL) {
        return new RocCharLiteralImpl(node);
      }
      else if (type == CRASH_STMT) {
        return new RocCrashStmtImpl(node);
      }
      else if (type == DBG_EXPR) {
        return new RocDbgExprImpl(node);
      }
      else if (type == ELLIPSIS_EXPR) {
        return new RocEllipsisExprImpl(node);
      }
      else if (type == EXPECT_STMT) {
        return new RocExpectStmtImpl(node);
      }
      else if (type == EXPOSED_ITEM) {
        return new RocExposedItemImpl(node);
      }
      else if (type == EXPOSES) {
        return new RocExposesImpl(node);
      }
      else if (type == FIELD_ACCESS_EXPR) {
        return new RocFieldAccessExprImpl(node);
      }
      else if (type == FLOAT_LITERAL) {
        return new RocFloatLiteralImpl(node);
      }
      else if (type == FOR_EXPR) {
        return new RocForExprImpl(node);
      }
      else if (type == FUNCTION_TYPE) {
        return new RocFunctionTypeImpl(node);
      }
      else if (type == HEADER) {
        return new RocHeaderImpl(node);
      }
      else if (type == HOSTED_HEADER) {
        return new RocHostedHeaderImpl(node);
      }
      else if (type == IDENT_EXPR) {
        return new RocIdentExprImpl(node);
      }
      else if (type == IDENT_PATTERN) {
        return new RocIdentPatternImpl(node);
      }
      else if (type == IF_EXPR) {
        return new RocIfExprImpl(node);
      }
      else if (type == IMPORT_ALIAS) {
        return new RocImportAliasImpl(node);
      }
      else if (type == IMPORT_EXPOSING) {
        return new RocImportExposingImpl(node);
      }
      else if (type == IMPORT_STATEMENT) {
        return new RocImportStatementImpl(node);
      }
      else if (type == INFERRED_TYPE) {
        return new RocInferredTypeImpl(node);
      }
      else if (type == INFERRED_TYPE_VAR) {
        return new RocInferredTypeVarImpl(node);
      }
      else if (type == INT_LITERAL) {
        return new RocIntLiteralImpl(node);
      }
      else if (type == LAMBDA_EXPR) {
        return new RocLambdaExprImpl(node);
      }
      else if (type == LIST_EXPR) {
        return new RocListExprImpl(node);
      }
      else if (type == LIST_PATTERN) {
        return new RocListPatternImpl(node);
      }
      else if (type == LIST_REST_PATTERN) {
        return new RocListRestPatternImpl(node);
      }
      else if (type == LITERAL_PATTERN) {
        return new RocLiteralPatternImpl(node);
      }
      else if (type == MATCH_BRANCH) {
        return new RocMatchBranchImpl(node);
      }
      else if (type == MATCH_EXPR) {
        return new RocMatchExprImpl(node);
      }
      else if (type == METHOD_CALL_EXPR) {
        return new RocMethodCallExprImpl(node);
      }
      else if (type == MODULE_HEADER) {
        return new RocModuleHeaderImpl(node);
      }
      else if (type == MODULE_NAME) {
        return new RocModuleNameImpl(node);
      }
      else if (type == MULTILINE_STRING_EXPR) {
        return new RocMultilineStringExprImpl(node);
      }
      else if (type == PACKAGES) {
        return new RocPackagesImpl(node);
      }
      else if (type == PACKAGE_ENTRY) {
        return new RocPackageEntryImpl(node);
      }
      else if (type == PACKAGE_HEADER) {
        return new RocPackageHeaderImpl(node);
      }
      else if (type == PLATFORM_HEADER) {
        return new RocPlatformHeaderImpl(node);
      }
      else if (type == PLATFORM_PROVIDES) {
        return new RocPlatformProvidesImpl(node);
      }
      else if (type == PLATFORM_PROVIDES_FIELD) {
        return new RocPlatformProvidesFieldImpl(node);
      }
      else if (type == PLATFORM_REQUIRES) {
        return new RocPlatformRequiresImpl(node);
      }
      else if (type == PLATFORM_TARGETS) {
        return new RocPlatformTargetsImpl(node);
      }
      else if (type == PROVIDES) {
        return new RocProvidesImpl(node);
      }
      else if (type == QUALIFIED_NAME_EXPR) {
        return new RocQualifiedNameExprImpl(node);
      }
      else if (type == QUESTION_SUFFIX_EXPR) {
        return new RocQuestionSuffixExprImpl(node);
      }
      else if (type == RECORD_EXPR) {
        return new RocRecordExprImpl(node);
      }
      else if (type == RECORD_EXPR_EXT) {
        return new RocRecordExprExtImpl(node);
      }
      else if (type == RECORD_EXPR_FIELD) {
        return new RocRecordExprFieldImpl(node);
      }
      else if (type == RECORD_PATTERN) {
        return new RocRecordPatternImpl(node);
      }
      else if (type == RECORD_PATTERN_FIELD) {
        return new RocRecordPatternFieldImpl(node);
      }
      else if (type == RECORD_TYPE) {
        return new RocRecordTypeImpl(node);
      }
      else if (type == RECORD_TYPE_EXT) {
        return new RocRecordTypeExtImpl(node);
      }
      else if (type == RECORD_TYPE_FIELD) {
        return new RocRecordTypeFieldImpl(node);
      }
      else if (type == REQUIRES_ENTRY) {
        return new RocRequiresEntryImpl(node);
      }
      else if (type == REQUIRES_FOR_ALIAS) {
        return new RocRequiresForAliasImpl(node);
      }
      else if (type == REQUIRES_FOR_CLAUSE) {
        return new RocRequiresForClauseImpl(node);
      }
      else if (type == RETURN_STMT) {
        return new RocReturnStmtImpl(node);
      }
      else if (type == STRING) {
        return new RocStringImpl(node);
      }
      else if (type == STRING_INTERPOLATION) {
        return new RocStringInterpolationImpl(node);
      }
      else if (type == TAG_EXPR) {
        return new RocTagExprImpl(node);
      }
      else if (type == TAG_PATTERN) {
        return new RocTagPatternImpl(node);
      }
      else if (type == TAG_PATTERN_ARGS) {
        return new RocTagPatternArgsImpl(node);
      }
      else if (type == TAG_UNION_EXT) {
        return new RocTagUnionExtImpl(node);
      }
      else if (type == TAG_UNION_MEMBER) {
        return new RocTagUnionMemberImpl(node);
      }
      else if (type == TAG_UNION_TYPE) {
        return new RocTagUnionTypeImpl(node);
      }
      else if (type == TARGETS_FIELD) {
        return new RocTargetsFieldImpl(node);
      }
      else if (type == TARGET_FILE) {
        return new RocTargetFileImpl(node);
      }
      else if (type == TARGET_LINK_ENTRY) {
        return new RocTargetLinkEntryImpl(node);
      }
      else if (type == TARGET_LINK_TYPE) {
        return new RocTargetLinkTypeImpl(node);
      }
      else if (type == TUPLE_ACCESS_EXPR) {
        return new RocTupleAccessExprImpl(node);
      }
      else if (type == TUPLE_EXPR) {
        return new RocTupleExprImpl(node);
      }
      else if (type == TUPLE_PATTERN) {
        return new RocTuplePatternImpl(node);
      }
      else if (type == TUPLE_TYPE) {
        return new RocTupleTypeImpl(node);
      }
      else if (type == TYPED_FLOAT_LITERAL) {
        return new RocTypedFloatLiteralImpl(node);
      }
      else if (type == TYPED_INT_LITERAL) {
        return new RocTypedIntLiteralImpl(node);
      }
      else if (type == TYPE_ARGUMENTS) {
        return new RocTypeArgumentsImpl(node);
      }
      else if (type == TYPE_DECL) {
        return new RocTypeDeclImpl(node);
      }
      else if (type == TYPE_HEADER) {
        return new RocTypeHeaderImpl(node);
      }
      else if (type == TYPE_HEADER_ARGS) {
        return new RocTypeHeaderArgsImpl(node);
      }
      else if (type == TYPE_PARAM) {
        return new RocTypeParamImpl(node);
      }
      else if (type == TYPE_REFERENCE) {
        return new RocTypeReferenceImpl(node);
      }
      else if (type == UNARY_EXPR) {
        return new RocUnaryExprImpl(node);
      }
      else if (type == UNDERSCORE_PATTERN) {
        return new RocUnderscorePatternImpl(node);
      }
      else if (type == VALUE_ANNOTATION) {
        return new RocValueAnnotationImpl(node);
      }
      else if (type == VALUE_DECL) {
        return new RocValueDeclImpl(node);
      }
      else if (type == VAR_DECL) {
        return new RocVarDeclImpl(node);
      }
      else if (type == WHERE_ALIAS) {
        return new RocWhereAliasImpl(node);
      }
      else if (type == WHERE_CLAUSE) {
        return new RocWhereClauseImpl(node);
      }
      else if (type == WHERE_METHOD) {
        return new RocWhereMethodImpl(node);
      }
      else if (type == WHILE_STMT) {
        return new RocWhileStmtImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
