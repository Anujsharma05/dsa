package recursion.other_questions;

public class CapitalizeWord {
	public static void main(String args[]) {
		String str = "this   is   sparta";
		String output = capitalizeWord(str);
		System.err.println(output);
	}
	
	public static String capitalizeWord(String str){
	    
		if(str==null) {
			return null;
		}
		
		int len = str.length();
		
		if(len==0) {
			return "";
		}
		if(len==1) {
			return str.toUpperCase();
		}
		if(str.charAt(len-2) == ' ') {
			return capitalizeWord(str.substring(0, len-1)) + (str.substring(len-1, len)).toUpperCase();
		} else {
			return capitalizeWord(str.substring(0, len-1)) + str.substring(len-1, len);
		}
	}
}
