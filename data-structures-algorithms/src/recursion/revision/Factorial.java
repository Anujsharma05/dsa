package recursion.revision;

public class Factorial {
    public static void main(String[] args) {
        int n = 4;
        int ans = factorial(n);
        System.out.println(ans);
    }
    static int factorial(int n) {
        if(n < 0) {
            return -1;
        }
        if(n ==0 || n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }
}
