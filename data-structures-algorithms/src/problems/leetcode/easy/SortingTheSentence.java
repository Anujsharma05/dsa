package problems.leetcode.easy;

/**
 * https://leetcode.com/problems/sorting-the-sentence/description/
 */
public class SortingTheSentence {

	public static void main(String[] args) {
		String s = "Myself2 Me1 I4 and3";
		String sorted = sortSentence(s);
		System.err.println(sorted);
	}
	 public static String sortSentence(String s) {
		 
		 String[] sArr = s.split(" ");
		 String[] res = new String[sArr.length];
		 
		 for(int i=0; i<sArr.length; i++) {
			 char ch = sArr[i].charAt(sArr[i].length()-1);
			 System.out.println(ch);
			 int pos = Character.getNumericValue(ch);
			 
			 res[pos-1] = sArr[i].substring(0, sArr[i].length()-1);
		 }
		 
		 StringBuilder sb = new StringBuilder();
		 for(String str: res) {
			 sb.append(str).append(" ");
		 }
		 
		 return sb.substring(0, sb.length()-1);
	 }
}
