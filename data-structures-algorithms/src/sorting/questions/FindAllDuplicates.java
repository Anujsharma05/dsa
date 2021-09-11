package sorting.questions;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> missingNums = findDuplicates(nums);

        for(Integer i: missingNums) {
            System.out.print(i + " ");
        }
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();

        int len = nums.length;
        int i=0;
        while(i < len) {
            int correct = nums[i] - 1;
            if(nums[i] == nums[correct]) {
                i++;
            } else {
                swap(nums, i, correct);
            }
        }

        for(int j=0; j<nums.length; j++) {
            if(nums[j] != j+1) {
                list.add(nums[j]);
            }
        }
        return list;
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
