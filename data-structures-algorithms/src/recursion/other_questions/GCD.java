package recursion.other_questions;

public class GCD {

	public static void main(String[] args) {

		int output = gcd(11, 7);
		System.err.println(output);
	}

	private static int gcd(int a, int b) {
		if(a<0 || b<0) {
			return -1;
		}
		System.out.println("a: " + a + ", b: " + b);
		if(b==0) {
			return a;
		}
		return gcd(b, a%b);
	}
}
