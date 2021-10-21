package patterns;

//https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md
public class PatternAssignment {
    public static void main(String[] args) {
        int n = 7;
        pattern12(n);
    }

    private static void pattern1(int n) {
        for(int row=0; row<n; row++) {
            for(int col=0; col<n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern2(int n) {
        for(int row=0; row<n; row++){
            for(int col=0; col<=row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern3(int n) {
        for(int row=0; row<n; row++) {
            for(int col=0; col<n-row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern4(int n) {
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    private static void pattern5(int n) {
        for(int row=1; row<2*n; row++) {
            int colsInRow = row > n ? 2*n - row : row;
            for(int col=1; col<=colsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern6(int n) {
        for(int row=1; row<=n; row++) {
            for(int space=1; space<=n-row; space++) {
                System.out.print("  ");
            }
            for(int col=1; col<=row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern7(int n) {
        for(int row=1; row<=n; row++) {
            for(int space=2; space<=row; space++) {
                System.out.print("  ");
            }
            for(int col=row; col<=n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern8(int n) {
        for(int row=1; row<=n; row++) {
            for(int space=1; space<=n-row; space++) {
                System.out.print("  ");
            }
            for(int col=1; col<=2*row-1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern9(int n) {
        for(int row=1; row<=n; row++) {
            for(int space=2; space<=row; space++) {
                System.out.print("  ");
            }
            int colsInRow = 2*n - 2*row + 1;
            for(int col=1; col<=colsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern10(int n) {
        for(int row=1; row<=n; row++) {
            for(int space=1; space<=n-row; space++) {
                System.out.print("  ");
            }
            for(int col=1; col<=row; col++) {
                System.out.print("*   ");
            }
            System.out.println();
        }
    }

    private static void pattern11(int n) {
        for(int row=1; row<=n; row++) {
            for(int space=2; space<=row; space++) {
                System.out.print("  ");
            }
            for(int col=row; col<=n; col++) {
                System.out.print("*   ");
            }
            System.out.println();
        }
    }

    private static void pattern12(int n) {
        for(int row=1; row<=2*n; row++) {
            int spacesInRow = row > n ? 2*n - row : row - 1;
            for(int space=1; space<=spacesInRow; space++) {
                System.out.print("  ");
            }
            int colsInRow = row > n ? row - n : n-row+1;
            for(int col=1; col<=colsInRow; col++) {
                System.out.print("*   ");
            }
            System.out.println();
        }
    }
}
