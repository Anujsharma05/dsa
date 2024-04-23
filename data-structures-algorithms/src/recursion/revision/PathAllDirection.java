package recursion.revision;

import java.util.Arrays;

public class PathAllDirection {
    public static void main(String[] args) {
        boolean[][] maze = new boolean[3][3];
//        maze("", 0, 0, maze);

        int[][] trail = new int[3][3];
        pathTrail("", 0, 0, maze, trail, 1);
    }
    static void maze(String path, int r, int c, boolean[][] maze) {

        //step already traversed before
        if(maze[r][c]) return;

        //base case
        if(r==2 && c==2) {
            System.out.println(path);
        }

        //setting step as traversed
        maze[r][c] = true;

        //go right
        if(c < 2) {
            maze(path + 'R', r, c+1, maze);
        }
        //go down
        if(r < 2) {
            maze(path + 'D', r+1, c, maze);
        }
        //go up
        if(r > 0) {
            maze(path + 'U', r-1, c, maze);
        }
        //go left
        if(c > 0) {
            maze(path + 'L', r, c-1, maze);
        }

        //removing step
        maze[r][c] = false;
    }

    static void pathTrail(String path, int r, int c, boolean[][] maze, int[][] trail, int step) {

        if(maze[r][c]) return;

        trail[r][c] = step;

        if(r==2 && c==2) {
            trailPrint(trail);
            System.out.println(path);
        }

        maze[r][c] = true;

        if(c < 2) {
            pathTrail(path + 'R', r, c+1, maze, trail, step+1);
        }
        if(r < 2) {
            pathTrail(path + 'D', r+1, c, maze, trail, step+1);
        }
        if(c > 0) {
            pathTrail(path + 'L', r, c-1, maze, trail, step+1);
        }
        if(r > 0) {
            pathTrail(path + 'U', r-1, c, maze, trail, step+1);
        }

        maze[r][c] = false;
        trail[r][c] = 0;
    }
    static void trailPrint(int[][] trail) {
        int row = trail.length;
        for(int i=0;i<row; i++) {
            System.out.println(Arrays.toString(trail[i]));
        }
    }
    static void resetTrail(int[][] trail) {
        int row = trail.length;
        int col = trail[0].length;
        for(int i=0;i<row; i++) {
            for(int j=0; j<col; j++) {
                trail[i][j] = 0;
            }
        }
    }
}
