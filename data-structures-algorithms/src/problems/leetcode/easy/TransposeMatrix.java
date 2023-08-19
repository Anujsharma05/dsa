package problems.leetcode.easy;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3}};
        int transposed[][] = transpose(matrix);
        System.out.println(Arrays.deepToString(transposed));
    }

    public static int[][] transpose(int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;

        int[][] transpose = new int[col][row];
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    /**
     * Only square matrix
     * space complexity => O(1)
     */

    public static void transposeSquareMatrix(int[][] matrix) {

        int rowLen = matrix.length;
        int colLen = matrix[0].length;

        for(int i=0; i<rowLen; i++) {
            for(int j=0; j<i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        System.out.println(Arrays.deepToString(matrix));

    }
}
