package searching.linear_binary_search_questions;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        int targetIndex = findTargetInInfiniteArray(arr, target);
        System.out.println(targetIndex);
    }

    static int findTargetInInfiniteArray(int[] arr, int target) {

        //starting with range of two
        int start = 0;
        int end = 1;
        int range = 2;
        while(target > arr[end]) {
           start = end + 1;

//           range can also be calculated by using the formula
//           (end - start + 1) * 2
           range = range * 2;
           end = end + range;
        }
        System.out.println(start + " = " + end);
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        if(arr.length == 0) return -1;

        while(start <= end) {

            int mid = start + (end - start)/2;

            if(arr[mid] > target) {
                end = mid - 1;
            } else if(arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
