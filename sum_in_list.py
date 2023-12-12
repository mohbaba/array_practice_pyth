def total_list(number_list):
	total = 0
	for num in number_list:
		total += num
	return total
#print(total_list([1,2,3,4,5]))


def total_list_while(number_list):

	total = 0
	list_length = len(number_list)
	counter = 0
	
	while counter < list_length:
		total += number_list[counter]
		counter += 1
	return total 
print(total_list_while([1,2,3,4,5]))
