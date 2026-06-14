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

public class RocStringInterpolationImpl extends ASTWrapperPsiElement implements RocStringInterpolation {

  public RocStringInterpolationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RocVisitor visitor) {
    visitor.visitStringInterpolation(this);
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
  @NotNull
  public PsiElement getCloseStringInterpolation() {
    return findNotNullChildByType(CLOSE_STRING_INTERPOLATION);
  }

  @Override
  @NotNull
  public PsiElement getOpenStringInterpolation() {
    return findNotNullChildByType(OPEN_STRING_INTERPOLATION);
  }

}
