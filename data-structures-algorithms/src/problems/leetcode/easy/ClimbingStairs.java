package problems.leetcode.easy;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/climbing-stairs/description/
 */
public class ClimbingStairs {

  public static void main(String[] args) {
    int n = 5;

    long start = System.currentTimeMillis();
    int ways = climbStairs(n);
    long end = System.currentTimeMillis();

    System.out.println("time: " + (end-start));
    System.out.println(ways);
    //1836311903
  }

  public static int climbStairs(int n) {
    HashMap<Integer, Integer> climbResult = new HashMap<>();
    return climb(n, climbResult);
  }

  private static int climb(int n, HashMap<Integer, Integer> map) {

    if(n < 0) {
      return 0;
    }
    if(n == 0) {
      return 1;
    }

    if(map.get(n) == null) {
      int oneStep = climb(n-1, map);
      int twoSteps = climb(n-2, map);
      map.put(n, oneStep+twoSteps);
      return oneStep + twoSteps;
    } else {
      return map.get(n);
    }
  }
}
