package problems.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountItemsMatchingRule {

	public static void main(String[] args) {
		
		String[][] arr = {{"phone","blue","pixel"},{"computer","silver","lenovo"},{"phone","gold","iphone"}};
		
		List<List<String>> list = new ArrayList<>();
		
		List<String> l = null;
		for(int i=0; i<arr.length; i++) {
			l = Arrays.asList(arr[i]);
			list.add(l);
		}
		
		String ruleKey = "color";
		String ruleValue = "silver";
		
		int output = countMatches(list, ruleKey, ruleValue);
		System.err.println(output);
	}
	public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
		int ruleColumn = 0;
		
		if(ruleKey.equals("color")) ruleColumn = 1;
		else if(ruleKey.equals("name")) ruleColumn = 2;
		
		int count = 0;
		
		for(List<String> item: items) {
			if(item.get(ruleColumn).equals(ruleValue)) count++;
		}
		return count;
    }
}
