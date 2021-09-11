package sorting.questions;

import java.util.Arrays;

//https://leetcode.com/problems/missing-number/
public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {0};
//        int[] nums = {0};
        int output = missingNumber(nums);
        System.out.println(output);
    }

    //community classroom
    public static int missingNumber(int[] nums) {
        int len = nums.length;

        int i=0;

        while(i < len) {
            int correct = nums[i];
            if(nums[i] < nums.length && i != correct) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        for(int j=0; j<nums.length; j++) {
            if(nums[j] != j) {
                return j;
            }
        }

        return nums.length;
    }

    //my solution
//    public static int missingNumber(int[] nums) {
//        int len = nums.length;
//
//        int i=0;
//
//        while(i < len) {
//            int correct = nums[i] - 1;
//            if(nums[i] == 0 || nums[i] == nums[correct]) {
//                i++;
//            } else {
//                swap(nums, i, correct);
//            }
//        }
//        int num = linearSearch(nums);
//
//        if(num == -1) {
//            return 0;
//        } else {
//            return num;
//        }
//    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static int linearSearch(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 0) {
                return i + 1;
            }
        }
        return -1;
    }
}
