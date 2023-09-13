package recursion;

public class CheckIfArraySorted {
    public static void main(String[] args) {
        int[] arr = {1,2,4,8,9,12};
        boolean isSorted = checkIfArrSorted(arr);
        System.out.println(isSorted);
    }

    static boolean checkIfArrSorted(int[] arr) {
        if(arr.length == 1) return true;
        return helper(arr, 0);
    }

    static boolean helper(int[] arr, int i) {

        if(arr[i] >= arr[i+1]) return false;

        if(i+1 == arr.length-1) return true;

        return helper(arr, i+1);
    }
}
