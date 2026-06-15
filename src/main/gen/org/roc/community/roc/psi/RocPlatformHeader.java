// This is a generated file. Not intended for manual editing.
package org.roc.community.roc.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RocPlatformHeader extends PsiElement {

  @Nullable
  RocExposes getExposes();

  @Nullable
  RocPackages getPackages();

  @Nullable
  RocPlatformProvides getPlatformProvides();

  @Nullable
  RocPlatformRequires getPlatformRequires();

  @Nullable
  RocPlatformTargets getPlatformTargets();

  @Nullable
  RocString getString();

}
