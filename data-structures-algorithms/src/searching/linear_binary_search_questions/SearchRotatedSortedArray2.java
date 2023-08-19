package searching.linear_binary_search_questions;

//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
public class SearchRotatedSortedArray2 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1,1,1,1};
        int target = 0;
        boolean found = search(nums, target);
        System.out.println(found);
    }

    public static boolean search(int[] nums, int target) {

        int start = 0;
        int end = nums.length-1;

        while(start <= end) {
            int mid = start + (end-start)/2;

            if(nums[mid] == target) return true;

            if(nums[start] < nums[mid]) {
                if(nums[start] <= target && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if(nums[start] > nums[mid]) {
                if(target <= nums[end] && nums[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                start++;
            }
        }
        return false;
    }
}
