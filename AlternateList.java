public class AlternateList{


	public static Object[] alternator(Object[] array1, Object[] array2){
		Object[] newArray = new Object[array1.length + array2.length];
		int count = 0;
		int count1 = 0;
		for(int index1 = 0 , index2 = 1; index1 < newArray.length && index2 < newArray.length ; index1 += 2,index2 += 2){
		
			newArray[index1] = array1[count];
			newArray[index2] = array2[count1];
			
			count++;
			count1++;
		}
		return newArray;
	}


} 