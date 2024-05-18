package recursion.other_questions;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int arr[] = {4, 3, 2, 8, 1, 1};
		int n = arr.length;

//		sort(arr, 0, n-1);

		selection(arr, arr.length, 0, 0);
		System.out.println(Arrays.toString(arr));
	}

	static void selection(int[] arr, int r, int c, int maxIndex) {
		if(r == 0) return;
		if(c < r) {
			if(arr[c] > arr[maxIndex]) {
				maxIndex = c;
			}
			selection(arr, r, c+1, maxIndex);
		} else {
			int temp = arr[r-1];
			arr[r-1] = arr[maxIndex];
			arr[maxIndex] = temp;

			selection(arr, r-1, 0, 0);
		}
	}

	private static int findMinIndex(int arr[], int startIndex, int endIndex) {

		int smallestValue = Integer.MAX_VALUE;
		int index = startIndex;

		for(int i=startIndex; i<=endIndex; i++) {
			if(smallestValue > arr[i]) {
				smallestValue = arr[i];
				index = i;
			}
		}

		return index;
	}

	private static int[] sort(int[] arr, int startIndex, int endIndex) {

		if(startIndex>endIndex) {
			return arr;
		}

		int minIndex = findMinIndex(arr, startIndex, endIndex);

		//swap
		int temp = arr[startIndex];
		arr[startIndex] = arr[minIndex];
		arr[minIndex] = temp;

		return sort(arr, startIndex+1, endIndex);
	}
}
