package recursion.leetcode;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        int target = 3;
        int index = search(arr, target);
        System.out.println(index);
    }
    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        return helper(arr, target, start, end);
    }

    static int helper(int[] arr, int target, int start, int end) {

        if(start > end) return -1;

        int mid = start + (end - start)/2;
        if(arr[mid] == target) return mid;

        if(arr[start] <= arr[mid]) {
            if(arr[start] <= target && target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        } else {
            if(arr[mid] < target && target <= arr[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return helper(arr, target, start, end);
    }
}
