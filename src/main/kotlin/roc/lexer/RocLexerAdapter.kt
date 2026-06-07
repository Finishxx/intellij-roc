package org.roc.community.roc.lexer

import com.intellij.lexer.FlexAdapter

class RocLexerAdapter : FlexAdapter(RocLexer(null)) {
}