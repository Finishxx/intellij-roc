record_update_2 : { name : Str, age : I64 } -> { name : Str, age : I64 }
record_update_2 = |person| {
	{ ..person, age: 31 }
}