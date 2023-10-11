package recursion.leetcode;

import java.util.LinkedList;

/**
 * https://leetcode.com/problems/perfect-squares/
 */
public class PerfectSquares {

    /**
     * Size taken as per given constraint input size
     * 1 <= n <= 10^4
     */
    int[] memoize = new int[10001];

    {
        for(int i = 0; i< memoize.length; i++) {
            memoize[i] = -1;
        }
    }
    public static void main(String[] args) {
        PerfectSquares obj = new PerfectSquares();
        int n = 50;
        int ans = obj.numSquares(n);
        System.out.println(ans);
    }

    /**
     * From youtube - CodestorywithMIK
     */
    public int numSquares(int n) {
        return helper(n);
    }

    public int helper(int n) {

        if(n == 0) {
            return 0;
        }

        if(memoize[n] != -1) {
            return memoize[n];
        }
        int minCount = Integer.MAX_VALUE;

        for(int i=1; i*i<=n; i++) {
            int count = 1 + helper(n-(i*i));
            minCount = Math.min(minCount, count);
        }

        memoize[n] = minCount;
        return minCount;
    }
    public int numSquaresMine(int n) {
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=1; i*i<=n; i++) {
            if(i*i == n) {
                return 1;
            }
            list.add(0, i*i);
//            list.add(i*i);
        }
        System.out.println(list);
        rec(n, list, 0);
        return minCount;
    }

    public int minCount = Integer.MAX_VALUE;
    public void rec(int n, LinkedList<Integer> list, int count) {

        if(n == 0) {
            if(count < minCount) {
                minCount = count;
                System.out.println(count);
            }
            return;
        }

        for(Integer i: list) {
            if(n-i >= 0) {
                rec(n-i, list, count+1);
            }
        }
    }
    public int numSquares1(int n) {

        int count = 0;
        int remainder = 0;
        int leastCount = Integer.MAX_VALUE;
        for(int i=1; i*i<=n; i++) {
            int q = n/(i*i);
            remainder = n % (i * i);

           count = q + ps(remainder, 0);

           if(count < leastCount) {
               leastCount = count;
           }
        }

        return leastCount;
    }

    /**
     * Greedy approach: finding largest perfect square and subtracting
     * from n
     */
    public int ps(int n, int count) {

        if(n == 0) {
            return count;
        }

        int closestPs = closestPerfectSquare(n);
        return ps(n-closestPs, count+1);

    }
    public int closestPerfectSquare(int n) {

        long low = 1;
        long high = n;

        long ans = 0;
        while(low <= high) {
            long mid = low + (high-low)/2;

            long val = mid * mid;
            if(val > n) {
                high = mid - 1;
            } else if(val < n) {
                if(val > ans) {
                    ans = mid;
                }
                low = mid + 1;
            } else {
                ans = mid;
                break;
            }
        }

        return (int) (ans * ans);
    }
}
