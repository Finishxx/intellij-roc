// This is a generated file. Not intended for manual editing.
package generated.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.roc.community.roc.psi.RocTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import generated.psi.*;

public class StringInterpolationImpl extends ASTWrapperPsiElement implements StringInterpolation {

  public StringInterpolationImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull Visitor visitor) {
    visitor.visitStringInterpolation(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getCloseStringInterpolation() {
    return findNotNullChildByType(CLOSE_STRING_INTERPOLATION);
  }

  @Override
  @NotNull
  public PsiElement getOpenStringInterpolation() {
    return findNotNullChildByType(OPEN_STRING_INTERPOLATION);
  }

}
