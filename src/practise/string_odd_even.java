package practise;

import java.util.Scanner;

public class string_odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if((i+1)%2!=0) {
				ch=(char)(ch+1);
				System.out.print(ch);
			}
			else {
				ch=(char)(ch-1);
				System.out.print(ch);				
			}
				
		}

	}

}
