package recursion.revision;

public class Combination {
    public static void main(String[] args) {
        String s = "abc";
        subset("", s);
    }
    static void subset(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        subset(p+up.charAt(0), up.substring(1));
        subset(p, up.substring(1));
    }
}
