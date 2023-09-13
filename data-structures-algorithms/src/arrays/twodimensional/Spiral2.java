package arrays.twodimensional;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/spiral-matrix-ii/
 */
public class Spiral2 {
    public static void main(String[] args) {
        int n = 4;
        int[][] matrix = generateMatrix(n);
        System.out.println(Arrays.deepToString(matrix));
    }
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int counter = 1;

        int left=0;
        int top=0;
        int bottom=n-1;
        int right = n-1;

        int dir = 0;

        while(left <= right && top <= bottom) {

            if(dir == 0) {
                for(int i=left; i<=right; i++) {
                    matrix[top][i] = counter++;
                }
                top++;
            } else if(dir == 1) {
                for(int i=top; i<=bottom; i++) {
                    matrix[i][right] = counter++;
                }
                right--;
            } else if(dir == 2) {
                for(int i=right; i>=left; i--) {
                    matrix[bottom][i] = counter++;
                }
                bottom--;
            } else if(dir == 3) {
                for(int i=bottom; i>=top; i--) {
                    matrix[i][left] = counter++;
                }
                left++;
            }

            dir = (dir + 1)%4;
        }

        return matrix;
    }
}
