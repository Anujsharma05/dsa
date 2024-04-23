package recursion.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/find-the-winner-of-the-circular-game/
 */
public class WinnerCircularGame {
    public static void main(String[] args) {
        int n = 450;
        int k = 9;
        WinnerCircularGame obj = new WinnerCircularGame();
        int winner = obj.findTheWinner(n, k);
        System.out.println(winner);
    }

    public int findTheWinner(int n, int k) {
        boolean[] out = new boolean[n+1];
        int start = 1;
        int ans =  game(n, k, out, start);
        System.out.println(Arrays.toString(out));
        return ans;
    }

    public int game(int n, int k, boolean[] out, int start) {
        if(n == 1) {
            return winner(out);
        }
        int playerOut = playerOut(out, k, start);
        int nextTurn = turn(out,k, playerOut+1);
        return game(n-1, k, out, nextTurn);
    }

    public int playerOut(boolean[] out, int k, int start) {
        if(start == out.length) {
            start = 1;
        }
        if(out[start]) {
            return playerOut(out, k, start+1);
        }
        if(k == 1) {
            out[start] = true;
            return start;
        }
       return playerOut(out, k-1, start + 1);
    }
    public int turn(boolean[] out, int k, int start) {
        if(start == out.length) {
            start = 1;
        }

        if(out[start]) {
            return turn(out, k, start+1);
        } else {
            return start;
        }
    }

    public int winner(boolean[] out) {
        for(int i=1; i<out.length; i++) {
            if(!out[i]) {
                return i;
            }
        }
        return -1;
    }
}
