// This is a generated file. Not intended for manual editing.
package org.roc.community.roc.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.roc.community.roc.psi.RocTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.roc.community.roc.psi.*;

public class RocListExprImpl extends ASTWrapperPsiElement implements RocListExpr {

  public RocListExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RocVisitor visitor) {
    visitor.visitListExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RocVisitor) accept((RocVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RocCharLiteral> getCharLiteralList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RocCharLiteral.class);
  }

  @Override
  @NotNull
  public List<RocFloatLiteral> getFloatLiteralList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RocFloatLiteral.class);
  }

  @Override
  @NotNull
  public List<RocIdentExpr> getIdentExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RocIdentExpr.class);
  }

  @Override
  @NotNull
  public List<RocIntLiteral> getIntLiteralList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RocIntLiteral.class);
  }

  @Override
  @NotNull
  public List<RocListExpr> getListExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RocListExpr.class);
  }

  @Override
  @NotNull
  public List<RocRecordExpr> getRecordExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RocRecordExpr.class);
  }

  @Override
  @NotNull
  public List<RocString> getStringList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RocString.class);
  }

  @Override
  @NotNull
  public List<RocTagExpr> getTagExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RocTagExpr.class);
  }

  @Override
  @NotNull
  public List<RocTupleExpr> getTupleExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RocTupleExpr.class);
  }

}
