package arrays;

public class BestScore {

	public static void main(String[] args) {
		
		Integer[] myArray = {3 ,5,35,39,42,36,43};
		String output = firstSecond(myArray);
		System.out.print(output);
	}
	static String firstSecond(Integer[] myArray) {

//		Integer max = Integer.MIN_VALUE;
//		int maxIndex = 0;
//		for(int i=0; i<myArray.length; i++) {
//			if(myArray[i] > max) {
//				max = myArray[i];
//				maxIndex = i;
//			}
//		}
//
//		Integer secondMax = Integer.MIN_VALUE;
//		for(int i=0; i<myArray.length; i++) {
//			if(myArray[i] > secondMax && i != maxIndex) {
//				secondMax = myArray[i];
//			}
//		}
//
//		return max + " " + secondMax;

		Integer max = Integer.MIN_VALUE;
		Integer secondMax = Integer.MIN_VALUE;
		for(int i=0; i<myArray.length; i++) {
			if(myArray[i] > max) {
				secondMax = max;
				max = myArray[i];
			} else if(myArray[i] > secondMax) {
				secondMax = myArray[i];
			}
		}
		return max + " " + secondMax;
	}
}
