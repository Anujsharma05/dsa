package problems.geeksforgeeks.school;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pallindrome {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
			String s = br.readLine();
			if(s!=null && s.length()==0) {
				System.out.println("N");
			} else {
				boolean output = isPalin(s);
				
				if(output) {
					System.out.println("Y");
				} else {
					System.out.println("N");
				}
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}  
	}
	
	public static boolean isPalin(String s) {
		if(s == null ) return false;
		if(s.length()==0 || s.length() == 1) return true;
		if(s.charAt(0) != s.charAt(s.length()-1)) return false;
		return isPalin(s.substring(1, s.length()-1));
	}
}
