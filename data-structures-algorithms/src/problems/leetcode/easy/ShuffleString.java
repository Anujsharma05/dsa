package problems.leetcode.easy;

public class ShuffleString {

	public static void main(String[] args) {
		
		String s = "codeleet";
		int[] indices = {4,5,6,7,0,2,1,3};
		String output = restoreString(s, indices);
		System.err.println(output);
	}
	public static String restoreString(String s, int[] indices) {
        
		if(s==null) return s;
		
		StringBuilder sb = new StringBuilder(s);
		for(int i=0; i<s.length(); i++) {
			int index = indices[i];
			sb.setCharAt(index, s.charAt(i));
		}
		return sb.toString();
		
//		char[] chArr = new char[s.length()];
//		
//		for(int i=0; i<s.length(); i++) {
//			chArr[indices[i]] = s.charAt(i);
//		}
//		
//		return String.valueOf(chArr);
    }
}
