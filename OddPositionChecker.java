import java.util.Arrays;
public class OddPositionChecker{


	public static int[] intPositionChecker(int[] number){
		int x = number.length / 2;
		int[] newArray = new int[x];
		int count = 0;
		for(int index = 0; index < number.length - 1 ; index += 2 ){

			
				newArray[count] = number[index] ;

			
			count++;  
		}
		return newArray;
	}

	public static String[] stringPositionChecker(String[] word){
		int x = word.length / 2;
		String[] newArray = new String[x];
		int count = 0;
		for(int index = 0; index < word.length - 1 ; index += 2 ){

			
				newArray[count] = word[index] ;

			
			count++;  
		}
		return newArray;
	}

}