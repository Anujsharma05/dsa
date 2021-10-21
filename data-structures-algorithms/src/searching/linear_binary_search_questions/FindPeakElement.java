package searching.linear_binary_search_questions;

//https://leetcode.com/problems/find-peak-element/
public class FindPeakElement {
    public static void main(String[] args) {
        int[] nums = {3,4,3,2,1};
        int peakIndex = findPeakElement(nums);
        System.out.println(peakIndex);
    }

    public static int findPeakElement(int[] nums) {

        int start = 0;
        int end = nums.length-1;

        if(nums.length == 1) return 0;

        if(nums[start] > nums[start+1]) {
            return start;
        }
        if(nums[end] > nums[end-1]) {
            return end;
        }

        while(start <= end) {
            int mid = start + (end - start)/2;

            if(peakFound(nums, mid)) {
                return mid;
            }

            if(mid > 0 && nums[mid-1] > nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static boolean peakFound(int[] nums, int mid) {
        return mid > 0 && mid < nums.length-1 && nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1];
    }

}
