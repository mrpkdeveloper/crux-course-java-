package lecture_9_recursion_2;

import java.util.ArrayList;
import java.util.Scanner;

public class recurssion_keypad_combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		String s = "145";
		System.out.println(kps(s));

	}

	public static ArrayList<String> kps(String s) {
		// base case
		if (s.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("\n");
			return br;
		}

		char ch = s.charAt(0);
		String ros = s.substring(1);
		// smaller problem
		ArrayList<String> rr = kps(ros);
		ArrayList<String> mr = new ArrayList<>();
		// self work
		String k = getCode(ch);
		for (int i = 0; i < k.length(); i++) {
			for (String val : rr) {
				mr.add(k.charAt(i) + val);
			}
		}
		return mr;

	}

	public static String getCode(char ch) {

		if (ch == '1')
			return "abc";
		else if (ch == '2')
			return "def";
		else if (ch == '3')
			return "ghi";
		else if (ch == '4')
			return "jk";
		else if (ch == '5')
			return "lmno";
		else if (ch == '6')
			return "pqr";
		else if (ch == '7')
			return "stu";
		else if (ch == '8')
			return "vwx";
		else if (ch == '9')
			return "yz";
		else if (ch == '0')
			return "@#";
		else
			return "";
	}

}
