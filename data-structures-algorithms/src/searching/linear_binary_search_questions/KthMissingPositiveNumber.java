package searching.linear_binary_search_questions;
//https://leetcode.com/problems/kth-missing-positive-number/
public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
//        int[] arr = {6};
        int k = 3;

        int missingNumber = findKthPositive(arr, k);
        System.out.println(missingNumber);
    }
//    my logic.....too complicated
//    public static int findKthPositive(int[] arr, int k) {
//        int lastIndex = arr.length-1;
//        int lastNumber = arr[lastIndex];
//        int missingNosWithinArray = lastNumber - arr.length;
//
//        if(missingNosWithinArray < k) {
//            int remainingNosOutsideArray = k - missingNosWithinArray;
//            return arr[lastIndex] + remainingNosOutsideArray;
//        } else {
//            int i=0, j=1;
//            int initialMissingCount = arr[0]-1;
//
//            if(initialMissingCount >= k) {
//                return k;
//            }
//
//            int missingCount = initialMissingCount;
//            int prevMissingCount = initialMissingCount;
//            while(j < arr.length) {
//                int missingElementsBetween = arr[j]-arr[i]-1;
//                missingCount = missingCount + missingElementsBetween;
//                if(missingCount < k) {
//                    prevMissingCount = missingCount;
//                    i++;
//                    j++;
//                } else {
//                    break;
//                }
//            }
//            return arr[i] + k - prevMissingCount;
//        }
//    }

    //O(n) solution
    public static int findKthPositive(int[] arr, int k) {
        for(int i : arr){
            if(i <= k) k++; else break;
        }
        return k;
    }

    //binary search
    public static int findKthPositiveBinary(int[] arr, int k) {
        int lastIndex = arr.length-1;
        int lastNumber = arr[lastIndex];
        int missingNosWithinArray = lastNumber - arr.length;

        int initialMissingCount = arr[0] - 1;
        if(initialMissingCount >= k) {
            return k;
        } else if(missingNosWithinArray < k) {
            int remainingNosOutsideArray = k - missingNosWithinArray;
            return arr[lastIndex] + remainingNosOutsideArray;
        } else {
            //binary search

            int start = 0;
            int end = lastIndex;

            while(start <= end) {
                int mid = start + (end-start)/2;

                //calculate missing numbers count before mid
                int missingCount = arr[mid] - mid - 1;

                if(missingCount >= k) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            int missingBeforeCurrentIndex = arr[end] - end - 1;
            return arr[end] + k -missingBeforeCurrentIndex;
        }
    }
}
