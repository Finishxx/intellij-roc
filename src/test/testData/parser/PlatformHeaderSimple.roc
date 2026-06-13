platform "foo"
    requires {
        main! : () => {}
    }
    exposes [Stdout, Stderr]
    packages {}
    provides { main_for_host!: "main" }