package searching.linear_binary_search_questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/intersection-of-two-arrays/
public class IntersectionTwoArrays {
    public static void main(String[] args) {
        int[] nums2 = {4,9,5};
        int[] nums1 = {9,4,9,8,4};

        int[] intersection = intersection(nums1, nums2);
        System.out.println(Arrays.toString(intersection));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for(int i: nums1) {
            set1.add(i);
        }

        Set<Integer> set2 = new HashSet<>();
        for(int i: nums2) {
            set2.add(i);
        }

        set1.retainAll(set2);

        int index = 0;
        int[] intersect = new int[set1.size()];
        for(Integer i: set1) {
            intersect[index] = i;
            index++;
        }
        return intersect;
    }

//    public static int[] intersection(int[] nums1, int[] nums2) {
//        Set<Integer> set = new HashSet<>();
//        for(int i=0; i<nums1.length; i++) {
//            boolean found = linearSearch(nums2, nums1[i]);
//
//            if(found) {
//                set.add(nums1[i]);
//            }
//        }
//        int[] intersect = new int[set.size()];
//
//        int index = 0;
//        for(Integer i: set) {
//            intersect[index] = i;
//            index++;
//        }
//        return intersect;
//    }
//
//    static boolean linearSearch(int[] arr, int target) {
//
//        for(int i: arr) {
//            if(i == target) {
//                return true;
//            }
//        }
//
//        return false;
//    }
}
