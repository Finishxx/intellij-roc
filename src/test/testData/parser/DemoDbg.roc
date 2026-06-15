dbg_keyword = || {
	foo : Dec
	foo = 42.0

	dbg foo

	# This variation does not work yet:
	# bar = dbg 43

	foo
}