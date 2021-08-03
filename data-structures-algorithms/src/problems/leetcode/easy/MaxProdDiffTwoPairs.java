package problems.leetcode.easy;

import java.util.Arrays;

public class MaxProdDiffTwoPairs {

	public static void main(String[] args) {
		
		int[] nums = {4,2,5,9,7,4,8};
		int diff = maxProductDifference(nums);
		System.err.println(diff);
	}
	public static int maxProductDifference(int[] nums) {
		//solve in O(n) time
        return 0;
//		O(nlogn)
//		Arrays.sort(nums);
//		
//		return (nums[nums.length-1] * nums[nums.length-2]) - (nums[0] * nums[1]);
    }
}
