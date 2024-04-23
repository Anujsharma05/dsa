package recursion.revision;

import java.util.ArrayList;
import java.util.List;

public class Dice {
    public static void main(String[] args) {
        int target = 3;
        List<String> list = diceList("", target);
        System.out.println(list);
    }
    static void dice(String p, int target) {
        if(target == 0) {
            System.out.println(p);
            return;
        }
        for(int i=1; i<=target; i++) {
            dice(p + i, target-i);
        }
    }
    static List<String> diceList(String p, int target) {
        if(target == 0) {
          List<String> ans = new ArrayList<>();
          ans.add(p);
          return ans;
        }
        List<String> all = new ArrayList<>();
        for(int i=1; i<=target && i <= 6; i++) {
            List<String> next = diceList(p + i, target-i);
            if(!next.isEmpty()) {
                all.addAll(next);
            }
        }
        return all;
    }
}
