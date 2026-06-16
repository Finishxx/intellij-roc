package org.roc.community.roc.settings

import com.intellij.openapi.components.BaseState

enum class RocExecutableDiscovery {
    PATH,
    SETTINGS,
}

class RocSettingsState : BaseState() {
    var lspEnabled: Boolean by property(true)
    var rocExecutableDiscovery: RocExecutableDiscovery by enum(RocExecutableDiscovery.PATH)
    var rocExecutablePath: String? by string("")
}