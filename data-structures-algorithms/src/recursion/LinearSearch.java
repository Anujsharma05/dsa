package recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,4,8,9,12};
        int target = 3;
        int index = linearSearch(arr, target);
        System.out.println(index);
    }

    static int linearSearch(int[] arr, int target) {
        return helper(arr, target, 0);
    }

    static int helper(int[] arr, int target, int idx) {
        if(arr[idx] == target) return idx;
        if(idx == arr.length-1) return -1;
        return helper(arr, target, idx+1);
    }
}
