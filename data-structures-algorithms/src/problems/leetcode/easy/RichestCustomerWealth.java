package problems.leetcode.easy;

public class RichestCustomerWealth {

	public static void main(String[] args) {
		
		int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};
		int max = maximumWealth(accounts);
		System.out.print(max);
	}
	public static int maximumWealth(int[][] accounts) {
        
		if(accounts == null || accounts.length == 0) return -1;
		int rows = accounts.length;
		
		int max = Integer.MIN_VALUE;
		for(int i=0; i<rows; i++) {
			int sum = 0;
			for(int j=0; j<accounts[i].length; j++) {
				sum = sum + accounts[i][j];
			}
			
			if(sum > max) {
				max = sum;
			}
		}
		return max;
    }
}
