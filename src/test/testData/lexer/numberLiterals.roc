number_literals = {
	usage_based: 5, # defaults to Dec
	explicit_u8: 5.U8, # Note that most of the time you will want to specify the type in the type signature instead.
	explicit_i8: 5.I8,
	explicit_u16: 5.U16,
	explicit_i16: 5.I16,
	explicit_u32: 5.U32,
	explicit_i32: 5.I32,
	explicit_u64: 5.U64,
	explicit_i64: 5.I64,
	explicit_u128: 5.U128,
	explicit_i128: 5.I128,
	# Note: F32, F64, and Dec literals use type inference which doesn't work with Str.inspect so they are omitted here.
	hex: 0x5,
	octal: 0o5,
	binary: 0b0101,
}
