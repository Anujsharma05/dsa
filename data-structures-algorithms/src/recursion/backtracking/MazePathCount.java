package recursion.backtracking;

/**
 * Possible moves: Move down or right only
 */
public class MazePathCount {
    public static void main(String[] args) {
        int r=3;
        int c=3;
        int count = count(r, c);
        System.out.println(count);
    }

    static int count(int r, int c) {

        if(r==1 || c==1) {
            return 1;
        }
        int downCount = count(r-1, c);
        int rightCount = count(r, c-1);

        return downCount + rightCount;
    }
}
