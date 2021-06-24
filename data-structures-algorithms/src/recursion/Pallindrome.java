package recursion;

public class Pallindrome {
	public static void main(String[] args) {

		Pallindrome obj = new Pallindrome();
		boolean isPalin = obj.isPalin("amanaplanacanalpandemonium");
		System.err.println(isPalin);
	}

	public boolean isPalin(String s) {
		if(s == null) return false;
		if(s.length()==0 || s.length() == 1) return true;
		if(s.charAt(0) != s.charAt(s.length()-1)) return false;
		return isPalin(s.substring(1, s.length()-1));
	}
}
