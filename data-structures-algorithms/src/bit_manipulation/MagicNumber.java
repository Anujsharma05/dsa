package bit_manipulation;

//time complexity=>log(n) because there are log(n)+1 digits
public class MagicNumber {
    public static void main(String[] args) {
        int n = 3;
        int base = 5;
        int ans = 0;

        while(n > 0) {
            int last = n & 1;
            ans = ans + last*base;
            base = base * 5;
            n = n>>1;
        }
        System.out.println(ans);
    }
}
