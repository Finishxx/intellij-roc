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

public class RocRequiresEntryImpl extends ASTWrapperPsiElement implements RocRequiresEntry {

  public RocRequiresEntryImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RocVisitor visitor) {
    visitor.visitRequiresEntry(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RocVisitor) accept((RocVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RocFunctionType getFunctionType() {
    return findChildByClass(RocFunctionType.class);
  }

  @Override
  @Nullable
  public RocInferredType getInferredType() {
    return findChildByClass(RocInferredType.class);
  }

  @Override
  @Nullable
  public RocInferredTypeVar getInferredTypeVar() {
    return findChildByClass(RocInferredTypeVar.class);
  }

  @Override
  @Nullable
  public RocRecordType getRecordType() {
    return findChildByClass(RocRecordType.class);
  }

  @Override
  @Nullable
  public RocRequiresForClause getRequiresForClause() {
    return findChildByClass(RocRequiresForClause.class);
  }

  @Override
  @Nullable
  public RocTagUnionType getTagUnionType() {
    return findChildByClass(RocTagUnionType.class);
  }

  @Override
  @Nullable
  public RocTupleType getTupleType() {
    return findChildByClass(RocTupleType.class);
  }

  @Override
  @Nullable
  public RocTypeReference getTypeReference() {
    return findChildByClass(RocTypeReference.class);
  }

  @Override
  @NotNull
  public PsiElement getLowerIdent() {
    return findNotNullChildByType(LOWER_IDENT);
  }

}
