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

public class RocPlatformHeaderImpl extends ASTWrapperPsiElement implements RocPlatformHeader {

  public RocPlatformHeaderImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RocVisitor visitor) {
    visitor.visitPlatformHeader(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RocVisitor) accept((RocVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RocExposes getExposes() {
    return findChildByClass(RocExposes.class);
  }

  @Override
  @Nullable
  public RocPackages getPackages() {
    return findChildByClass(RocPackages.class);
  }

  @Override
  @Nullable
  public RocPlatformProvides getPlatformProvides() {
    return findChildByClass(RocPlatformProvides.class);
  }

  @Override
  @Nullable
  public RocPlatformRequires getPlatformRequires() {
    return findChildByClass(RocPlatformRequires.class);
  }

  @Override
  @Nullable
  public RocPlatformTargets getPlatformTargets() {
    return findChildByClass(RocPlatformTargets.class);
  }

  @Override
  @Nullable
  public RocString getString() {
    return findChildByClass(RocString.class);
  }

}
