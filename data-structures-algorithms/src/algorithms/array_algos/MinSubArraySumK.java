package algorithms.array_algos;

//Sliding Window Dynamic
//Smallest Subarray with given sum value
public class MinSubArraySumK {

	public static void main(String[] args) {
		
		int arr[] = {1,5,2,7,1,1,2,8,1,0};
		int target = 4;
		
		int subArraySize = minSubArrayWithSumGreaterEqualTarget(arr, target);
		System.err.println(subArraySize);
	}

	private static int minSubArrayWithSumGreaterEqualTarget(int[] arr, int target) {
		
		int j=0, sum=0, minimumSubArrayLength = Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			
			sum = sum + arr[i];
			
			while(sum >= target) {
				
				if(sum == target) {
					minimumSubArrayLength = Math.min(minimumSubArrayLength, i-j+1);
				}
				
				sum = sum - arr[j];
				j++;
				
			}
		}
		
		return minimumSubArrayLength;
	}

}
