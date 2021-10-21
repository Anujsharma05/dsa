package strings;

//https://leetcode.com/problems/truncate-sentence/
public class TruncateSentence {
    public static void main(String[] args) {
        String s = "What is the solution to this problem";
        int k =4;

        String out = truncateSentence(s, k);
        System.out.println(out);
    }

//    public static String truncateSentence(String s, int k) {
//
//        String[] sArr = s.split(" ");
//
//        if(sArr.length == k) return s;
//
//        StringBuilder sb = new StringBuilder();
//
//        for(int i=0; i<k; i++) {
//            sb.append(sArr[i]).append(" ");
//        }
//
//        return sb.substring(0, sb.length()-1);
//    }

    public static String truncateSentence(String s, int k) {
        int idx=0;
        int spaceCount=0;

        while(idx<s.length() && spaceCount<k){
            if(s.charAt(idx)==' ') spaceCount++;
            idx++;
        }
        // if(spaceCount<k) means we have to include whole string
        return spaceCount==k ? s.substring(0,idx-1) : s;
    }
}
