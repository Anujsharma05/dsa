package recursion.other_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[] arr = {16,2,4,7,8,9,6};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int low, int high) {
        if(high-low<=0) return;
        int pivotIndex = partition(arr, low, high);
        sort(arr, low, pivotIndex-1);
        sort(arr, pivotIndex+1, high);
    }
    static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low;
        int j = low;

        while(i <= high) {
            if(arr[i] <= pivot) {
                swap(arr, i, j);
                j++;
            }
            i++;
        }

        return j-1;
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
