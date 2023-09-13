package recursion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Check pattern problem
 * r => row
 * c => col
 */
public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {5,6,7,8,9,1,2,3};
        bubbleSort(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr, int r, int c) {

        if(r==0) return;
        if(c < r) {
            if(arr[c] > arr[c+1]) {
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubbleSort(arr, r, c+1);
        } else {
            bubbleSort(arr, r-1, 0);
        }
    }

    static void bubble(int[] arr) {
        helper1(arr, 0, arr.length-1);
    }

    static void helper1(int[] arr, int i, int end) {
        if(i == arr.length-1) return;
        helper2(arr, 0, end);
        helper1(arr, i+1, end-1);
    }

    static void helper2(int[] arr, int index, int end) {
        if(index == end) return;

        if(arr[index] > arr[index + 1]) {
            int temp = arr[index];
            arr[index]  = arr[index + 1];
            arr[index+1] = temp;
        }

        helper2(arr,index+1, end);
    }
}
