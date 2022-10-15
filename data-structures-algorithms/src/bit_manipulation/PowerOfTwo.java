package bit_manipulation;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 25;
        //won't work for n=0
        if(n==0) {
            System.out.println(false);
            return;
        }
        boolean isPwrOf2 = (n & (n-1)) == 0 ? true : false;
        System.out.println(isPwrOf2);
    }
}
