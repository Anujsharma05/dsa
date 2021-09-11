package sorting.questions;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class FindDisappearedNumbers {
    public static void main(String[] args) {
        int[] nums = {1};
        List<Integer> missingNums = findDisappearedNumbers(nums);

        for(Integer i: missingNums) {
            System.out.print(i + " ");
        }
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> list = new ArrayList<>();

        int i=0;

        while(i < nums.length) {
            int correct = nums[i] - 1;

            if(nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        for(int j=0; j<nums.length; j++) {
            if(j != nums[j]-1) {
                list.add(j+1);
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
