package practise;

import java.util.Scanner;

public class toggle_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		for(int i = 0 ; i<s.length();i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				System.out.print(Character.toLowerCase(s.charAt(i)));
			}
			else
				System.out.print(Character.toUpperCase(s.charAt(i)));
		}
		

	}

}
