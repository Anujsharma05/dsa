package recursion.other_questions;

public class Factorial {

	public static void main(String[] args) {
		
		Factorial fact = new Factorial();
		var output = fact.recur(5);
		System.err.println(output);
	}
	
	public int recur(int num) {
		
		if(num<0) {
			return -1;
		}
		if(num==0) {
			return 1;
		}
		
		return num * recur(num-1);
	}

}
