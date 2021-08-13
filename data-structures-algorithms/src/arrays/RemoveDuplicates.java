package arrays;

import java.util.Arrays;

//class Exercise {
//
//    private static int removeDuplicates(int a[], int n) {
//        if (n == 0 || n == 1) {
//            return n;
//        }
//        int j = 0;
//        for (int i = 0; i < n - 1; i++) {
//            if (a[i] != a[i + 1]) {
//                a[j++] = a[i];
//            }
//        }
//        a[j++] = a[n - 1];
//        return j;
//  }
//
//
//  public static int[] removeDuplicates(int[] arr) {
//
//    int result = removeDuplicates(arr, arr.length);
//
//    int[] newArray = new int[result];
//
//    for (int i = 0; i < result; i++) {
//
//            newArray[i] = arr[i];
//
//    }
//
//    return newArray;
//
//  }
//
//
//}

public class RemoveDuplicates {
	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 2, 3, 4, 5, 1 };
		
//		int[] output = Exercise.removeDuplicates(arr);
		
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
