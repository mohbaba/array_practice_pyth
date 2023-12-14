import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class LargestTest{


	@Test
	// method is always void
	public void testIfThisCanGetLargestInt(){
		Largest large = new Largest();
		int[] array = {20,10,30,70,80,40};
		int answer = large.largestNumber(array);
		assertEquals(80,answer);


		int[] anotherArray = {9999,4039,8398,839,2000,8756};
		int result = large.largestNumber(anotherArray);
		assertEquals(9999,result);


	}	

}