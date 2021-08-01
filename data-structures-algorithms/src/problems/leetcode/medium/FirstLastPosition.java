package problems.leetcode.medium;

import java.util.Arrays;

public class FirstLastPosition {

	public static void main(String[] args) {
		int[] nums = {1};
		int ans[] = searchRangeLogn(nums, 1);
		System.err.println(Arrays.toString(ans));
	}

	private static int[] searchRangeLogn(int[] nums, int i) {
		
		int first = findFirst(nums, i);
		int last = findLast(nums, i);
		
		return new int[] {first, last};
	}
	
	private static int findFirst(int[] nums, int target) {
		
		int index = -1;
		int l=0, h = nums.length-1;
		
		while(l <= h) {
			int mid = (l+h)/2;
			
			if(nums[mid] >= target) {
				h = mid - 1;
			} else {
				l = mid + 1;
			}
			
			if(nums[mid] == target) {
				index = mid;
			}
		}
		
		return index;
	}
	
	private static int findLast(int[] nums, int target) {
		
		int index = -1;
		int l=0, h = nums.length-1;
		
		while(l <= h) {
			int mid = (l+h)/2;
			
			if(nums[mid] <= target) {
				l = mid + 1;
			} else {
				h = mid - 1;
			}
			
			if(nums[mid] == target) {
				index = mid;
			}
		}
		
		return index;
	}
	
//	public static int[] searchRange(int[] nums, int target) {
//		int loc = binarySearch(nums, target);
//		if(loc == -1)
//			return new int[] {-1, -1};
//		
//		int start = loc, end = loc;
//		
//		for(int i=loc-1; i>=0; i--)  {
//			if(nums[i] == target) {
//				start = i;
//			} else {
//				break;
//			}
//		}
//		
//		for(int j=loc+1; j<nums.length; j++) {
//			if(nums[j] == target) {
//				end = j;
//			} else {
//				break;
//			}
//		}
//		
//        return new int[] {start, end};
//    }
//	
//	private static int binarySearch(int[] nums, int target) {
//		
//		int l = 0, h=nums.length-1;
//		while(l<=h) {
//			int mid = (l+h)/2;
//			
//			if(nums[mid] == target) {
//				return mid;
//			} else if(nums[mid] < target) {
//				l = mid+1;
//			} else {
//				h = mid-1;
//			}
//		}
//		return -1;
//	}
}
