from even_position_print import *

def test_even_position_print():
	
	assert even_position_print(['hello',9,'true',False, True]) == ['hello','true',True]