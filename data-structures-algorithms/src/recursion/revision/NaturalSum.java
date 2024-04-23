package recursion.revision;

public class NaturalSum {
    public static void main(String[] args) {
        int n = 10;
        int ans = sum(n);
        int ans2 = sumWithoutHelper(n);
        System.out.println(ans);
        System.out.println(ans2);
    }
    static int sumWithoutHelper(int n) {
        if(n < 1) return 0;
        return n + sum(n-1);
    }
    static int sum(int n) {
        int sum=0;
        return helper(sum, n);
    }
    static int helper(int sum, int n) {
        if(n < 1) return sum;
        return helper(sum + n, n-1);
    }
}
