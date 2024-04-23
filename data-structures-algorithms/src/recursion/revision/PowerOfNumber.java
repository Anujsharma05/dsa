package recursion.revision;

public class PowerOfNumber {
    public static void main(String[] args) {
        int n = 3;
        int pow = 4;
        int ans = power(n, pow);
        System.out.println(ans);
    }
    static int power(int n, int pow) {
       if(pow == 0) return 1;
       return n * power(n, pow-1);
    }
}
