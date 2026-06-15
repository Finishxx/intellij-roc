early_return = |arg| {
	first = 
		if !arg {
			return 99
		} else {
			"continue"
		}

	# Do some other stuff
	Str.count_utf8_bytes(first)
}