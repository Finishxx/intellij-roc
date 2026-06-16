package org.roc.community.roc.lsp

import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.execution.configurations.PathEnvironmentVariableUtil
import com.intellij.openapi.components.service
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.platform.lsp.api.LspServer
import com.intellij.platform.lsp.api.LspServerSupportProvider
import com.intellij.platform.lsp.api.ProjectWideLspServerDescriptor
import com.intellij.platform.lsp.api.lsWidget.LspServerWidgetItem
import org.roc.community.roc.RocIcons
import org.roc.community.roc.settings.RocExecutableDiscovery
import org.roc.community.roc.settings.RocSettings
import org.roc.community.roc.settings.RocSettingsConfigurable
import org.roc.community.roc.util.RocFileUtil

class RocLspServerSupportProvider : LspServerSupportProvider {
    override fun fileOpened(
        project: Project,
        file: VirtualFile,
        serverStarter: LspServerSupportProvider.LspServerStarter
    ) {
        if (RocFileUtil.isRocFile(file)) {
            serverStarter.ensureServerStarted(RocServerDescriptor(project))
        }
    }

    override fun createLspServerWidgetItem(
        lspServer: LspServer,
        currentFile: VirtualFile?
    ) =
        LspServerWidgetItem(
            lspServer, currentFile,
            RocIcons.RocIcon, RocSettingsConfigurable::class.java
        )
}

// TODO: We should stop the server somehow?
private class RocServerDescriptor(project: Project) : ProjectWideLspServerDescriptor(project, "Roc") {
    val settings: RocSettings
        get() = project.service<RocSettings>()

    override fun isSupportedFile(file: VirtualFile): Boolean =
        RocFileUtil.isRocFile(file)
                && settings.lspEnabled
                && (settings.rocExecutableDiscovery == RocExecutableDiscovery.PATH || !settings.rocExecutablePath.isNullOrEmpty())

    override fun createCommandLine(): GeneralCommandLine {
        val executablePath = when (settings.rocExecutableDiscovery) {
            RocExecutableDiscovery.PATH ->
                PathEnvironmentVariableUtil.findExecutableInPathOnAnyOS("roc")?.absolutePath
                    ?: error("roc not found on PATH")
            RocExecutableDiscovery.SETTINGS ->
                settings.rocExecutablePath ?: error("Roc executable path is not configured")
        }
        return GeneralCommandLine(executablePath, "experimental-lsp")
    }
}