import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListTotalTest{


	@Test
	public void testThatListTotalExists(){

		ListTotal listTotal = new ListTotal();


	}

	@Test
	public void testThatWhileLoopCanSumAllElementsInList(){

		ListTotal listTotal = new ListTotal();
		double[] testArray = {1,2,3,4,5,6};
		double expected = 21;
		assertEquals(expected,listTotal.whileLoopSum(testArray));



	}

	@Test
	public void testThatDoWhileCanSumAllElementsInList(){
	
		ListTotal listTotal = new ListTotal();
		double[] testArray = {1,2,3,4,5,6};
		double expected = 21;
		assertEquals(expected,listTotal.doWhileLoopSum(testArray));

	}

	@Test
	public void testThatForLoopCanSumAllElementsInList(){
	
		ListTotal listTotal = new ListTotal();
		double[] testArray = {1,2,3,4,5,6};
		double expected = 21;
		assertEquals(expected,listTotal.forLoopSum(testArray));


	}
}