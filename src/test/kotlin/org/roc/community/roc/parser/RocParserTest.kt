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

    // -- types (temporarily parsed at the root; see Roc.bnf) --

    @Test
    fun testTypeVar() = doTest(true)

    @Test
    fun testTypeRecord() = doTest(true)

    @Test
    fun testTypeRecordExt() = doTest(true)

    @Test
    fun testTypeFunction() = doTest(true)

    @Test
    fun testTypeEffectfulFn() = doTest(true)

    @Test
    fun testTypeApply() = doTest(true)

    @Test
    fun testTypeQualified() = doTest(true)

    @Test
    fun testTypeTagUnion() = doTest(true)

    @Test
    fun testTypeTuple() = doTest(true)

    @Test
    fun testTypeInferred() = doTest(true)

    // -- imports (M2) --

    @Test
    fun testImportSimple() = doTest(true)

    @Test
    fun testImportQualified() = doTest(true)

    @Test
    fun testImportAlias() = doTest(true)

    @Test
    fun testImportExposing() = doTest(true)

    @Test
    fun testImportFile() = doTest(true)
}