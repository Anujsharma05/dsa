package problems.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class KidsGreatestCandies {

	public static void main(String[] args) {
		
		int[] candies = {12,1,12};
		int extraCandies = 1;
		
		List<Boolean> list = kidsWithCandies(candies, extraCandies);
		for(Boolean b: list) {
			System.out.print(b + " ");
		}
	}
	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
		int max = Integer.MIN_VALUE;
		for(int i=0; i<candies.length; i++) {
			if(candies[i] > max) {
				max = candies[i];
			}
		}
		
		List<Boolean> list = new ArrayList<>();
		
		for(int i=0; i<candies.length; i++) {
			if((candies[i] + extraCandies) >= max) {
				list.add(true);
			} else {
				list.add(false);
			}
		}
		
		return list;
    }
}
