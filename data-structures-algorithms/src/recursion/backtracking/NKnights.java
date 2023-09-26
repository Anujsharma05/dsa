package recursion.backtracking;

import java.util.Arrays;

public class NKnights {
    public static void main(String[] args) {

        int n = 3;
        boolean[][] board = new boolean[n][n];
        int count = knights(board, 0, 0, n);
        System.out.println(count);
    }

    static int knights(boolean[][] board, int row, int col, int knights) {

        //base condition (all n knights placed)
        if (knights == 0) {
            printBoard(board);
            System.out.println();
            return 1;
        }
        //end of board is reached
        if (row == board.length - 1 && col == board.length) {
            return 0;
        }
        //last column reached go to next row
        if (col == board.length) {
            return knights(board, row + 1, 0, knights);
        }

        int count = 0;
        if (isSafe(board, row, col)) {
            board[row][col] = true;
            count += knights(board, row, col + 1, knights - 1);
            board[row][col] = false;
        }

        return count + knights(board, row, col + 1, knights);
    }

    /**
     * Check placed knights position on the upper side of current row
     */
    static boolean isSafe(boolean[][] board, int row, int col) {

        if (validSquare(board, row - 1, col - 2) && board[row - 1][col - 2]) {
            return false;
        }
        if (validSquare(board, row - 1, col + 2) && board[row - 1][col + 2]) {
            return false;
        }
        if (validSquare(board, row - 2, col - 1) && board[row - 2][col - 1]) {
            return false;
        }
        if (validSquare(board, row - 2, col + 1) && board[row - 2][col + 1]) {
            return false;
        }

        return true;
    }

    /**
     * Check whether row, col lies within the board
     */
    static boolean validSquare(boolean[][] board, int row, int col) {
        int len = board.length;
        return row >= 0 && row < len && col >= 0 && col < len;
    }

    static void printBoard(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean col : row) {
                if (col)
                    System.out.print("K");
                else
                    System.out.print("O");
            }
            System.out.println();
        }
    }
}
