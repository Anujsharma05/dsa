package recursion.other_questions;

public class PracticeQuestion {
	public static void main(String[] args) {
		A(3);
	}
	private static void A(int n) {
		if(n<1) {
			return;
		}
		System.err.print(n + " ");
		A(n-1);
		A(n-1);
	}
}
