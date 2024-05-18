package recursion.other_questions;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 7;
        int targetIndex = binarySearch(arr, target);
        System.out.println(targetIndex);
    }

    static int binarySearch(int[] arr, int target) {
        int low= 0, high = arr.length-1;
        int index = search(arr, target, low, high);
        return index;
    }

    static int search(int[] arr, int target, int low, int high) {
        if(low > high) return -1;

        int mid = low + (high-low)/2;

        if(target > arr[mid]) {
            low = mid + 1;
        } else if(target < arr[mid]){
            high = mid - 1;
        } else {
            return mid;
        }
        return search(arr, target, low, high);
    }
}
