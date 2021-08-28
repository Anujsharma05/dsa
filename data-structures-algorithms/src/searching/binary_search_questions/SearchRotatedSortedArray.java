package searching.binary_search_questions;
//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class SearchRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {6,7,8,1,2,3,4,5};
        int target = 6;

        int result = search(nums, target);
        System.out.println(result);
    }

//    community classroom solution
    static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        int pivot = findPivot(nums, start, end);

        if(pivot == -1) {
            //array not rotated
            return binarySearch(nums, target, start, end);
        }

        if(nums[pivot] == target) return pivot;

        if(nums[start] > target) {
            return binarySearch(nums, target, pivot+1, end);
        } else {
            return binarySearch(nums, target, start, pivot-1);
        }
    }
    static int findPivot(int[] nums, int start, int end) {
        while(start <= end) {
            int mid = start + (end-start)/2;

            if(mid < end && nums[mid] > nums[mid+1]) {
                return mid;
            }
            if(mid > start && nums[mid-1] > nums[mid]) {
                return mid - 1;
            }

            if(nums[mid] >= nums[start]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
//    public static int search(int[] nums, int target) {
//        int start = 0;
//        int end = nums.length - 1;
//
//       int pivot = pivotIndex(nums, start, end);
//        System.out.println("pivot:"+pivot);
//       if(nums[pivot] == target) return pivot;
//
//       if(pivot == end) {
//           return binarySearch(nums, target, start, end);
//       } else {
//           if(target >= nums[start]) {
//               return binarySearch(nums, target, start, pivot);
//           } else {
//               return binarySearch(nums, target, pivot+1, end);
//           }
//       }
//    }

//    static int pivotIndex(int[] nums, int start, int end) {
//
//        if(nums[end] > nums[start]) return end;
//
//        while(start < end) {
//
//            int mid = start + (end-start)/2;
//
//            if(start==mid) {
//                if(nums[mid] > nums[end]) {
//                    end = mid;
//                } else {
//                    start = mid + 1;
//                }
//            }
//
//            if(nums[mid] > nums[start] && nums[mid] > nums[end]) {
//                start = mid;
//            } else if(nums[mid] < nums[start] && nums[mid] < nums[end]) {
//                end = mid - 1;
//            } else{
//                start = mid + 1;
//            }
//        }
//
//        return start;
//    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        if(arr.length == 0) return -1;

        while(start <= end) {

            int mid = start + (end - start)/2;

            if(arr[mid] > target) {
                end = mid - 1;
            } else if(arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
