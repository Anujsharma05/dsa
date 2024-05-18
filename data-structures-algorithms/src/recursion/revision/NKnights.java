package recursion.revision;

public class NKnights {
    public static void main(String[] args) {
        int n = 3;
        boolean[][] board = new boolean[n][n];
        int count = knights(board, 0, 0, n);
        System.out.println(count);
    }
    static int knights(boolean[][] board, int row, int col, int knights) {

        if(knights == 0) {
            printBoard(board);
            System.out.println();
            return 1;
        }

        if (row == board.length - 1 && col == board.length) {
            return 0;
        }

        //go to next row
        if(col==board.length) {
            return knights(board, row+1, 0, knights);
        }

        int count = 0;

        if(isValid(board,row, col)) {
            board[row][col] = true;
            count += knights(board, row, col+1, knights-1);
            board[row][col] = false;
        }

        return count + knights(board, row, col+1, knights);
    }
    static boolean isValid(boolean[][] board, int row, int col) {

        int len = board.length;

        if(row-1>=0 && col-2>=0 && board[row-1][col-2]) return false;

        if(row-1>=0 && col+2<len && board[row-1][col+2]) return false;

        if(row-2>=0 && col-1>=0 && board[row-2][col-1]) return false;

        if(row-2>=0 && col+1<len && board[row-2][col+1]) return false;

        return true;
    }
    static void printBoard(boolean[][] board) {
        for(boolean[] rows: board) {
            for(boolean col: rows) {
                if(col) {
                    System.out.print("K ");
                } else {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }
}

