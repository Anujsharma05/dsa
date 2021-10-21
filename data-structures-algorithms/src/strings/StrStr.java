package strings;

//https://leetcode.com/problems/implement-strstr/
public class StrStr {
    public static void main(String[] args) {
        String haystack = "mississippi", needle = "issipi";
        int index = strStr(haystack, needle);
        System.out.println(index);
    }

    //brute force
    //simpler way than my implementation
    public static int strStr(String haystack, String needle) {
        return -1;
    }

    //brute force but there is a simple way to right the same solution
//    public static int strStr(String haystack, String needle) {
//
//        if(needle.length() == 0) return 0;
//        if(haystack.length() < needle.length()) return -1;
//
//        int startIndex = -1;
//        int index = 0;
//        for(int i=0; i<haystack.length(); i++) {
//            if(needle.charAt(0) == haystack.charAt(i)) {
//                int start = i;
//                startIndex = i;
//                while(index < needle.length() && start < haystack.length()) {
//                    if(needle.charAt(index) == haystack.charAt(start)) {
//                        index++;
//                        start++;
//                    } else {
//                        startIndex = -1;
//                        break;
//                    }
//                }
//
//                if(index == needle.length()) {
//                    return startIndex;
//                } else {
//                    index = 0;
//                    startIndex = -1;
//                }
//            }
//        }
//        return startIndex;
//    }
}
