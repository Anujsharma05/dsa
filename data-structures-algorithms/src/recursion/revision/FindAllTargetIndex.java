package recursion.revision;

import java.util.ArrayList;
import java.util.List;

public class FindAllTargetIndex {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,8,12};
        int target = 4;
        List<Integer> res = findTarget(arr, target, 0);
        System.out.println(res);
    }
    static List<Integer> findTarget(int[] arr, int target, int index) {

        List<Integer> targets = new ArrayList<>();
        if(index == arr.length) {
            return targets;
        }
        if(arr[index] == target) {
            targets.add(index);
        }
        List<Integer> next = findTarget(arr, target, index+1);

        if(!next.isEmpty()) {
            targets.addAll(next);
        }
        return targets;
    }
}
