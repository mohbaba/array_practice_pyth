import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ListConcatenatorTest{


	@Test
	public void testThatListConcatenatorExists(){

		ListConcatenator listConcatenator = new ListConcatenator();
		

	}


	@Test
	public void testListConcatenator(){
	
		ListConcatenator listConcatenator = new ListConcatenator();
		Object[] testArray1  = {"a","b","c"};
		Object[] testArray2  = {1,2,3};
		Object[] expected = {"a","b","c",1,2,3};
		assertArrayEquals(expected , listConcatenator.concatenate(testArray1,testArray2));

	}
}