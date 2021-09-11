package searching.linear_binary_search_questions;

import java.util.Arrays;

//https://leetcode.com/problems/check-if-n-and-its-double-exist/
public class CheckNDoubleExist {
    public static void main(String[] args) {
        int[] arr = {-10,12,-20,-8,15};
        boolean res = checkIfExist(arr);
        System.out.println(res);
    }
//    public static boolean checkIfExist(int[] arr) {
//        Arrays.sort(arr);
//
//        int i=0;
//        int j=1;
//
//        while(i < j && j < arr.length) {
//            if(arr[i]*2 == arr[j]) {
//                return true;
//            } else if(arr[i]*2 < arr[j]) {
//                i++;
//                if(i == j) {
//                    j++;
//                }
//            } else {
//                j++;
//            }
//        }
//        return false;
//    }

    public static boolean checkIfExist(int[] arr) {

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length; j++) {
                if(i!=j && arr[i] * 2 == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
