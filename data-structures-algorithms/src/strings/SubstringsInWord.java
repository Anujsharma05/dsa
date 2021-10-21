package strings;

//https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/
public class SubstringsInWord {
    public static void main(String[] args) {
        String[] patterns = {"a","b","c"};
        String word = "aaaaabbbbb";

        int number = numOfStrings(patterns, word);
        System.out.println(number);
    }

    public static int numOfStrings(String[] patterns, String word) {

        int count = 0;
        for(String s: patterns) {
            if(word.indexOf(s) >= 0) {
                count ++;
            }
        }

        return count;
    }
}
