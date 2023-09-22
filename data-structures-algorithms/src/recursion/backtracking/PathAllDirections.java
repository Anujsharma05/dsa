package recursion.backtracking;

import java.util.Arrays;

/**
 * Left/Right/Up/Down
 */
public class PathAllDirections {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        int[][] path = new int[3][3];

//        paths("", maze, 0, 0);
        pathsPrint("", maze, 0,0, path, 1);
    }

    static void paths(String p, boolean[][] maze, int r, int c) {
        int rowLen = maze.length;
        int colLen = maze[0].length;

        if(r==rowLen-1 && c == colLen-1) {
            System.out.println(p);
            return;
        }

        if(!maze[r][c]) {
            return;
        }

        maze[r][c] = false;

        if(r < rowLen-1) {
            paths(p + 'D', maze, r+1, c);
        }
        if(c < colLen-1) {
            paths(p + 'R', maze, r, c+1);
        }
        if(r>0) {
            paths(p + 'U', maze, r-1, c);
        }
        if(c>0) {
            paths(p + 'L', maze, r, c-1);
        }

        maze[r][c] = true;
    }

    static void pathsPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        int rowLen = maze.length;
        int colLen = maze[0].length;

        if(r==rowLen-1 && c == colLen-1) {
            path[r][c] = step;
            for(int[] arr: path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!maze[r][c]) {
            return;
        }

        maze[r][c] = false;
        path[r][c] = step;

        step = step + 1;

        if(r < rowLen-1) {
            pathsPrint(p + 'D', maze, r+1, c, path, step);
        }
        if(c < colLen-1) {
            pathsPrint(p + 'R', maze, r, c+1, path, step);
        }
        if(r>0) {
            pathsPrint(p + 'U', maze, r-1, c, path, step);
        }
        if(c>0) {
            pathsPrint(p + 'L', maze, r, c-1, path, step);
        }

        path[r][c] = 0;
        maze[r][c] = true;
    }

    /**
     * Initial solution thought
     */
    static void paths1(String p, boolean[][] maze, int r, int c) {
        int rowLen = maze.length;
        int colLen = maze[0].length;

        if(r==rowLen-1 && c == colLen-1) {
            System.out.println(p);
            return;
        }

//        if(!maze[r][c]) {
//            return;
//        }
        maze[r][c] = false;

        if(r < rowLen-1 && maze[r+1][c]) {
            paths(p + 'D', maze, r+1, c);
            maze[r+1][c] = true;
        }
        if(c < colLen-1 &&  maze[r][c+1]) {
            paths(p + 'R', maze, r, c+1);
            maze[r][c+1] = true;
        }
        if(r>0 && maze[r-1][c]) {
            paths(p + 'U', maze, r-1, c);
            maze[r-1][c] = true;
        }
        if(c>0 && maze[r][c-1]) {
            paths(p + 'L', maze, r, c-1);
            maze[r][c-1] = true;
        }
    }
}
