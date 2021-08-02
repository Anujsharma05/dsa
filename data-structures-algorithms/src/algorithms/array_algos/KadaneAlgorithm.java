package algorithms.array_algos;

//maximizing sum subarray
public class KadaneAlgorithm {

	public static void main(String[] args) {
		
		int[] arr = {-1,-2,-3};
		int maxSum = kadaneAlgo(arr);
		System.err.println(maxSum);
	}

	private static int kadaneAlgo(int[] arr) {
		
		int max = Integer.MIN_VALUE;
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			if(sum < 0) {
				sum = arr[i];
			} else {
				sum = sum + arr[i];
			}
			
			if(sum > max) {
				max = sum;
			}
		}
		
		return max;
	}

}
