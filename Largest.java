import java.util.Scanner;
public class Largest{

	public static void main(String[]args){

		Scanner scanner = new Scanner(System.in);
		int counter = 0;
		double largest = 0;
		

		while(counter < 10){
			
			System.out.print("Enter score: ");
			double userInput = scanner.nextDouble();
			counter++;

			if(userInput > largest){
				largest = userInput;
			}

			
		}
		
		System.out.printf("The largest number is %.2f",largest);


}




}