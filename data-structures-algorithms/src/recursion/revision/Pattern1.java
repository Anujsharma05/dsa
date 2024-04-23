package recursion.revision;

public class Pattern1 {
    public static void main(String[] args) {
        int n=4;
        pattern(n, 0);
    }
    static void pattern(int r, int c) {
        if(r < 1) return;

        if(c < r) {
            pattern(r, c+1);
            System.out.print("* ");
        } else {
            pattern(r-1, 0);
            System.out.println();
        }
    }
}
