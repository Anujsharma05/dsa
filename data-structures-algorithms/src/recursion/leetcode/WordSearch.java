package recursion.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class WordSearch {
    public static void main(String[] args) {
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };

        String word = "ABCCED";
        exist(board, word);
    }
    static boolean exist(char[][] board, String word) {
        boolean[][] path = new boolean[board.length][board[0].length];
        ArrayList<String> list = search(board, path, "", word, 0, 0);
        System.out.println(list);
        return false;
    }

    static ArrayList<String> search(char[][] board, boolean[][] path, String p, String word, int row, int col) {

        if(path[row][col]) {
            return new ArrayList<>();
        }
        if(p.length() == word.length()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

       if(p.length() + board[row][col] < word.length()) {
           path[row][col] = true;

           if(row+1 < board.length) {
               //down
               list.addAll(search(board, path, p+board[row][col], word, row+1, col));
           }
           if(col+1 < board[0].length) {
               //right
               list.addAll(search(board, path, p+board[row][col], word, row, col+1));
           }
           if(row-1 >= 0) {
               //up
               list.addAll(search(board, path, p+board[row][col], word, row-1, col));
           }
           if(col-1 >= 0) {
               //left
               list.addAll(search(board, path, p+board[row][col], word, row, col-1));
           }
           path[row][col] = false;
       }

        return list;
    }
}
