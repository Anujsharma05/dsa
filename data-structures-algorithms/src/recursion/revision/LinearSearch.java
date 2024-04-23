package recursion.revision;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 3, 7, 9, 3, 10,3, 11};
        int target = 3;
       List<Integer> list = searchMultipleAns(arr, target, 0);
        System.out.println(list);
    }

    static int search(int[] arr, int target, int i) {
        if (i == arr.length) return -1;
        if (arr[i] == target) return i;
        return search(arr, target, i + 1);
    }

    static List<Integer> searchMultipleAns(int[] arr, int target, int i) {
        List<Integer> list = new ArrayList<>();
        if (i == arr.length) {
            return list;
        }
        if (arr[i] == target) {
            list.add(i);
        }
        List<Integer> ansFromNextCall = searchMultipleAns(arr, target, i + 1);
        if(!ansFromNextCall.isEmpty()) {
            list.addAll(ansFromNextCall);
        }
        return list;
    }
}
