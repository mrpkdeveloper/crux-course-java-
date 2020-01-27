package practise_after_recursion;

import java.util.Scanner;

public class generate_binarry_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t != 0) {
			String n = scn.next();
			gbs(n, "");
			t--;
		}
	}

	public static void gbs(String q, String ans) {
		if (q.length() == 0) {
			System.out.print(ans+" ");
			return;
		}
		char ch = q.charAt(0);
		String roq = q.substring(1);
		if (ch == '?') {
			gbs(roq, ans + "0");
			gbs(roq, ans + "1");

		} else
			gbs(roq, ans + ch);

	}

}
