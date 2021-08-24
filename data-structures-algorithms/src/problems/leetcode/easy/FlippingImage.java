package problems.leetcode.easy;

import java.util.Arrays;

public class FlippingImage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        int[][] output = flipAndInvertImage(image);
        System.out.println(Arrays.deepToString(output));
    }

    public static int[][] flipAndInvertImage(int[][] image) {

        int rows = image.length;
        int cols = image[0].length;

        flipHorizontally(image, rows, cols);
        invertImage(image, rows, cols);

        return image;
    }

    public  static void flipHorizontally(int[][] image, int rows, int cols) {
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols/2; j++) {
                int temp = image[i][j];
                image[i][j] = image[i][cols - j - 1];
                image[i][cols - j - 1] = temp;
            }
        }
    }

    public static void invertImage(int[][] image, int rows, int cols) {
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
//                if(image[i][j] == 0) {
//                    image[i][j] = 1;
//                } else {
//                    image[i][j] = 0;
//                }

//                XORing
//                image[i][j] = image[i][j] ^ 1;

                image[i][j] = 1 - image[i][j];
            }
        }
    }
}
