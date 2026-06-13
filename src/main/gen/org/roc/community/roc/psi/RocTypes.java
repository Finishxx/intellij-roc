// This is a generated file. Not intended for manual editing.
package org.roc.community.roc.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.roc.community.roc.psi.impl.*;

public interface RocTypes {

  IElementType APP_HEADER = new RocElementType("APP_HEADER");
  IElementType EXPOSED_ITEM = new RocElementType("EXPOSED_ITEM");
  IElementType HEADER = new RocElementType("HEADER");
  IElementType PACKAGES = new RocElementType("PACKAGES");
  IElementType PACKAGE_ENTRY = new RocElementType("PACKAGE_ENTRY");
  IElementType PROVIDES = new RocElementType("PROVIDES");
  IElementType STRING = new RocElementType("STRING");
  IElementType STRING_INTERPOLATION = new RocElementType("STRING_INTERPOLATION");

  IElementType AND = new RocTokenType("and");
  IElementType APP = new RocTokenType("app");
  IElementType AS = new RocTokenType("as");
  IElementType BREAK = new RocTokenType("break");
  IElementType CLOSE_STRING_INTERPOLATION = new RocTokenType("CLOSE_STRING_INTERPOLATION");
  IElementType COMMA = new RocTokenType(",");
  IElementType COMMENT = new RocTokenType("COMMENT");
  IElementType CRASH = new RocTokenType("crash");
  IElementType DBG = new RocTokenType("dbg");
  IElementType DOT = new RocTokenType(".");
  IElementType DOT_INT = new RocTokenType("DOT_INT");
  IElementType DOT_LOWER_IDENT = new RocTokenType("DOT_LOWER_IDENT");
  IElementType DOT_STAR = new RocTokenType(".*");
  IElementType DOT_UPPER_IDENT = new RocTokenType("DOT_UPPER_IDENT");
  IElementType DOUBLE_DOT = new RocTokenType("..");
  IElementType ELSE = new RocTokenType("else");
  IElementType EXPECT = new RocTokenType("expect");
  IElementType EXPOSES = new RocTokenType("exposes");
  IElementType EXPOSING = new RocTokenType("exposing");
  IElementType FLOAT = new RocTokenType("FLOAT");
  IElementType FOR = new RocTokenType("for");
  IElementType GENERATES = new RocTokenType("generates");
  IElementType HAS = new RocTokenType("has");
  IElementType HOSTED = new RocTokenType("hosted");
  IElementType IF = new RocTokenType("if");
  IElementType IMPLEMENTS = new RocTokenType("implements");
  IElementType IMPORT = new RocTokenType("import");
  IElementType IMPORTS = new RocTokenType("imports");
  IElementType IN = new RocTokenType("in");
  IElementType INT = new RocTokenType("INT");
  IElementType INTERFACE = new RocTokenType("interface");
  IElementType LBRACE = new RocTokenType("{");
  IElementType LBRACK = new RocTokenType("[");
  IElementType LOWER_IDENT = new RocTokenType("LOWER_IDENT");
  IElementType LPAREN = new RocTokenType("(");
  IElementType MATCH = new RocTokenType("match");
  IElementType MODULE = new RocTokenType("module");
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
  IElementType OR = new RocTokenType("or");
  IElementType PACKAGE = new RocTokenType("package");
  IElementType PLATFORM = new RocTokenType("platform");
  IElementType RBRACE = new RocTokenType("}");
  IElementType RBRACK = new RocTokenType("]");
  IElementType REQUIRES = new RocTokenType("requires");
  IElementType RETURN = new RocTokenType("return");
  IElementType RPAREN = new RocTokenType(")");
  IElementType SINGLE_QUOTE = new RocTokenType("SINGLE_QUOTE");
  IElementType STRING_END = new RocTokenType("STRING_END");
  IElementType STRING_PART = new RocTokenType("STRING_PART");
  IElementType STRING_START = new RocTokenType("STRING_START");
  IElementType TARGETS = new RocTokenType("targets");
  IElementType TRIPLE_DOT = new RocTokenType("...");
  IElementType UNDERSCORE = new RocTokenType("_");
  IElementType UPPER_IDENT = new RocTokenType("UPPER_IDENT");
  IElementType VAR = new RocTokenType("var");
  IElementType WHERE = new RocTokenType("where");
  IElementType WHILE = new RocTokenType("while");
  IElementType WITH = new RocTokenType("with");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == APP_HEADER) {
        return new RocAppHeaderImpl(node);
      }
      else if (type == EXPOSED_ITEM) {
        return new RocExposedItemImpl(node);
      }
      else if (type == HEADER) {
        return new RocHeaderImpl(node);
      }
      else if (type == PACKAGES) {
        return new RocPackagesImpl(node);
      }
      else if (type == PACKAGE_ENTRY) {
        return new RocPackageEntryImpl(node);
      }
      else if (type == PROVIDES) {
        return new RocProvidesImpl(node);
      }
      else if (type == STRING) {
        return new RocStringImpl(node);
      }
      else if (type == STRING_INTERPOLATION) {
        return new RocStringInterpolationImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
