package org.roc.community.roc.parser

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

    // -- collection expressions (M4b, hosted by the destructuring decl; see Roc.bnf) --

    @Test
    fun testExprListEmpty() = doTest(true)

    @Test
    fun testExprList() = doTest(true)

    @Test
    fun testExprTuple() = doTest(true)

    @Test
    fun testExprParenSingle() = doTest(true)

    @Test
    fun testExprRecordEmpty() = doTest(true)

    @Test
    fun testExprRecord() = doTest(true)

    @Test
    fun testExprRecordShorthand() = doTest(true)

    @Test
    fun testExprRecordUpdate() = doTest(true)

    @Test
    fun testExprNested() = doTest(true)

    // -- suffixes & qualification (M4c; hosted by valueDecl; see Roc.bnf) --

    @Test
    fun testExprCall() = doTest(true)

    @Test
    fun testExprCallEmpty() = doTest(true)

    @Test
    fun testExprFieldAccess() = doTest(true)

    @Test
    fun testExprTupleAccess() = doTest(true)

    @Test
    fun testExprMethodCall() = doTest(true)

    @Test
    fun testExprTagApplied() = doTest(true)

    @Test
    fun testExprQualifiedTag() = doTest(true)

    @Test
    fun testExprQualifiedIdent() = doTest(true)

    @Test
    fun testExprQualifiedCall() = doTest(true)

    @Test
    fun testExprChained() = doTest(true)

    // -- operators: precedence, unary, postfix ? (M4d; hosted by valueDecl; see Roc.bnf) --

    @Test
    fun testExprAddMul() = doTest(true)

    @Test
    fun testExprMulDiv() = doTest(true)

    @Test
    fun testExprAddSub() = doTest(true)

    @Test
    fun testExprComparison() = doTest(true)

    @Test
    fun testExprAndOr() = doTest(true)

    @Test
    fun testExprOrAssoc() = doTest(true)

    @Test
    fun testExprCoalesce() = doTest(true)

    @Test
    fun testExprBinQuestion() = doTest(true)

    @Test
    fun testExprUnaryMinus() = doTest(true)

    @Test
    fun testExprUnaryBang() = doTest(true)

    @Test
    fun testExprUnaryField() = doTest(true)

    @Test
    fun testExprQuestionSuffix() = doTest(true)

    @Test
    fun testExprEllipsis() = doTest(true)

    @Test
    fun testExprLadder() = doTest(true)

    // -- control flow: if / match / closure / for (M4e; hosted by valueDecl; see Roc.bnf) --

    @Test
    fun testExprIf() = doTest(true)

    @Test
    fun testExprIfNoElse() = doTest(true)

    @Test
    fun testExprMatch() = doTest(true)

    @Test
    fun testExprMatchGuard() = doTest(true)

    @Test
    fun testExprMatchAlt() = doTest(true)

    @Test
    fun testExprLambda() = doTest(true)

    @Test
    fun testExprLambdaNoArgs() = doTest(true)

    @Test
    fun testExprFor() = doTest(true)

    @Test
    fun testExprIfMatch() = doTest(true)

    // -- blocks: { stmts } + record-vs-block disambiguation (M4e-blocks; see Roc.bnf) --

    @Test
    fun testExprBlock() = doTest(true)

    @Test
    fun testExprBlockMulti() = doTest(true)

    @Test
    fun testExprBlockAnno() = doTest(true)

    @Test
    fun testExprBlockBareIdent() = doTest(true)

    @Test
    fun testExprRecordAmbiguous() = doTest(true)

    @Test
    fun testExprNestedBlock() = doTest(true)

    @Test
    fun testExprIfBlock() = doTest(true)

    // -- keyword statements + dbg expr (M4f-stmts; see Roc.bnf) --

    @Test
    fun testStmtExpect() = doTest(true)

    @Test
    fun testStmtCrash() = doTest(true)

    @Test
    fun testStmtWhile() = doTest(true)

    @Test
    fun testStmtBreak() = doTest(true)

    @Test
    fun testExprDbg() = doTest(true)

    @Test
    fun testStmtReturnInBlock() = doTest(true)

    @Test
    fun testBlockKeywordStmts() = doTest(true)

    // -- wiring: var / bare-expr / interpolation (M4f-wiring; see Roc.bnf) --

    @Test
    fun testStmtVar() = doTest(true)

    @Test
    fun testStmtVarAnno() = doTest(true)

    @Test
    fun testTopLevelDbg() = doTest(true)

    @Test
    fun testTopLevelBareExpr() = doTest(true)

    @Test
    fun testStringInterp() = doTest(true)

    @Test
    fun testStringInterpExpr() = doTest(true)

    // -- comments: trivia-skipped by RocParserDefinition.getCommentTokens (no grammar rule) --

    @Test
    fun testCommentOnly() = doTest(true)

    @Test
    fun testCommentBetweenDecls() = doTest(true)

    @Test
    fun testCommentInBlock() = doTest(true)

    // -- remaining syntax: multiline strings + arrow-call (M5; see Roc.bnf) --

    @Test
    fun testExprMultiline() = doTest(true)

    @Test
    fun testExprMultilineStitch() = doTest(true)

    @Test
    fun testExprMultilineInterp() = doTest(true)

    @Test
    fun testExprMultilineTriple() = doTest(true)

    @Test
    fun testExprArrowCall() = doTest(true)

    @Test
    fun testExprArrowChain() = doTest(true)

    @Test
    fun testExprArrowTag() = doTest(true)

    @Test
    fun testExprArrowParen() = doTest(true)

    // -- platform header (the one previously-deferred header; see Roc.bnf) --

    @Test
    fun testPlatformHeaderSimple() = doTest(true)

    @Test
    fun testPlatformHeaderForClause() = doTest(true)

    @Test
    fun testPlatformHeaderLegacyRequires() = doTest(true)

    @Test
    fun testPlatformHeaderTargets() = doTest(true)

    // -- demo-file coverage: highlighterDemoText.roc split into chunks (M6; see Roc.bnf) --

    @Test
    fun testDemoImport() = doTest(true)

    @Test
    fun testDemoNumberOperators() = doTest(true)

    @Test
    fun testDemoBooleanOperators() = doTest(true)

    @Test
    fun testDemoSimpleMatch() = doTest(true)

    @Test
    fun testDemoListPatterns() = doTest(true)

    @Test
    fun testDemoTagUnionMatch() = doTest(true)

    @Test
    fun testDemoMultilineStr() = doTest(true)

    @Test
    fun testDemoEffectful() = doTest(true)

    @Test
    fun testDemoQuestionSuffix() = doTest(true)

    @Test
    fun testDemoQuestionErrMap() = doTest(true)

    @Test
    fun testDemoCrash() = doTest(true)

    @Test
    fun testDemoForLoop() = doTest(true)

    @Test
    fun testDemoBreak() = doTest(true)

    @Test
    fun testDemoWhileLoop() = doTest(true)

    @Test
    fun testDemoDbg() = doTest(true)

    @Test
    fun testDemoIf() = doTest(true)

    @Test
    fun testDemoTuple() = doTest(true)

    @Test
    fun testDemoTypeVar() = doTest(true)

    @Test
    fun testDemoDestructuring() = doTest(true)

    @Test
    fun testDemoRecordUpdate() = doTest(true)

    @Test
    fun testDemoNumberLiterals() = doTest(true)

    @Test
    fun testDemoOpaqueType() = doTest(true)

    @Test
    fun testDemoNominalType() = doTest(true)

    @Test
    fun testDemoEarlyReturn() = doTest(true)

    @Test
    fun testDemoStaticDispatch() = doTest(true)

    @Test
    fun testDemoMultiPayloadTag() = doTest(true)

    @Test
    fun testDemoOpenTagUnion() = doTest(true)

    @Test
    fun testDemoTypeAlias() = doTest(true)

    @Test
    fun testDemoWhere() = doTest(true)

    @Test
    fun testDemoMain() = doTest(true)

    @Test
    fun testDemoTopLevelExpect() = doTest(true)

    // -- error recovery: comma/bracket lists (pin + recoverWhile; see Roc.bnf) --
    // Each golden should keep the container node (LIST_EXPR / CALL_EXPR / exposes list) with
    // a contained PsiErrorElement, instead of collapsing the rest of the file into one error.

    @Test
    fun testRecoverUnclosedList() = doTest(true)

    @Test
    fun testRecoverListBadElement() = doTest(true)

    @Test
    fun testRecoverUnclosedCall() = doTest(true)

    @Test
    fun testRecoverExposesBadItem() = doTest(true)

    @Test
    fun testRecoverTuplePatternBad() = doTest(true)

    @Test
    fun testRecoverRecordPatternBad() = doTest(true)

    @Test
    fun testRecoverTypeArgBad() = doTest(true)

    @Test
    fun testRecoverRecordTypeBad() = doTest(true)

    @Test
    fun testRecoverTagUnionBad() = doTest(true)
}