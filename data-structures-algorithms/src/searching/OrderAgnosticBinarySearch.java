package searching;

//will work for both ascending or descending sorted arrays
public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
//        int[] arr = {1, 3, 5, 6, 9, 9, 12, 51, 66, 90};
        int[] arr = {91, 55, 51, 44, 22, 12, 9, 5, 2, 1};
        int target = 51;

        int targetIndex = binarySearchOrderAgnostic(arr, target);
        System.out.println(targetIndex);
    }

    static int binarySearchOrderAgnostic(int[] arr, int target) {

        if(arr.length == 0) return -1;

        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {

//            this way of calculation mid will fail for large numbers, int might overflow due to large value
//            int mid = (start + end)/2;

            //better way to calculate mid
            int mid = start + (end - start)/2;

            if(arr[mid] == target) {
                return mid;
            }

            if(isAsc) {
                if(arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
