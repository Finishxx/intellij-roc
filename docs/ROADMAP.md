# Roadmap

The guiding boundary: the **plugin** owns everything syntactic and structural - fast,
offline, PSI-based, works on half-typed code. The **LSP** (Roc's own Zig compiler ships
one at `roc-lang/src/lsp/`) owns everything semantic - types, cross-module info, the
famous error prose. Several features overlap; the lists below pick an owner for each so
we never fund both sides of the same thing.

## Foundation

- **Parser recovery** (`pin` + `recoverWhile` in `Roc.bnf`). Sequence this first: every
  PSI feature below degrades on incomplete/half-typed code without it, and we edit live
  code constantly.
- Finish the lexer syntax highlighter. ✅

## Editor features - pure PSI, the plugin's job

Build directly on the generated PSI, LSP won't provide these.

- **Commenter** (`lang.commenter`) - Ctrl+/ toggles `#` comments. Comment tokens already
  registered in `RocParserDefinition`.
- **Brace matcher** (`lang.braceMatcher`) - match/auto-close `{}` `[]` `()`, lambda `|…|`,
  string interpolation `${…}`.
- **Code folding** (`lang.foldingBuilder`) - `{…}` blocks, record/tag-union literals,
  associated blocks, multiline strings, doc comments, consecutive import groups.
- **Structure view** (`lang.psiStructureViewFactory`) - outline of top-level type/value
  decls and associated-block members.
- **Breadcrumbs** (`breadcrumbsInfoProvider`) and **extend-selection**
  (`extendWordSelectionHandler`) - small nice-to-haves.
- **Spellchecking** (`spellchecker.support`) - idents/comments/strings. Needs
  `getStringLiteralElements` populated first (currently `TokenSet.EMPTY`).

## Navigation & refactoring - local resolve model

One scope-based name-resolution model (NOT type inference) unlocks several features at
once.

- **References + go-to-declaration** within a file (`PsiReference` + `PsiNamedElement`) -
  resolve a `LOWER_IDENT` use to its binding in scope.
- **Find usages** (`lang.findUsagesProvider`) and **highlight occurrences** - fall out of
  references.
- **Rename refactoring** - falls out of `PsiNamedElement`.
- **Keyword completion** (`completion.contributor`) - cheap and independent; identifier
  completion piggybacks on the scope model.

## Inspections - pure-PSI, fast, fire as-you-type

Structural checks that need no type info (the deferred-diagnostics list). Annotators, not
LSP - they're instant and faithful to the grammar.

- import must be top-level only
- `var` only in a body, single ident
- RHS of a call must be callable
- chained comparison is non-associative
- match-branch `->` tolerance
- alias may not carry an associated block
- associated-block last item may not be a bare expr

## LSP - leave to the compiler, don't double-build

Roc's Zig compiler already ships a full LSP (`publishDiagnostics`, hover, definition,
completion, semantic tokens, formatting) with a dedicated `language_server` report
renderer. Bridge it; don't reimplement the semantics in Kotlin.

- Error diagnostics (the famous Roc messages)
- Hover docs
- Go-to definition (cross-module)
- Formatting (Roc has `roc format` - skip an in-plugin `FormattingModelBuilder`)
- Type-aware completion

Open decision - **target IDE drives the integration**: IntelliJ's built-in platform LSP
API (`com.intellij.platform.lsp`) is Ultimate/paid-only. For Community support, bridge via
the LSP4IJ plugin instead. Note `plugin.xml` currently has
`<depends>com.intellij.modules.lsp</depends>`, which already restricts the plugin to
LSP-capable (paid) IDEs - revisit before shipping to Community.