package problems.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {

	public static void main(String[] args) {
		
		String jewels = "aA";
		String stones = "aAAbbbb";
		
		int num = numJewelsInStones(jewels, stones);
		System.err.println(num);
	}
	public static int numJewelsInStones(String jewels, String stones) {
        
		int count = 0;
		
//		for(int i=0; i<jewels.length(); i++) {
//			for(int j=0; j<stones.length(); j++) {
//				if(jewels.charAt(i) == stones.charAt(j)) {
//					count++;
//				}
//			}
//		}
		
		Set<Character> set = new HashSet<>();
		
		for(int i=0; i<jewels.length(); i++) {
			set.add(jewels.charAt(i));
		}
		
		for(int i=0; i<stones.length(); i++) {
			if(set.contains(stones.charAt(i))) count++;
		}
		
//		Map<Character, Integer> map = new HashMap<>();
//		
//		for(int i=0; i<stones.length(); i++) {
//			if(map.containsKey(stones.charAt(i))) {
//				map.put(stones.charAt(i), map.get(stones.charAt(i)) + 1);
//			} else {
//				map.put(stones.charAt(i), 1);
//			}
//		}
//		
//		for(int i=0; i<jewels.length(); i++) {
//			if(map.containsKey(jewels.charAt(i))) {
//				count = count + map.get(jewels.charAt(i));
//			}
//		}
		
		return count;
    }
}
