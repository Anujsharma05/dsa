package recursion.revision;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Permutation {
    public static void main(String[] args) {
        String p = "";
        String up = "abc";
        int count = count(p, up);
        System.out.println("d");
        System.out.println(count);
    }
    static void combination(String p , String up) {
        if(up.isEmpty()) {
            if(p.isEmpty()) {
                System.out.println("hello");
            }
            System.out.println(p);
            return;
        }
        for(int i=0; i<=p.length(); i++) {
            String start = p.substring(0, i);
            String middle = String.valueOf(up.charAt(0));
            String end = p.substring(i, p.length());
            combination(start+middle+end, up.substring(1));
        }
    }
    static int count(String p , String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return 1;
        }
        int count = 0;
        for(int i=0; i<=p.length(); i++) {
            String start = p.substring(0, i);
            String middle = String.valueOf(up.charAt(0));
            String end = p.substring(i, p.length());
            count = count + count(start+middle+end, up.substring(1));
        }
        return count;
    }
    static List<String> list(String p , String up) {
        if(up.isEmpty()) {
            List<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        List<String> curList = new ArrayList<>();
        for(int i=0; i<=p.length(); i++) {
            String start = p.substring(0, i);
            String middle = String.valueOf(up.charAt(0));
            String end = p.substring(i, p.length());
            List<String> ans = list(start+middle+end, up.substring(1));
            curList.addAll(ans);
        }
        return curList;
    }
}
