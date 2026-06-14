// This is a generated file. Not intended for manual editing.
package org.roc.community.roc.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RocAlternativesPattern extends PsiElement {

  @NotNull
  List<RocIdentPattern> getIdentPatternList();

  @NotNull
  List<RocListPattern> getListPatternList();

  @NotNull
  List<RocLiteralPattern> getLiteralPatternList();

  @NotNull
  List<RocRecordPattern> getRecordPatternList();

  @NotNull
  List<RocString> getStringList();

  @NotNull
  List<RocTagPattern> getTagPatternList();

  @NotNull
  List<RocTuplePattern> getTuplePatternList();

  @NotNull
  List<RocUnderscorePattern> getUnderscorePatternList();

}
