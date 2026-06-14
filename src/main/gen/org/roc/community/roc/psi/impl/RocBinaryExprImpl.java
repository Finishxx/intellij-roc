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

public class RocBinaryExprImpl extends RocExprImpl implements RocBinaryExpr {

  public RocBinaryExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull RocVisitor visitor) {
    visitor.visitBinaryExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RocVisitor) accept((RocVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RocExpr> getExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RocExpr.class);
  }

  @Override
  @Nullable
  public PsiElement getOpBinaryMinus() {
    return findChildByType(OP_BINARY_MINUS);
  }

  @Override
  @NotNull
  public RocExpr getLeft() {
    List<RocExpr> p1 = getExprList();
    return p1.get(0);
  }

  @Override
  @Nullable
  public RocExpr getRight() {
    List<RocExpr> p1 = getExprList();
    return p1.size() < 2 ? null : p1.get(1);
  }

}
