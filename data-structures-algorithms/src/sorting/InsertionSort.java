package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
//        insertionSort(arr);
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    //community classroom approach
    //sort subarray at each step
    static void insertion(int[] arr) {
        int len = arr.length;

        for(int i=0; i<len-1; i++) {
            for(int j=i+1; j>0; j--) {
                if(arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                } else {
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void insertionSort(int[] arr) {
        int len = arr.length;

        for(int i=1; i<len; i++) {
            int currentVal = arr[i];
            boolean smallerFound = false;
            int j;
            for(j=i-1; j>=0; j--) {
                if(arr[j] > currentVal) {
//                    instead of shifting right we can also use swapping
                    arr[j+1] = arr[j];
                    smallerFound = true;
                } else {
                    break;
                }
            }
            if(smallerFound) {
                arr[j+1] = currentVal;
            }
        }
    }
}
