if_demo : U64 -> Str
if_demo = |num| {
	# every if must have an else branch!
	one_line_if = if num == 1 "One" else "NotOne"

	two_line_if = 
		if num == 2
			"Two"
		else
			"NotTwo"

	with_curlies = 
		if num == 5 {
			"Five"
		} else {
			"NotFive"
		}

	# else if
	if num == 3
		"Three"
	else if num == 4
		"Four"
	else
		one_line_if.concat(two_line_if).concat(with_curlies)
}