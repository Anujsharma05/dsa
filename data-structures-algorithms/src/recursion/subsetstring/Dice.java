package recursion.subsetstring;

import java.util.ArrayList;
import java.util.List;

public class Dice {
    public static void main(String[] args) {
        int target = 4;
//        dice("", target);
//        System.out.println(diceList("", target));
        customFaceDice("", target, 8);
    }
    static void dice(String p, int target) {

        if(target == 0) {
            System.out.println(p);
            return;
        }
        /**
         * For all dice possible values
         */
        for(int i=1; i<=6 && i<=target; i++) {
            dice(p+i, target-i);
        }
    }

    static List<String> diceList(String p, int target) {

        if(target == 0) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        List<String> list = new ArrayList<>();
        /**
         * For all dice possible values
         */
        for(int i=1; i<=6 && i<=target; i++) {
            list.addAll(diceList(p+i, target-i));
        }
        return list;
    }

    static void customFaceDice(String p, int target, int face) {

        if(target == 0) {
            System.out.println(p);
            return;
        }
        /**
         * For all dice possible values
         */
        for(int i=1; i<=face && i<=target; i++) {
            dice(p+i, target-i);
        }
    }
}
