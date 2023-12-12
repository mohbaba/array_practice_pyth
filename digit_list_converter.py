def digit_list_converter(number):
	new_list = []
	for num in str(number):
		new_list.append(int(num))
	return new_list
	

digit_list_converter(12345)