package recursion.leetcode;

import problems.leetcode.easy.MatchTargetMatrixAfterRotation;

/**
 * Binary exponentiation => 2^8 => (2^2)^4
 */
public class PowXN {
    public static void main(String[] args) {
        double x = 2;
        int n = 3;
        double ans = myPow(x, n);
        System.out.println(ans);
    }

    /**
     * Solution from leetcode
     * Avoids stackoverflow
     *
     * Time Complexity => O(log n)
     */
    static double myPow(double x, int n) {
        return solve(x, n);
    }
    static double solve(double x, long n) {
        if(n == 0) {
            return 1;
        }
        if(x == 0 || x == 1 || n == 1) {
            return x;
        }
        if(n < 0) {
            return solve(1/x,-n);
        }
        return n % 2 == 0 ? solve(x * x, n/2) : x * solve(x * x, (n-1)/2);
    }

    /**
     * My solution
     * Stackoverflow for a large n
     *
     * Time Complexity => O(n)
     */
    static double myPow1(double x, int n) {
        if(x == 0) return 0;
      return pow(x, Math.abs(n), 1, n);
    }
    static double pow(double x, int absN, double p, int originalN) {
        if(absN == 0) {
            if(originalN < 0) {
                return 1/p;
            }
            return p;
        }
       return pow(x, absN-1, p * x, originalN);
    }
}
