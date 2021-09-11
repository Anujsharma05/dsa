package problems.leetcode.easy;
//https://leetcode.com/problems/search-insert-position/
public class SearchInsertionPosition {

	public static void main(String[] args) {

		int[] nums = { 1,3, 5, 7 };
		int target = 6;

		int output = searchInsert(nums, target);
		System.err.println(output);
	}

//	public static int searchInsert(int[] nums, int target) {
//
//		int low = 0;
//		int high = nums.length - 1;
//
//		int closeIndex = -1;
//
//		if(target > nums[high]) {
//			return high + 1;
//		}
//		if(target < nums[low]) {
//			return low;
//		}
//
//		while (low <= high) {
//
//			//imp condition start
//			if(low == high) {
//				return low;
//			}
//			//imp condition end
//
//			int mid = (low + high) / 2;
//			if (target == nums[mid]) {
//				return mid;
//			} else if (target > nums[mid]) {
//				low = mid + 1;
//			} else {
//				high = mid -1;
//			}
//		}
//
//		return closeIndex;
//	}

	//clean way
	public static int searchInsert(int[] nums, int target) {

		int start = 0;
		int end = nums.length-1;

		if(target < nums[start]) {
			return 0;
		} else if(target > nums[end]) {
			return end + 1;
		} else {
			//binary search

			while(start <= end) {
				int mid = start + (end - start)/2;

				if(nums[mid] < target) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}

			return start;
		}
	}

}
