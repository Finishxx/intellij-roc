# break exits a for or while loop early
break_in_for_loop = |bool_list| {
	var $allTrue = True
	for b in bool_list {
		if b == False {
			$allTrue = False
			break
		} else {
			{}
		}
	}
	$allTrue
}