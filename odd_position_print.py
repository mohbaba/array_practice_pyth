def odd_position_print(list):
	new_list = []
	for index in range(len(list)):
		
		if index % 2 == 1:
			new_list.append(list[index])
			
	return new_list	
 
print(odd_position_print([1,'hello',3,4,5,6,7]))