package recursion.other_questions;

import java.util.Arrays;

public class SomeRecursive {

	public static void main(String[] args) {
		
		int arr[] = {2,6,4};
		
		boolean output = someRecursive(arr, new OddFunction());
		System.err.println(output);
	}

	public static boolean someRecursive(int[] arr, OddFunction odd) {
		
		if(arr.length<1) {
			return false;
		}
		
		if(odd.run(arr[0])) {
			return true;
		}
		
		return someRecursive(Arrays.copyOfRange(arr, 1, arr.length), odd);
    }
}

class OddFunction {
    boolean run(int num) {
        if (num % 2 == 0) { 
            return false; }
       else {
           return true;
       }
   }
}