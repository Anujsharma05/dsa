package recursion;

public class RecursionLogic {

	public static void main(String[] args) {
//		firstMethod();
		recursiveMethod(4);
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

}
