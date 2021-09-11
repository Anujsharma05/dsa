package searching.linear_binary_search_questions;

public class SquareRoot {
    public static void main(String[] args) {
        int num = 2;
        System.out.println((int)Math.sqrt(num));
        int squareRoot = mySqrt(num);
        System.out.println(squareRoot);
    }

    public static int mySqrt(int x) {
        if(x < 1) return 0;

        int start = 1;
        int end = x;
        while(start < end) {
            int mid = start + (end - start)/2;

            if(mid == x/mid) return mid;
            if(mid < x/mid) {
                start = mid + 1;
                if(start > x/start) {
                    return mid;
                }
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}

