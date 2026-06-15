match_tag_union_advanced : Try({}, [StdoutErr(Str), Other]) -> Str
match_tag_union_advanced = |try|
# `Try(a, b)` is the tag union `[Ok(a), Err(b)]` under the hood.
	match try {
		Ok(_) =>
			"Success"

		Err(StdoutErr(err)) =>
			"StdoutErr: ${Str.inspect(err)}"

		Err(_) =>
			"Unknown error"
		}