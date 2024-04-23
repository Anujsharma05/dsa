package recursion.revision;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,1,2};
//        iterative(arr);
        recursive(arr);
//        insertionSortRecursive(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSortRecursive(int arr[], int n) {
        // Base case
        if (n <= 1)
            return;

        // Sort first n-1 elements
        insertionSortRecursive( arr, n-1 );

        // Insert last element at its correct position
        // in sorted array.
        int last = arr[n-1];
        int j = n-2;

        /* Move elements of arr[0..i-1], that are
          greater than key, to one position ahead
          of their current position */
        while (j >= 0 && arr[j] > last) {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;
    }

    static void recursive(int[] arr) {
        if(arr.length==0 || arr.length==1) return;
        rec(arr, 1, 1);
    }
    static void rec(int[] arr, int i, int index) {

        if(arr.length == index) return;
        if(i > 0) {
            if(arr[i] < arr[i-1]) {
                swap(arr, i, i-1);
                rec(arr, i-1, index);
            } else {
                rec(arr, index+1, index+1);
            }
        } else {
            rec(arr, index+1, index+1);
        }
    }
    static void iterative(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j>0; j--) {
                if(arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                } else {
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
