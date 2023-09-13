package recursion.backtracking;

/**
 * [ T, T, T]
 * [ T, F, T]
 * [ T, T, T]
 * T: path, F: River(Obstacle)
 * Possible moves: right or down
 */
public class MazeWithObstacle {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        paths(maze, "", 0, 0);
    }

    static void paths(boolean[][] maze, String p, int r, int c) {

        if(!maze[r][c]) return; //obstacle(river)

        if(r == maze.length-1 && c == maze[0].length-1) {
            System.out.println(p);
            return;
        }

        if(r < maze.length-1) {
            paths(maze, p + 'D', r+1, c);
        }
        if(c < maze[0].length-1) {
            paths(maze, p + 'R', r, c+1);
        }
    }
}
