package recursion.revision;

import java.util.Arrays;

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

        int len = board.length;
        boolean emptyFound = false;
        int row=-1;
        int col=-1;
        for(int i=0; i<len; i++) {
            for(int j=0; j<len; j++) {
                if(board[i][j] == 0) {
                    emptyFound = true;
                    row = i;
                    col = j;
                }
            }
            if(emptyFound) {
                break;
            }
        }

        //sudoku filled completely
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
    static boolean isSafe(int[][] board, int row, int col, int i) {
        //check horizontal
        for(int x=0; x<board.length; x++) {
            if(board[row][x] == i) return false;
        }
        //check vertical
        for(int x=0; x<board.length; x++) {
            if(board[x][col] == i) return false;
        }
        //check in one of the nine small boxes
        int rowStart = row - row%3;
        int colStart = col - col%3;
        for(int r=rowStart; r<rowStart+3; r++) {
            for(int c=colStart; c<colStart+3; c++) {
                if(board[r][c] == i) return false;
            }
        }

        return true;
    }
    static void printBoard(int[][] board) {
        for(int rows[]: board) {
            System.out.println(Arrays.toString(rows));
        }
        System.out.println();
    }
}
