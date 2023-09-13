package problems.leetcode.medium;

public class HouseRobber {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int maxMoney = rob(nums);
        System.out.println(maxMoney);
    }

    public static int rob(int[] nums) {
        int oddSum=0, evenSum=0;
        int maxOdd = Integer.MIN_VALUE, maxEven = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++) {
            if(i %2 ==0) {
                evenSum+=nums[i];

                if(nums[i] > maxEven) {
                    maxEven = nums[i];
                }

            } else {
                oddSum+=nums[i];

                if(nums[i] > maxOdd) {
                    maxOdd  = nums[i];
                }
            }
        }
        return Math.max(oddSum, evenSum);
    }
}
