package recursion.subsetstring;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
//        String str = "abc";
//        String aux = "z";
//        possiblePositions(str, aux);
        ArrayList<String> list = subsetList("", "abc");
        System.out.println(list);

        int count = subsetCount("", "abc");
        System.out.println(count);
    }

    static int subsetCount(String p, String up) {
        if(up.isEmpty()) {
            return 1;
        }

        String ch = String.valueOf(up.charAt(0));
        up = up.substring(1);

        int counter = 0;
        for(int i=0; i<=p.length(); i++) {
            String start = p.substring(0, i);
            String end = p.substring(i, p.length());
            counter = counter + subsetCount(start + ch + end, up);
        }
        return counter;
    }

    static ArrayList<String> subsetList(String p, String up) {
        ArrayList<String> list = new ArrayList<>();

        if(up.isEmpty()) {
//            System.out.println(p);
            list.add(p);
            return list;
        }

        String ch = String.valueOf(up.charAt(0));
        up = up.substring(1);

        int len = p.length();
        for(int i=0; i<=len; i++) {
            String start = p.substring(0, i);
//            String mid = ch;
            String end = p.substring(i, len);

            String aux = start + ch + end;
            ArrayList<String> ans = subsetList(aux, up);
            list.addAll(ans);
        }
        return list;
    }

    static void subset(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        String ch = String.valueOf(up.charAt(0));
        up = up.substring(1);

        int len = p.length();
        for(int i=0; i<=len; i++) {
            String start = p.substring(0, i);
            String mid = ch;
            String end = p.substring(i, len);

            String aux = start + mid + end;
            subset(aux, up);
        }
    }

    /**
     * Permutation Logic
     */
    static void possiblePositions(String str, String aux) {

        int len = str.length();
        for(int i=0; i<=len; i++) {
            String start = str.substring(0, i);
            String mid = aux;
            String end = str.substring(i, len);
            System.out.println(start + mid + end);
        }
    }
}
