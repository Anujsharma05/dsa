package bit_manipulation;

public class NumberOfDigits {
    public static void main(String[] args) {
        int n=12345;
        int base = 10;

        int digits = ((int)(Math.log(n)/Math.log(base))) + 1;
        System.out.println(digits);
    }
}
