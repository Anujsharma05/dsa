package problems.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

	public static void main(String[] args) {
		String s = "rat", t = "car";
		int x = 'z'-'a'+1;
		System.err.println(x);
		boolean anagram = isAnagram(s, t);
		System.err.println(anagram);
	}
	public static boolean isAnagram(String s, String t) {
        
		if(s==null || t==null) return false;
		if(s.length() != t.length()) return false;
		
		Map<Character, Integer> map = new HashMap<>();

		for(int i=0; i<s.length(); i++) {
			if(map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			} else {
				map.put(s.charAt(i), 1);
			}
		}
		
		for(int i=0; i<t.length(); i++) {
			if(map.containsKey(t.charAt(i))) {
				map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
			} else {
				return false;
			}
		}
		
		
		for(Integer i: map.values()) {
			if(i != 0) return false;
		}
		
		return true;
    }
}
