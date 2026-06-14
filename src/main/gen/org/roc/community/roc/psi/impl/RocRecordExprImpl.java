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

public class RocRecordExprImpl extends ASTWrapperPsiElement implements RocRecordExpr {

  public RocRecordExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RocVisitor visitor) {
    visitor.visitRecordExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RocVisitor) accept((RocVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RocRecordExprExt getRecordExprExt() {
    return findChildByClass(RocRecordExprExt.class);
  }

  @Override
  @NotNull
  public List<RocRecordExprField> getRecordExprFieldList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RocRecordExprField.class);
  }

}
