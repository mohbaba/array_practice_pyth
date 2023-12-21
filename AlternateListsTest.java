import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AlternateListsTest{



	@Test
	public void testThatAlternateListExists(){

		AlternateList alternateList = new AlternateList();

	}

	@Test
	public void testAlternateList(){

		AlternateList alternateList = new AlternateList();
		Object[] array1 = {"a","b","c"};
		Object[] array2 = {1,2,3};
		Object[] expected = {"a",1,"b",2,"c",3};
		assertArrayEquals(expected , alternateList.alternator(array1,array2));

	}
}