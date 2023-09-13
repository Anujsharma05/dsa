package sorting;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] arr = {7,6,5,4,3,2,1};

        int start = 0;
        int end = arr.length - 1;
        sort(arr, start, end);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int start, int end) {

        if(start == end) return;

        int mid = start + (end - start)/2;

        sort(arr, start, mid);
        sort(arr, mid + 1, end);
        inplace(arr, start, mid , end);
    }

    static void inplace(int[] arr, int start, int mid, int end) {

        int[] temp = new int[end-start+1];
        int i = start;
        int j = mid+1;
        int k = 0;
        while(i <= mid && j <= end) {
            if(arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while(j <= end) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        for(int idx = 0; idx < temp.length; idx++) {
            arr[idx + start] = temp[idx];
        }
    }

    /**
     * Insertion Sort approach
     * Inefficient
     */
    static void inplace1(int[] arr, int start, int mid, int end) {

        while (start <=mid && mid < end) {
            if (arr[start] > arr[mid + 1]) {
                for (int i = mid + 1; i > start; i--) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
                mid++;
            }
            start++;
        }
    }
}
