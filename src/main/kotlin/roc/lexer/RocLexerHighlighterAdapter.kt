package org.roc.community.roc.lexer

import com.intellij.lexer.FlexAdapter

class RocLexerHighlighterAdapter : FlexAdapter(RocLexer(null)) {
}