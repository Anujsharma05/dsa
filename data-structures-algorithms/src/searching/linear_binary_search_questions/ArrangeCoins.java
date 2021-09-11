package searching.linear_binary_search_questions;

public class ArrangeCoins {
    public static void main(String[] args) {
        int n = 12;
        int rows = arrangeCoins(n);
        System.out.println(rows);
    }

//    Naive Approach
//    public static int arrangeCoins(int n) {
//
//        int rows = 1;
//        while(n > 0) {
//            int count = 0;
//            while(count < rows) {
//                if(n == 0) {
//                    return rows - 1;
//                }
//                count++;
//                n--;
//            }
//            rows++;
//        }
//
//        return rows - 1;
//    }

//    Another Naive Approach
//    public static int arrangeCoins(int n) {
//
//        if(n == 1) return 1;
//        int count = n;
//        int rowCount = 2;
//
//        while(count > 0) {
//            count = count - rowCount;
//            if(count == 1) {
//                return rowCount;
//            } else if(count < 1) {
//                return rowCount - 1;
//            } else {
//                rowCount++;
//            }
//        }
//
//        return rowCount;
//    }

//    binary search
//    logic is that 1st row will contain 1 element 2nd row will contain 2 elements.
//    going like this 5th row will contain 5 elements.
//    By end of 5th row: total elements would be 1+2+3+4+5=15
//    Thus number of rows will give total elements by formula
//    n*(n+1)/2. So we can have row as mid and then we will adjust the sum
//    accordingly

    public static int arrangeCoins(int n) {
        long start = 0;
        long end = n;

        while(start <= end) {

            long mid = start + (end-start)/2;
            long coins = mid*(mid+1)/2;

            if(coins == n) {
                return (int)mid;
            } else if(coins < n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return (int) end;
    }
}
