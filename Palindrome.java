import java.util.Arrays;
public class Palindrome{


	public static boolean palindromeChecker(String word){

		boolean check = false;
		int count = 0;
		char[] newArray = new char[word.length()];
		char[] checkArray = new char[newArray.length];
		for(int index = 0 ; index < word.length() ; index++){
			newArray[index] = word.toLowerCase().charAt(index);

		}
	
		for(int index = newArray.length -1 ; index >= 0 ; index--){
			checkArray[count] = newArray[index];
			count++;
		}
		if(Arrays.equals(checkArray,newArray)){
			check = true;
		}
		return check;
	}

	public static void main(String...args){

		System.out.print(palindromeChecker("Hannah"));
	}

}