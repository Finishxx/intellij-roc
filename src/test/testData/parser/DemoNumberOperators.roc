number_operators : I64, I64 -> _
number_operators = |a, b| {
	a_f64 = I64.to_f64(a)
	b_f64 = I64.to_f64(b)

	{
		# binary operators
		sum: a + b,
		diff: a - b,
		prod: a * b,
		div: a_f64 / b_f64,
		div_trunc: a // b,
		rem: a % b,
		eq: a == b,
		neq: a != b,
		lt: a < b,
		lteq: a <= b,
		gt: a > b,
		gteq: a >= b,

		# Not implemented yet:
		# default: None ?? 0,

		# unary operators
		neg: -a,
		# the last item can have a comma too
	}
}