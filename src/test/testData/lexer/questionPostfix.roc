question_postfix : List(Str) -> Try(I64, _)
question_postfix = |strings| {
	# `?` to immediately return the error if there is one
	first_str = strings.first()?
	first_num = I64.from_str(first_str)?

	Ok(first_num)
}

# `?` with a right-hand side maps the err payload before early returning.
# The rhs can be a bare tag (applied as a constructor) or any function-like
# expression (e.g. a lambda); the err payload is passed as its argument.
question_with_err_map : List(Str) -> Try(Str, _)
question_with_err_map = |strings| {
	# `? NoFirstError` wraps the err as `NoFirstError(err)` before returning
	first_str = strings.first() ? NoFirstError
	Ok(first_str)
}

question_with_err_lambda : List(Str) -> Try(Str, _)
question_with_err_lambda = |strings| {
	# `? |e| NoFirstError(e)` is the explicit lambda form
	first_str = strings.first() ? |e| NoFirstError(e)
	Ok(first_str)
}
