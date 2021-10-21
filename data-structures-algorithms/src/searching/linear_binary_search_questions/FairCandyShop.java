package searching.linear_binary_search_questions;

import java.util.Arrays;

//https://leetcode.com/problems/fair-candy-swap/
public class FairCandyShop {
    public static void main(String[] args) {
        int[] aliceSizes = {2};
        int[] bobSizes = {1, 3};

        int[] output = fairCandySwap(aliceSizes, bobSizes);
        System.out.println(Arrays.toString(output));
    }

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceSum = 0;
        int bobSum = 0;

        for(int i: aliceSizes) {
            aliceSum = i + aliceSum;
        }

        for(int i: bobSizes) {
            bobSum = bobSum + i;
        }

        for(int i=0; i<aliceSizes.length; i++) {
            int aliceGiveCandies = aliceSizes[i];
            for(int j=0; j<bobSizes.length; j++) {
                int bobGiveCandies = bobSizes[j];

                int aliceCurrentCandies = aliceSum - aliceGiveCandies + bobGiveCandies;
                int bobCurrentCandies = bobSum - bobGiveCandies + aliceGiveCandies;

                if(aliceCurrentCandies == bobCurrentCandies) {
                    return new int[] {aliceGiveCandies, bobGiveCandies};
                }
            }
        }

        return new int[] {0, 0};
    }
}
