package recursion.revision;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,9,7};
        sort(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr, int r, int c) {
        if(r < 1) return;
        if(c < r) {
            if(arr[c] > arr[c+1]) {
                swap(arr, c);
            }
            sort(arr, r, c+1);
        } else {
            sort(arr, r-1, 0);
        }
    }
    static void swap(int[] arr, int c) {
        int temp = arr[c];
        arr[c] = arr[c+1];
        arr[c+1] = temp;
    }
}
