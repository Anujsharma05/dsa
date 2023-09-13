package problems.leetcode.medium;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        SortColors s = new SortColors();
        s.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    /**
     * Dutch National Flag Algorithm
     */
    public void sortColorsOptimized(int[] nums) {
        int left=0, right=nums.length-1;
        int i=0;

        while(i<=right) {
            if(nums[i] == 0) {
                if(i != left) {
                    swap(nums, i, left);
                }
                left++;
                i++;
            } else if(nums[i] == 1) {
                i++;
            } else {
                swap(nums, i, right);
                right--;
            }
        }
    }

    public void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }

    /**
     * Brute Force
     */
    public void sortColors(int[] nums) {

        int zeroes = 0, ones = 0, twos = 0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0)
                zeroes++;
            else if(nums[i] == 1)
                ones++;
            else
                twos++;
        }

        int index = 0;

        for(int i=0; i<zeroes; i++) {
            nums[index] = 0;
            index++;
        }

        for(int i=0; i<ones; i++) {
            nums[index] = 1;
            index++;
        }

        for(int i=0; i<twos; i++) {
            nums[index] = 2;
            index++;
        }
    }
}
