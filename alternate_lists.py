def alternate_lists(list_1,list_2):
	new_list = []
	for element1 in range(len(list_1)):
		for element2 in range(len(list_2)-1):
			new_list.append(list_1[element1])
			new_list.append(list_2[element2])
			
		return new_list

print(alternate_lists(['a','b','c','d'],[1,2,3,4]))