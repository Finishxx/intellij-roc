# Complex pipeline: chaining static dispatch methods with a lambda
format_names : List(Str) -> Str
format_names = |names|
	names
		.map(|name| name.trim())
		.join_with(", ")
		->(|joined| {
			if joined.is_empty() "No names provided" else "Names: ${joined}"
		})
