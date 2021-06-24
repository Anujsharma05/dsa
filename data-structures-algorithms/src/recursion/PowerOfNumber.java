package recursion;

public class PowerOfNumber {

	public static void main(String[] args) {

		int num = 3;
		int n = 4;
		
		int output = power(num, n);
		System.err.println(output);
	}
	
	private static int power(int num, int n) {
		if(n<0) {
			return -1;
		}
//		if(n==0) {
//			return 1;
//		}
		if(n==1) {
			return num;
		}
		return num * power(num, n-1);
	}

}
