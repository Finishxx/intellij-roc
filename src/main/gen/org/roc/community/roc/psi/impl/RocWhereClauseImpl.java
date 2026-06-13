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

public class RocWhereClauseImpl extends ASTWrapperPsiElement implements RocWhereClause {

  public RocWhereClauseImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RocVisitor visitor) {
    visitor.visitWhereClause(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RocVisitor) accept((RocVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RocWhereAlias> getWhereAliasList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RocWhereAlias.class);
  }

  @Override
  @NotNull
  public List<RocWhereMethod> getWhereMethodList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RocWhereMethod.class);
  }

}
