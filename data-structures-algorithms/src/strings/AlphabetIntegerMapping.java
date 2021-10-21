package strings;

//https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
public class AlphabetIntegerMapping {
    public static void main(String[] args) {
        String s = "25#";
        String out = freqAlphabets(s);
        System.out.println(out);
    }
    public static String freqAlphabets(String s) {

        int i = s.length()-1;
        StringBuilder sb = new StringBuilder();
        while(i >= 0) {
            int val;
            if(s.charAt(i) == '#') {
                val = Integer.valueOf(s.substring(i-2, i));
                i-=3;
            } else {
                val = Integer.valueOf(s.substring(i, i+1));
                i--;
            }
            sb.insert(0, (char) (val + 96));
        }

        return sb.toString();
    }
}
