package arrays;

public class MissingNumber {

	public static void main(String[] args) {
		
		int[] intArray = {1, 2, 3, 4,5,6,8,9,10};
		missingNumber(intArray);
	}

	public static void missingNumber(int[] intArray) {
        
//		int missingNum = -1;
//		
//		for(int i=0; i<intArray.length; i++) {
//			if(i+1 != intArray[i]) {
//				missingNum = i+1;
//				break;
//			}
//		}
//		
//		if(missingNum == -1 && intArray.length == 9) {
//			missingNum = 10;
//		}
//		
//		System.out.print(missingNum);
		
		int expectedSum = (10*11)/2;
		int sum = 0;
        for(int i=0; i<intArray.length; i++) {
			sum = sum + intArray[i];
		}
		System.err.println(expectedSum - sum);
    }
}
