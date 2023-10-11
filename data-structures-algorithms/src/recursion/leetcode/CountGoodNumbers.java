package recursion.leetcode;

/**
 * https://leetcode.com/problems/count-good-numbers/
 */
//will only work for small n (Max 10)
public class CountGoodNumbers {
    public static void main(String[] args) {
        long n = 20;
//        int count = countGoodNumbers(n);
//        System.out.println("Count: " + count);
//999928327
        int tenModuloSeven = (int) Math.pow(10, 9) + 7;

        int pow1;
        int pow2;

        if(n % 2 == 0) {
            pow1 = pow2 = (int)n/2;
        } else {
            pow1 = (int)n/2 + 1;
            pow2 = (int)n/2;
        }

        int product = 1;
        for(int i=1; i<=pow1; i++) {
            product = (product % tenModuloSeven * 5) % tenModuloSeven;
        }
        for(int i=1; i<=pow2; i++) {
            product = (product % tenModuloSeven * 4) % tenModuloSeven;
        }
        System.out.println(product % tenModuloSeven);
        long num1 = (int)(Math.pow(5,pow1) % tenModuloSeven);
        long num2 = (int) (Math.pow(4,pow2) % tenModuloSeven);
        long ans = (num1 % tenModuloSeven) * (num2 % tenModuloSeven);
        System.out.println((int)(ans % tenModuloSeven));
    }
    public static int countGoodNumbers(long n) {
        int[] evenIndex = {0,2,4,6,8};
        int[] oddIndex = {2,3,5,7};
        return count("", n, evenIndex, oddIndex, 0);
    }
    static int count(String p, long n, int[] evenIndex, int[] oddIndex, int index) {

        if(n == 0) {
//            System.out.println(p);
            return 1;
        }

        int totalCount = 0;

        int tenModuloSeven = (int) Math.pow(10, 9) + 7;

        if(index%2 == 0) {
            for(int even: evenIndex) {
                totalCount += count(p+even, n-1, evenIndex, oddIndex, index+1) % tenModuloSeven;
            }
        } else {
            for(int odd: oddIndex) {
               totalCount += count(p+odd, n-1, evenIndex, oddIndex, index+1) % tenModuloSeven;
            }
        }
        return  totalCount;
    }
}
