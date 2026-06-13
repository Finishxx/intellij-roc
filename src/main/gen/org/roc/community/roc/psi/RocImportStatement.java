// This is a generated file. Not intended for manual editing.
package org.roc.community.roc.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RocImportStatement extends PsiElement {

  @Nullable
  RocFunctionType getFunctionType();

  @Nullable
  RocImportAlias getImportAlias();

  @Nullable
  RocImportExposing getImportExposing();

  @Nullable
  RocInferredType getInferredType();

  @Nullable
  RocInferredTypeVar getInferredTypeVar();

  @Nullable
  RocModuleName getModuleName();

  @Nullable
  RocRecordType getRecordType();

  @Nullable
  RocString getString();

  @Nullable
  RocTagUnionType getTagUnionType();

  @Nullable
  RocTupleType getTupleType();

  @Nullable
  RocTypeReference getTypeReference();

  @Nullable
  PsiElement getLowerIdent();

}
