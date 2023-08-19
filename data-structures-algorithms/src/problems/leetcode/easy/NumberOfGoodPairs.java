package problems.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
        int goodPairsCount = numIdenticalPairs(nums);
        System.out.println(goodPairsCount);
    }
//    public static int numIdenticalPairs(int[] nums) {
//        int count = 0;
//
//        for(int i=0; i<nums.length; i++) {
//            for(int j=i+1; j<nums.length; j++) {
//                if(nums[i] == nums[j]) {
//                    count++;
//                }
//            }
//        }
//        return count;
//    }

    //    O(n) solution
    public static int numIdenticalPairs(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }
        int sum = 0;
        for (int count : map.values()) {
            int combinations = count * (count - 1) / 2;
            sum = sum + combinations;
        }
        return sum;
    }

    //Better approach using hashtable O(N) time and O(1) auxiliary space
    public static int numIdenticalPairs1(int[] guestList) {
        int[] hall = new int[101];
        int handshakes = 0;
        for (int peo : guestList) {
            int friend = hall[peo];
            handshakes += friend;
            hall[peo] = friend + 1;
        }
        return handshakes;
    }

    //Optimized approach using HashMap O(N) time and O(1) auxiliary space
    public static int numIdenticalPairs2(int[] guestList) {
        Map<Integer, Integer> hall = new HashMap<>();
        int handshakes = 0;
        for (int people : guestList) {
            int friend = hall.getOrDefault(people, 0);
            handshakes += friend;
            hall.put(people, friend + 1);
        }
        return handshakes;
    }
}
