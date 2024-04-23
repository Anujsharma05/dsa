package recursion.revision;

import java.util.ArrayList;
import java.util.List;

public class MazePaths {
    public static void main(String[] args) {
        int r=3,c=3;
//        maze("", r, c);
//        List<String> paths = mazeList("", r, c);
//        System.out.println(paths);
        int count = pathCount(r, c);
        System.out.println(count);
    }
    static void maze(String path, int r, int c) {
        if(r==1 && c==1) {
            System.out.println(path);
            return;
        }
        //go right
        if(c > 1) {
            maze(path + 'R', r, c-1);
        }
        if(r > 1) {
            maze(path + 'D', r-1, c);
        }
    }
    static List<String> mazeList(String path, int r, int c) {
        if(r==1 && c==1) {
            List<String> list = new ArrayList<>();
            list.add(path);
            return list;
        }
        List<String> all = new ArrayList<>();
        //go right
        if(c > 1) {
            all.addAll(mazeList(path + 'R', r, c-1));
        }
        if(r > 1) {
            all.addAll(mazeList(path + 'D', r-1, c));
        }
        return all;
    }

    static int pathCount(int r, int c) {
        if(r==1 && c==1) {
            return 1;
        }
        int count = 0;
        //go right
        if(c > 1) {
            count += pathCount(r, c-1);
        }
        //go down
        if(r > 1) {
            count += pathCount(r-1, c);
        }
        return count;
    }
}
