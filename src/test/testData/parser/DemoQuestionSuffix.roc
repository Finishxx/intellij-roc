question_postfix : List(Str) -> Try(I64, _)
question_postfix = |strings| {
	# `?` to immediately return the error if there is one
	first_str = strings.first()?
	first_num = I64.from_str(first_str)?

	Ok(first_num)
}