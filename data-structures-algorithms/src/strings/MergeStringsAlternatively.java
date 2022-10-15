package strings;

//https://leetcode.com/problems/merge-strings-alternately/
public class MergeStringsAlternatively {
    public static void main(String[] args) {
        String word1 = "abcd", word2 = "p";
        String merged = mergeAlternately(word1, word2);
        System.out.println(merged);
    }
    public static String mergeAlternately(String word1, String word2) {
        int smallWord = word1.length() <= word2.length() ? 1 : 2;
        int len = smallWord == 1 ? word1.length() : word2.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<len; i++) {
            sb.append(word1.charAt(i)).append(word2.charAt(i));
        }

        if(smallWord==1) {
            for(int i=len; i<word2.length(); i++) {
                sb.append(word2.charAt(i));
            }
        } else {
            for(int i=len; i<word1.length(); i++) {
                sb.append(word1.charAt(i));
            }
        }
        return sb.toString();
    }
}
