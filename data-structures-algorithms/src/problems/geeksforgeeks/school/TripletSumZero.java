package problems.geeksforgeeks.school;

import java.util.Arrays;

public class TripletSumZero {

	public static void main(String[] args) {
		
		int[] arr = {1,4,2, 1, -15,5};
		
		boolean isSumZero = tripletSum(arr);
		System.err.println(isSumZero);
	}

	private static boolean tripletSum(int[] arr) {
		
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length-2; i++) {
			boolean output = twoSum(arr, arr[i], i+1);
			if(output) return true;
		}
		
		return false;
	}
	
	private static boolean twoSum(int[] arr, int sum, int i) {
		int j = arr.length - 1;
		while(i < j) {
			if(arr[i] + arr[j] == -sum) {
				return true;
			} else if(arr[i] + arr[j] < -sum) {
				i++;
			} else {
				j--;
			}
		}
		
		return false;
	}
}
