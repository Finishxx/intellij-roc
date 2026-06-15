simple_match : [Red, Green, Blue, BabyBlue] -> Str
simple_match = |color| {
	match color {
		Red => "The color is red."
		Green => "The color is green."
		Blue | BabyBlue => "The color is blue."
	}
}