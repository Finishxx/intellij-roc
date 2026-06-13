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

public class StringImpl extends ASTWrapperPsiElement implements String {

  public StringImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull Visitor visitor) {
    visitor.visitString(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<StringInterpolation> getStringInterpolationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StringInterpolation.class);
  }

  @Override
  @NotNull
  public PsiElement getStringEnd() {
    return findNotNullChildByType(STRING_END);
  }

  @Override
  @NotNull
  public PsiElement getStringStart() {
    return findNotNullChildByType(STRING_START);
  }

}
