package recursion.other_questions;

public class PowerOfNumber {

	public static void main(String[] args) {

		int num = 3;
		int n = 4;
		
		int output = power(num, n);
		System.err.println(output);
	}
	
	public static int power(int base, int exponent) {
        
		if(exponent==0) {
			return 1;
		} else if(exponent == 1) {
			return base;
		} else {
			return base * power(base, exponent-1);
		}
		
    }

}
