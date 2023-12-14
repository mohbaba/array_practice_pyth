import java.util.Scanner;
public class Largest{

	public int largestNumber(int[]numbers){

		int largest =  0;
		
		for(int index = 0 ; index <= numbers.length -1; index++){
			 if(numbers[i] > largest){
				largest = numbers[i];
			}
		}
		return largest;

	}




}