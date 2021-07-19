package arrays;

import java.util.Arrays;

public class RemoveDuplicates {
	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 2, 3, 4,4, 5 };
		int[] output = removeDuplicates(arr);
		System.out.print(Arrays.toString(output));

	}

	public static int[] removeDuplicates(int[] arr) {
		
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == Integer.MIN_VALUE) continue;
			count++;
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					arr[j] = Integer.MIN_VALUE;
				}
			}
		}
		int[] res = new int[count];
		
		int index =0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != Integer.MIN_VALUE) {
				res[index] = arr[i];
				index++;
			}
		}
		return res;
	}
}
