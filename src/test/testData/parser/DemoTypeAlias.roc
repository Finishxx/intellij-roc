# TODO: Closed tag unions with `..[]]` - syntax not implemented yet
# str_to_color : Str -> [Red, Green, Blue, Other, ..[]]

# Type alias for an extensible tag union. You can use a type var (`others`) like so:
Letters(others) : [A, B, ..others]

# Use the type alias in a function signature. Pass `[C]` as `others`.
letter_to_str : Letters([C]) -> Str
letter_to_str = |letter| match letter {
	A => "A"
	B => "B"
	_ => "other letter"
}