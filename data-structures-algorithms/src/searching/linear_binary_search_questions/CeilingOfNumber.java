package searching.linear_binary_search_questions;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 1;

        int ceiling = findCeiling(arr, target);
        int floor = findFloor(arr, target);
        System.out.println("ceiling:" + ceiling);
        System.out.println("floor:" + floor);
    }

//    static int findCeiling(int[] arr, int target) {
//        int start = 0;
//        int end = arr.length-1;
//
//        while(start <= end) {
//            int mid = start + (end - start)/2;
//            if(arr[mid] == target) {
//                return arr[mid];
//            } else if(arr[mid] < target) {
//                start = mid + 1;
//            } else {
//                if(start == mid) {
//                    return arr[start];
//                } else {
//                    if(arr[mid-1] < target) {
//                        return arr[mid];
//                    } else {
//                        end = mid - 1;
//                    }
//                }
//
//            }
//        }
//
//        return -1;
//    }

    static int findCeiling(int[] arr, int target) {

        if(arr.length == 0) return -1;

        int start = 0;
        int end = arr.length-1;

        if(target > arr[end]) {
            return -1;
        }
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(arr[mid] == target) {
                return arr[mid];
            } else if(arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return arr[start];
    }

    static int findFloor(int[] arr, int target) {

        if(arr.length == 0) return -1;

        int start = 0;
        int end = arr.length-1;

        if(target < arr[start]) {
            return -1;
        }
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(arr[mid] == target) {
                return arr[mid];
            } else if(arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return arr[end];
    }
}
