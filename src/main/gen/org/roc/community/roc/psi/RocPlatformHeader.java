// This is a generated file. Not intended for manual editing.
package org.roc.community.roc.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RocPlatformHeader extends PsiElement {

  @NotNull
  RocExposes getExposes();

  @NotNull
  RocPackages getPackages();

  @NotNull
  RocPlatformProvides getPlatformProvides();

  @NotNull
  RocPlatformRequires getPlatformRequires();

  @Nullable
  RocPlatformTargets getPlatformTargets();

  @NotNull
  RocString getString();

}
