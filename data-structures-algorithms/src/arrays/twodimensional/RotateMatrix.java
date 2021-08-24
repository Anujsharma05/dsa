package arrays.twodimensional;

import java.util.Arrays;

public class RotateMatrix {

	public static void main(String[] args) {

		int[][] matrix = {
				{1, 1, 0, 0},
				{0, 0, 0, 1},
				{0, 1, 0, 0},
				{1, 0, 1, 1}
		};

//		int[][] matrix = {
//				{1,2,3},
//				{4,5,6},
//				{7,8,9},
//		};

		rotateMatrix(matrix);
	}

	static void rotateMatrix(int[][] matrix) {

		if(matrix==null || matrix.length < 1) {
			return;
		}

		int rows = matrix.length;
		int cols = matrix[0].length;

		for (int i = 0; i < rows; i++) {
			for (int j = i; j < cols; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}

		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols/2; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][cols-j-1];
				matrix[i][cols-j-1] = temp;
			}
		}

		for(int i=0; i<rows; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}

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
