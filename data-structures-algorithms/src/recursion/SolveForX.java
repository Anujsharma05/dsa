package recursion;
/**
 * n = a ^ x;
 */
public class SolveForX {
    public static void main(String[] args) {
        int n = 64;
        int a = 2;
        int x = power(n, a, 0);
        System.out.println(x);
    }

    static int power(int n, int a, int count) {
        if(n == 1) return count ;
        return power(n/a, a, count+1);
    }
}
