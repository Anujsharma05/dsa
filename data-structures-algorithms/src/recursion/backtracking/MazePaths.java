package recursion.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Possible moves: Move down or right only
 */
public class MazePaths {
    public static void main(String[] args) {
        int r=3;
        int c=3;
        paths("", r, c);
        System.out.println();
        List<String> ans = pathList("", r, c);
        System.out.println(ans);
    }
    static void paths(String p, int r, int c) {

//        if(r<1 || c<1) return; //handled below
        if(r==1 &&  c==1) {
            System.out.print(p + ", ");;
        }
        if(r>1) {
            paths(p + 'D', r-1, c);
        }
        if(c>1) {
            paths(p + 'R', r, c-1);
        }
    }

    static ArrayList<String> pathList(String p, int r, int c) {

//        if(r<1 || c<1)  return new ArrayList<>(); //handled below
        if(r==1 &&  c==1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> paths = new ArrayList<>();
        if(r>1) {
            ArrayList<String> down = pathList(p + 'D', r-1, c);
            paths.addAll(down);
        }
        if(c>1) {
            ArrayList<String> right = pathList(p + 'R', r, c-1);
            paths.addAll(right);
        }
        return paths;
    }
}
