package problems.leetcode.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
 */
public class CellsOddValueMatrix {
    public static void main(String[] args) {
        int[][] indices = {
                {0,1},
                {1,1}
        };
        int m=2,n=3;

        int oddCells = oddCellsBest(m,n,indices);
        System.out.println(oddCells);
    }

    /**
     * O(m + n) space and time
     */
    public static int oddCellsBest(int m, int n, int[][] indices) {

        int[][] matrix = new int[m][n];

        boolean[] rows = new boolean[m];
        boolean[] cols = new boolean[n];

        int oddCells = 0;

        for(int i=0; i<indices.length; i++) {
            int row = indices[i][0];
            int col = indices[i][1];

            rows[row] = !rows[row];
            cols[col] = !cols[col];
        }

        int oddRows=0, evenRows=0;
        int oddCols=0, evenCols=0;

        for(int i=0; i<rows.length; i++) {
            if(rows[i] == true) {
                oddRows++;
            } else {
                evenRows++;
            }
        }

        for(int i=0; i<cols.length; i++) {
            if(cols[i] == true) {
                oddCols++;
            } else {
                evenCols++;
            }
        }

        return oddRows * evenCols + evenRows * oddCols;
    }

    /**
     * O(m + n) space
     * O(m * n) time
     */
    public static int oddCellsBetter(int m, int n, int[][] indices) {
        int count = 0;
        int row[] = new int [m];
        int col[] = new int [n];
        for(int x[] : indices)
        {
            row[x[0]]++;
            col[x[1]]++;
        }
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
            {
                if((row[i]+col[j])%2!=0)
                    count++;
            }
        return count;
    }

    /**
     * O(m * n) space and time
     */
    public static int oddCellsMySolution(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];

        int oddCells = 0;

        for(int i=0; i<indices.length; i++) {
            int row = indices[i][0];
            int col = indices[i][1];

            for(int c=0; c<n; c++) {
                matrix[row][c]++;
            }

            for(int r=0; r<m; r++) {
                matrix[r][col]++;
            }
        }

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(matrix[i][j] % 2 != 0) {
                    oddCells++;
                }
            }
        }

        return oddCells;
    }
}
