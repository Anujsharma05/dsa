package recursion.other_questions;

public class ProductOfArray {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4};
		int length = arr.length;
		
		ProductOfArray obj = new ProductOfArray();
		int output = obj.productOfArray(arr, length);
		System.err.println(output);
	}

	public int productOfArray(int A[], int N) {
		
		if(N==0) {
			return 1;
		}
		
		return A[N-1] * productOfArray(A, N-1);
	}
}
