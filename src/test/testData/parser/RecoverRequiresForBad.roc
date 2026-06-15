platform "foo"
    requires {
        [Model : model, %, Other : other] for main : model -> Str
    }
    exposes [Simple]
    packages {}
    provides { init_for_host: "init" }