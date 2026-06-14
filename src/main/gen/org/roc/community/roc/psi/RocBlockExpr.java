// This is a generated file. Not intended for manual editing.
package org.roc.community.roc.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RocBlockExpr extends RocExpr {

  @NotNull
  List<RocBreakStmt> getBreakStmtList();

  @NotNull
  List<RocCrashStmt> getCrashStmtList();

  @NotNull
  List<RocExpectStmt> getExpectStmtList();

  @NotNull
  List<RocExpr> getExprList();

  @NotNull
  List<RocReturnStmt> getReturnStmtList();

  @NotNull
  List<RocValueAnnotation> getValueAnnotationList();

  @NotNull
  List<RocValueDecl> getValueDeclList();

  @NotNull
  List<RocVarDecl> getVarDeclList();

  @NotNull
  List<RocWhileStmt> getWhileStmtList();

}
