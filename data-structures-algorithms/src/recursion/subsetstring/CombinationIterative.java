package recursion.subsetstring;

import java.util.*;

public class CombinationIterative {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        subsetPreventDuplicateTutorial(arr);
    }

    static void subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for (int num : arr) {
            int outerSize = outer.size();
            for(int i=0; i<outerSize; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }

        System.out.println(outer);
    }

    /**
     * My solution
     */
    static void subsetPreventDuplicate(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        Arrays.sort(arr);
        outer.add(new ArrayList<>());

        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            int outerSize = outer.size();

            int val;
            if(set.add(num)) {
                val = 0;
            } else {
                val = outerSize/2;
            }

            for(int i=val; i<outerSize; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        System.out.println(outer);
    }

    /**
     * Tutorial solution
     */
    static void subsetPreventDuplicateTutorial(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        Arrays.sort(arr);
        outer.add(new ArrayList<>());

        int start = 0, end = 0;

        for (int j=0; j<arr.length; j++) {
            int outerSize = outer.size();

            if(j>0 && arr[j] == arr[j-1]) {
                start = end + 1;
            }
            end = outerSize - 1;

            for(int i=start; i<outerSize; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(arr[j]);
                outer.add(internal);
            }
        }
        System.out.println(outer);
    }
}
