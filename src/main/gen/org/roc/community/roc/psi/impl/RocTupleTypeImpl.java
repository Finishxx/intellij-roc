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

public class RocTupleTypeImpl extends ASTWrapperPsiElement implements RocTupleType {

  public RocTupleTypeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RocVisitor visitor) {
    visitor.visitTupleType(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RocVisitor) accept((RocVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RocFunctionType> getFunctionTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RocFunctionType.class);
  }

  @Override
  @NotNull
  public List<RocInferredType> getInferredTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RocInferredType.class);
  }

  @Override
  @NotNull
  public List<RocInferredTypeVar> getInferredTypeVarList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RocInferredTypeVar.class);
  }

  @Override
  @NotNull
  public List<RocRecordType> getRecordTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RocRecordType.class);
  }

  @Override
  @NotNull
  public List<RocTagUnionType> getTagUnionTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RocTagUnionType.class);
  }

  @Override
  @NotNull
  public List<RocTupleType> getTupleTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RocTupleType.class);
  }

  @Override
  @NotNull
  public List<RocTypeReference> getTypeReferenceList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RocTypeReference.class);
  }

  @Override
  @Nullable
  public PsiElement getNoSpaceLparen() {
    return findChildByType(NO_SPACE_LPAREN);
  }

}
