package sorting.questions;

import java.util.Arrays;

//https://leetcode.com/problems/first-missing-positive/
public class FindMissingPositive {
    public static void main(String[] args) {
        int[] nums = {1};
        int number = firstMissingPositive(nums);
        System.out.println(number);
    }

    public static int firstMissingPositive(int[] nums) {

        int len = nums.length;
        int i=0;
        while(i < len) {
            int correct = nums[i] - 1;
            if(nums[i] > len || nums[i] < 1 || nums[i] == nums[correct]) {
                i++;
            } else {
                swap(nums, i, correct);
            }
        }

        for(int j=0; j<len; j++) {
            if(nums[j] != j+1) {
                return j+1;
            }
        }
        return len+1;
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
