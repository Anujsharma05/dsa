package problems.leetcode.easy;

public class SortSentence {

	public static void main(String[] args) {
		String s = "Myself2 Me1 I4 and3";
		String sorted = sortSentence(s);
		System.err.println(sorted);

	}
	 public static String sortSentence(String s) {
		 
		 String[] sArr = s.split(" ");
		 String[] res = new String[sArr.length];
		 
		 for(int i=0; i<sArr.length; i++) {
			 int pos = Character.getNumericValue(sArr[i].charAt(sArr[i].length()-1));
			 
			 res[pos-1] = sArr[i].substring(0, sArr[i].length()-1);
		 }
		 
		 StringBuilder sb = new StringBuilder();
		 for(String str: res) {
			 sb.append(str).append(" ");
		 }
		 
		 return sb.substring(0, sb.length()-1);
	 }
}
