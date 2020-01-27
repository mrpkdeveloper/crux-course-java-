package practise_after_recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class pratise {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		pss((str), "", str);
		System.exit(0);
	}

	public static void pss(String q, String ans, String temp) {
		// base case
		if (q.length() == 0) {

			if (ans.compareTo(temp) > 0)
				System.out.println(ans);

			return;
		}
		for (int i = 0; i < q.length(); i++) {
			char c = q.charAt(i);
			String roq = q.substring(0, i) + q.substring(i + 1);
			int flag = 0;
			for (int j = i + 1; j < q.length(); j++) { // no duplicates
				if (c == q.charAt(j)) {
					flag++;
				}
			}
			if (flag == 0)
				pss(roq, ans + c, temp);
		}
	}
}
