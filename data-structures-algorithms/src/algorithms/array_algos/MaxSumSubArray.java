package algorithms.array_algos;

//Sliding Window Fixed
//Find max sum subarray of fixed size k
public class MaxSumSubArray {

	public static void main(String[] args) {

		int[] input = {4,2,1,7,8,1,2,8,1,0};
		int k = 3;
		int output = findMaxSumWindowK(input, k);
		System.err.println(output);
	}

	private static int findMaxSumWindowK(int[] input, int k) {
		
		int max = Integer.MIN_VALUE;
		int sum=0;
		
		for(int i=0; i<input.length; i++) {
			sum = sum + input[i];
			
			if(i >= k-1) {
				if(sum > max) {
					max = sum;
				}
				sum = sum - input[i-(k-1)];
			}
		}
		
		return max;
	}

}
