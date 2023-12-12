def element_checker(list,element):
	for elements in list:
		if element in list:
			return True
		else:
			return False

print(element_checker([1,2,3,4,5,6], 0))