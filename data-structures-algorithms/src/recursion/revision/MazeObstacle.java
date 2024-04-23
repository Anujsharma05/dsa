package recursion.revision;

public class MazeObstacle {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        paths(maze, "", 0, 0);
    }
    static void paths(boolean[][] maze, String path, int r, int c) {
        if(r==2 && c==2) {
            System.out.println(path);
            return;
        }
        if(!maze[r][c]) {
            return;
        }
        //go right
        if(c<2) {
            paths(maze, path + 'R', r, c+1);
        }
        if(r<2) {
            paths(maze, path + 'D', r+1, c);
        }
    }
}
