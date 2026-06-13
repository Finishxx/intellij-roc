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

public class RocWhereAliasImpl extends ASTWrapperPsiElement implements RocWhereAlias {

  public RocWhereAliasImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RocVisitor visitor) {
    visitor.visitWhereAlias(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RocVisitor) accept((RocVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getDotUpperIdent() {
    return findChildByType(DOT_UPPER_IDENT);
  }

  @Override
  @NotNull
  public PsiElement getLowerIdent() {
    return findNotNullChildByType(LOWER_IDENT);
  }

  @Override
  @Nullable
  public PsiElement getNoSpaceDotUpperIdent() {
    return findChildByType(NO_SPACE_DOT_UPPER_IDENT);
  }

}
