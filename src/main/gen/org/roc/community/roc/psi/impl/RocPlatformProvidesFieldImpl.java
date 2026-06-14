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

public class RocPlatformProvidesFieldImpl extends ASTWrapperPsiElement implements RocPlatformProvidesField {

  public RocPlatformProvidesFieldImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RocVisitor visitor) {
    visitor.visitPlatformProvidesField(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RocVisitor) accept((RocVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RocCharLiteral getCharLiteral() {
    return findChildByClass(RocCharLiteral.class);
  }

  @Override
  @Nullable
  public RocFloatLiteral getFloatLiteral() {
    return findChildByClass(RocFloatLiteral.class);
  }

  @Override
  @Nullable
  public RocIdentExpr getIdentExpr() {
    return findChildByClass(RocIdentExpr.class);
  }

  @Override
  @Nullable
  public RocIntLiteral getIntLiteral() {
    return findChildByClass(RocIntLiteral.class);
  }

  @Override
  @Nullable
  public RocListExpr getListExpr() {
    return findChildByClass(RocListExpr.class);
  }

  @Override
  @Nullable
  public RocRecordExpr getRecordExpr() {
    return findChildByClass(RocRecordExpr.class);
  }

  @Override
  @Nullable
  public RocString getString() {
    return findChildByClass(RocString.class);
  }

  @Override
  @Nullable
  public RocTagExpr getTagExpr() {
    return findChildByClass(RocTagExpr.class);
  }

  @Override
  @Nullable
  public RocTupleExpr getTupleExpr() {
    return findChildByClass(RocTupleExpr.class);
  }

  @Override
  @NotNull
  public PsiElement getLowerIdent() {
    return findNotNullChildByType(LOWER_IDENT);
  }

}
