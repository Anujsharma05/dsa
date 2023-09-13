package recursion;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {

		String st = "91";
		int chInt = st.charAt(0) - '0';
		System.out.println(chInt);

		String str = "abc";
		permutation("", str);
	}

	static void permutation(String p, String up) {

		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		String ch = up.charAt(0) + "";

		for(int i=0; i<=p.length(); i++) {

			String start = p.substring(0, i);
			String end = p.substring(i, p.length());
			permutation(start+ch+end, up.substring(1));
		}

	}
}
