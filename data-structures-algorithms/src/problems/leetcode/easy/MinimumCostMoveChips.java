package problems.leetcode.easy;

/**
 * https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position
 */
public class MinimumCostMoveChips {
    public static void main(String[] args) {
        int[] position = {1,2,3};

        int cost = minCostToMoveChips(position);
        System.out.println(cost);
    }

    public static int minCostToMoveChips(int[] position) {

        int odd = 0;
        int even = 0;
        for(int i=0; i<position.length; i++) {
            if(position[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

//        if(even > odd) {
//            return odd;
//        } else {
//            return even;
//        }
        return Math.min(even, odd);
    }
}
