platform "foo"
    requires {
        [Model : model] for main : model -> Str
    }
    exposes [Simple]
    packages {}
    provides { init_for_host: "init" }