package recursion;

public class FindMaxNum {
	public static void main(String[] args) {
		int arr[] = {4, 5, 1, 9, 3};
		int n = arr.length;
		int output = findMaxNum(arr, n);
		System.err.println(output);
	}

	private static int findMaxNum(int arr[], int n) {
		if(n<1) {
			return -1;
		}
		if(n==1) {
			return arr[0];
		}
		
		return Math.max(arr[n-1], findMaxNum(arr, n-1));
	}
}
