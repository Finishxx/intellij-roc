# Tags can have multiple payloads
multi_payload_tag : [Foo(I64, Str), Bar] -> Str
multi_payload_tag = |tag| match tag {
	Foo(num, name) => "Foo with ${num.to_str()} and ${name}"
	Bar => "Just Bar"
}