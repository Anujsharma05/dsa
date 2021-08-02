package problems.leetcode.easy;

import java.util.Arrays;

public class ShuffleArray {

	public static void main(String[] args) {

		int[] nums = {1,1,2,2};
		int n = 2;
		
		int[] shuffled = shuffle(nums, n);
		System.err.println(Arrays.toString(shuffled));
	}
	
//	O(n) time and space
//	public static int[] shuffle(int[] nums, int n) {
//        
//		int i=0,j=0,k=1;
//		
//		int[] shuffle = new int[n*2];
//		
//		while(i<n) {
//			shuffle[j] = nums[i];
//			shuffle[k] = nums[i+n];
//			i++;
//			j = j + 2;
//			k = k + 2;
//		}
//		
//		return shuffle;
//    }
	
//	O(n) time, O(1) space
	public static int[] shuffle(int[] nums, int n) {
        
		int temp = 10000;
		
		for(int i=n; i<nums.length; i++) {
			nums[i] = (nums[i] * temp) + nums[i-n];
		}
		
		int j=0;
		for(int i=n; i<nums.length; i++) {
			nums[j] = nums[i]%temp;
			nums[j+1] = nums[i]/temp;
			j+=2;
		}
		
		return nums;
    }
}
