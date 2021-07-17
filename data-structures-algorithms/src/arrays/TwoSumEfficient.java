package arrays;

import java.util.Arrays;

public class TwoSumEfficient {

	public static void main(String[] args) {
		
		int nums[] = {2,5,1,4};
		int target = 9;
		
		int[] output = twoSum(nums, target);
		System.out.print(Arrays.toString(output));
		
	}

	public static int[] twoSum(int[] nums, int target) {
		
		int numsCopy[] = Arrays.copyOf(nums, nums.length);
		Arrays.sort(numsCopy);
		
		int start = 0, end = numsCopy.length-1;
		
		int a=0,b=0;
		
		while(start<end) {
			int sum = numsCopy[start] + numsCopy[end];
			
			if(sum<target)
				start++;
			else if(sum>target)
				end--;
			else {
				a = numsCopy[start];
				b = numsCopy[end];
				break;
			}
		}
		
		int output[] = new int[2];
		
		for(int i=0; i<nums.length; i++) {
			if(a == nums[i]) {
				output[0] = i;
				break;
			}
		}
		
		for(int i=nums.length-1; i>=0; i--) {
			if(b==nums[i]) {
				if(i > output[0]) {
					output[1] = i;
				} else {
					output[1] = output[0];
					output[0] = i;
				}
			}
		}
		
		return output;
	}
}
