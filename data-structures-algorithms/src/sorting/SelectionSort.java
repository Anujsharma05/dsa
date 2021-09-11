package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,4,3,4,5,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        int len = arr.length;

        for(int i=0; i<len-1; i++) {
            int minValIndex = i;
            for(int j=i+1; j<len; j++) {
              if(arr[j] < arr[minValIndex])   {
                  minValIndex = j;
              }
            }

            if(i != minValIndex) {
                swap(arr, i, minValIndex);
            }
        }
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
