# for loops can be easier to think about than List.fold (previously `List.walk`)
for_loop = |num_list| {
	var $sum = 0

	for num in num_list {
		$sum = $sum + num
	}

	$sum
}