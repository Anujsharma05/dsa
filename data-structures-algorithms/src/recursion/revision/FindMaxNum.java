package recursion.revision;

public class FindMaxNum {
    public static void main(String[] args) {
        int arr[] = {4, 5, 11, 9, 3};
        int output = findMaxNum(arr, 0, Integer.MIN_VALUE);
        System.out.println(output);
    }
    static int findMaxNum(int[] arr, int i, int max) {
        if(arr.length==i) return max;
        if(arr[i] > max) {
            max = arr[i];
        }
        return findMaxNum(arr, i+1, max);
    }
}
