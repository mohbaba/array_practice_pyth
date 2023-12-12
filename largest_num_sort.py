def largest_num_sort(number_list):
	
	largest = 0
	for num in number_list:
		if num > largest:
			largest = num
	return largest

print(largest_num_sort([9,4,20,4,2,8,50,-1,0,8]))	
		
	