package recursion.leetcode;

/**
 * https://leetcode.com/problems/decode-string/
 */
public class DecodeString {
    public static void main(String[] args) {
        String str = "1[a2[qw]bc]";
        DecodeString obj = new DecodeString();
        String res = obj.decodeString(str);
        System.out.println(res);
    }

    public String decodeString(String s) {
        return ds(s, 0, s.length());
    }

    public String ds(String str, int s, int e) {

        if(s >= e) {
            return "";
        }
        char ch = str.charAt(s);

        if (isLetter(ch)) {
            return ch + ds(str, s + 1, e);
        } else {
            String ans = "";
            int i = s;
            while (i < e) {
                if (str.charAt(i) == '[') {
                    break;
                }
                i++;
            }
            int k = Integer.parseInt(str.substring(s, i));
            int endIndex = findEndIndex(str, i + 1);

            String belowAns = ds(str, i + 1, endIndex);

            for (int x = 0; x < k; x++) {
                ans = ans + belowAns;
            }
            return ans + ds(str, endIndex+1, e);
        }
    }

    public int findEndIndex(String str, int i) {
        int startCount = 1;
        int endCount = 1;
        while (i < str.length()) {
            if (str.charAt(i) == '[') {
                startCount = startCount + 1;
            }

            if (str.charAt(i) == ']') {
                if (startCount == endCount) {
                    return i;
                } else {
                    endCount = endCount + 1;
                }
            }
            i++;
        }
        return -1;
    }

    public boolean isLetter(int chVal) {
        int lower = 'a';
        int upper = 'z';
        return lower <= chVal && chVal <= upper;
    }
}
