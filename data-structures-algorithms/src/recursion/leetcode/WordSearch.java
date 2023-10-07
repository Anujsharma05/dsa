package recursion.leetcode;

/**
 * https://leetcode.com/problems/word-search/
 */
class WordSearch {
    public static void main(String[] args) {

        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCCED";
        boolean exist = exist(board, word);
        System.out.println(exist);
    }

    public static boolean exist(char[][] board, String word) {
        boolean[][] path = new boolean[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                boolean exist = search(board, path, "", word, i, j, 0);
                if (exist) return true;
            }
        }
        return false;
    }

    static boolean search(char[][] board, boolean[][] path, String p, String word, int row, int col, int index) {

        if (path[row][col]) {
            return false;
        }

        if (word.charAt(index) != board[row][col]) {
            return false;
        }

        p = p + board[row][col];

        if (p.length() == word.length() && p.equals(word)) {
            return true;
        }

        path[row][col] = true;
        boolean exist = false;

        if (row + 1 < board.length) {
            //down
            exist = search(board, path, p, word, row + 1, col, index + 1);
            if (exist) return true;
        }
        if (col + 1 < board[0].length) {
            //right
            exist = search(board, path, p, word, row, col + 1, index + 1);
            if (exist) return true;
        }
        if (row - 1 >= 0) {
            //up
            exist = search(board, path, p, word, row - 1, col, index + 1);
            if (exist) return true;
        }
        if (col - 1 >= 0) {
            //left
            exist = search(board, path, p, word, row, col - 1, index + 1);
            if (exist) return true;
        }
        path[row][col] = false;

        return false;
    }
}