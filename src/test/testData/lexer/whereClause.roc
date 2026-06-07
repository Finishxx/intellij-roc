# If you want to define a function that works for any type that has a specific method, you can use `where`:
stringify : a -> Str where [a.to_str : a -> Str]
stringify = |value| value.to_str()
