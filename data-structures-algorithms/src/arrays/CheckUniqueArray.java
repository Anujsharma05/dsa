package arrays;

import java.util.HashSet;
import java.util.Set;

public class CheckUniqueArray {

	public static void main(String[] args) {
		int[] intArray = {1,2,3,5,4,6};
		boolean output = isUnique(intArray);
		System.out.println(output);
	}

	public static boolean isUnique(int[] intArray) {
        
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i: intArray) {
			if(!set.add(i)) {
				return false;
			}
		}
		
		return true;
    }
}
