package searching.linear_binary_search_questions;
//https://leetcode.com/problems/split-array-largest-sum/
public class SplitArrayMinimizeLargestSum {
    public static void main(String[] args) {

        int[] nums = {7,2,5,10,8};
        int m = 2;

        SplitArrayMinimizeLargestSum obj = new SplitArrayMinimizeLargestSum();
        int minimumLargestSum = obj.splitArray(nums, m);
        System.out.println(minimumLargestSum);
    }

    public int splitArray(int[] nums, int m) {

        int start = 0;
        int end = 0;

        for(int i=0; i<nums.length; i++) {
            start = Math.max(start, nums[i]);
            end = end + nums[i];
        }

        while(start < end) {
           int mid = start + (end-start)/2;

           int pieces = 1;
           int sum = 0;

           for(int i=0; i<nums.length; i++) {
               if(sum + nums[i] > mid) {
                   sum = nums[i];
                   pieces++;
               } else {
                   sum = sum + nums[i];
               }
           }

           if(pieces <= m) {
               end = mid;
           } else {
               start = mid + 1;
           }
        }

        return start;
    }
}
