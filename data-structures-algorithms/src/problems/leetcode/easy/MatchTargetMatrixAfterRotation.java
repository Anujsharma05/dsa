package problems.leetcode.easy;

import java.util.Arrays;

public class MatchTargetMatrixAfterRotation {

	public static void main(String[] args) {
		
		int[][] matrix = { {0,1},{1,0}};
		
		int[][] target = {{1,0}, {0,1}};
		
		MatchTargetMatrixAfterRotation obj = new MatchTargetMatrixAfterRotation();
		
		boolean matchFound = obj.findRotation(matrix, target);
		System.out.println(matchFound);

	}

	public boolean findRotation(int[][] mat, int[][] target) {
        
		boolean initialCheck = matchTwoMatrix(mat, target);
		
		if(initialCheck) {
			return true;
		} else {
			int totalRotations = 3;
			return checkMatchAfterRotation(mat, target, totalRotations);
		}
    }
	
	private boolean checkMatchAfterRotation(int[][] mat, int[][] target, int totalRotations) {
		
		if(totalRotations == 0) return false;
		
		rotateMatrix(mat);
		
		if(matchTwoMatrix(mat, target)) {
			return true;
		} else {
			return checkMatchAfterRotation(mat, target, totalRotations - 1);
		}
	}

	public void rotateMatrix(int[][] mat) {
		int length = mat.length;
		for(int i=0; i<length; i++) {
			for(int j=0; j<i; j++) {
				int temp = mat[i][j];
				mat[i][j] = mat[j][i];
				mat[j][i] = temp;
			}
		}
		
		for(int i=0; i<length; i++) {
			for(int j=0; j<length/2; j++) {
				int temp = mat[i][j];
				mat[i][j] = mat[i][length-j-1];
				mat[i][length-j-1] = temp;
			}
		}
	}
	
	public boolean matchTwoMatrix(int[][] mat, int[][] target) {
		
		if(mat.length != target.length) return false;
		
		int length = mat.length;
		
		for(int i=0; i<length; i++) {
			for(int j=0; j<length; j++) {
				if(mat[i][j] != target[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}
