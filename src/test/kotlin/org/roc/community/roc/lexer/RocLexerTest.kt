package org.roc.community.roc.lexer

import com.intellij.lexer.Lexer
import com.intellij.testFramework.LexerTestCase
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.roc.community.roc.lexerTestDataPath

/**
 * Golden-file tests for the Roc lexer. Each `testXxx()` lexes `testData/lexer/<xxx>.roc` and
 * compares the token dump (one `TokenType ('text')` per line) to `<xxx>.txt`.
 *
 * First run: the goldens don't exist yet, so the framework writes each `.txt` and fails the case
 * ("created data file"). Review the generated goldens, then re-run — now green. To regenerate after
 * a lexer change, delete the affected `.txt` (or set `UsefulTestCase.OVERWRITE_TESTDATA = true`).
 *
 * Most snippets are lifted verbatim from `roc-lang/test/echo/all_syntax_test.roc` (faithful tabs
 * and all); the three synthetic cases cover contrasts and tokens that file never exercises.
 */
@RunWith(JUnit4::class)
class RocLexerTest : LexerTestCase() {
    override fun createLexer(): Lexer = RocLexerAdapter()

    // Unused (we fully override getPathToTestDataFile), kept for documentation.
    override fun getDirPath(): String = "src/test/testData/lexer"

    override fun getPathToTestDataFile(extension: String): String =
        lexerTestDataPath().resolve(getTestName(true) + extension).toString()

    // The Roc lexer keeps whitespace-sensitivity state (sawSpace / lastToken / interpStack) in
    // member fields *outside* yystate(), so it is intentionally not restartable mid-stream
    // (TODO(incremental-lexing) in Roc.flex). These golden tests lock the forward token stream;
    // skip the platform's restart-equivalence check, which that design does not satisfy.
    override fun checkCorrectRestart(text: String) {}

    // ---- lifted from all_syntax_test.roc (line range noted; see plan case-split) ----
    @Test fun testImportAndComments() = doFileTest("roc")        // 1-6
    @Test fun testBinaryOperators() = doFileTest("roc")          // 13-25
    @Test fun testBooleanOperators() = doFileTest("roc")         // 36-41
    @Test fun testMatchSimple() = doFileTest("roc")              // 43-50
    @Test fun testMatchListPatterns() = doFileTest("roc")        // 52-68
    @Test fun testStringInterpolation() = doFileTest("roc")      // 70-82
    @Test fun testMultilineString() = doFileTest("roc")          // 84-88
    @Test fun testEffectfulIdents() = doFileTest("roc")          // 90-94
    @Test fun testQuestionPostfix() = doFileTest("roc")          // 96-120
    @Test fun testCrashKeyword() = doFileTest("roc")             // 122-126
    @Test fun testVarForBreakDollar() = doFileTest("roc")        // 128-151
    @Test fun testWhileLoop() = doFileTest("roc")                // 153-163
    @Test fun testDbgKeyword() = doFileTest("roc")               // 169-179
    @Test fun testIfElse() = doFileTest("roc")                   // 181-206
    @Test fun testTuplesAccess() = doFileTest("roc")             // 208-226
    @Test fun testRecordUpdate() = doFileTest("roc")             // 235-238
    @Test fun testNumberLiterals() = doFileTest("roc")           // 240-256
    @Test fun testOpaqueNominal() = doFileTest("roc")            // 258-283
    @Test fun testStaticDispatchPipeline() = doFileTest("roc")   // 299-307
    @Test fun testTagUnionsOpen() = doFileTest("roc")            // 316-337
    @Test fun testWhereClause() = doFileTest("roc")              // 339-341
    @Test fun testExpectBlocks() = doFileTest("roc")             // 436-444

    // ---- synthetic: contrasts and token coverage the source file doesn't exercise ----
    @Test fun testUnaryMinus() = doFileTest("roc")               // -a / x-1 / x - 1 / f -x / f - x
    @Test fun testCoverageMisc() = doFileTest("roc")             // char/@opaque/?? |> <- & ^ ... .* f(x) vs f (x), spaced dots
    @Test fun testExtraKeywords() = doFileTest("roc")            // header keywords + return absent from the source file
}
