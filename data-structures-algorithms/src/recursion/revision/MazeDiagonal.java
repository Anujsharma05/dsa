package recursion.revision;

public class MazeDiagonal {
    public static void main(String[] args) {
        int r=3;
        int c=3;
        maze("", r, c);
    }
    static void maze(String path, int r, int c) {
        if(r==1 && c==1) {
            System.out.print(path + ", ");;
            return;
        }
        //go right
        if(c > 1) {
            maze(path + 'R', r, c-1);
        }
        //go down
        if(r > 1) {
            maze(path + 'D', r-1, c);
        }
        //go diagonal
        if(r > 1 && c > 1) {
            maze(path + "dg", r-1, c-1);
        }
    }
}
