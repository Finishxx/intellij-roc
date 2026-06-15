// This is a generated file. Not intended for manual editing.
package org.roc.community.roc.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.roc.community.roc.psi.RocTypes.*;
import org.roc.community.roc.psi.*;

public class RocTypedFloatLiteralImpl extends RocExprImpl implements RocTypedFloatLiteral {

  public RocTypedFloatLiteralImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull RocVisitor visitor) {
    visitor.visitTypedFloatLiteral(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RocVisitor) accept((RocVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getFloat() {
    return findNotNullChildByType(FLOAT);
  }

  @Override
  @NotNull
  public PsiElement getNoSpaceDotUpperIdent() {
    return findNotNullChildByType(NO_SPACE_DOT_UPPER_IDENT);
  }

}
