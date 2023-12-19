public class ListOccur{

	public boolean intChecker(int[] array, int number){
		
		boolean isTrue = false;
		for(int index = 0; index < array.length - 1; index++){

			if(array[index] == number){
				isTrue =  true;
			}

		}

		return isTrue;
		
	}

	public boolean stringChecker(String[] array , String word){

		boolean isTrue = false;
		for(int index = 0; index < array.length -1 ; index++){
			if(array[index] == word){
				isTrue = true;
			}
		}

		return isTrue;
	}


	public boolean doubleChecker(double[] array , double number){

		boolean isTrue = false;
		for(int index = 0; index < array.length -1 ; index++){
			if(array[index] == number){
				isTrue = true;
			}
		}

		return isTrue;
	}


}


