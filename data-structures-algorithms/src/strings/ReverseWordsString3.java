package strings;

import java.util.Arrays;

//https://leetcode.com/problems/reverse-words-in-a-string-iii/
public class ReverseWordsString3 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String rev = reverseWords(s);
        System.out.println(rev);
    }

    //efficient solution
    public static String reverseWords(String s) {
      //The basic idea is to get the first and last index of each word and reverse word with itself using first and last indexes

        int len = s.length();

        if(len == 1) return s;

        int index = 0;

        char[] chArr = s.toCharArray();

        while(index < len) {

            int start = index;

            while(index < len && chArr[index] != ' ') {
                index++;
            }

            int end = index - 1;

            while(start < end) {
                char temp = chArr[start];
                chArr[start++] = chArr[end];
                chArr[end--] = temp;
            }

            index++;
        }

        return new String(chArr);
    }

//    public static String reverseWords(String s) {
//        StringBuilder sb = new StringBuilder();
//
//        String[] sArr = s.split(" ");
//
//        for(int i=0; i<sArr.length/2; i++) {
//            String temp = sArr[i];
//            sArr[i] = sArr[sArr.length-i-1];
//            sArr[sArr.length-i-1] = temp;
//        }
//
//        for(String str: sArr) {
//            sb.append(str).append(" ");
//        }
//
//        sb.reverse();
//        return sb.substring(1, sb.length());
//    }
}
