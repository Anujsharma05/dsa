package sorting;

import java.util.Arrays;

public class ms {
    public static void main(String[] args) {
        int[] arr = {7,6,5,4,3,2,1,7};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int low, int high) {

        if((high-low) <= 0) return;

        int mid = low + (high - low)/2;

        sort(arr, low, mid);
        sort(arr, mid+1, high);
        mergeSortedSubArrays(arr, low, mid, high);
    }

    static void mergeSortedSubArrays(int[] arr, int low, int mid, int high) {

        int i=low; int j= mid + 1;
        int ctr=0;
        int[] res = new int[high-low+1];
        while(i <= mid && j <= high) {
            if(arr[i] < arr[j]) {
                res[ctr] = arr[i];
                i++;
            } else {
                res[ctr] = arr[j];
                j++;
            }
            ctr++;
        }

        while(i <= mid) {
            res[ctr] = arr[i];
            ctr++;
            i++;
        }

        while(j <= high) {
            res[ctr] = arr[j];
            ctr++;
            j++;
        }

        for(int k=0; k<res.length; k++) {
            arr[k+low] = res[k];
        }
    }
}
