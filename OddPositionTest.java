import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;




public class OddPositionTest{
	@Test
	public void testThatOddPositionExists(){

		OddPositionChecker oddPositionChecker = new OddPositionChecker();
		


		}

	@Test
	public void testForIntPositionChecker(){

		OddPositionChecker oddPositionChecker = new OddPositionChecker();
		int[] array = {1,2,3,4,5,6,7,8,9,0};
		int[]expected = {1,3,5,7,9};
		int[] result = oddPositionChecker.intPositionChecker(array);
		assertArrayEquals(expected , result);


		}



	@Test
	public void testForStringPositionChecker(){

		OddPositionChecker oddPositionChecker = new OddPositionChecker();
		String[] array = {"Hello","Moh","Mighty","Dayo","BeeJay","Freedom Fighter"};
		String[]expected = {"Hello", "Mighty","BeeJay"};
		String[] result = oddPositionChecker.stringPositionChecker(array);
		assertArrayEquals(expected , result);


		}

}