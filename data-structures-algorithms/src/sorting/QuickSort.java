package sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {8,2,4,7,8,9,6};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int low, int high) {

        if((high-low) <= 0) {
            return;
        }

        int j = low;
        int pivot = arr[high];
        for(int i=low; i<high; i++) {
            if(arr[i] < pivot) {
                swap(arr, i, j);
                j++;
            }
        }
        swap(arr, j, high);

        sort(arr, low, j-1);
        sort(arr, j+1, high);
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
