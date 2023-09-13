package problems.leetcode.easy;

import java.util.Arrays;

public class ReshapeMatrix {
    public static void main(String[] args) {

        int[][] mat = {{1,2,3,4}, {5,6,7,8}};
        int r = 4, c = 2;

        int[][] reshaped = matrixReshape(mat, r, c);

        System.out.println(Arrays.deepToString(reshaped));
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {

        int m = mat.length;
        int n = mat[0].length;

        if (m * n != r * c) {
            return mat;
        }

        int[][] res = new int[r][c];

        int rVal = 0, cVal = 0;

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(cVal == c) {
                    rVal++;
                    cVal = 0;
                }

                res[rVal][cVal] = mat[i][j];
                cVal++;
            }
        }

        return res;
    }

}
