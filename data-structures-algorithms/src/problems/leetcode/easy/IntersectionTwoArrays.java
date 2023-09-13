package problems.leetcode.easy;

import java.util.*;

public class IntersectionTwoArrays {
    public static void main(String[] args) {

        int[] nums1 = {4,7,9,7,6,7};
        int[] nums2 = {5,0,0,6,1,6,2,2,4};
        IntersectionTwoArrays obj = new IntersectionTwoArrays();
        int[] res = obj.intersectionSet(nums1, nums2);
        System.out.println(Arrays.toString(res));
    }
    public int[] intersectionSet(int[] nums1, int[] nums2) {

        Set<Integer> set = new HashSet<>();
        for(int i: nums1) {
            set.add(i);
        }

        List<Integer> ans = new ArrayList<>();
        for(int i: nums2) {
            if(set.contains(i)) {
                ans.add(i);
                set.remove(i);
            }
        }

        int[] res = new int[ans.size()];
        int index = 0;
        for(Integer i: ans) {
            res[index] = i;
            index++;
        }
        return res;
    }

    public int[] intersectionSorting(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> list = new LinkedList<>();
        int i1=0,i2=0;
        while(i1 < nums1.length && i2 < nums2.length) {
            if(nums1[i1] == nums2[i2]) {

                if(list.size() > 0) {
                    int num = list.get(list.size()-1);
                    if(num != nums1[i1]) {
                        list.add(nums1[i1]);
                    }
                } else {
                    list.add(nums1[i1]);
                }
                i1++;
                i2++;
            } else if(nums1[i1] < nums2[i2]) {
                i1++;
            } else {
                i2++;
            }
        }

        int[] res = new int[list.size()];
        int index = 0;
        for(Integer i: list) {
            res[index] = i;
            index++;
        }
       return res;
    }

    public int[] intersectionBruteForce(int[] nums1, int[] nums2) {

        int[] res;
        if (nums1.length < nums2.length)
            res = logic(nums1, nums2);
        else
            res = logic(nums2, nums1);

        return res;
    }

    public int[] logic(int[] outer, int[] inner) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<outer.length; i++) {
            for(int j=0; j<inner.length; j++) {
                if(outer[i] == inner[j]) {
                    set.add(outer[i]);
                    break;
                }
            }
        }

        int[] res = new int[set.size()];
        int index=0;
        for(Integer i: set) {
            res[index] = i;
            index++;
        }
        return res;
    }
}
