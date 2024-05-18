package recursion.other_questions;

public class DecimalToBinary {

	public static void main(String[] args) {

		int n = 15;
		int output = decToBin(n);
		System.err.println(output);
	}

	private static int decToBin(int n) {
		if(n==0) {
			return 0;
		}
		return n%2 + (10* decToBin(n/2));
	}
}
