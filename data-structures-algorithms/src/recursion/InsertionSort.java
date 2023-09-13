package recursion;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        sort(arr,1, 1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr,int c, int index) {
        if(index >= arr.length) return;
        if(c > 0) {
            if(arr[c] < arr[c-1]) {
                int temp = arr[c];
                arr[c] = arr[c-1];
                arr[c-1] = temp;
                sort(arr, c-1, index);
            } else {
                sort(arr, index+1, index+1);
            }
        } else {
            sort(arr, index+1, index+1);
        }
    }
}
