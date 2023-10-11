package recursion.leetcode;

/**
 * https://leetcode.com/problems/target-sum/
 */
class TargetSum {

    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        int target = 3;
        int count = findTargetSumWays(nums, target);
        System.out.println(count);
    }
    public static int findTargetSumWays(int[] nums, int target) {
        return ways(nums, target, 0, 0);
    }

    public static int ways(int[] nums, int target, int sum, int index) {

        if(index == nums.length) {
            if(sum == target) {
                return 1;
            }
            return 0;
        }

        int count = 0;
        count+=ways(nums, target, sum + nums[index], index+1);
        count+=ways(nums, target, sum-nums[index], index+1);
        return count;
    }
}
