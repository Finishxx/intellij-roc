package org.roc.community.roc

import junit.framework.TestCase
import java.nio.file.Files
import java.nio.file.Path

fun TestCase.lexerTestDataPath(): Path = moduleRoot(javaClass).resolve("src/test/testData/lexer")
fun TestCase.parserTestDataPath(): Path = moduleRoot(javaClass).resolve("src/test/testData/parser")

private fun moduleRoot(anchor: Class<*>): Path {
    var dir: Path? = anchor.getResource("${anchor.simpleName}.class")
        ?.toURI()
        ?.let { runCatching { Path.of(it) }.getOrNull() }
    while (dir != null && !Files.isRegularFile(dir.resolve("settings.gradle.kts"))) {
        dir = dir.parent
    }
    return dir ?: Path.of(System.getProperty("user.dir"))
}
