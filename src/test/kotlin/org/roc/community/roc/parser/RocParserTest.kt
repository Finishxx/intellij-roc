package org.roc.community.roc.parser

import com.intellij.platform.testFramework.core.FileComparisonFailedError
import com.intellij.testFramework.ParsingTestCase
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.roc.community.roc.parserTestDataPath

@RunWith(JUnit4::class)
class RocParsingTest : ParsingTestCase("", "roc", RocParserDefinition()) {
    override fun getTestDataPath(): String = parserTestDataPath().toString()

    @Test
    fun testAppHeaderMinimal() = doTest(true)

    @Test
    fun testModuleHeader() = doTest(true)

    @Test
    fun testHostedHeader() = doTest(true)

    @Test
    fun testPackageHeader() = doTest(true)

    @Test
    fun testExposedItemVariants() = doTest(true)

    @Test
    fun testHeaderTrailingComma() = doTest(true)
}