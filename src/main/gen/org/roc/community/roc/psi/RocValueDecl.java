// This is a generated file. Not intended for manual editing.
package org.roc.community.roc.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RocValueDecl extends PsiElement {

  @Nullable
  RocAsPattern getAsPattern();

  @Nullable
  RocIdentPattern getIdentPattern();

  @Nullable
  RocListPattern getListPattern();

  @Nullable
  RocLiteralPattern getLiteralPattern();

  @Nullable
  RocRecordPattern getRecordPattern();

  @NotNull
  List<RocString> getStringList();

  @Nullable
  RocTagPattern getTagPattern();

  @Nullable
  RocTuplePattern getTuplePattern();

  @Nullable
  RocUnderscorePattern getUnderscorePattern();

  @Nullable
  RocVarPattern getVarPattern();

  @Nullable
  PsiElement getFloat();

  @Nullable
  PsiElement getInt();

  @Nullable
  PsiElement getLowerIdent();

  @Nullable
  PsiElement getUpperIdent();

}
