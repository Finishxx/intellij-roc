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

public class RocTypeHeaderArgsImpl extends ASTWrapperPsiElement implements RocTypeHeaderArgs {

  public RocTypeHeaderArgsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RocVisitor visitor) {
    visitor.visitTypeHeaderArgs(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RocVisitor) accept((RocVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RocTypeParam> getTypeParamList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RocTypeParam.class);
  }

  @Override
  @Nullable
  public PsiElement getNoSpaceLparen() {
    return findChildByType(NO_SPACE_LPAREN);
  }

}
