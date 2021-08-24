package problems.leetcode.easy;

import java.util.Arrays;

public class SmallerThanCurrentNumber {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] output = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(output));
    }
//    public static int[] smallerNumbersThanCurrent(int[] nums) {
//
//        int[] res = new int[nums.length];
//
//        for(int i=0; i<nums.length; i++) {
//            int count = 0 ;
//            for(int j=0; j<nums.length; j++) {
//                if(nums[j] < nums[i]) {
//                    count++;
//                }
//            }
//
//            res[i] = count;
//        }
//        return res;
//    }

//    Input size specific answer
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        //for numbers 0 to 100
        int[] counterArray = new int[101];
        //counting frequency for each number
        for(int i: nums) {
            counterArray[i]++;
        }
        //adding current and smaller numbers count
        for(int i=1; i<101; i++) {
            counterArray[i] = counterArray[i] + counterArray[i-1];
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                nums[i] = 0;
            else
                //removing current number count and storing smaller count
                nums[i] = counterArray[nums[i] - 1];
        }
        return nums;
    }
}
