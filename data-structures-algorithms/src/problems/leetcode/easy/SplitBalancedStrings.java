package problems.leetcode.easy;

public class SplitBalancedStrings {

	public static void main(String[] args) {
		String s = "RLRRRLLRLL";
		int count = balancedStringSplit(s);
		System.err.println(count);
	}
	public static int balancedStringSplit(String s) {
		
		int cr=0,cl=0,count=0;
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == 'R') {
				cr++;
			} else {
				cl++;
			}
			
			if(cr == cl) {
				count++;
				cr = cl = 0;	
			}
		}
		
		return count;
    }
}
