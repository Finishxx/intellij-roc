package org.roc.community.roc

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class RocFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, RocLanguage) {
    override fun getFileType(): FileType = RocFileType
}