package recursion.revision;

public class Palindrome {
    public static void main(String[] args) {
        String input = " a ";
        boolean ans = isPalindrome(input, 0, input.length()-1);
        System.out.println(ans);
    }
    static boolean isPalindrome(String input, int i, int j) {
        if(i>j) return true;
        if(input.charAt(i) == input.charAt(j)) {
            return isPalindrome(input, i+1, j-1);
        }
        return false;
    }
}
