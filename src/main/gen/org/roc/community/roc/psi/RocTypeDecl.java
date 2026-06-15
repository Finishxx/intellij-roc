// This is a generated file. Not intended for manual editing.
package org.roc.community.roc.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RocTypeDecl extends PsiElement {

  @Nullable
  RocAssociatedBlock getAssociatedBlock();

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

  @NotNull
  RocTypeHeader getTypeHeader();

  @Nullable
  RocTypeReference getTypeReference();

  @Nullable
  RocWhereClause getWhereClause();

}
