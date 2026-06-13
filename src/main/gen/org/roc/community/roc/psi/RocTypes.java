// This is a generated file. Not intended for manual editing.
package org.roc.community.roc.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.roc.community.roc.psi.impl.*;

public interface RocTypes {

  IElementType APP_HEADER = new RocElementType("APP_HEADER");
  IElementType EXPOSED_ITEM = new RocElementType("EXPOSED_ITEM");
  IElementType EXPOSES = new RocElementType("EXPOSES");
  IElementType FUNCTION_TYPE = new RocElementType("FUNCTION_TYPE");
  IElementType HEADER = new RocElementType("HEADER");
  IElementType HOSTED_HEADER = new RocElementType("HOSTED_HEADER");
  IElementType IMPORT_ALIAS = new RocElementType("IMPORT_ALIAS");
  IElementType IMPORT_EXPOSING = new RocElementType("IMPORT_EXPOSING");
  IElementType IMPORT_STATEMENT = new RocElementType("IMPORT_STATEMENT");
  IElementType INFERRED_TYPE = new RocElementType("INFERRED_TYPE");
  IElementType INFERRED_TYPE_VAR = new RocElementType("INFERRED_TYPE_VAR");
  IElementType MODULE_HEADER = new RocElementType("MODULE_HEADER");
  IElementType MODULE_NAME = new RocElementType("MODULE_NAME");
  IElementType PACKAGES = new RocElementType("PACKAGES");
  IElementType PACKAGE_ENTRY = new RocElementType("PACKAGE_ENTRY");
  IElementType PACKAGE_HEADER = new RocElementType("PACKAGE_HEADER");
  IElementType PROVIDES = new RocElementType("PROVIDES");
  IElementType RECORD_TYPE = new RocElementType("RECORD_TYPE");
  IElementType RECORD_TYPE_EXT = new RocElementType("RECORD_TYPE_EXT");
  IElementType RECORD_TYPE_FIELD = new RocElementType("RECORD_TYPE_FIELD");
  IElementType STRING = new RocElementType("STRING");
  IElementType STRING_INTERPOLATION = new RocElementType("STRING_INTERPOLATION");
  IElementType TAG_UNION_EXT = new RocElementType("TAG_UNION_EXT");
  IElementType TAG_UNION_MEMBER = new RocElementType("TAG_UNION_MEMBER");
  IElementType TAG_UNION_TYPE = new RocElementType("TAG_UNION_TYPE");
  IElementType TUPLE_TYPE = new RocElementType("TUPLE_TYPE");
  IElementType TYPE_ARGUMENTS = new RocElementType("TYPE_ARGUMENTS");
  IElementType TYPE_REFERENCE = new RocElementType("TYPE_REFERENCE");

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
      if (type == APP_HEADER) {
        return new RocAppHeaderImpl(node);
      }
      else if (type == EXPOSED_ITEM) {
        return new RocExposedItemImpl(node);
      }
      else if (type == EXPOSES) {
        return new RocExposesImpl(node);
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
      else if (type == MODULE_HEADER) {
        return new RocModuleHeaderImpl(node);
      }
      else if (type == MODULE_NAME) {
        return new RocModuleNameImpl(node);
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
      else if (type == PROVIDES) {
        return new RocProvidesImpl(node);
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
      else if (type == STRING) {
        return new RocStringImpl(node);
      }
      else if (type == STRING_INTERPOLATION) {
        return new RocStringInterpolationImpl(node);
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
      else if (type == TUPLE_TYPE) {
        return new RocTupleTypeImpl(node);
      }
      else if (type == TYPE_ARGUMENTS) {
        return new RocTypeArgumentsImpl(node);
      }
      else if (type == TYPE_REFERENCE) {
        return new RocTypeReferenceImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
