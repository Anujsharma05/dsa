package problems.leetcode.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/build-array-from-permutation
 */
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

	/**
	 * O(1) space
	 * @param nums
	 * @return
	 */
	public static int[] buildArraySpaceOptimized(int[] nums) {

		int ref = 1024;

		for(int i=0; i<nums.length; i++) {

			if(i == nums[i]) continue;

			if(nums[i] < i) {
				nums[i] = nums[i] * ref + nums[nums[i]]/ref;
			} else {
				nums[i] = nums[i] * ref + nums[nums[i]];
			}
		}

		for(int i=0; i<nums.length; i++) {
			nums[i] = nums[i] % ref;
		}

		return nums;
	}
}
