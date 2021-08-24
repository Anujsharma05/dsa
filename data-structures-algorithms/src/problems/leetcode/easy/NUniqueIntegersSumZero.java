package problems.leetcode.easy;

import java.util.Arrays;

public class NUniqueIntegersSumZero {
    public static void main(String[] args) {
        int n = 9;
        int[] sum = sumZero(n);
        System.out.println(Arrays.toString(sum));
    }
    public static int[] sumZero(int n) {

        int[] res = new int[n];

        if(n%2 == 0) {
            for(int i=0; i<n/2; i++) {
                res[i] = i+1;
                res[i+n/2] = -(i+1);
            }
        } else {
            for(int i=0; i<n/2; i++) {
                res[i] = i+1;
                res[i+1+n/2] = -(i+1);
            }
        }
        return res;
    }
}
