package recursion;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		int[] arr1 = {};
		int[] arr2 = {3,8};

		int[] res = mergeSortedArrays(arr1, arr2);
		System.out.println(Arrays.toString(res));
	}

	static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
		int i=0,j=0;
		int idx = 0;
		int[] res = new int[arr1.length + arr2.length];
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i] <= arr2[j]) {
				res[idx] = arr1[i];
				i++;
			} else {
				res[idx] = arr2[j];
				j++;
			}
			idx++;
		}

		if(i < arr1.length) {
			for(int x=i; x<arr1.length; x++) {
				res[idx] = arr1[x];
				idx++;
			}
		} else {
			for(int x=j; x<arr2.length; x++) {
				res[idx] = arr2[x];
				idx++;
			}
		}

		return res;
	}
	private static void printPairs(int arr[], int n) {

		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.err.print(arr[i]+ "" + arr[j] + " ");
			}
			System.err.println();
		}
	}

}
