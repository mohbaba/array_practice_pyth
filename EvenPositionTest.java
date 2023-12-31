import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class EvenPositionTest{


	@Test
	public void testThatEvenPositionCheckerExists(){
		EvenPositionChecker positionChecker = new EvenPositionChecker();

	}

	@Test
	public void testIntEvenPositionChecker(){
		EvenPositionChecker positionChecker = new EvenPositionChecker();
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		int[] expected = {2,4,6,8,10};
		assertArrayEquals(expected, positionChecker.intPositionChecker(array));

	}

	@Test
	public void testStringPositionChecker(){
		EvenPositionChecker positionChecker = new EvenPositionChecker();
		String[] array = {"Moh","Baba","Dee","Daddy"};
		String[] expected = {"Baba","Daddy"};
		assertArrayEquals(expected, positionChecker.stringPositionChecker(array));
		
	}

	@Test
	public void testObjectPositionChecker(){
		EvenPositionChecker positionChecker = new EvenPositionChecker();
		Object[] array = {"Moh",1,"Dee",20.9};
		Object[] expected = {1,20.9};
	 assertArrayEquals(expected,positionChecker.objectPositionChecker(array));

	}

}
