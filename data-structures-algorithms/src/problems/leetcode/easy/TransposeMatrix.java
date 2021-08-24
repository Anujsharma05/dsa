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
}
