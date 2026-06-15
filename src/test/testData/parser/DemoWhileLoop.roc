while_loop = |limit| {
	var $count = 0
	var $sum = 0

	while $count < limit {
		$sum = $sum + $count
		$count = $count + 1
	}

	$sum
}