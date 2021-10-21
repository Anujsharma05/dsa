package searching.linear_binary_search_questions;

//https://leetcode.com/problems/single-element-in-a-sorted-array/
public class SingleElementSortedArray {
    public static void main(String[] args) {
        int[] nums = {4};
        int number = singleNonDuplicate(nums);
        System.out.println(number);
    }

    public static int singleNonDuplicate(int[] nums) {

        int start = 0;
        int end = nums.length-1;

        if(end == 0) return nums[end];

        while(start < end) {

            int mid = start + (end - start)/2;

            int leftOfMid = mid - start;

            if(leftOfMid%2==0) {
                if(nums[mid]==nums[mid-1]) {
                    end = mid - 2;
                } else if(nums[mid]==nums[mid+1]) {
                    start = mid + 2;
                } else {
                    return nums[mid];
                }
            } else {
                if(nums[mid] == nums[mid-1]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return nums[start];
    }
}
