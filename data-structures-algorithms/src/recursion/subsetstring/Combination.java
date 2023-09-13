package recursion.subsetstring;

public class Combination {
    public static void main(String[] args) {
        String str = "abc";
        String p = "";
        subset(p, str);
    }

    static void subset(String p, String up) {
        if(up.isEmpty()) {
            if(!p.isEmpty()) {
                System.out.println("val:" + p);
            }
            return;
        }
        subset(p + up.charAt(0), up.substring(1));
        subset(p, up.substring(1));
    }
}
