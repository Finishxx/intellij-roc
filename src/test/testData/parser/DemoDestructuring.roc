destructuring = || {
	tup : (Str, Dec)
	tup = ("Roc", 1.0)
	(str, num) = tup

	rec : { x: Dec, y: Dec }
	rec = { x: 1.0, y: tup.1 } # tuple access with `.index`
	{ x, y } = rec

	(str, num, x, y)
}