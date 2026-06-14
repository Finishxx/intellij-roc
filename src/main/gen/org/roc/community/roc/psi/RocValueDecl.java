// This is a generated file. Not intended for manual editing.
package org.roc.community.roc.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RocValueDecl extends PsiElement {

  @Nullable
  RocAsPattern getAsPattern();

  @Nullable
  RocCharLiteral getCharLiteral();

  @Nullable
  RocFloatLiteral getFloatLiteral();

  @Nullable
  RocIdentExpr getIdentExpr();

  @Nullable
  RocIdentPattern getIdentPattern();

  @Nullable
  RocIntLiteral getIntLiteral();

  @Nullable
  RocListExpr getListExpr();

  @Nullable
  RocListPattern getListPattern();

  @Nullable
  RocLiteralPattern getLiteralPattern();

  @Nullable
  RocRecordExpr getRecordExpr();

  @Nullable
  RocRecordPattern getRecordPattern();

  @NotNull
  List<RocString> getStringList();

  @Nullable
  RocTagExpr getTagExpr();

  @Nullable
  RocTagPattern getTagPattern();

  @Nullable
  RocTupleExpr getTupleExpr();

  @Nullable
  RocTuplePattern getTuplePattern();

  @Nullable
  RocUnderscorePattern getUnderscorePattern();

  @Nullable
  RocVarPattern getVarPattern();

}
