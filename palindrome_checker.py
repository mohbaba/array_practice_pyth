def is_palindrome(word):
	
	new_list = []
	for alphabet in str(word):
		new_list.append(alphabet)
	if new_list == new_list[::-1]:
		return True
	else:
		return False
print(is_palindrome(898))