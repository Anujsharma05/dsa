package recursion.backtracking;

import java.util.Arrays;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        int possiblePositions = queens(board, 0);
        System.out.println(possiblePositions);
    }

    static int queens(boolean[][] board, int row) {

        //end of board is reached
        if(row == board.length) {
            printBoard(board);
            System.out.println();
            return 1;
        }

        int count = 0;

        //check all the possible col in that row
        for(int col=0; col<board.length; col++) {
            if(isValid(board, row, col)) {
                //place the queen
                board[row][col] = true;

                //Current row queen is place, now check next row
                count+=queens(board, row+1);

                //backtrack
                board[row][col] = false;
            }
        }
        return count;
    }

    static boolean isValid(boolean[][] board, int row, int col) {

        //check vertical boxes
        for(int i=0; i<row; i++) {
            if(board[i][col])
                return false;
        }

        //check left diagonal
        int maxLeft = Math.min(row, col);
        for(int i=1; i<=maxLeft; i++) {
            if(board[row-i][col-i])
                return false;
        }

        //check right diagonal
        int maxRight = Math.min(row, board.length-1-col);
        for(int i=1; i<=maxRight; i++) {
            if(board[row-i][col+i])
                return false;
        }
        return true;
    }

    static void printBoard(boolean[][] board) {
        for(boolean[] row: board) {
            for(boolean col: row) {
                if(col)
                    System.out.print("Q ");
                 else
                    System.out.print("X ");
            }
            System.out.println();
        }
    }
}
