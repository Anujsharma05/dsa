package recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * List is not passed as param but created inside the recursive method
 */
public class FindAllTargetIndex {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,8,12};
        int target = 4;
        List<Integer> res = findTarget(arr, target);
        res.stream().forEach(System.out::println);
    }

    static List<Integer> findTarget(int[] arr, int target) {
        return helper(arr, target, 0);
    }

    static List<Integer> helper(int[] arr, int target, int index) {

        List<Integer> list = new ArrayList<>();

        if(index == arr.length) {
            return list;
        }

        if(arr[index] == target) {
            list.add(index);
        }

        List<Integer> ansFromNextCall = helper(arr, target, index+1);
        if(!ansFromNextCall.isEmpty()) {
            list.addAll(ansFromNextCall);
        }
        return list;
    }
}
