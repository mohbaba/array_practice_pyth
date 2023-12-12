from new_concatenator import *

def test_concatenator():
	assert concatenator(['a','b','c'],[1,2,3,4,5,6,7]) == ['a','b','c',1,2,3,4,5,6,7]