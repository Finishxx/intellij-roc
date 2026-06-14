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

public class RocTupleAccessExprImpl extends RocExprImpl implements RocTupleAccessExpr {

  public RocTupleAccessExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull RocVisitor visitor) {
    visitor.visitTupleAccessExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RocVisitor) accept((RocVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public RocExpr getExpr() {
    return findNotNullChildByClass(RocExpr.class);
  }

  @Override
  @Nullable
  public PsiElement getDotInt() {
    return findChildByType(DOT_INT);
  }

  @Override
  @Nullable
  public PsiElement getNoSpaceDotInt() {
    return findChildByType(NO_SPACE_DOT_INT);
  }

}
