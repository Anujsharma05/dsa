package sorting;

import java.util.Arrays;

public class  MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int[] res = sort(arr);
        System.out.println(Arrays.toString(res));
    }

    static int[] sort(int[] arr) {
        if (arr.length == 1) return arr;
//        int[] arr1 = createArr(arr, 0, arr.length/2);
//        int[] arr2 = createArr(arr, arr.length/2, arr.length);

        int mid = arr.length / 2;
        int[] arr1 = Arrays.copyOfRange(arr, 0, mid);
        int[] arr2 = Arrays.copyOfRange(arr, mid, arr.length);

        int[] sorted1 = sort(arr1);
        int[] sorted2 = sort(arr2);
        return mergeSortedArrays(sorted1, sorted2);
    }

    /**
     * copy of range function
     *
     * @param arr
     * @param start
     * @param end
     * @return
     */
    static int[] createArr(int[] arr, int start, int end) {
        int[] newArr = new int[end - start];
        int idx = 0;
        for (int i = start; i < end; i++) {
            newArr[idx] = arr[i];
            idx++;
        }

        return newArr;
    }

    static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        int idx = 0;
        int[] res = new int[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                res[idx] = arr1[i];
                i++;
            } else {
                res[idx] = arr2[j];
                j++;
            }
            idx++;
        }

        for (int x = i; x < arr1.length; x++) {
            res[idx] = arr1[x];
            idx++;
        }
        for (int x = j; x < arr2.length; x++) {
            res[idx] = arr2[x];
            idx++;
        }

        return res;
    }
}
