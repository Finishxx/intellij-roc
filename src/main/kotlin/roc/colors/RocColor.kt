package org.roc.community.roc.colors

import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.options.OptionsBundle
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.util.NlsContexts.AttributeDescriptor
import org.roc.community.roc.RocMessageBundle
import java.util.function.Supplier
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors as Default

enum class RocColor(humanName: Supplier<@AttributeDescriptor String>, default: TextAttributesKey? = null) {
    VARIABLE(RocMessageBundle.lazyMessage("settings.color.variables.default"), Default.IDENTIFIER),
    // Roc has no semantic info at the lexer level, so every PascalCase name (type, tag, or module)
    // shares this one color.
    TYPE(RocMessageBundle.lazyMessage("settings.color.type"), Default.CLASS_NAME),
    OPAQUE(RocMessageBundle.lazyMessage("settings.color.opaque"), Default.CLASS_NAME),

    KEYWORD(RocMessageBundle.lazyMessage("settings.color.keyword"), Default.KEYWORD),

    NUMBER(RocMessageBundle.lazyMessage("settings.color.number"), Default.NUMBER),
    STRING(RocMessageBundle.lazyMessage("settings.color.string"), Default.STRING),
    CHAR(RocMessageBundle.lazyMessage("settings.color.char"), Default.STRING),
    // The `${` / `}` delimiters around an interpolated expression.
    STRING_INTERPOLATION(RocMessageBundle.lazyMessage("settings.color.string.interpolation"), Default.VALID_STRING_ESCAPE),

    OPERATORS(RocMessageBundle.lazyMessage("settings.color.operators"), Default.OPERATION_SIGN),

    COMMENT(OptionsBundle.messagePointer("options.language.defaults.line.comment"), Default.LINE_COMMENT),

    PARENTHESES(OptionsBundle.messagePointer("options.language.defaults.parentheses"), Default.PARENTHESES),
    BRACES(OptionsBundle.messagePointer("options.language.defaults.braces"), Default.BRACES),
    BRACKETS(OptionsBundle.messagePointer("options.language.defaults.brackets"), Default.BRACKETS),
    COMMA(OptionsBundle.messagePointer("options.language.defaults.comma"), Default.COMMA),
    DOT(OptionsBundle.messagePointer("options.language.defaults.dot"), Default.DOT),
    ;

    val textAttributesKey: TextAttributesKey = TextAttributesKey.createTextAttributesKey("org.roc.$name", default)
    val attributesDescriptor: AttributesDescriptor = AttributesDescriptor(humanName, textAttributesKey)
    val testSeverity: HighlightSeverity = HighlightSeverity(name, HighlightSeverity.INFORMATION.myVal)
}
