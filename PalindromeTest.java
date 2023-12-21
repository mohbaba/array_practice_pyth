import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeTest{


	@Test
	public void testThatPalindromeClassExists(){

		Palindrome palindrome = new Palindrome();

	
	}

	@Test
	public void testPalindromeMethod(){
	
		Palindrome palindrome = new Palindrome();
		String word = "Hannah";
		boolean expected = true;
		assertEquals(expected,palindrome.palindromeChecker(word));
		
	}


}