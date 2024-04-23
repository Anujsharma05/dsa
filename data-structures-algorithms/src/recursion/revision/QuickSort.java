package recursion.revision;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,3,2,7,4};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr, int s, int e) {

        if(e-s <= 0) return;

        int i=s, j=s;
        int pivot = arr[e];

        while(i != arr.length-1) {
            if(arr[i] < pivot) {
                swap(arr, i, j);
                j++;
            }
            i++;
        }
        swap(arr, j, e);

        sort(arr, s, j-1);
        sort(arr, j+1, e);
    }
    static void arrange(int[] arr) {

        int i=0,j=0;
        int pivot = arr[arr.length-1];

        while(i != arr.length-1) {
            if(arr[i] < pivot) {
                swap(arr, i, j);
                j++;
            }
            i++;
        }
        swap(arr, j, arr.length-1);



    }
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
