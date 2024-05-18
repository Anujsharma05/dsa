package recursion.other_questions;

/**
 * https://practice.geeksforgeeks.org/problems/n-digit-numbers-with-digits-in-increasing-order5903/1
 */
public class NDigitWithIncreasingDigit {
    public static void main(String[] args) {
        int n = 3;
        fun(n, "");
    }
    static void fun(int n, String p) {
        if(n == 0) {
            System.out.println(p);
            return;
        }

        if(n == 1 && p.isEmpty()) System.out.println("0");

        int lastDigit;
        if(p.isEmpty()) {
            lastDigit = 0;
        } else {
            lastDigit = Integer.valueOf(p.charAt(p.length()-1)) - '0';
        }

        for(int i=1; i<=9; i++) {
            if(i>lastDigit) {
                fun(n-1, p + i);
            }
        }
    }
}
