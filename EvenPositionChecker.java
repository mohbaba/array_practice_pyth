public class EvenPositionChecker{


	public static int[] intPositionChecker(int[] array){
		
		int count = 0;
		int[] newArray = new int[array.length / 2];
		for(int index = 1; index < array.length ; index += 2){
		
			newArray[count] = array[index];
			count++;


		}
		return newArray;
	}


	public static String[] stringPositionChecker(String[] array){
		
		int count = 0;
		String[] newArray = new String[array.length / 2];
		for(int index = 1; index < array.length ; index += 2){
		
			newArray[count] = array[index];
			count++;


		}
		return newArray;
	}

	public static Object[] objectPositionChecker(Object[] array){
	
		int count = 0;
		Object[] newArray = new Object[array.length / 2];
		for(int index = 1; index < array.length ; index += 2){
		
			newArray[count] = array[index];
			count++;


		}
		return newArray;

	}

}