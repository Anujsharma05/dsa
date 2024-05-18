package recursion.other_questions;

public class StringLength {
    public static void main(String[] args) {
        String str = "anuj sharma";
        int len = strLen(str);
        System.out.println(len);
    }

    static int strLen(String str) {
        if(str.equals("")) {
            return 0;
        }
        return 1 + strLen(str.substring(1));
    }
}
