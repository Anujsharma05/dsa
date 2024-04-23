package recursion.revision;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,7,1};
        int[] output = merge(arr);
        System.out.println(Arrays.toString(output));
    }
    static int[] merge(int[] arr) {

        if(arr.length==1) return arr;

        int mid = arr.length/2;
        int[] first = Arrays.copyOfRange(arr, 0, mid);
        int[] second = Arrays.copyOfRange(arr, mid, arr.length);

        int[] sorted1 = merge(first);
        int[] sorted2 = merge(second);
        return combine(sorted1, sorted2);
    }
    static int[] combine(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length+arr2.length];
        int index = 0;
        int i=0, j=0;

        while(i < arr1.length && j < arr2.length) {
            if(arr1[i] < arr2[j]) {
                arr[index] = arr1[i];
                i++;
            } else {
                arr[index] = arr2[j];
                j++;
            }
            index++;
        }
        while(i < arr1.length) {
            arr[index] = arr1[i];
            index++;
            i++;
        }
        while(j < arr2.length) {
            arr[index] = arr2[j];
            index++;
            j++;
        }
        return arr;
    }
}
