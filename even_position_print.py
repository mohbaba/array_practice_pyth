def even_position_print(list):
	new_list = []
	for index in range(len(list)):
		if index % 2 == 0:
			new_list.append(list[index])
	return new_list
print(even_position_print([1,2,3,4,5,6,7]))