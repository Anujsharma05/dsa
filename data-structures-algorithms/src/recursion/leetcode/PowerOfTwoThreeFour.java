package recursion.leetcode;

public class PowerOfTwoThreeFour {
    public static void main(String[] args) {
        int n = 15;
        boolean output = isPowerOfThree(n);
        System.out.println(output);
    }

    public static boolean isPowerOfThree(int n) {
        if (n < 1) return false;
        if(n == 1) return true;

        int rem = n % 3;
        if(rem != 0 ) return false;

        return isPowerOfThree(n/3);
    }
    public static boolean isPowerOfTwo(int n) {
        if (n < 1)
            return false;
        if (n == 1)
            return true;
        if(n % 2 != 0)
            return false;
        return isPowerOfTwo(n/2);
    }
}
