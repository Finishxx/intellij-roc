// This is a generated file. Not intended for manual editing.
package org.roc.community.roc.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RocRecordExprField extends PsiElement {

  @Nullable
  RocCharLiteral getCharLiteral();

  @Nullable
  RocFloatLiteral getFloatLiteral();

  @Nullable
  RocIdentExpr getIdentExpr();

  @Nullable
  RocIntLiteral getIntLiteral();

  @Nullable
  RocListExpr getListExpr();

  @Nullable
  RocRecordExpr getRecordExpr();

  @Nullable
  RocString getString();

  @Nullable
  RocTagExpr getTagExpr();

  @Nullable
  RocTupleExpr getTupleExpr();

  @NotNull
  PsiElement getLowerIdent();

}
