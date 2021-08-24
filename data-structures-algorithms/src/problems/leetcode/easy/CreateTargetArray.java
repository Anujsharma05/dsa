package problems.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateTargetArray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};

        int[] output = createTargetArray(nums, index);
        System.out.println(Arrays.toString(output));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> res = new ArrayList<>();

        for(int i=0; i<nums.length; i++) {
            res.add(index[i], nums[i]);
        }

//        converting arraylist to int[]
        int[] output = new int[nums.length];
        for(int i=0;i<res.size(); i++) {
            output[i] = res.get(i);
        }

        return output;
    }

//    study this solution
//    public int[] createTargetArray(int[] nums, int[] index) {
//        int[] target = new int[nums.length];
//        int i = 0, k = 0;
//        while (i < index.length) {
//            for (k = target.length - 1; k > index[i]; k--)
//                target[k] = target[k - 1];
//            target[index[i]] = nums[i];
//            i++;
//        }
//        return target;
//    }

}
