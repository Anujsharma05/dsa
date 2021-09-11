package sorting.questions;

//https://leetcode.com/problems/find-the-duplicate-number/
public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = {1};
        int duplicate = findDuplicate(nums);
        System.out.println(duplicate);
    }

    public static int findDuplicate(int[] nums) {

        int i=0;

        while(i < nums.length) {

            if(nums[i] != i+1) {
                int correct = nums[i] - 1;

                if(nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
