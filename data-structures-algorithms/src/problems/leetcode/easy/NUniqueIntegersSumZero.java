package problems.leetcode.easy;

import java.util.Arrays;

public class NUniqueIntegersSumZero {
    public static void main(String[] args) {
        int n = 9;
        int[] sum = sumZero(n);
        System.out.println(Arrays.toString(sum));
    }
    public static int[] sumZero(int n) {

        int[] result = new int[n];

        int start = 1;
        for(int i=0; i<n/2; i++) {
            result[i] = start;
            result[n-i-1] = -start;
            start++;
        }

        return result;
    }
}
