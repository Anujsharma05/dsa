package recursion.revision;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 8, 10, 13, 15};
        int target = 1;
        int index = search(arr, target);
        System.out.println(index);
    }

    static int search(int[] arr, int target) {
        return helper(arr, target, 0, arr.length - 1);
    }

    static int helper(int[] arr, int target, int l, int h) {

        if (l > h) return -1;

        int mid = l + (h - l) / 2;

        if (arr[mid] < target) {
            l = mid + 1;
        } else if (arr[mid] > target) {
            h = mid - 1;
        } else {
            return mid;
        }

        return helper(arr, target, l, h);
    }
}
