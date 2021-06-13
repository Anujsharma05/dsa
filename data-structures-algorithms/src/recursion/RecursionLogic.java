package recursion;

public class RecursionLogic {

	public static void main(String[] args) {
//		firstMethod();
		recursiveMethod(6);
		int output = powerOfTwo(3);
		System.err.println("power of two: " + output);
	}

//	static void firstMethod() {
//		secondMethod();
//		System.out.println("I am first method");
//	}
//
//	static void secondMethod() {
//		thirdMethod();
//		System.out.println("I am second method");
//	}
//
//	static void thirdMethod() {
//		fourthMethod();
//		System.out.println("I am third method");
//	}
//
//	static void fourthMethod() {
//		System.out.println("I am fourth method");
//	}
	
	static void recursiveMethod(int n) {
		
		if(n<1) {
			System.err.println("n is less than 1");
		} else {
			recursiveMethod(n-1);
			System.err.println(n);
		}
	}
	
	static int powerOfTwo(int n) {
		
		if(n==0) {
			return 1;
		} else {
			int power = 2 * powerOfTwo(n-1);
			return power;
		}
	}

}
