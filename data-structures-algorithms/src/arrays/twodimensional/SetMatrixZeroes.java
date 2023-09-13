package arrays.twodimensional;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/set-matrix-zeroes/
 */
public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix = {
                {0,1,2,0},
                {3,4,0,2},
                {1,3,1,5}
        };

        setZeroOptimal(matrix);
    }

    /**
     * O(m * n) time
     * O(1) space
     * @param matrix
     */
    public static void setZeroOptimal(int[][]  matrix) {
        int rowLen = matrix.length;
        int colLen = matrix[0].length;

        boolean row0 = false, col0 = false;

        for(int i=0; i<rowLen; i++) {
            if(matrix[i][0] == 0) {
                row0 = true;
                break;
            }
        }

        for(int j=0; j<colLen; j++) {
            if(matrix[0][j] == 0) {
                col0 = true;
                break;
            }
        }

        /**
         * Marking boundaries with 0 to fill zeroes later
         */
        for(int i=1; i<rowLen; i++) {
            for(int j=1; j<colLen; j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        /**
         * Marking zeroes based on boundary elements
         */
        for(int i=1; i<rowLen; i++) {
            for(int j=1; j<colLen; j++) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                   matrix[i][j] = 0;
                }
            }
        }

        /**
         * Setting 0th row all zero if true
         */
        if(row0) {
            for(int i=0; i<rowLen; i++) {
                matrix[i][0] = 0;
            }
        }

        /**
         * Setting 0th col all zero if true
         */
        if(col0) {
            for(int j=0; j<colLen; j++) {
                matrix[0][j] = 0;
            }
        }

        System.out.println(Arrays.deepToString(matrix));

    }

    /**
     * O(m * n) time
     * O(m + n) space
     * @param matrix
     */
    public static void setZeroBetter(int[][]  matrix) {

        int rowLen = matrix.length;
        int colLen = matrix[0].length;

        int[] rowArr = new int[rowLen];
        int[] colArr = new int[colLen];

        for(int i=0; i<rowLen; i++) {
            for(int j=0; j<colLen; j++) {
                if(matrix[i][j] == 0) {
                    rowArr[i] = Integer.MIN_VALUE;
                    colArr[j] = Integer.MIN_VALUE;
                }
            }
        }

        for(int i=0; i<rowLen; i++) {
            for(int j=0; j<colLen; j++) {
                if(rowArr[i] == Integer.MIN_VALUE || colArr[j] == Integer.MIN_VALUE) {
                   matrix[i][j] = 0;
                }
            }
        }

        System.out.println(Arrays.deepToString(matrix));
    }

    /**
     * Brute force
     * O(m * n * (m + n)) time
     * O(1) space
     * @param matrix
     */
    public static void setZeroes(int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;

        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if(matrix[i][j] == 0) {
                    setRowColZero(matrix,i, j);
                }
            }
        }

        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if(matrix[i][j] == Integer.MAX_VALUE) {
                    matrix[i][j] = 0;
                }
            }
        }

//        System.out.println(Arrays.deepToString(matrix));
    }

    static void setRowColZero(int[][] res, int rowIndex, int colIndex) {

        int row = res.length;
        int col = res[0].length;

        for(int i=0; i<row; i++) {
            if(res[i][colIndex] != 0) {
                res[i][colIndex] = Integer.MAX_VALUE;
            }
        }

        for(int i=0; i<col; i++) {
            if(res[rowIndex][i] != 0) {
                res[rowIndex][i] = Integer.MAX_VALUE;
            }
        }
    }
}
