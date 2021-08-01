package problems.leetcode.easy;

import java.util.Arrays;

public class ArrayFromPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5,0,1,2,3,4};
		int[] ans = buildArray(nums);
		System.err.println(Arrays.toString(ans));
	}
	public static int[] buildArray(int[] nums) {
        
		int[] ans = new int[nums.length];
		for(int i=0; i<nums.length; i++) {
			int temp = nums[i];
			ans[i] = nums[temp];
		}
		return ans;
    }
}
