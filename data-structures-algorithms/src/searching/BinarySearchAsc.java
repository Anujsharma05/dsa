package searching;

public class BinarySearchAsc {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 9, 9, 12, 51, 66, 90};
        int target = 90;

        int targetIndex = binarySearch(arr, target);
        System.out.println(targetIndex);
    }

    static int binarySearch(int[] arr, int target) {

        if(arr.length == 0) return -1;

        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {

//            this way of calculation mid will fail for large numbers, int might overflow due to large value
//            int mid = (start + end)/2;

            //better way to calculate mid
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
