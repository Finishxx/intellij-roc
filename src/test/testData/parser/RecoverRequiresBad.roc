platform "foo"
    requires { main! : Str, %, other : U8 }
    exposes [Stdout]
    packages {}
    provides { main_for_host!: "main" }