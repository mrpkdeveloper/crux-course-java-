package practise;

import java.util.Scanner;

public class string_difference_in_ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		char ch1=s.charAt(0),ch2=s.charAt(0);int i=0;
		for(i = 0 ; i<s.length()-1; i++) {
			ch1=s.charAt(i);
			ch2=s.charAt(i+1);
			int n = (int)(ch2 - ch1);
			System.out.print(ch1);
			System.out.print(n);
		}
		System.out.print(ch2);

	}

}
