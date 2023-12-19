import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class ListOccurTest{

	@Test
	public void testIfAnIntegerElementOccursInList(){

		ListOccur listOccur = new ListOccur();
		int[] array = {5,4,3,2,1};
		int check = 5;
		boolean isTrue = listOccur.intChecker(array , check);
		assertEquals(true , isTrue);
		



	}

	@Test
	public void testIfStringElementOccursInList(){

		ListOccur listOccur = new ListOccur();
		String[] array = {"Moh","Baba","Hello","Far"};
		String check = "Dee";
		boolean isFalse = listOccur.stringChecker(array,check);
		assertEquals(false, isFalse);




	}


	@Test
	public void testIfDoubleOrFloatElementOccursInList(){

		ListOccur listOccur = new ListOccur();
		double[] array = {6.7,6473.0,9.7738,7.0};
		double check = 72;
		boolean isFalse = listOccur.doubleChecker(array,check);
		assertEquals(false, isFalse);




	}








}