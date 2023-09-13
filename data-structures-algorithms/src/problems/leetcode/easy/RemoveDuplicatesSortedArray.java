package problems.leetcode.easy;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {

        int[] nums = {1,2,3};
        int k = removeDuplicatesOptimized(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(k);
    }

    public static int removeDuplicatesOptimized(int[] nums) {

        int i=0, j=1, k=1;
        while(i < nums.length && j < nums.length) {
            if(nums[i] != nums[j]) {
                nums[k] = nums[j];
                k++;
                i = j;
            }
            j++;
        }
        return k;
    }

    /**
     * Brute force
     */
    public static int removeDuplicates(int[] nums) {
        Set<Integer> set = new TreeSet<>();

        for(int i=0; i<nums.length; i++) {
            set.add(nums[i]);
        }

        Iterator<Integer> itr = set.iterator();
        int i=0;
        while(itr.hasNext()) {
            nums[i] = itr.next();
            i++;
        }
        return set.size();
    }
}
