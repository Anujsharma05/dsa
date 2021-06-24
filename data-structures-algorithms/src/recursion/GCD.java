package recursion;

public class GCD {

	public static void main(String[] args) {

		int output = gcd(8, 7);
		System.err.println(output);
	}

	private static int gcd(int a, int b) {
		if(a<0 || b<0) {
			return -1;
		}
		if(b==0) {
			return a;
		}
		return gcd(b, a%b);
	}
}
