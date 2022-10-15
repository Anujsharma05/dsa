package strings;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean isPalin = isPalindrome(s);
        System.out.println(isPalin);
    }

    //better solution two pointers
    public static boolean isPalindromeBetter(String s) {
        int start = 0;
        int end = s.length()-1;

        while(start < end) {
            if(start<end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }
            if(start<end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }
            if(s.charAt(start) != s.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }
        return true;
    }

    //my solution
    public static boolean isPalindrome(String s) {
//        String actual = s.replaceAll("[^A-Za-z0-9]", "!").toLowerCase();
        StringBuilder sb = new StringBuilder();
        optimizeString(s, sb);
        int len = sb.length();
        for(int i=0; i<len/2; i++) {
            if(sb.charAt(i) != sb.charAt(len-i-1)) {
                return false;
            }
        }
        return true;
    }

    static void optimizeString(String s, StringBuilder sb) {
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            int charIntVal = (int) ch;

            boolean isNumber = charIntVal >= 48 && charIntVal <= 57;
            boolean isLower = charIntVal >= 97 && charIntVal <= 122;
            boolean isUpper = charIntVal >=65 && charIntVal <= 90;
            if(isNumber || isLower) {
                sb.append(ch);
            } else if(isUpper) {
                sb.append((char)(ch+32));
            }
        }
    }
}
