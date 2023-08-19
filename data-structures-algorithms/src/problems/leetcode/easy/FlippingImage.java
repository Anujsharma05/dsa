package problems.leetcode.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/flipping-an-image
 */
public class FlippingImage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        int[][] output = flipAndInvertImage(image);
        System.out.println(Arrays.deepToString(output));
    }

    //                XORing
    //                image[i][j] = image[i][j] ^ 1;
    public static int[][] flipAndInvertImage(int[][] image) {
        int rows = image.length;
        int cols = image[0].length;

        /**
         * Edge case
         */
        if(cols == 1) {
            image[0][0] = 1 - (image[0][0] + 1);
            return image;
        }

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols/2; j++) {
                int temp = image[i][j];
                image[i][j] = 1 - (image[i][cols-j-1] + 1);
                image[i][cols-j-1] = 1 - (temp + 1);
            }

            if(cols % 2 != 0) {
                image[i][cols/2] = 1 - (image[i][cols/2] + 1);
            }
        }

        return image;
    }
}
