# end name with `!` for effectful functions
# `=>` shows effectfulness in the type signature
effect_demo! : Str => {}
effect_demo! = |msg|
	echo!(msg)
