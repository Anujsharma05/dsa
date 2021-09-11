package sorting;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cycleSort(int[] arr) {
        int len = arr.length;
        int i=0;
        while(i < len) {
            int correct = arr[i] - 1;
            if(arr[i] == arr[correct]) {
                i = i+1;
            } else {
                swap(arr, i, correct);
            }
        }
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
