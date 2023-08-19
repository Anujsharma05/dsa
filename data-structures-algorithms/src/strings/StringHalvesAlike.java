package strings;

//https://leetcode.com/problems/determine-if-string-halves-are-alike/
public class StringHalvesAlike {
	public static void main(String[] args) {
		String s = "dd";
		boolean isAlike = halvesAreAlike(s);
		System.out.println(isAlike);
	}

	public static boolean halvesAreAlike(String s) {

		int sum = 0;
		for (int i = 0; i < s.length(); i++) {

			boolean isVowel = isVowel(s.charAt(i));

			if (isVowel) {
				if (i < s.length() / 2) {
					sum++;
				} else {
					sum--;
				}
			}
		}
		return sum == 0;
	}

	static boolean isVowel(char ch) {
		boolean isVowel = false;
		switch (ch) {
//            case 'a','e','i','o','u','A','E','I','O','U' -> isVowel = true;
		}
		return isVowel;
	}
}
