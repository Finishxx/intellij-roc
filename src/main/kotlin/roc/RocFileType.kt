package org.roc.community.roc

import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.util.NlsContexts
import com.intellij.openapi.util.NlsSafe
import org.jetbrains.annotations.NonNls
import javax.swing.Icon

class RocFileType : LanguageFileType(RocLanguage) {
    override fun getName(): @NonNls String = "Roc"

    override fun getDescription(): @NlsContexts.Label String = "Roc file type"

    override fun getDefaultExtension(): @NlsSafe String = "roc"

    override fun getIcon(): Icon = RocIcons.RocIcon
}