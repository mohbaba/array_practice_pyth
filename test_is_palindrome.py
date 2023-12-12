from palindrome_checker import *

def test_is_palindrome():
	
	assert is_palindrome('hello') == False
	assert is_palindrome('17a71') == True