package problems.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {

	public static void main(String[] args) {

		int numRows = 4;
		List<List<Integer>> list = generate(numRows);

		for (List<Integer> rows : list) {
			for (Integer row : rows) {
				System.out.print(row + " ");
			}
			System.out.println();
		}
	}
//	public static List<List<Integer>> generate(int numRows) {
//        
//		List<List<Integer>> wrapper = new ArrayList<>();
//		
//		if(numRows <= 0) return wrapper;
//		
//		List<Integer> list = null;
//		for(int i=0; i<=numRows; i++) {
//			list = new ArrayList<>();
//			
//			if(i==0) {
//				list.add(1);
//			} else {
//				list.add(1);
//				List<Integer> prevRow = wrapper.get(i-1);
//				for(int j=1; j<prevRow.size(); j++) {
//					int val = prevRow.get(j-1) + prevRow.get(j);
//					list.add(val);
//				}
//				list.add(1);
//			}
//			wrapper.add(list);
//		}
//		return wrapper;
//    }

	public static List<List<Integer>> generate(int numRows) {

		List<List<Integer>> wrapper = new ArrayList<>();

		if (numRows <= 0)
			return wrapper;
		
		return generateTriangle(wrapper, numRows-1);
	}
	//recursive
	private static List<List<Integer>> generateTriangle(List<List<Integer>> wrapper, int numRows) {
		
		List<Integer> list = null;
		
			list = new ArrayList<>();
			
			if(numRows==0) {
				list.add(1);
			} else {
				list.add(1);
				generateTriangle(wrapper, numRows-1);
				List<Integer> prevRow = wrapper.get(numRows-1);
				
				for(int j=1; j<prevRow.size(); j++) {
					int val = prevRow.get(j-1) + prevRow.get(j);
					list.add(val);
				}
				list.add(1);
			}
			wrapper.add(list);
		
		return wrapper;
	}
}
