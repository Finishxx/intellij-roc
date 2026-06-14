// This is a generated file. Not intended for manual editing.
package org.roc.community.roc.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.roc.community.roc.psi.RocTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.roc.community.roc.psi.*;

public class RocTuplePatternImpl extends ASTWrapperPsiElement implements RocTuplePattern {

  public RocTuplePatternImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RocVisitor visitor) {
    visitor.visitTuplePattern(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RocVisitor) accept((RocVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RocAlternativesPattern> getAlternativesPatternList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RocAlternativesPattern.class);
  }

  @Override
  @NotNull
  public List<RocAsPattern> getAsPatternList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RocAsPattern.class);
  }

  @Override
  @NotNull
  public List<RocIdentPattern> getIdentPatternList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RocIdentPattern.class);
  }

  @Override
  @NotNull
  public List<RocListPattern> getListPatternList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RocListPattern.class);
  }

  @Override
  @NotNull
  public List<RocLiteralPattern> getLiteralPatternList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RocLiteralPattern.class);
  }

  @Override
  @NotNull
  public List<RocRecordPattern> getRecordPatternList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RocRecordPattern.class);
  }

  @Override
  @NotNull
  public List<RocString> getStringList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RocString.class);
  }

  @Override
  @NotNull
  public List<RocTagPattern> getTagPatternList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RocTagPattern.class);
  }

  @Override
  @NotNull
  public List<RocTuplePattern> getTuplePatternList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RocTuplePattern.class);
  }

  @Override
  @NotNull
  public List<RocUnderscorePattern> getUnderscorePatternList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RocUnderscorePattern.class);
  }

  @Override
  @Nullable
  public PsiElement getNoSpaceLparen() {
    return findChildByType(NO_SPACE_LPAREN);
  }

}
