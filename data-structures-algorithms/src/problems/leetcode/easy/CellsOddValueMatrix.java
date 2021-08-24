package problems.leetcode.easy;

import java.util.Arrays;

public class CellsOddValueMatrix {
    public static void main(String[] args) {
        int m = 2, n = 3;
        int[][] indices = {{0, 1},{1,1}};

        int output = oddCells(m, n, indices);
        System.out.println(output);
    }

    public static int oddCellss(int m, int n, int[][] indices) {

        int[][] matrix = new int[m][n];

        for(int i=0; i<indices.length; i++) {
            int row = indices[i][0];
            int col = indices[i][1];
            incrementRowCol(matrix, row, col);
        }
        return countOdd(matrix);
    }

    private static void incrementRowCol(int[][] matrix, int row, int col) {

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                if(i == row) {
                    matrix[i][j]++;
                }
                if(j == col) {
                    matrix[i][j]++;
                }
            }
        }
    }

    private static int countOdd(int[][] matrix) {
        int count = 0;
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                if(matrix[i][j] % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int oddCells(int n, int m, int[][] indices) {
        boolean[] row =new boolean[n];
        boolean[] col=new boolean[m];

        //------- calculating is the index count is even or odd-----
        for(int i=0;i<indices.length;i++){
            int a=indices[i][0];
            int b=indices[i][1];
            row[a]=!row[a];
            col[b]=!col[b];
        }

        int rowEven=0;
        int colEven=0;
        int rowOdd=0;
        int colOdd=0;
        System.out.println(Arrays.toString(row));
        System.out.println(Arrays.toString(col));
        //-----counting number of odds and evens in a row----
        for(int i=0;i<n;i++){
            if(row[i]==true)
                rowOdd++;
            else
                rowEven++;
        }

        //-----counting number of odds and evens in a coloumn----
        for(int j=0;j<m;j++){
            if(col[j]==true)
                colOdd++;
            else
                colEven++;
        }

        //----all the combinations which generate odd number-----
        return rowEven*colOdd+rowOdd*colEven;
    }
}
