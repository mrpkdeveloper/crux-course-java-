package practise;

import java.util.Scanner;

public class strings_pallindromic_substrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		System.out.println(substring_pallindrome(s));
		
	}
	
	
	
	public static boolean pallindrome(String str) {
		boolean ans = true;
		for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
		}
		return ans;
	}
	
	public static int substring_pallindrome(String str) {
		int count=0;
		for (int si = 0; si < str.length(); si++) {
			for (int ei = si+1; ei <=str.length(); ei++) {
				String sub=str.substring(si, ei);
				if(pallindrome(sub))
					count++;
			}
		}
		return count;

	}

}
