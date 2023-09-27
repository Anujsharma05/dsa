package recursion.leetcode;

import java.util.LinkedList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int target = 7;
        int[] arr = {2,3,6,7};
//		combinationSum("", arr, target);
        compareList();
    }

    /**
     * Contains repeated list, need to remove those
     */
    static void combinationSum(String p, int[] arr, int target) {
        if(target == 0) {
            System.out.println(p);
            return;
        } else if(target < 0) return;

        for(int i=0; i<arr.length && target-arr[i]>=0; i++) {
            combinationSum(p + arr[i], arr, target-arr[i]);
        }
    }

    /**
     * To eliminate repeated list
     */
    static void compareList() {
        List<Integer> list = new LinkedList<>();
        list.add(4);
        System.out.println(list.get(list.size()-1));
    }
}
