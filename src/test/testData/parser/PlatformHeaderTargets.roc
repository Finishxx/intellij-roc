platform "foo"
    requires { main! : () => {} }
    exposes [Stdout]
    packages { pf: "../pf/main.roc" }
    provides { main_for_host!: "main" }
    targets: {
        files: "targets/",
        exe: {
            x64mac: ["libhost.a", app],
            wasm32: ["host.wasm", app],
        }
    }