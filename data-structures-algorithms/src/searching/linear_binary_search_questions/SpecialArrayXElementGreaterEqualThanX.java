package searching.linear_binary_search_questions;

import java.util.Arrays;

public class SpecialArrayXElementGreaterEqualThanX {
    public static void main(String[] args) {
        int[] nums = {3,5};
        int x = specialArray(nums);
        System.out.println(x);
    }
//    public static int specialArray(int[] nums) {
//        int len = nums.length;
//
//        Arrays.sort(nums);
//
//        if(len <= nums[0]) {
//            return len;
//        } else {
//            for(int i=0; i<nums.length; i++) {
//                if(nums[i] == nums.length-i) {
//                    return nums[i];
//                } else if(nums[i] > nums.length-i){
//                    return -1;
//                }
//            }
//        }
//        return -1;
//    }

    public static int specialArray(int[] nums) {

        int num = 0;
        while(num<=1000) {
            int count = 0;
            for(int i=0; i<nums.length; i++) {
                if(num <= nums[i]) {
                    count++;
                }

                if(count > num) {
                    break;
                }
            }
            if(num == count) {
                return num;
            }
            num++;
        }
        return -1;
    }
}
