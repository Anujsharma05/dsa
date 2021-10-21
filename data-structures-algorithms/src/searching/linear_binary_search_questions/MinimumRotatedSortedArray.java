package searching.linear_binary_search_questions;

//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
public class MinimumRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {18};
        int minimum = findMin(nums);
        System.out.println(minimum);
    }
    public static int findMin(int[] nums) {

        int pivotIndex = findPivot(nums);
        return nums[pivotIndex+1];
    }

    static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        while(start < end) {
            int mid = start + (end-start)/2;

            if(mid < end && nums[mid] > nums[mid+1]) {
                return mid;
            }
            if(mid > start && nums[mid-1] > nums[mid]) {
                return mid - 1;
            }

            if(nums[mid] >= nums[start]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
