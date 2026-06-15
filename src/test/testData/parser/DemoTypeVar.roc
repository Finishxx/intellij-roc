# Here we use a type variable `a` to indicate this function works for a list of any type.
type_var : List(a) -> List(a)
type_var = |lst| lst