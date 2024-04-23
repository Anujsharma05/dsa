package recursion.revision;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] arr = {5,4,3,7,1};
        merge(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void merge(int[] arr, int start, int end) {
        if(end-start<=0) return;

        int mid = (start+end)/2;

        merge(arr, start, mid);
        merge(arr, mid+1, end);
        combine(arr, start, mid, end);
    }
    static void combine(int[] arr, int start, int mid, int end) {
        int[] sorted = new int[end-start+1];
        int index=0;
        int j = mid+1;
        int s= start;
        while(start <= mid && j <= end) {
            if(arr[start] < arr[j]) {
                sorted[index] = arr[start];
                start++;
            } else {
                sorted[index] = arr[j];
                j++;
            }
            index++;
        }
        while(start<=mid) {
            sorted[index] = arr[start];
            index++;
            start++;
        }
        while(j<=end) {
            sorted[index] = arr[j];
            index++;
            j++;
        }

        for(int i=0; i<sorted.length; i++) {
            arr[i+s] = sorted[i];
        }
    }
}
