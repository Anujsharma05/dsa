package recursion.revision;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 6;
        int ans = fib(n);
        System.out.println(ans);
    }
    static int fib(int n) {
        if(n < 0) return -1;
        if(n==0 || n==1) return n;
        return fib(n-1) + fib(n-2);
    }
}
