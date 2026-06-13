// This is a generated file. Not intended for manual editing.
package org.roc.community.roc.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RocValueAnnotation extends PsiElement {

  @Nullable
  RocFunctionType getFunctionType();

  @Nullable
  RocInferredType getInferredType();

  @Nullable
  RocInferredTypeVar getInferredTypeVar();

  @Nullable
  RocRecordType getRecordType();

  @Nullable
  RocTagUnionType getTagUnionType();

  @Nullable
  RocTupleType getTupleType();

  @Nullable
  RocTypeReference getTypeReference();

  @Nullable
  RocWhereClause getWhereClause();

  @Nullable
  PsiElement getLowerIdent();

  @Nullable
  PsiElement getNamedUnderscore();

}
