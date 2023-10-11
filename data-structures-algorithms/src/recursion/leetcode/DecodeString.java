package recursion.leetcode;

/**
 * https://leetcode.com/problems/decode-string/
 */
public class DecodeString {
    public static void main(String[] args) {
        String str = "4[a[qw]bc]";
        int i = 2;
        int startCount = 1;
        int endCount = 1;
        int start = -1;
        while (i < str.length()) {
            if (str.charAt(i) == '[') {
                startCount = startCount + 1;
            }

            if (str.charAt(i) == ']') {
                if (startCount == endCount) {
                    System.out.println(i);
                    break;
                } else {
                    endCount = endCount + 1;
                }
            }
            i++;
        }

        String s = "4[ab]";
        String ans = ds(s, 0, s.length());
        System.out.println(ans);
    }

    static String ds(String str, int s, int e) {

        char ch = str.charAt(s);
        String ans = "";
        if (isLetter(ch)) {
            return ans + ds(str, s + 1, e);
        } else {

            int i = s;
            while (i < e) {
                if (str.charAt(i) == '[') {
                    break;
                }
            }
            int k = Integer.parseInt(str.substring(s, i));
            int endIndex = findEndIndex(str, i + 1);

            String belowAns = ds(str, i + 1, endIndex);

            for (int x = 0; x < k; x++) {
                str = str + belowAns;
            }


            return ans + ds(str, e + 1, 0)
        }
        return ans;
    }

    static int findEndIndex(String str, int i) {
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

    static String decodeString1(String s) {
        int i = 0;
        int j = 0;
        StringBuilder sb = new StringBuilder();
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (isLetter(ch)) {
                sb.append(ch);
                i++;
                j++;
                continue;
            }

            if (ch == '[') {
                int k = Integer.parseInt(s.substring(j, i));
                int z = i + 1;
                while (z < s.length()) {
                    if (s.charAt(z) == ']') {
                        String repeatStr = s.substring(i + 1, z);
                        for (int x = 0; x < k; x++) {
                            sb.append(repeatStr);
                        }
                        z++;
                        break;
                    }
                    z++;
                }
                i = z;
                j = z;
                continue;
            }

            i++;
        }

        return sb.toString();
    }

    static boolean isLetter(int chVal) {
        int lower = 'a';
        int upper = 'z';
        return lower <= chVal && chVal <= upper;
    }
}
