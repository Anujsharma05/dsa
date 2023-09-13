package problems.leetcode.practice;

import java.util.*;

public class ArrConcat {
    public static void main(String[] args) {
        char[] c = {'h', 'e','l','l','o'};
        reverseString(c);
        System.out.println(Arrays.toString(c));
    }

    static void reverseString(char[] s) {
        int endIndex = s.length/2;
        helper(s, endIndex, 0);
    }

    static void helper(char[] s, int endIndex, int index) {
        if(index >= endIndex) return;
        int len = s.length;
        char temp = s[index];
        s[index] = s[len-index-1];
        s[len-index-1] = temp;

        helper(s, endIndex, index+1);
    }
}

