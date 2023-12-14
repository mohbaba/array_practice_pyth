import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReverseListTest{

	@Test
	public void testToReverseAnIntArray(){

		ReverseList reverseList = new ReverseList();
	
		int[] array = {1,2,3,4,5};
		int[] answer = reverseList.reverseInt(array);
		int[] expected = {5,4,3,2,1};
		assertArrayEquals(expected , answer);



	}


	@Test
	public void testToReverseStringArray(){

		ReverseList reverseList = new ReverseList();

		String[] array = {"hello","Moh","Baba"};
		String[] answer = reverseList.reverseString(array);
		String[] expected = {"Baba","Moh","hello"};
		assertArrayEquals(expected, answer);

	}


}