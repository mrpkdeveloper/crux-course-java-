package dynamic_programming;

import java.util.Arrays;

public class edit_distance {
//to make s2 same as s1 in minimum no of operations (insert,delete,replace)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "saturday";
		String s2 = "sunday";
		int[][] strg = new int[s1.length() + 1][s2.length() + 1];
		for (int i = 0; i < strg.length; i++) {
			Arrays.fill(strg[i], -1);
		}
		System.out.println(editdistanceTD(s1, s2, strg));
		System.out.println(editdistanceBU(s1, s2));

	}

	public static int editdistanceTD(String s1, String s2, int[][] strg) {
		if (s1.length() == 0 || s2.length() == 0) {
			return Math.max(s1.length(), s2.length());
		}

		if (strg[s1.length()][s2.length()] != -1) {
			return strg[s1.length()][s2.length()];
		}
		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);
		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);
		int ans = 0;
		if (ch1 == ch2) {
			ans = editdistanceTD(ros1, ros2, strg);
		} else {
			int i = editdistanceTD(ros1, s2, strg);
			int d = editdistanceTD(s1, ros2, strg);
			int r = editdistanceTD(ros1, ros2, strg);
			ans = Math.min(i, Math.min(d, r)) + 1;
		}
		strg[s1.length()][s2.length()] = ans;
		return ans;

	}

	public static int editdistanceBU(String s1, String s2) {
		int[][] strg = new int[s1.length() + 1][s2.length() + 1];

		for (int r = s1.length(); r >= 0; r--) {
			for (int c = s2.length(); c >= 0; c--) {
				if (r == s1.length()) {
					strg[r][c] = s2.length() - c;
					continue;
				}

				if (c == s2.length()) {
					strg[r][c] = s1.length() - r;
					continue;
				}

				if (s1.charAt(r) == s2.charAt(c)) {
					strg[r][c] = strg[r + 1][c + 1];
				} else {
					int i = strg[r + 1][c];
					int d = strg[r][c + 1];
					int re = strg[r + 1][c + 1];
					strg[r][c] = Math.min(i, Math.min(d, re)) + 1;
				}

			}

		}
		return strg[0][0];
	}

}
