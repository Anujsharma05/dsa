package searching.linear_binary_search_questions;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class PeakIndexMountainArray {
    public static void main(String[] args) {

        int[] arr = {3,5,3,2,0};

        int peakIndex = peakIndexInMountainArray(arr);
        System.out.println(peakIndex);
    }

//    my code
//    public static int peakIndexInMountainArray(int[] arr) {
//
//        int start = 0;
//        int end = arr.length-1;
//
//        while(start<=end) {
//
//            int mid = start + (end-start)/2;
//
//            if(mid==arr.length-1) {
//                end = mid - 1;
//            } else {
//                if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) {
//                    return mid;
//                }
//
//                if (arr[mid] < arr[mid+1]) {
//                    start = mid + 1;
//                } else {
//                    end = mid - 1;
//                }
//            }
//        }
//        return -1;
//    }

//    community classroom
    public static int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length-1;

//        not checking equal because when they are equal that will be the maximum number hence answer
        while(start < end) {

            int mid = start + (end - start) / 2;

            if(arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start; // or return end as they both are equal as per the conditions
    }
}
