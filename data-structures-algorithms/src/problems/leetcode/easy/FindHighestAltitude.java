package problems.leetcode.easy;

public class FindHighestAltitude {

	public static void main(String[] args) {
		
		int[] gain = {44,32,-9,52,23,-50,50,33,-84,47,-14,84,36,-62,37,81,-36,-85,-39,67,-63,64,-47,95,91,-40,65,67,92,-28,97,100,81};
		int alt = largestAltitude(gain);
		System.err.println(alt);

	}
	public static int largestAltitude(int[] gain) {
        
		int max = 0;
		int sum = 0;
		for(int i=0; i<gain.length; i++) {
			sum = sum + gain[i];
			max = Math.max(max, sum);
		}
		
		return max;
    }
}
