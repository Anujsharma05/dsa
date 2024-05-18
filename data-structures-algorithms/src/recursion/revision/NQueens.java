package recursion.revision;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        int count = queens(board, 0);
        System.out.println(count);
    }
    static int queens(boolean[][] board, int row) {
        if(row == board.length) {
            printBoard(board);
            System.out.println();
            return 1;
        }

        int count = 0;
        for(int i=0; i< board.length; i++) {
            board[row][i] = true;
            if(isValid(board, row, i)) {
                count += queens(board, row+1);
            }
            board[row][i] = false;
        }
        return count;
    }
    static boolean isValid(boolean[][] board, int row, int col) {

        //vertical
        for(int i=0; i<row; i++) {
            if(board[i][col]) return false;
        }
        //left diagonal
        int i = row-1;
        int j= col-1;
        while(i>=0 && j>=0) {
            if(board[i][j]) return false;
            i = i-1;
            j = j-1;
        }
        //right diagonal
        i = row-1;
        j = col+1;
        while(i>=0 && j<board.length) {
            if(board[i][j]) return false;
            i=i-1;
            j=j+1;
        }

        return true;
    }
    static void printBoard(boolean[][] board) {
        for(boolean[] rows: board) {
            for(boolean col: rows) {
                if(col) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
