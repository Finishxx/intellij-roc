# Top level expects only run when using `roc test file.roc`
expect Bool.True != Bool.False

## Multi-line expect that confirms basic math works.
expect {
	x = 4
	y = 5
	x + y == 9
}
