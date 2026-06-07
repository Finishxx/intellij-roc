# for loops can be easier to think about than List.fold (previously `List.walk`)
for_loop = |num_list| {
	var $sum = 0

	for num in num_list {
		$sum = $sum + num
	}

	$sum
}

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
