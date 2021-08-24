package problems.leetcode.easy;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat = {{5}};

        int diagonalSum = diagonalSum(mat);
        System.out.println(diagonalSum);
    }
    public static int diagonalSum(int[][] mat) {

        if(mat.length == 1) return mat[0][0];

        int sum = 0;
        int index = mat.length-1;
        for(int i=0; i<mat.length; i++) {
            sum = sum + mat[i][i];
            if(i != index) {
                sum = sum + mat[i][index];
            }
            index--;
        }
        return sum;
    }
}
