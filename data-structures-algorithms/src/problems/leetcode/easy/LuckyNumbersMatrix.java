package problems.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/lucky-numbers-in-a-matrix/description/
public class LuckyNumbersMatrix {

	public static void main(String[] args) {
		int[][] matrix = {{7,8},{1,2}};
		LuckyNumbersMatrix obj = new LuckyNumbersMatrix();
		List<Integer> list = obj.luckyNumbers(matrix);
		for(Integer i: list) {
			System.out.println(i + " ");
		}
	}
	
	public List<Integer> luckyNumbers (int[][] matrix) {
        
		List<Integer> list = new ArrayList<>();
		int cols = matrix[0].length;
		for(int j=0; j<matrix[0].length; j++) {
			int colMax = Integer.MIN_VALUE;
			int maxRowIndex=0;
			for(int i=0; i<matrix.length; i++) {
				if(matrix[i][j] > colMax) {
					colMax = matrix[i][j];
					maxRowIndex = i;
				}
			}
			
			boolean isLucky = checkForMaxInColumn(matrix, maxRowIndex, colMax);
			
			if(isLucky) {
				list.add(colMax);
			}
		}
		
		return list;
    }

	private boolean checkForMaxInColumn(int[][] matrix, int maxRowIndex, int colMax) {
		int rowMin = Integer.MAX_VALUE;
		for(int i=0; i<matrix[maxRowIndex].length; i++) {
			if(matrix[maxRowIndex][i] < rowMin) {
				rowMin = matrix[maxRowIndex][i];
			}
		}
		
		return colMax == rowMin;
	}

}
