import java.util.Arrays; 
public class ReverseList{

	public int[] reverseInt(int[] number){
		
		int count = 0;
		int arrayLength = number.length - 1;
		int[] newArray = new int[number.length];

		for(int index = number.length-1; index >= 0; index--){
			newArray[count] = number[index];
			count++;
		}
		
		return newArray;
	}


	public String[] reverseString(String[] words){
		
		int count = 0;
		int arrayLength = words.length - 1;
		String[] newArray = new String[words.length];

		for(int index = arrayLength; index >= 0; index--){
			newArray[count] = words[index];
			count++;
		}
		
		return newArray;
	}
}









