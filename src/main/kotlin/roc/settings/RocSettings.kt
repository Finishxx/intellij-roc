package org.roc.community.roc.settings

import com.intellij.openapi.components.Service
import com.intellij.openapi.components.SimplePersistentStateComponent
import com.intellij.openapi.components.Storage
import com.intellij.openapi.components.State
import com.intellij.openapi.project.Project

@Service(Service.Level.PROJECT)
@State(name = "RocSettings", storages = [(Storage("roc.xml"))])
class RocSettings(internal val project: Project) :
    SimplePersistentStateComponent<RocSettingsState>(RocSettingsState()) {

    var lspEnabled: Boolean
        get() = state.lspEnabled
        set(value) {
            state.lspEnabled = value
        }
    var rocExecutableDiscovery: RocExecutableDiscovery
        get() = state.rocExecutableDiscovery
        set(value) {
            state.rocExecutableDiscovery = value
        }
    var rocExecutablePath: String?
        get() = state.rocExecutablePath
        set(value) {
            state.rocExecutablePath = value
        }

    override fun noStateLoaded() {
        super.noStateLoaded()
        loadState(RocSettingsState())
    }

    fun update(block: (RocSettings) -> Unit) {
        block(this)
    }

}