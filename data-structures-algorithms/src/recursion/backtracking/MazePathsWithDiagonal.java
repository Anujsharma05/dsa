package recursion.backtracking;

/**
 * Possible moves: Move down or right or diagonal
 */
public class MazePathsWithDiagonal {
    public static void main(String[] args) {
        int r=3;
        int c=3;
        paths("", r, c);
    }

    static void paths(String p, int r, int c) {

        if(r==1 &&  c==1) {
            System.out.print(p + ", ");
        }
        if(r>1) {
            paths(p + 'D', r-1, c);
        }
        if(c>1) {
            paths(p + 'R', r, c-1);
        }

        if(r>1 && c>1) {
            paths(p + "dg", r-1, c-1 );
        }
    }
}
