package problems.leetcode.easy;

public class EvenNumberDigits {
    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};

        int num = 17171;

        int count = 0;
        while(num != 0) {
            num = num/10;
            count++;
        }
        System.out.println(count);
        int output = findNumbers(nums);
        System.out.println(output);
    }

    public static int findNumbersMySolution(int[] nums) {

        int evenCount = 0;
        for(int num: nums) {

            int count = 0;
            while(num > 0) {
                num/=10;
                count++;
            }
            if(count % 2 == 0) {
                evenCount++;
            }
        }

        return evenCount;
    }

    public static int findNumbers(int[] nums) {

        int count = 0;

        for(int i=0; i<nums.length; i++) {
           int digits = (int)Math.log10(nums[i]) + 1;

           if(digits % 2 == 0) {
               count++;
           }
        }
        return count;
    }
}
