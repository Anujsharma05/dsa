package recursion.other_questions;

public class RecursiveSum {

	public static void main(String[] args) {
	
	RecursiveSum obj = new RecursiveSum();
	int output = obj.recursiveRange(10);
	System.err.println(output);
	}

	public int recursiveRange(int num) {
	    
		if(num<1) {
			return 0;
		}
		
		return num + recursiveRange(num -1 );
	} 
}
