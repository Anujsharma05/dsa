package recursion;

public class SumOfDigits {

	public static void main(String[] args) {

		int n = 11;
		
		int output = sum(n);
		System.err.println(output);
	}
	
	private static int sum(int n) {
		
		if(n<=0) {
			return 0;
		}
		
		return n%10 + sum(n/10);
	}

}
