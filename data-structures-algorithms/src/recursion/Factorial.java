package recursion;

public class Factorial {

	public static void main(String[] args) {
		
		Factorial fact = new Factorial();
		var output = fact.recur(10);
		System.err.println(output);
	}
	
	public int recur(int n) {
		
		if(n<0) {
			return -1;
		}
		
		if(n==0 || n==1) {
			return 1;
		}
		
		return n * recur(n-1);
	}

}
