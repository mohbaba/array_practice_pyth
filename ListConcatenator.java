public class ListConcatenator{

	public static Object[] concatenate(Object[] array1, Object[] array2){
		int count = array2.length;
		Object[] newArray = new Object[array1.length + array2.length];
		int index = 0; 
		for(; index < array1.length  ; index++){

			newArray[index] = array1[index];

		}
		
		for(int index1 = 0 ; index1 < array2.length ; index1++){
		
			newArray[index] = array2[index1];
			index++;
		}
		return newArray;
	}

}