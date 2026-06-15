# Mark a tag union as open using `..`.
# This function accepts any tag union containing at least Red and Green.
color_to_str : [Red, Green, ..] -> Str
color_to_str = |color| match color {
	Red => "red"
	Green => "green"
	_ => "other color"
}