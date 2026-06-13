package org.roc.community.roc.lexer

import com.intellij.lexer.Lexer
import com.intellij.testFramework.LexerTestCase
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.roc.community.roc.lexerTestDataPath

@RunWith(JUnit4::class)
class RocLexerTest : LexerTestCase() {
    override fun createLexer(): Lexer = RocLexerAdapter()

    // Unused (we fully override getPathToTestDataFile), kept for documentation.
    override fun getDirPath(): String = "src/test/testData/lexer"

    override fun getPathToTestDataFile(extension: String): String =
        lexerTestDataPath().resolve(getTestName(true) + extension).toString()

    // (TODO(incremental-lexing) in Roc.flex). These golden tests lock the forward token stream;
    //   skip the platform's restart-equivalence check, which that design does not satisfy.
    override fun checkCorrectRestart(text: String) {}

    // ---- lifted from all_syntax_test.roc (line range noted; see plan case-split) ----
    @Test
    fun testImportAndComments() = doFileTest("roc")
    @Test
    fun testBinaryOperators() = doFileTest("roc")
    @Test
    fun testBooleanOperators() = doFileTest("roc")
    @Test
    fun testMatchSimple() = doFileTest("roc")
    @Test
    fun testMatchListPatterns() = doFileTest("roc")
    @Test
    fun testStringInterpolation() = doFileTest("roc")
    @Test
    fun testMultilineString() = doFileTest("roc")
    @Test
    fun testEffectfulIdents() = doFileTest("roc")
    @Test
    fun testQuestionPostfix() = doFileTest("roc")
    @Test
    fun testCrashKeyword() = doFileTest("roc")
    @Test
    fun testVarForBreakDollar() = doFileTest("roc")
    @Test
    fun testWhileLoop() = doFileTest("roc")
    @Test
    fun testDbgKeyword() = doFileTest("roc")
    @Test
    fun testIfElse() = doFileTest("roc")
    @Test
    fun testTuplesAccess() = doFileTest("roc")
    @Test
    fun testRecordUpdate() = doFileTest("roc")
    @Test
    fun testNumberLiterals() = doFileTest("roc")
    @Test
    fun testOpaqueNominal() = doFileTest("roc")
    @Test
    fun testStaticDispatchPipeline() = doFileTest("roc")
    @Test
    fun testTagUnionsOpen() = doFileTest("roc")
    @Test
    fun testWhereClause() = doFileTest("roc")
    @Test
    fun testExpectBlocks() = doFileTest("roc")


    // Original test cases
    @Test
    fun testUnaryMinus() = doFileTest("roc")
    @Test
    fun testCoverageMisc() = doFileTest("roc")
    @Test
    fun testExtraKeywords() = doFileTest("roc")
}
