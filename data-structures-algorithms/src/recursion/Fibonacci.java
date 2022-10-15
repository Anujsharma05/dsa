package recursion;

public class Fibonacci {

	public static void main(String[] args) {
		
		Fibonacci obj = new Fibonacci();
		var output = obj.fib(4);
		System.err.println(output);
	}

	public int fib(int n) {
		if(n<0) {
			return -1;
		}
		
		if(n==0 || n==1) {
			return n;
		}
		
		return fib(n-2) + fib(n-1);
	}
	
}
