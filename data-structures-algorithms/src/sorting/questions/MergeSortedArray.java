package sorting.questions;

import java.util.Arrays;

//https://leetcode.com/problems/merge-sorted-array/
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {7,8,9,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
//        int[] nums1 = {0};
//        int[] nums2 = {1};
//        int m = 0;
//        int n = 1;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    //out of the box solution
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int finalIndex = m + n - 1;
        int nums1End = m - 1;
        int nums2End = n - 1;

        while(nums1End >= 0 && nums2End >= 0) {
            if(nums1[nums1End] >= nums2[nums2End]) {
                nums1[finalIndex--] = nums1[nums1End--];
            } else {
                nums1[finalIndex--] = nums2[nums2End--];
            }
        }

        while(nums2End >= 0) {
            nums1[finalIndex--] = nums2[nums2End--];
        }

    }

    //my solution(naive approach)
    //merge the two arrays then apply insertion sort
    public static void merge1(int[] nums1, int m, int[] nums2, int n) {

        for(int i=0; i<nums2.length; i++) {
            nums1[i+m] = nums2[i];
        }

        insertion(nums1);
    }

    static void insertion(int[] nums) {
        for(int i=0; i<nums.length-1; i++) {
            for(int j=i+1; j>0; j--) {
                if(nums[j] < nums[j-1]) {
                    swap(nums ,j, j-1);
                } else {
                    break;
                }
            }
        }
    }

    static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
