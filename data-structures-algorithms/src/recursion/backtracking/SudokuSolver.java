package recursion.backtracking;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/sudoku-solver/
 */

//        {"5","3","4","6","7","8","9","1","2"},
//        {"6","7","2","1","9","5","3","4","8"},
//        {"1","9","8","3","4","2","5","6","7"},
//        {"8","5","9","7","6","1","4","2","3"},
//        {"4","2","6","8","5","3","7","9","1"},
//        {"7","1","3","9","2","4","8","5","6"},
//        {"9","6","1","5","3","7","2","8","4"},
//        {"2","8","7","4","1","9","6","3","5"},
//        {"3","4","5","2","8","6","1","7","9"}
public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = {
                {5,3,0,0,7,0,0,0,0},
                {6,0,0,1,9,5,0,0,0},
                {0,9,8,0,0,0,0,6,0},
                {8,0,0,0,6,0,0,0,3},
                {4,0,0,8,0,3,0,0,1},
                {7,0,0,0,2,0,0,0,6},
                {0,6,0,0,0,0,2,8,0},
                {0,0,0,4,1,9,0,0,5},
                {0,0,0,0,8,0,0,7,9}
        };

        solver(board);
    }
    static void solver(int[][] board) {

        boolean emptyFound = false;
        int row = -1;
        int col = -1;
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                if(board[i][j] == 0) {
                    emptyFound = true;
                    col = j;
                    break;
                }
            }
            if(emptyFound) {
                row = i;
                break;
            }
        }

        if(!emptyFound) {
            printBoard(board);
            return;
        }

        for(int i=1; i<=9; i++) {
            if(isSafe(board, row, col, i)) {
                board[row][col] = i;
                solver(board);
                board[row][col] = 0;
            }
        }

    }

    static boolean isSafe(int[][] board, int row, int col, int num) {

        //Check if num already exist in Row
        for(int i=0; i<board.length; i++) {
            if(board[row][i] == num) {
                return false;
            }
        }
        //Check if num already exist in Col
        for(int i=0; i<board.length; i++) {
            if(board[i][col] == num) {
                return false;
            }
        }

        //Check if num exist in one of the nine boxes
        int rowStart = row - row%3;
        int colStart = col - col%3;

        for(int i=rowStart; i<rowStart+3; i++) {
            for(int j=colStart; j<colStart+3; j++) {
                if(board[i][j] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    static void printBoard(int[][] board) {
        for(int[] row: board) {
            System.out.println(Arrays.toString(row));
        }
    }
}
