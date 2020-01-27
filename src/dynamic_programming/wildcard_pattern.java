package dynamic_programming;

public class wildcard_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "bacd";
		String p = "b********d***********";
		System.out.println(wildcard_pattern(s, p));
		System.out.println(wildcard_patternTD(s, p, new int[s.length() + 1][p.length() + 1]));
		System.out.println(wildcard_patternBU(s, p));

	}

	public static boolean wildcard_pattern(String s, String p) {
		if (s.length() != 0 && p.length() == 0) {
			return false;
		}
		if (s.length() == 0 && p.length() == 0) {
			return true;
		}
		if (s.length() == 0 && p.length() != 0) {
			for (int i = 0; i < p.length(); i++) {
				if (p.charAt(i) != '*') {
					return false;
				}
			}
			return true;
		}

		char ch1 = s.charAt(0);
		char ch2 = p.charAt(0);
		String ros = s.substring(1);
		String rop = p.substring(1);
		boolean ans;
		if (ch1 == ch2 || ch2 == '?') {
			ans = wildcard_pattern(ros, rop);
		} else if (ch2 == '*') {
			boolean blank = wildcard_pattern(s, rop);
			boolean multiple_char = wildcard_pattern(ros, p);
			ans = blank || multiple_char;
		} else {
			ans = false;
		}

		return ans;

	}

	public static boolean wildcard_patternTD(String s, String p, int[][] strg) {
		if (s.length() != 0 && p.length() == 0) {
			return false;
		}
		if (s.length() == 0 && p.length() == 0) {
			return true;
		}
		if (s.length() == 0 && p.length() != 0) {
			for (int i = 0; i < p.length(); i++) {
				if (p.charAt(i) != '*') {
					return false;
				}
			}
			return true;
		}
		if (strg[s.length()][p.length()] != 0) {
			return (strg[s.length()][p.length()] == 2) ? true : false;
		}
		char ch1 = s.charAt(0);
		char ch2 = p.charAt(0);
		String ros = s.substring(1);
		String rop = p.substring(1);
		boolean ans;
		if (ch1 == ch2 || ch2 == '?') {
			ans = wildcard_patternTD(ros, rop, strg);
		} else if (ch2 == '*') {
			boolean blank = wildcard_patternTD(s, rop, strg);
			boolean multiple_char = wildcard_patternTD(ros, p, strg);
			ans = blank || multiple_char;
		} else {
			ans = false;
		}
		strg[s.length()][p.length()] = (ans ? 2 : 1);
		return ans;

	}

	public static boolean wildcard_patternBU(String s, String p) {
		boolean[][] strg = new boolean[s.length() + 1][p.length() + 1];
		strg[s.length()][p.length()] = true;

		for (int r = s.length(); r >= 0; r--) {
			for (int c = p.length() - 1; c >= 0; c--) {

				if (r == s.length()) {
					if (p.charAt(c) == '*') {
						strg[r][c] = strg[r][c + 1];
					}
					continue;
				}

				char ch1 = s.charAt(r);
				char ch2 = p.charAt(c);

				// copy
				if (ch1 == ch2 || ch2 == '?') {
					strg[r][c] = strg[r + 1][c + 1];
				} else if (ch2 == '*') {
					boolean blank = strg[r][c + 1];
					boolean multiple_char = strg[r + 1][c];
					strg[r][c] = blank || multiple_char;
				} else {
					strg[r][c] = false;
				}
				// copy

			}
		}
		return strg[0][0];
	}

}
