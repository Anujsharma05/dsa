package recursion.revision;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        int target = 7;
        List<List<Integer>> ans = combination(arr, target);
        System.out.println(ans);
    }

    static List<List<Integer>> combination(int[] arr, int target) {
        List<List<Integer>> list = new ArrayList<>();
        combSum(list, new ArrayList<>(), arr, target, 0);
        return list;
    }

    private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int remain, int start){
        if(remain < 0) return;
        else if(remain == 0) list.add(new ArrayList<>(tempList));
        else{
            for(int i = start; i < nums.length; i++){
                tempList.add(nums[i]);
                backtrack(list, tempList, nums, remain - nums[i], i); // not i + 1 because we can reuse same elements
                tempList.remove(tempList.size() - 1);
            }
        }
    }
    static void combSum(List<List<Integer>> list, List<Integer> tempList, int[] nums, int target, int start) {

        if(target < 0) return;
        if(target == 0) {
            list.add(new ArrayList<>(tempList));
            return;
        }
        for(int i=start; i<nums.length; i++) {
            tempList.add(nums[i]);
            combSum(list, tempList, nums, target-nums[i], i);
            tempList.remove(tempList.size()-1);
        }
    }

    /**
     * Failed approach
     */
//    static List<List<Integer>> combination(int[] arr, int target) {
//
//        List<List<Integer>> outer = new ArrayList<>();
//        List<Integer> inner = new ArrayList<>();
//        if(target == 0) {
//            return outer;
//        }
//
//        for(int i=0; i<arr.length; i++) {
//
//            if(target -arr[i] < 0) continue;
//
//            List<List<Integer>> next = combination(arr, target-arr[i]);
//
//            outer.addAll(next);
//
//            if(outer.isEmpty()) {
//                inner.add(arr[i]);
//                outer.add(inner);
//            } else {
//                List<Integer> in = outer.get(outer.size()-1);
//                in.add(arr[i]);
//            }
//        }
//        return outer;
//    }
}
