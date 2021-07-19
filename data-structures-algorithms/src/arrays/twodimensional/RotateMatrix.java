package arrays.twodimensional;

import java.util.Arrays;

public class RotateMatrix {

	public static void main(String[] args) {

		int[][] matrix = { {1,2},{3,4}};

		rotateMatrix(matrix);
	}
	
	 public static void rotateMatrix(int[][] M) {
	        int n = M.length, depth = n / 2;
	        for (int i = 0; i < depth; i++) {
	            int len = n - 2 * i - 1, opp = n - 1 - i;
	            for (int j = 0; j < len; j++) {
	                int temp = M[i][i+j];
	                M[i][i+j] = M[opp-j][i];
	                M[opp-j][i] = M[opp][opp-j];
	                M[opp][opp-j] = M[i+j][opp];
	                M[i+j][opp] = temp;
	            }
	        }
	        System.err.println(Arrays.deepToString(M));
	    }

//	static void rotateMatrix(int[][] matrix) {
//
//		if(matrix==null || matrix.length < 1) {
//			return;
//		}
//		
//		int endIndex = matrix.length - 1;
//
//		for (int i = 0; i < matrix.length - 1; i++) {
//			for (int j = 0; j < matrix[i].length - 1; j++) {
//
//				if (i <= (endIndex - j) && j <= (endIndex - i)) {
//					int temp = matrix[i][j];
//					matrix[i][j] = matrix[endIndex - j][endIndex - i];
//					matrix[endIndex - j][endIndex - i] = temp;
//				}
//
//			}
//		}
//		for (int i = 0; i < matrix.length / 2; i++) {
//			for (int j = 0; j < matrix[i].length; j++) {
//				int temp = matrix[i][j];
//				matrix[i][j] = matrix[endIndex - i][j];
//				matrix[endIndex - i][j] = temp;
//			}
//		}
//		System.out.print("[");
//		for(int i=0; i<matrix.length; i++) {
//			System.out.print("[");
//			String colData = "";
//			for(int j=0; j<matrix[i].length; j++) {
//				colData = colData + matrix[i][j] + ",";
//			}
//			System.out.print(colData.substring(0, colData.length()-1));
//			System.out.print("]");
//		}
//		System.out.print("]");
//	}

//	static void rotateMatrix(int[][] matrix) {
//		int row = matrix.length;
//		int col = matrix[0].length;
//
//		int[][] transpose = new int[col][row];
//		int[][] rotate = new int[col][row];
//
//		for (int j = 0; j < row; j++) {
//			for (int i = 0; i < col; i++) {
//				transpose[i][j] = matrix[j][i];
//			}
//		}
//
//		int rowMaxIndex = transpose[0].length - 1;
//
//		for (int i = 0; i < transpose.length; i++) {
//			for (int j = 0; j < transpose[i].length; j++) {
//				rotate[i][rowMaxIndex - j] = transpose[i][j];
//			}
//		}
//		System.err.println(Arrays.deepToString(rotate));
//	}
}
