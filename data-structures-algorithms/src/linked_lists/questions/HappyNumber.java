package linked_lists.questions;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/happy-number/description/
 */
public class HappyNumber {
    public static void main(String[] args) {
        int num = 21;
        boolean isHappy = isHappy(num);
        System.out.println(isHappy);
    }

    /**
     * slow and fast pointer approach
     */
    public static boolean isHappy(int n) {
        int slow=n,fast=n;
        do {
            slow = sumOfSqOfDigits(slow);
            fast = sumOfSqOfDigits(sumOfSqOfDigits(fast));
        } while(slow != fast);
        if(slow == 1) return true;
        return false;
    }

    /**
     * Brute force
     */
    public static boolean isHappyBruteForce(int n) {
        int sum = 0;

        Set<Integer> set = new HashSet<>();
        set.add(n);
        while (sum != 1) {
            sum = sumOfSqOfDigits(n);
            if (sum == 1) {
                return true;
            }
            if (!set.add(sum)) return false;
            n = sum;
        }
        return false;
    }

    static int sumOfSqOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            n = n / 10;
            sum = sum + lastDigit * lastDigit;
        }
        return sum;
    }
}
