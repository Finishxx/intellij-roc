// This is a generated file. Not intended for manual editing.
package org.roc.community.roc.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RocMethodCallExpr extends RocExpr {

  @NotNull
  List<RocExpr> getExprList();

  @Nullable
  PsiElement getDotLowerIdent();

  @Nullable
  PsiElement getNoSpaceDotLowerIdent();

  @NotNull
  PsiElement getNoSpaceLparen();

}
