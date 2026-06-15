match_list_patterns : List(U64) -> U64
match_list_patterns = |lst| {
	match lst {
		[] => 0
		[x] => x
		[1, 2, 3] => 6
		[1, 2, ..] => 66
		[2, .., 1] => 88
		[1, .. as tail] => 77 + tail.len()
		[_head, 5] => 55
		[99, x] if x < 4 => 99 + x

		# Note: avoid overusing `_` in a match branch, in general you should
		# try to match all cases explicitly.
		_ => 100
	}
}