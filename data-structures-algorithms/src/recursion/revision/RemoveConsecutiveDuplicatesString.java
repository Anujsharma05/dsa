package recursion.revision;

public class RemoveConsecutiveDuplicatesString {
    public static void main(String[] args) {
        String str = "aaaaabbbbbbcccc";
        String ans = solve("", str);
        System.out.println(ans);
    }
    static String solve(String p, String up) {
        if(up.isEmpty()) {
            return p;
        }
        if(p.isEmpty()) {
            return solve(p + up.charAt(0), up.substring(1));
        }
        if(p.charAt(p.length()-1) == up.charAt(0)) {
            return solve(p, up.substring(1));
        }
        return solve(p + up.charAt(0), up.substring(1));
    }
}
