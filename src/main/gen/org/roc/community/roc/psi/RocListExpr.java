// This is a generated file. Not intended for manual editing.
package org.roc.community.roc.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RocListExpr extends PsiElement {

  @NotNull
  List<RocCharLiteral> getCharLiteralList();

  @NotNull
  List<RocFloatLiteral> getFloatLiteralList();

  @NotNull
  List<RocIdentExpr> getIdentExprList();

  @NotNull
  List<RocIntLiteral> getIntLiteralList();

  @NotNull
  List<RocListExpr> getListExprList();

  @NotNull
  List<RocRecordExpr> getRecordExprList();

  @NotNull
  List<RocString> getStringList();

  @NotNull
  List<RocTagExpr> getTagExprList();

  @NotNull
  List<RocTupleExpr> getTupleExprList();

}
