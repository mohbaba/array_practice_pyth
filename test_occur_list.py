from occur_list import *

def test_element_checker():

	assert element_checker([True,0,8,'hello','9'],'9') == True