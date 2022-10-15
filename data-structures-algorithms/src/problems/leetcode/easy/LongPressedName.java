package problems.leetcode.easy;

//https://leetcode.com/problems/long-pressed-name/
public class LongPressedName {
    public static void main(String[] args) {

        String name = "aleex", typed = "aaleeexxa";
        boolean isLongPressed = isLongPressedName(name, typed);
        System.out.println(isLongPressed);
    }

    public static boolean isLongPressedName(String name, String typed) {

        int len1 = name.length();
        int len2 = typed.length();
        int i=0,j=0;
        while(i<len1 && j<len2) {
            char c1 = name.charAt(i);
            char c2 = typed.charAt(j);

            if(c1!=c2) return false;

            int count1=0;
            while(i<len1 && name.charAt(i)==c1) {
                i++;
                count1++;
            }

            int count2=0;
            while(j<len2 && typed.charAt(j)==c2) {
                j++;
                count2++;
            }

            if(count2 < count1) {
                System.out.println("not reached");
                return false;
            }
        }
        System.out.println(j);
        return i==len1 && j==len2;
    }
}
