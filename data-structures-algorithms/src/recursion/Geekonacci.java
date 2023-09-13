package recursion;

public class Geekonacci {
    public static void main(String[] args) {

        int N = 4;
        int Nth = geeko(N);
        System.out.println(Nth);
    }

    static int geeko(int N) {

        int A = 1;
        int B = 3;
        int C = 2;

        if(N == 3) return C;
        else if(N == 2) return B;
        else if(N == 1) return A;
        return geeko(N-1) + geeko(N-2) + geeko(N-3);
    }
}
