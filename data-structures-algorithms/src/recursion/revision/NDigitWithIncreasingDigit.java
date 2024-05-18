package recursion.revision;

public class NDigitWithIncreasingDigit {
    public static void main(String[] args) {
        int n = 2;
        fun(n, "");
    }
    static void fun(int n, String p) {

        if(p.length()==n) {
            System.out.println(p);
            return;
        }
        for(int i=1; i<=9; i++) {
            if(p.isEmpty()) {
                fun(n, p + i);
            } else {
                int lastDigit = Integer.valueOf(p.substring(p.length()-1));
                if(i > lastDigit) {
                    fun(n, p + i);
                }
            }
        }
    }
}
