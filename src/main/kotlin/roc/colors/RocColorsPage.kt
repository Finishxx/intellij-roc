package org.roc.community.roc.colors

import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import com.intellij.openapi.util.NlsContexts
import com.intellij.openapi.util.io.StreamUtil
import org.jetbrains.annotations.NonNls
import org.roc.community.roc.RocIcons
import org.roc.community.roc.RocMessageBundle
import javax.swing.Icon

class RocColorsPage : ColorSettingsPage {
    override fun getIcon(): Icon = RocIcons.RocIcon
    override fun getHighlighter(): SyntaxHighlighter = RocHighlighter()
    override fun getDemoText(): @NonNls String = DEMO_TEXT
    override fun getAdditionalHighlightingTagToDescriptorMap(): Map<String?, TextAttributesKey?>? = null
    override fun getAttributeDescriptors(): Array<out AttributesDescriptor?> = ATTRS
    override fun getColorDescriptors(): Array<out ColorDescriptor?> = ColorDescriptor.EMPTY_ARRAY
    override fun getDisplayName(): @NlsContexts.ConfigurableName String =
        RocMessageBundle.message("roc.colors.settings.page.display.name")
}

private val ATTRS: Array<AttributesDescriptor> = RocColor.entries.map { it.attributesDescriptor }.toTypedArray()
private val DEMO_TEXT: String by lazy {
    // TODO: The annotations in this file should be generable, and would be more accurate for it.
    val stream = RocColorsPage::class.java.classLoader
        .getResourceAsStream("org/roc/community/roc/colors/highlighterDemoText.roc")
        ?: error("Cannot load resource `org/roc/community/roc/colors/highlighterDemoText.roc`")
    stream.use {
        StreamUtil.convertSeparators(it.reader().readText())
    }
}