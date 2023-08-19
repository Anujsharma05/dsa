package problems.leetcode.easy;

import java.util.Arrays;

//https://leetcode.com/problems/concatenation-of-array/
public class ArrayConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 3, 2, 1 };
		int[] ans = getConcatenation(nums);
		System.err.println(Arrays.toString(ans));
	}

	public static int[] getConcatenation(int[] nums) {

		int[] ans = new int[nums.length * 2];

//		 for(int i=0; i<ans.length; i++) {
//			 if(i < nums.length) {
//				 ans[i] = nums[i];
//			 } else {
//				 ans[i] = nums[i-nums.length];
//			 }
//		 }

		for (int i = 0; i < nums.length; i++) {
			ans[i] = nums[i];
			ans[i + nums.length] = nums[i];
		}

		return ans;
	}
}
