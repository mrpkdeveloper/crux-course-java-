package practise;

import java.util.Scanner;

public class string_pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		System.out.println(pallindrome(s));
		
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

}
