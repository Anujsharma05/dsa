package recursion;

public class Test {

	public static void main(String[] args) {
		
		int arr[] = {1, 3, 4, 5};
		int n = arr.length;
		printPairs(arr, n);

	}
	
	private static void printPairs(int arr[], int n) {
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.err.print(arr[i]+ "" + arr[j] + " ");
			}
			System.err.println();
		}
	}

}
