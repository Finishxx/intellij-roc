package org.roc.community.roc.parser

import com.intellij.psi.tree.TokenSet
import org.roc.community.roc.psi.RocTypes

object RocTokenSets {
    // TODO: Maybe others too
    val IDENTIFIERS: TokenSet = TokenSet.create(RocTypes.LOWER_IDENT, RocTypes.UPPER_IDENT)
    val COMMENTS: TokenSet = TokenSet.create(RocTypes.COMMENT)
}