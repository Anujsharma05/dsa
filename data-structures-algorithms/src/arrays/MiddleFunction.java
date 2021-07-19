package arrays;

import java.util.Arrays;

public class MiddleFunction {
	public static void main(String[] args) {
		
		int[] arr = {1,2,4,6,7,4};
		int[] output = middle(arr);
		System.out.println(Arrays.toString(output));
	}
	
	static int[] middle(int[] arr) {
		
//		if(arr.length<3) {
//			return new int[0];
//		} 
//		int newLength = arr.length - 2;
//		int midArray[] = new int[newLength];
//		for(int i=1;i<arr.length-1; i++) {
//			midArray[i-1] = arr[i];
//		}
//		
//		return midArray;
		
		return Arrays.copyOfRange(arr, 1, arr.length-1);
    }
}
