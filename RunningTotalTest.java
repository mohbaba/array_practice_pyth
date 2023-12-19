import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RunningTotalTest{



	@Test
	public void testThatRunningTotalExists(){

		RunningTotal runningTotal = new RunningTotal();

	}

	@Test
	public void testRunningTotal(){
		RunningTotal runningTotal = new RunningTotal();
		int[] array = {1,2,3,4,5};
		int[] expected = {1,3,6,10,15};
		assertArrayEquals(expected,runningTotal.cumTotal(array));
	
	
	}

	@Test
	public void testDoubleRunningTotal(){
		RunningTotal runningTotal = new RunningTotal();
		double[] array = {1,2,3,4,5};
		double[] expected = {1,3,6,10,15};
		assertArrayEquals(expected,runningTotal.cumDoubleTotal(array));
	
	
	}



}