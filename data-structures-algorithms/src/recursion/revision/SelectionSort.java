package recursion.revision;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,7,9};
        sort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr, int r, int c, int maxIndex) {
        if(r == 0) return;
        if(c < r) {
            if(arr[c] > arr[maxIndex]) {
                maxIndex= c;
            }
            sort(arr, r, c+1, maxIndex);
        } else {
            swap(arr, maxIndex, r-1);
            sort(arr, r-1, 0, 0);
        }
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
