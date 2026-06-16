// This is a generated file. Not intended for manual editing.
package org.roc.community.roc.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.roc.community.roc.psi.RocTypes.*;
import org.roc.community.roc.psi.*;

public class RocBlockExprImpl extends RocExprImpl implements RocBlockExpr {

  public RocBlockExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull RocVisitor visitor) {
    visitor.visitBlockExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RocVisitor) accept((RocVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RocBreakStmt> getBreakStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RocBreakStmt.class);
  }

  @Override
  @NotNull
  public List<RocCrashStmt> getCrashStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RocCrashStmt.class);
  }

  @Override
  @NotNull
  public List<RocExpectStmt> getExpectStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RocExpectStmt.class);
  }

  @Override
  @NotNull
  public List<RocExpr> getExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RocExpr.class);
  }

  @Override
  @NotNull
  public List<RocReturnStmt> getReturnStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RocReturnStmt.class);
  }

  @Override
  @NotNull
  public List<RocTypeDecl> getTypeDeclList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RocTypeDecl.class);
  }

  @Override
  @NotNull
  public List<RocValueAnnotation> getValueAnnotationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RocValueAnnotation.class);
  }

  @Override
  @NotNull
  public List<RocValueDecl> getValueDeclList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RocValueDecl.class);
  }

  @Override
  @NotNull
  public List<RocVarDecl> getVarDeclList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RocVarDecl.class);
  }

  @Override
  @NotNull
  public List<RocWhileStmt> getWhileStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RocWhileStmt.class);
  }

}
