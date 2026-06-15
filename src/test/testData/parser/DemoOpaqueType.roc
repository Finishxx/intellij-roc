# Opaque type
# Useful if you want to hide fields e.g. so users of the type can not access some implementation detail you did not want to expose. 
Secret :: {
	key : Str,
}.{
	new : Str -> Secret
	new = |k| { key: k }

	unlock : Secret, Str -> Str
	unlock = |secret, password| {
		if password == "open sesame" {
			"The secret key is: ${secret.key}"
		} else {
			"Wrong password!"
		}
	}
}