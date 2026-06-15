package org.roc.community.roc.colors

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import org.roc.community.roc.lexer.RocLexerAdapter
import org.roc.community.roc.parser.RocTokenSets
import org.roc.community.roc.psi.RocTypes

class RocHighlighter : SyntaxHighlighterBase() {
    init {
        // Early initialize text attributes to make them available for `HighlightingMarkupGrave`
        RocColor.VARIABLE
    }

    override fun getHighlightingLexer(): Lexer = RocLexerAdapter()

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> =
        pack(Helper.map(tokenType)?.textAttributesKey)

    object Helper {
        fun map(tokenType: IElementType): RocColor? = when (tokenType) {
            in RocTokenSets.KEYWORDS -> RocColor.KEYWORD
            in RocTokenSets.OPERATORS -> RocColor.OPERATORS
            in RocTokenSets.STRINGS -> RocColor.STRING

            RocTypes.INT, RocTypes.FLOAT -> RocColor.NUMBER
            RocTypes.SINGLE_QUOTE -> RocColor.CHAR

            RocTypes.OPEN_STRING_INTERPOLATION,
            RocTypes.CLOSE_STRING_INTERPOLATION -> RocColor.STRING_INTERPOLATION

            RocTypes.COMMENT -> RocColor.COMMENT
            RocTypes.LOWER_IDENT -> RocColor.VARIABLE
            RocTypes.UPPER_IDENT -> RocColor.TYPE
            RocTypes.OPAQUE_NAME -> RocColor.OPAQUE

            RocTypes.LPAREN, RocTypes.NO_SPACE_LPAREN, RocTypes.RPAREN -> RocColor.PARENTHESES
            RocTypes.LBRACE, RocTypes.RBRACE -> RocColor.BRACES
            RocTypes.LBRACK, RocTypes.RBRACK -> RocColor.BRACKETS
            RocTypes.COMMA -> RocColor.COMMA
            RocTypes.DOT -> RocColor.DOT

            // Left as default text for now (the "Rich" highlighting tier): UNDERSCORE,
            // NAMED_UNDERSCORE, and the dot-ident family (DOT_LOWER_IDENT, NO_SPACE_DOT_UPPER_IDENT,
            // DOT_INT, ...) which would need field/qualified-member coloring.
            else -> null
        }
    }
}