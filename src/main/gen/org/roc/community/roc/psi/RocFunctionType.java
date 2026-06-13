// This is a generated file. Not intended for manual editing.
package org.roc.community.roc.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RocFunctionType extends PsiElement {

  @Nullable
  RocFunctionType getFunctionType();

  @NotNull
  List<RocInferredType> getInferredTypeList();

  @NotNull
  List<RocInferredTypeVar> getInferredTypeVarList();

  @NotNull
  List<RocRecordType> getRecordTypeList();

  @NotNull
  List<RocTagUnionType> getTagUnionTypeList();

  @NotNull
  List<RocTupleType> getTupleTypeList();

  @NotNull
  List<RocTypeReference> getTypeReferenceList();

}
