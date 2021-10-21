package searching.linear_binary_search_questions;

//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
public class SearchRotatedSortedArray2 {
    public static void main(String[] args) {
        int[] nums = {2,5,6,0,0,1,2};
        int target = 0;
        boolean found = search(nums, target);
        System.out.println(found);
    }

    public static boolean search(int[] nums, int target) {

        int pivot = findPivot(nums);
        return false;
    }

    static int findPivot(int[] nums) {

        return -1;
    }
}
