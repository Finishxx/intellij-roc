multiline_str : U64 -> Str
multiline_str = |number|
	\\Line 1
	\\Line 2
	\\Line ${number.to_str()}
