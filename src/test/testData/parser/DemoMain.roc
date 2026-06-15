main! = |_args| {
	echo!("Hello, world!")
	echo!("Hello, world! (using alias)")

	echo!(Str.inspect(number_operators(10, 5)))
	print!(boolean_operators(Bool.True, Bool.False))

	# pizza operator (|>) is gone, we now have static dispatch instead.
	# It allows you to call methods that are defined on the type (like `Animal.is_eq` above).
	print!("One".concat(" Two"))

	# If you want a very similar style for a function that is not defined on the type but is in scope, you can use `->`:
	print!("Three"->my_concat(" Four"))

	echo!(simple_match(Red))
	print!(match_list_patterns([1, 10]))
	echo!(match_tag_union_advanced(Ok({})))

	echo!(multiline_str(3))
	echo!("Unicode escape sequence: \u(00A0)")

	effect_demo!("This is an effectful function!")

	print!(question_postfix(["1", "not a number", "100"]))
	print!(question_with_err_map([]))
	print!(question_with_err_lambda([]))

	sum = for_loop([1, 2, 3, 4, 5])
	print!(sum)

	expect sum == 15

	all_true = break_in_for_loop([True, True, False, True, True])
	print!(all_true)

	while_sum = while_loop(5)
	print!(while_sum)

	print!(dbg_keyword())

	echo!(if_demo(2))

	print!(tuple_demo)

	print!(type_var(["a", "b"]))

	print!(destructuring())

	# print!(record_update)

	print!({ x: 10, y: 20 }.x)

	print!(record_update_2({ name: "Alice", age: 30 }))

	print!(number_literals)

	secret = Secret.new("my_secret_key")
	# This print will not expose internal data.
	print!(secret)
	print!(secret.unlock("open sesame"))

	dog : Animal
	dog = Dog("Fido")
	cat : Animal
	cat = Cat("Whiskers")
	print!(dog == cat)

	print!(early_return(Bool.False))

	print!(stringify(12345))

	# Tags with multiple payloads
	print!(multi_payload_tag(Foo(42, "hello")))

	# Open tag unions with `..`
	# This function accepts [Red, Green, ..] so we can pass Blue too
	print!(color_to_str(Blue))

	# Complex pipeline with arrow lambda
	print!(format_names(["  Alice ", "Bob  ", " Charlie"]))

	# Type alias for extensible tag union
	print!(letter_to_str(A))
	print!(letter_to_str(C)) # C is not in [A, B] but we passed it in the signature of letter_to_str

	print!(readme.contains("Roc"))

	# Commented out so CI tests can pass
	# crash "Avoid using crash in production software!"

	Ok({})
}