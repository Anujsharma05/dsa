package arrays;

public class MaxProduct {

	public static void main(String[] args) {
		
		int[] intArray = {10,20,30,40,50};
		String output = maxProduct(intArray);
		System.out.print(output);
	}

	 public static String maxProduct(int[] intArray) {
	        
		 int max = Integer.MIN_VALUE;
		 int maxIndex = 0;
		 
		 for(int i=0; i<intArray.length; i++) {
			 if(intArray[i] > max) {
				 max = intArray[i];
				 maxIndex = i;
			 }
		 }
		 
		 int secondMax = Integer.MIN_VALUE;
		 
		 for(int i=0; i<intArray.length; i++) {
			 if(intArray[i] > secondMax && i!=maxIndex) {
				 secondMax = intArray[i];
			 }
		 }
		 
		 return Integer.toString(secondMax) + "," + Integer.toString(max);
	 }
}
