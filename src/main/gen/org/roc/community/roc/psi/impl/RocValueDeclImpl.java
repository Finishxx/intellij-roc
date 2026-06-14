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

public class RocValueDeclImpl extends ASTWrapperPsiElement implements RocValueDecl {

  public RocValueDeclImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RocVisitor visitor) {
    visitor.visitValueDecl(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RocVisitor) accept((RocVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RocAsPattern getAsPattern() {
    return findChildByClass(RocAsPattern.class);
  }

  @Override
  @NotNull
  public List<RocExpr> getExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RocExpr.class);
  }

  @Override
  @Nullable
  public RocIdentPattern getIdentPattern() {
    return findChildByClass(RocIdentPattern.class);
  }

  @Override
  @Nullable
  public RocListPattern getListPattern() {
    return findChildByClass(RocListPattern.class);
  }

  @Override
  @Nullable
  public RocLiteralPattern getLiteralPattern() {
    return findChildByClass(RocLiteralPattern.class);
  }

  @Override
  @Nullable
  public RocRecordPattern getRecordPattern() {
    return findChildByClass(RocRecordPattern.class);
  }

  @Override
  @Nullable
  public RocTagPattern getTagPattern() {
    return findChildByClass(RocTagPattern.class);
  }

  @Override
  @Nullable
  public RocTuplePattern getTuplePattern() {
    return findChildByClass(RocTuplePattern.class);
  }

  @Override
  @Nullable
  public RocUnderscorePattern getUnderscorePattern() {
    return findChildByClass(RocUnderscorePattern.class);
  }

  @Override
  @Nullable
  public RocVarPattern getVarPattern() {
    return findChildByClass(RocVarPattern.class);
  }

}
