package problems.leetcode.easy;

public class SetencePangram {
    public static void main(String[] args) {
        String sentence = "zthequickbrownfoxjumpsoverthelaydog";
        boolean output = checkIfPangram(sentence);
        System.out.println(output);
    }

//    public static boolean checkIfPangram(String sentence) {
//        if(sentence == null) return false;
//
//        //all letters are not present
//        if(sentence.length() < 26) {
//            return false;
//        }
//
//        char[] sen = sentence.toCharArray();
//
//        boolean[] pan = new boolean[26];
//
//        for(char c: sen) {
//            int val = c;
//            pan[val-97] = true;
//        }
//
//        for(boolean present: pan) {
//            if(!present) {
//                return false;
//            }
//        }
//        return true;
//    }

//    using indexOf and avoiding boolean array to save space
    public static boolean checkIfPangram(String sentence) {
        if(sentence == null) return false;

        //all letters are not present
        if(sentence.length() < 26) {
            return false;
        }
        for(int i=0; i<sentence.length(); i++){
            if(sentence.indexOf(sentence.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }
}
