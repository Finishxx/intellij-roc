package org.roc.community.roc.colors

import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.util.NlsContexts.AttributeDescriptor
import org.roc.community.roc.RocMessageBundle
import java.util.function.Supplier
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors as Default

enum class RocColor(humanName: Supplier<@AttributeDescriptor String>, default: TextAttributesKey? = null) {
    VARIABLE(RocMessageBundle.lazyMessage("settings.color.variables.default"), Default.LINE_COMMENT),
    ;

    val textAttributesKey: TextAttributesKey = TextAttributesKey.createTextAttributesKey("org.rust.$name", default)
    val attributesDescriptor: AttributesDescriptor = AttributesDescriptor(humanName, textAttributesKey)
    val testSeverity: HighlightSeverity = HighlightSeverity(name, HighlightSeverity.INFORMATION.myVal)
}
