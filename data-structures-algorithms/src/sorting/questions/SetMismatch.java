package sorting.questions;

import java.util.Arrays;

//https://leetcode.com/problems/set-mismatch/
public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1,1};
        int[] errorNums = findErrorNums(nums);
        System.out.println(Arrays.toString(errorNums));
    }

    public static int[] findErrorNums(int[] nums) {
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
                return new int[] {nums[j], j+1};
            }
        }

        return new int[]{-1, -1};
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
