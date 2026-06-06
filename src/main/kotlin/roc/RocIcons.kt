package org.roc.community.roc

import com.intellij.openapi.util.IconLoader
import javax.swing.Icon

object RocIcons {
    private fun load(path: String): Icon {
        return IconLoader.getIcon(
            path,
            RocIcons::class.java.getClassLoader(),
        )
    }
    val RocIcon = load("icons/roc.svg")
}