package problems.leetcode.easy;

//https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
public class StringArraysEquivalent {
    public static void main(String[] args) {
        String[] word1 = {"ab", "cd", "ef", "g"}, word2 = {"abcdefg"};
        boolean areEqual = arrayStringsAreEqual1(word1, word2);
        System.out.println(areEqual);
    }

    //my solution
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        for (String s : word1) {
            sb1.append(s);
        }

        StringBuilder sb2 = new StringBuilder();
        for (String s : word2) {
            sb2.append(s);
        }
        return sb1.toString().equals(sb2.toString());
    }

    //better solution
    public static boolean arrayStringsAreEqual1(String[] word1, String[] word2) {

        int idx1 = 0, idx2 = 0;
        int i = 0, j = 0;
        while (idx1 < word1.length && idx2 < word2.length) {

            if (word1[idx1].charAt(i++) != word2[idx2].charAt(j++)) return false;

            if (i == word1[idx1].length()) {
                idx1++;
                i = 0;
            }
            if (j == word2[idx2].length()) {
                idx2++;
                j = 0;
            }
        }

        return idx1 == word1.length && idx2 == word2.length;
    }
}
