package recursion;

public class FirstUppercase {

	public static void main(String[] args) {
		String s = "bgjgGfhh";
		char output = first(s);
		System.err.println(output);
	}

	static char first(String str) {
	    
		if(str==null) {
			return 0;
		}
		if(str.isEmpty()) {
			return 0;
		}
//		if((int)str.charAt(0) >=65 && (int)str.charAt(0) <=90) {
//			return str.charAt(0);
//		}
		if(Character.isUpperCase(str.charAt(0))) {
			return str.charAt(0);
		}
		
		return first(str.substring(1, str.length()));
	}
}
