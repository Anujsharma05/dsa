package problems.leetcode.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/plus-one/
 */
public class PlusOne {
    public static void main(String[] args) {
        int[] digit = {9};
        int[] output = plusOne(digit);
        System.out.println(Arrays.toString(output));
    }

    public static int[] plusOne(int[] digits) {

        int len = digits.length;
        int k = 1;
        for(int i=len-1; i>=0; i--) {
            int num = (digits[i] + k) % 10;
            k = (digits[i] + k)/10;
            digits[i] = num;
        }

        if(k > 0) {
            int[] result = new int[len+1];
            result[0] = k;
            return result;
        }

        return digits;
    }
}
