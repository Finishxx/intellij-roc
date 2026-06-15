package org.roc.community.roc.parser

import com.intellij.psi.tree.TokenSet
import org.roc.community.roc.psi.RocTypes

object RocTokenSets {
    // TODO: Maybe others too
    val IDENTIFIERS: TokenSet = TokenSet.create(RocTypes.LOWER_IDENT, RocTypes.UPPER_IDENT)
    val COMMENTS: TokenSet = TokenSet.create(RocTypes.COMMENT)

    val KEYWORDS: TokenSet = TokenSet.create(
        RocTypes.KW_AND, RocTypes.KW_APP, RocTypes.KW_AS, RocTypes.KW_BREAK,
        RocTypes.KW_CRASH, RocTypes.KW_DBG, RocTypes.KW_ELSE, RocTypes.KW_EXPECT,
        RocTypes.KW_EXPOSES, RocTypes.KW_EXPOSING, RocTypes.KW_FOR, RocTypes.KW_GENERATES,
        RocTypes.KW_HAS, RocTypes.KW_HOSTED, RocTypes.KW_IF, RocTypes.KW_IMPLEMENTS,
        RocTypes.KW_IMPORT, RocTypes.KW_IMPORTS, RocTypes.KW_IN, RocTypes.KW_INTERFACE,
        RocTypes.KW_MATCH, RocTypes.KW_MODULE, RocTypes.KW_OR, RocTypes.KW_PACKAGE,
        RocTypes.KW_PACKAGES, RocTypes.KW_PLATFORM, RocTypes.KW_PROVIDES, RocTypes.KW_REQUIRES,
        RocTypes.KW_RETURN, RocTypes.KW_TARGETS, RocTypes.KW_VAR, RocTypes.KW_WHERE,
        RocTypes.KW_WHILE, RocTypes.KW_WITH,
    )

    val OPERATORS: TokenSet = TokenSet.create(
        RocTypes.OP_AMPERSAND, RocTypes.OP_ARROW, RocTypes.OP_ASSIGN, RocTypes.OP_BACKSLASH,
        RocTypes.OP_BACK_ARROW, RocTypes.OP_BANG, RocTypes.OP_BAR, RocTypes.OP_BINARY_MINUS,
        RocTypes.OP_CARET, RocTypes.OP_COLON, RocTypes.OP_COLON_EQUAL, RocTypes.OP_DOUBLE_COLON,
        RocTypes.OP_DOUBLE_QUESTION, RocTypes.OP_DOUBLE_SLASH, RocTypes.OP_EQUALS, RocTypes.OP_FAT_ARROW,
        RocTypes.OP_GREATER_THAN, RocTypes.OP_GREATER_THAN_OR_EQ, RocTypes.OP_LESS_THAN, RocTypes.OP_LESS_THAN_OR_EQ,
        RocTypes.OP_NOT_EQUALS, RocTypes.OP_PERCENT, RocTypes.OP_PIZZA, RocTypes.OP_PLUS,
        RocTypes.OP_QUESTION, RocTypes.NO_SPACE_OP_QUESTION, RocTypes.OP_SLASH, RocTypes.OP_STAR,
        RocTypes.OP_UNARY_MINUS,
        // spread / range / record-builder operators that happen to start with a dot
        RocTypes.DOUBLE_DOT, RocTypes.TRIPLE_DOT, RocTypes.DOT_STAR,
    )

    val STRINGS: TokenSet = TokenSet.create(
        RocTypes.STRING_START, RocTypes.STRING_PART, RocTypes.STRING_END,
        RocTypes.MULTILINE_STRING_START,
    )
}
