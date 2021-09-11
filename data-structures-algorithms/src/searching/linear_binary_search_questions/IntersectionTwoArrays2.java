package searching.linear_binary_search_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/intersection-of-two-arrays-ii/
public class IntersectionTwoArrays2 {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        int[] intersection = intersect(nums1, nums2);
        System.out.println(Arrays.toString(intersection));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {

        List<Integer> list = new ArrayList<>();

        boolean[] taken = new boolean[nums2.length];
        for(int i=0; i<nums1.length; i++) {
            for(int j=0; j<nums2.length; j++) {
                if(nums1[i] == nums2[j] && !taken[j]) {
                    taken[j] = true;
                    list.add(nums2[j]);
                    break;
                }
            }
        }

        int[] intersect = new int[list.size()];
        int index = 0;
        for(Integer i: list) {
            intersect[index] = i;
            index++;
        }
        return intersect;
    }
}
