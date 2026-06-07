package org.roc.community.roc

import junit.framework.TestCase
import java.nio.file.Files
import java.nio.file.Path

/**
 * Absolute path to this module's checked-in lexer testData directory (`src/test/testData/lexer`).
 *
 * [com.intellij.testFramework.LexerTestCase.getPathToTestDataFile] resolves goldens against the IDE
 * home path, which under the IntelliJ Platform Gradle plugin is the downloaded IDE — not our
 * project. We instead locate the module root from the test class's own compiled location and walk
 * up to the directory containing `settings.gradle.kts`, then descend into the source tree, so
 * goldens are read from / generated into version control.
 */
fun TestCase.lexerTestDataPath(): Path = moduleRoot(javaClass).resolve("src/test/testData/lexer")

private fun moduleRoot(anchor: Class<*>): Path {
    var dir: Path? = anchor.getResource("${anchor.simpleName}.class")
        ?.toURI()
        ?.let { runCatching { Path.of(it) }.getOrNull() }
    while (dir != null && !Files.isRegularFile(dir.resolve("settings.gradle.kts"))) {
        dir = dir.parent
    }
    return dir ?: Path.of(System.getProperty("user.dir"))
}
