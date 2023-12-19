import java.util.Scanner;

public class AddThreeNum{


	public static void main(String[]args){


		Scanner scanner = new Scanner(System.in);
		double total = 0;
		int count = 0;
		double largest = 0;

		while(count < 10){
			System.out.print("Enter number: ");
			double input = scanner.nextDouble();
			if(input > largest){largest = input;}

			total += input;
			count++;


		}

		//System.out.printf("The summ of the three numbers is %f%n", total);
		System.out.printf("The largest of the three numbers is %.0f%n", largest);
	}






}