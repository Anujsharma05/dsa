package recursion.other_questions;

/**
 * r => row
 * c => col
 *   r=1   *
 *   r=2   **
 *   r=3   ***
 *   r=4   ****
 */
public class PatternProblem {
    public static void main(String[] args) {
        int n = 4;
        printTriangle(n,0);
//        print(n);
    }

    static void printTriangle(int r, int c) {
        if(r==0) return;
        if(c < r) {
            printTriangle(r, c+1);
            System.out.print("*");
        } else {
            printTriangle(r-1, 0);
            System.out.println();
        }
    }
    static void printInvertedTriangle(int r, int c) {
        if(r==0) return;
        if(c < r) {
            System.out.print("*");
            printTriangle(r, c+1);
        } else {
            System.out.println();
            printTriangle(r-1, 0);
        }
    }

    static void print(int n) {
        if(n == 0) return;
        printStar(n);
        print(n-1);
    }
    static void printStar(int n) {
       if(n==0) {
           System.out.println();
           return;
       };
        System.out.print("*");
        printStar(n-1);
    }
}
