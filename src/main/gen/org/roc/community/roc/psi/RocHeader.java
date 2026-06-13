// This is a generated file. Not intended for manual editing.
package org.roc.community.roc.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RocHeader extends PsiElement {

  @Nullable
  RocAppHeader getAppHeader();

  @Nullable
  RocHostedHeader getHostedHeader();

  @Nullable
  RocModuleHeader getModuleHeader();

  @Nullable
  RocPackageHeader getPackageHeader();

}
