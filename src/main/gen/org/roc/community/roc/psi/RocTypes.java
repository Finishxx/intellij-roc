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
  IElementType CRASH = new RocTokenType("crash");
  IElementType DBG = new RocTokenType("dbg");
  IElementType DOT = new RocTokenType(".");
  IElementType DOT_STAR = new RocTokenType(".*");
  IElementType DOUBLE_DOT = new RocTokenType("..");
  IElementType ELSE = new RocTokenType("else");
  IElementType EXPECT = new RocTokenType("expect");
  IElementType EXPOSES = new RocTokenType("exposes");
  IElementType EXPOSING = new RocTokenType("exposing");
  IElementType FOR = new RocTokenType("for");
  IElementType GENERATES = new RocTokenType("generates");
  IElementType HAS = new RocTokenType("has");
  IElementType HOSTED = new RocTokenType("hosted");
  IElementType IF = new RocTokenType("if");
  IElementType IMPLEMENTS = new RocTokenType("implements");
  IElementType IMPORT = new RocTokenType("import");
  IElementType IMPORTS = new RocTokenType("imports");
  IElementType IN = new RocTokenType("in");
  IElementType INTERFACE = new RocTokenType("interface");
  IElementType LBRACE = new RocTokenType("{");
  IElementType LBRACK = new RocTokenType("[");
  IElementType LOWER_IDENT = new RocTokenType("LOWER_IDENT");
  IElementType LPAREN = new RocTokenType("(");
  IElementType MATCH = new RocTokenType("match");
  IElementType MODULE = new RocTokenType("module");
  IElementType OPEN_STRING_INTERPOLATION = new RocTokenType("OPEN_STRING_INTERPOLATION");
  IElementType OP_AMPERSAND = new RocTokenType("&");
  IElementType OP_ARROW = new RocTokenType("->");
  IElementType OP_ASSIGN = new RocTokenType("=");
  IElementType OP_BACK_ARROW = new RocTokenType("<-");
  IElementType OP_BANG = new RocTokenType("!");
  IElementType OP_BAR = new RocTokenType("|");
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
  IElementType OR = new RocTokenType("or");
  IElementType PACKAGE = new RocTokenType("package");
  IElementType PACKAGES = new RocTokenType("packages");
  IElementType PLATFORM = new RocTokenType("platform");
  IElementType PROVIDES = new RocTokenType("provides");
  IElementType RBRACE = new RocTokenType("}");
  IElementType RBRACK = new RocTokenType("]");
  IElementType REQUIRES = new RocTokenType("requires");
  IElementType RETURN = new RocTokenType("return");
  IElementType RPAREN = new RocTokenType(")");
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
