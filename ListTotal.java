public class ListTotal{

	public static double whileLoopSum(double[] numArray){
		
		int count = 0;
		double total = 0;
		while(count < numArray.length){
			total += numArray[count];
			count++;
		}
		return total;
	}

	public static double doWhileLoopSum(double[] numArray){

		int count = 0;
		double total = 0;
		do{
			total += numArray[count];
			count++;
		}
		while(count < numArray.length);
		return total;
	}

	public static double forLoopSum(double[] numArray){

		double total = 0;
		for(int index = 0 ; index < numArray.length ; index++){
	
			total += numArray[index];		
		}
		return total;
	}

}