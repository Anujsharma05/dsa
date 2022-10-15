package strings;

//https://leetcode.com/problems/valid-palindrome-ii/
public class ValidPalindromeII {
    public static void main(String[] args) {
        String s = "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga";
        boolean isValid = validPalindrome(s);
        System.out.println(isValid);
    }
    public static boolean validPalindrome(String s) {
        if(s.length() < 3) return true;
        boolean charRemoved = false;
        int start=0, end=s.length()-1;
        boolean isPallindrome = true;

        while(start<end) {
            if(s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else if(s.charAt(start+1) == s.charAt(end) && !charRemoved) {
                start+=2;
                end--;
                charRemoved = true;
            } else {
                isPallindrome = false;
                break;
            }
        }

       if(!isPallindrome) {
           charRemoved = false;
           start=0;
           end=s.length()-1;
           while(start<end) {
               if(s.charAt(start) == s.charAt(end)) {
                   start++;
                   end--;
               } else if(s.charAt(start) == s.charAt(end-1) && !charRemoved) {
                   start++;
                   end-=2;
                   charRemoved = true;
               } else {
                   return false;
               }
           }
       }
        return true;
    }
}
