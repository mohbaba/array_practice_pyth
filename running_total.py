def running_total(list):
	new_list = []
	total = 0
	for num in list:
		total += num
		new_list.append(total)
	return new_list

print(running_total([1,2,3,4]))