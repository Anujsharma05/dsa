package recursion.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/permutations
 */
public class Permutations {
    public static void main(String[] args) {

        int[] nums = {1,2,2};
        List<List<Integer>> list = permute(nums);
        System.out.println(list);
    }
    static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int idx) {
        if(tempList.size()==nums.length) {
            list.add(new ArrayList<>(tempList));
        }
        for(int i=0; i<nums.length; i++) {
            if(tempList.contains(nums[i])) continue;
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, idx+1);
            tempList.remove(tempList.size()-1);
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        // Arrays.sort(nums); // not necessary
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

//    private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums){
//        if(tempList.size() == nums.length){
//            list.add(new ArrayList<>(tempList));
//        } else{
//            for(int i = 0; i < nums.length; i++){
//                if(tempList.contains(nums[i])) continue; // element already exists, skip
//                tempList.add(nums[i]);
//                backtrack(list, tempList, nums);
//                tempList.remove(tempList.size() - 1);
//            }
//        }
//    }
}
