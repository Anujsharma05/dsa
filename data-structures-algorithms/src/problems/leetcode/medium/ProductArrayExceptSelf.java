package problems.leetcode.medium;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/product-of-array-except-self
 */
public class ProductArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] res = productExceptSelf(nums);
        System.out.println(Arrays.toString(res));
    }

    private static int[] productExceptSelfOptimized(int[] nums) {
        int[] res = new int[nums.length];

        int productForward = 1;
        for(int i=0; i<nums.length; i++) {
            res[i] = productForward;
            productForward = productForward * nums[i];
        }

        int productBackward = 1;
        for(int i=nums.length-1; i>=0; i--) {
            res[i] = res[i] * productBackward;
            productBackward = productBackward * nums[i];
        }
        return res;
    }

    /**
     * brute force
     */
    private static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            int product = 1;
            for(int j=0; j<nums.length; j++) {
                if(i == j) continue;
                product = product * nums[j];
            }
            res[i] = product;
        }
        return res;
    }
}
