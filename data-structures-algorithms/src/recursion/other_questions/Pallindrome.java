package recursion.other_questions;

public class Pallindrome {
	public static void main(String[] args) {

		Pallindrome obj = new Pallindrome();
		boolean isPalin = obj.isPalin("f");
		System.err.println(isPalin);
	}
	static boolean isPalindromeBetter(String input, int i, int j) {
		if(i>j) return true;
		if(input.charAt(i) == input.charAt(j)) {
			return isPalindromeBetter(input, i+1, j-1);
		}
		return false;
	}
	public boolean isPalin(String s) {
		if(s == null) return false;
		if(s.length()==0 || s.length() == 1) return true;
		if(s.charAt(0) != s.charAt(s.length()-1)) return false;
		return isPalin(s.substring(1, s.length()-1));
	}
}
