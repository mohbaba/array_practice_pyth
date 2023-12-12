from running_total import *

def test_running_total():
	
	assert running_total([1,2,3,4,5]) == [1,3,6,10,15]