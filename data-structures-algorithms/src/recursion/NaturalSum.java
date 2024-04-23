package recursion;

public class NaturalSum {
	public static void main(String[] args) {
		int n = 10;
		int output = sum(n);
		System.err.println(output);
	}
	private static int sum(int n) {
		if(n<=0) {
			return 0;
		}
//		if(n==1) {
//			return 1;
//		}
		return n + sum(n-1);
	}
}
