package searching.linear_binary_search_questions;

//https://leetcode.com/problems/koko-eating-bananas/
public class KokoEatingBananas {
    public static void main(String[] args) {

        int[] piles = {312884470};
        int h = 312884469;
        int minSpeed = minEatingSpeed(piles, h);
        System.out.println(minSpeed);
    }
    public static int minEatingSpeed(int[] piles, int h) {

        if(piles.length == 1) {
            return countHours(piles, h);
        }

        int start  = 1;
        int end = piles[0];
        for(int i=1; i<piles.length; i++) {
            if(piles[i] > end) {
                end = piles[i];
            }
        }

        while(start < end) {
            int mid = start + (end - start)/2;

            int hours = countHours(piles, mid);

            if(hours <= h) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    static int countHours(int[] piles, double mid) {

        double hoursRequired = 0;
        for(int bananas: piles) {
            hoursRequired = hoursRequired + Math.ceil((float)bananas/mid);
        }
        return (int)hoursRequired;
    }
}
