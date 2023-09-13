package recursion.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class LetterCombinationPhoneNumber {
    public static void main(String[] args) {
        String num = "84";
        List<String> ans = combination("", num);
        int ansCount = combinationCount("", num);
        System.out.println(ans);
        System.out.println(ansCount);
    }

    static List<String> combination(String p, String up) {

        if(up.isEmpty()) {
            List<String> laterCall = new ArrayList<>();

            if(!p.isEmpty()) {
                laterCall.add(p);
            }
            return laterCall;
        }

        int digit =  Integer.valueOf((String.valueOf(up.charAt(0))));

        up = up.substring(1);

        int start = (digit-2) * 3;
        int end = (digit-1) * 3;

        if(digit == 7) {
            end = end + 1;
        } else if(digit == 8) {
            start = start + 1;
            end = end + 1;
        } else if(digit == 9) {
            start = start + 1;
            end = end + 2;
        }

        List<String> currentCall = new ArrayList<>();

        while(start < end && start < 26) {
            int charCode = 'a' + start;
            String ans = p + (char) charCode;
            List<String> later = combination(ans, up);
            currentCall.addAll(later);
            start++;
        }

        return currentCall;
    }

    static int combinationCount(String p, String up) {
        if(up.isEmpty()) {
           return 1;
        }

        int digit =  Integer.valueOf((String.valueOf(up.charAt(0))));

        up = up.substring(1);

        int start = (digit-2) * 3;
        int end = (digit-1) * 3;

        if(digit == 7) {
            end = end + 1;
        } else if(digit == 8) {
            start = start + 1;
            end = end + 1;
        } else if(digit == 9) {
            start = start + 1;
            end = end + 2;
        }

        int count = 0;

        while(start < end && start < 26) {
            int charCode = 'a' + start;
            String ans = p + (char) charCode;
            count = count + combinationCount(ans, up);
            start++;
        }

        return count;
    }
}
