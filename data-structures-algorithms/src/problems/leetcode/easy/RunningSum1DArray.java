package problems.leetcode.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/running-sum-of-1d-array
 */
public class RunningSum1DArray {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        int[] output = runningSum(nums);
        System.out.println(Arrays.toString(output));
    }

    public static int[] runningSum(int[] nums) {
        int sum = 0;

        for(int i=0; i<nums.length; i++) {
            sum = sum + nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}
