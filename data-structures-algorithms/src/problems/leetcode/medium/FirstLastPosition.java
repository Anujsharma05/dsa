package problems.leetcode.medium;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array
 */
public class FirstLastPosition {

	public static void main(String[] args) {
		int[] nums = {1};
		FirstLastPosition obj = new FirstLastPosition();
		int ans[] = obj.searchRangeOptimized(nums, 1);
		System.err.println(Arrays.toString(ans));
	}

	public int[] searchRangeOptimized(int[] nums, int target) {
		int left = findLeftIndex(nums, target);
		int right = findRightIndex(nums, target);
		return new int[]{left,right};
	}

	public int findLeftIndex(int[] nums, int target) {
		boolean isLeftFound = false;
		int start = 0;
		int end = nums.length-1;
		while(start<=end) {
			int mid = start + (end - start)/2;
			if(target == nums[mid]) {
				end = mid - 1;
				isLeftFound = true;
			} else if(target < nums[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return isLeftFound ? start : -1;
	}

	public int findRightIndex(int[] nums, int target) {
		boolean isRightFound = false;
		int start = 0;
		int end = nums.length-1;
		while(start<=end) {
			int mid = start + (end - start)/2;

			if(target == nums[mid]) {
				start = mid + 1;
				isRightFound = true;
			} else if(target > nums[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return isRightFound ? end : -1;
	}

	/**
	 * Brute force
	 */
	public static int[] searchRange(int[] nums, int target) {

		int[] res = {-1,-1};

		if(nums.length == 0)
			return res;

		boolean isLeftFound = false, isRightFound = false;
		int i=0, j= nums.length-1;

		while(i <= j) {
			if(nums[i] == target)
				isLeftFound = true;

			if(nums[j] == target)
				isRightFound = true;

			if(isLeftFound && isRightFound) {
				res[0] = i;
				res[1] = j;
				return res;
			}

			if(!isLeftFound)
				i++;
			if(!isRightFound)
				j--;
		}
		return res;
	}
}
