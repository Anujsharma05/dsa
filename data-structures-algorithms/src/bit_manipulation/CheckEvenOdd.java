package bit_manipulation;

public class CheckEvenOdd {
    public static void main(String[] args) {
        int num = 12;
        checkEvenOrOdd(num);
    }

    static void checkEvenOrOdd(int num) {
        if((num&1)==1) {
            System.out.println("odd");
        } else {
            System.out.println("even");
        }
    }
}
