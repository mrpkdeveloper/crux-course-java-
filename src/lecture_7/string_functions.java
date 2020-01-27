package lecture_7;

import java.util.Scanner;

public class string_functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scn = new Scanner(System.in);
//		String str = scn.next();
		//System.out.println(pallindrome(str));
		//substring(str);
         System.out.println(substring_pallindrome_time_comp("nnittin"));
	}

	public static boolean pallindrome(String str) {
		boolean ans = true;
			for (int i = 0, j = str.length() - 1; i<j; i++, j--) {
				if (str.charAt(i) != str.charAt(j)) {
					return false;
				}
			}
			return ans;
		}

	public static void substring(String str) {
		for (int si = 0; si < str.length(); si++) {
			for (int ei = si+1; ei <=str.length(); ei++) {
				System.out.print(str.substring(si, ei) + " ");
			}
			System.out.println();
		}

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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static int substring_pallindrome_time_comp(String str) {
		int count=0;
	// odd substrings
		for(int axis=0;axis<str.length();axis++) {
			for(int orbit=0;(axis+orbit)<str.length() && (axis-orbit)>=1;orbit++) {
				if(str.charAt(axis-orbit)==str.charAt(axis+orbit)) {
					count++;
				}
				else
					break;
			}
		}
		
		// even substrings
		for(double axis=0.5;axis<str.length();axis++) {
			for(double orbit=0.5;(axis+orbit)<str.length() && (axis-orbit)>=1;orbit++) {
				if(str.charAt((int) (axis-orbit))==str.charAt((int) (axis+orbit))) {
					count++;
				}
				else
					break;
			}
		}		
		
		
		
		return count;

	}	
	
	
}






















