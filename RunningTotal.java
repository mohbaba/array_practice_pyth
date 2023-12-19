public class RunningTotal{


	public static int[] cumTotal(int [] numArray){
		
		int total = 0;
		int[] newArray = new int[numArray.length];
		for(int index = 0 ; index < numArray.length ; index++){

			total += numArray[index];
			newArray[index] = total;
		}

		return newArray;
	}


	public static double[] cumDoubleTotal(double [] numArray){
		
		int total = 0;
		double[] newArray = new double[numArray.length];
		for(int index = 0 ; index < numArray.length ; index++){

			total += numArray[index];
			newArray[index] = total;
		}

		return newArray;
	}

}