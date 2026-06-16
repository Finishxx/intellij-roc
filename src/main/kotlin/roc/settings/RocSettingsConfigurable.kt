package org.roc.community.roc.settings

import com.intellij.openapi.components.service
import com.intellij.openapi.options.BoundSearchableConfigurable
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.DialogPanel
import com.intellij.ui.dsl.builder.bind
import com.intellij.ui.dsl.builder.bindSelected
import com.intellij.ui.dsl.builder.bindText
import com.intellij.ui.dsl.builder.panel
import org.roc.community.roc.RocMessageBundle

class RocSettingsConfigurable(private val project: Project) : BoundSearchableConfigurable(
    RocMessageBundle.message("settings.roc.name"),
    RocMessageBundle.message("settings.roc.name"),
    _id = "Settings.Roc"
) {


    private val settings: RocSettings
        get() = project.service<RocSettings>()

    override fun createPanel(): DialogPanel = panel {
        row {
            checkBox(RocMessageBundle.message("settings.roc.lsp.enabled"))
                .bindSelected(settings::lspEnabled)
        }
        buttonsGroup {
            row {
                radioButton("From settings", RocExecutableDiscovery.SETTINGS)
                radioButton("From PATH", RocExecutableDiscovery.PATH)
            }
        }.bind(settings::rocExecutableDiscovery)
        row("Executable path:") {
            textFieldWithBrowseButton()
                .bindText(                                    // String? needs getter/setter, like markdown's customStylesheetPath
                    getter = { settings.rocExecutablePath.orEmpty() },
                    setter = { settings.rocExecutablePath = it },
                )
        }
    }
}