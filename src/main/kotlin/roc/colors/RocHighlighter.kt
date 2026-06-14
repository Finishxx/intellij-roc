package org.roc.community.roc.colors

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import org.roc.community.roc.lexer.RocLexerAdapter

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
            else -> null
        }
    }
}