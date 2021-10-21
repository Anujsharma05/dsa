package strings;

import java.util.Arrays;

//https://leetcode.com/problems/to-lower-case/
public class ToLowerCase {
    public static void main(String[] args) {
       String s = "LOVELY";
       String lower = toLowerCase(s);
        System.out.println(lower);
    }
    public static String toLowerCase(String s) {
        char[] arr = s.toCharArray();

        for(int i=0; i<arr.length; i++) {
            int val = arr[i];
            if(val >= 65 && val<=90) {
                arr[i] = (char)(val + 32);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char ch : arr) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
