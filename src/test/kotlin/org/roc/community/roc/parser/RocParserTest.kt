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

    // -- types (now exercised via value annotations; see Roc.bnf) --

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

    // -- type-declaration statements (M3.5; see Roc.bnf) --

    @Test
    fun testTypeAlias() = doTest(true)

    @Test
    fun testTypeNominal() = doTest(true)

    @Test
    fun testTypeOpaque() = doTest(true)

    @Test
    fun testAnnotationWhere() = doTest(true)

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

    // -- patterns (M3, hosted by a TEMP destructuring decl; see Roc.bnf) --

    @Test
    fun testPatternIdent() = doTest(true)

    @Test
    fun testPatternVar() = doTest(true)

    @Test
    fun testPatternUnderscore() = doTest(true)

    @Test
    fun testPatternTag() = doTest(true)

    @Test
    fun testPatternTuple() = doTest(true)

    @Test
    fun testPatternRecord() = doTest(true)

    @Test
    fun testPatternRecordRest() = doTest(true)

    @Test
    fun testPatternList() = doTest(true)

    @Test
    fun testPatternAs() = doTest(true)

    @Test
    fun testPatternAlternatives() = doTest(true)

    // -- expression atoms (M4a, hosted by the destructuring decl; see Roc.bnf) --

    @Test
    fun testExprInt() = doTest(true)

    @Test
    fun testExprFloat() = doTest(true)

    @Test
    fun testExprString() = doTest(true)

    @Test
    fun testExprChar() = doTest(true)

    @Test
    fun testExprIdent() = doTest(true)

    @Test
    fun testExprTag() = doTest(true)

    // -- platform header (the one previously-deferred header; see Roc.bnf) --

    @Test
    fun testPlatformHeaderSimple() = doTest(true)

    @Test
    fun testPlatformHeaderForClause() = doTest(true)

    @Test
    fun testPlatformHeaderLegacyRequires() = doTest(true)

    @Test
    fun testPlatformHeaderTargets() = doTest(true)
}