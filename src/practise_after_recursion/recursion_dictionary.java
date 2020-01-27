package practise_after_recursion;

import java.util.Scanner;

public class recursion_dictionary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		pss(str, "", str);
		System.exit(0);

	}

	public static void pss(String q, String ans, String temp) {
		// base case
		if (q.length() == 0) {
			if (ans.charAt(0) >= temp.charAt(0) && check(ans, temp))
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

	public static boolean check(String s, String temp) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == temp.charAt(i)) {

			} else if (s.charAt(i) > temp.charAt(i))
				return true;
			else
				return false;

		}

		return false;
	}

	/*
	 * public static String string_sort(String s) {
	 * 
	 * char[] array = bubble_sort(s.toCharArray()); return String.valueOf(array); }
	 * 
	 * public static char[] bubble_sort(char[] arr) { int n = arr.length; for (int c
	 * = 0; c <= n - 2; c++) { for (int j = 0; j <= n - c - 2; j++) { if ((int)
	 * (Character.toLowerCase(arr[j])) > (int) (Character.toLowerCase(arr[j + 1])))
	 * { char temp = arr[j]; arr[j] = arr[j + 1]; arr[j + 1] = temp; } } } return
	 * arr; }
	 */

}
