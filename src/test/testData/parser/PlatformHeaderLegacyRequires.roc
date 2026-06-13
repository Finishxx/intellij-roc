platform "foo"
    requires {} { main! : () => Str }
    exposes [Stdout]
    packages {}
    provides { main_for_host!: "main" }