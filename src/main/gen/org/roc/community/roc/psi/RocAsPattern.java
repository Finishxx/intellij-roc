// This is a generated file. Not intended for manual editing.
package org.roc.community.roc.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RocAsPattern extends PsiElement {

  @Nullable
  RocIdentPattern getIdentPattern();

  @Nullable
  RocListPattern getListPattern();

  @Nullable
  RocLiteralPattern getLiteralPattern();

  @Nullable
  RocRecordPattern getRecordPattern();

  @Nullable
  RocString getString();

  @Nullable
  RocTagPattern getTagPattern();

  @Nullable
  RocTuplePattern getTuplePattern();

  @Nullable
  RocUnderscorePattern getUnderscorePattern();

  @NotNull
  PsiElement getLowerIdent();

}
