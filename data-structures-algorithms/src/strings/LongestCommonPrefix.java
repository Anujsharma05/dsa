package strings;

import java.util.Arrays;

//https://leetcode.com/problems/longest-common-prefix/
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
//        String output = longestCommonPrefix(strs);
//        System.out.println(output);

        longestCommonPrefixSorted(strs);
    }

//    O(MxN)
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length < 1 || strs == null) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        //find the shortest String
        int shortest = 0;
        int len = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            int curLen = strs[i].length();
            if (curLen < len) {
                len = curLen;
                shortest = i;
            }
        }
        //find the longest common prefix
        String sub = strs[shortest];
        for (int i = 0; i < strs.length; i++) {
            while (strs[i].indexOf(sub) != 0) {
                sub = sub.substring(0, sub.length()-1);
            }
        }
        return sub;
    }

//    O(MxN)
    public static String alongestCommonPrefix(String[] strs) {

        int minLength = Integer.MAX_VALUE;
        for(String str: strs) {
            if(str.length() < minLength) {
                minLength = str.length();
            }
        }
        int index=0;
        boolean allEqual = true;
        StringBuilder sb = new StringBuilder();
        while(index < minLength) {
            for(int i=0; i<strs.length-1; i++) {
                if(strs[i].charAt(index) != strs[i+1].charAt(index)) {
                    allEqual = false;
                    break;
                }
            }
            if(allEqual) {
                sb.append(strs[0].charAt(index));
            } else {
                return sb.toString();
            }
            index++;
        }

        return sb.toString();
    }

//    O(nlogn)
    public static void longestCommonPrefixSorted(String[] strs) {

        Arrays.sort(strs);

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<strs[0].length(); i++) {
            if(strs[0].charAt(i) == strs[strs.length-1].charAt(i)) {
                sb.append(strs[0].charAt(i));
                continue;
            }
            break;
        }

        System.out.println(sb.toString());
    }

}
