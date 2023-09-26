package recursion;

public class RemoveConsecutiveDuplicatesString {
    public static void main(String[] args) {
        String str = "aaaaabbbbbb";

        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        removeDupSb(str, 0, 1, sb);
        System.out.println(sb);

        System.out.println(removeDup(str, -1, -1));
    }
    static void removeDupSb(String str, int prev, int cur, StringBuilder sb) {

        if(cur == str.length()) {
            return;
        }
        if(str.charAt(prev) != str.charAt(cur)) {
            prev = cur;
            sb.append(str.charAt(cur));
        }
        removeDupSb(str, prev, cur + 1, sb);
    }

    static String removeDup(String str, int prev, int cur) {

        if(cur == str.length()) {
            return "";
        }
        String s = "";

        if(prev == -1) {
            s = s + str.charAt(0) + removeDup(str, 0, 1);
        } else if(str.charAt(prev) != str.charAt(cur)) {
            prev = cur;
            s = s + str.charAt(cur) + removeDup(str, prev, cur + 1);
        } else {
            s = s + removeDup(str, prev, cur + 1);
        }
        return s;
    }
}
