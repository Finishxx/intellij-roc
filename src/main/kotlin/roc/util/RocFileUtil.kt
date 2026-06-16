package org.roc.community.roc.util

import com.intellij.openapi.fileTypes.FileTypeRegistry
import com.intellij.openapi.vfs.VirtualFile
import org.roc.community.roc.RocFileType

object RocFileUtil {
    fun isRocFile(file: VirtualFile?): Boolean =
        file != null
                && FileTypeRegistry.getInstance().isFileOfType(file, RocFileType)
                && file.extension == "roc"


}