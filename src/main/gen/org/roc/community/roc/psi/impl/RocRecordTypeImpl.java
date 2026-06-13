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

public class RocRecordTypeImpl extends ASTWrapperPsiElement implements RocRecordType {

  public RocRecordTypeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RocVisitor visitor) {
    visitor.visitRecordType(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RocVisitor) accept((RocVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RocRecordTypeExt getRecordTypeExt() {
    return findChildByClass(RocRecordTypeExt.class);
  }

  @Override
  @NotNull
  public List<RocRecordTypeField> getRecordTypeFieldList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RocRecordTypeField.class);
  }

}
