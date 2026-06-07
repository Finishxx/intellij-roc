tuple_demo = 
# tuples can contain multiple types
	("Roc", 1)

# Here we use a type variable `a` to indicate this function works for a list of any type.
type_var : List(a) -> List(a)
type_var = |lst| lst

destructuring = || {
	tup : (Str, Dec)
	tup = ("Roc", 1.0)
	(str, num) = tup

	rec : { x: Dec, y: Dec }
	rec = { x: 1.0, y: tup.1 } # tuple access with `.index`
	{ x, y } = rec

	(str, num, x, y)
}
