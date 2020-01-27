package dynamic_programming;

public class min_partition_palindromic_substrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ababba";
		System.out.println(min_partition(s, 0, s.length() - 1));
		System.out.println(min_partitionTD(s, 0, s.length() - 1, new int[s.length()][s.length()]));
		System.out.println(min_partitionBU(s));

	}

	public static int min_partition(String s, int si, int ei) {
		int min = Integer.MAX_VALUE;
		if (ispalindrome(s, si, ei)) {
			return 0;
		}
		for (int k = si; k < ei; k++) {

			int fp = min_partition(s, si, k);
			int sp = min_partition(s, k + 1, ei);

			int total = fp + sp + 1;
			if (total < min) {
				min = total;
			}

		}
		return min;
	}

	public static int min_partitionTD(String s, int si, int ei, int[][] strg) {
		int min = Integer.MAX_VALUE;
		if (ispalindrome(s, si, ei)) {
			return 0;
		}
		if (strg[si][ei] != 0) {
			return strg[si][ei];
		}
		for (int k = si; k < ei; k++) {

			int fp = min_partitionTD(s, si, k, strg);
			int sp = min_partitionTD(s, k + 1, ei, strg);

			int total = fp + sp + 1;
			if (total < min) {
				min = total;
			}

		}
		strg[si][ei] = min;
		return min;
	}

	public static int min_partitionBU(String s) {
		int n = s.length();
		int[][] strg = new int[n][n];

		for (int slide = 1; slide <= n - 1; slide++) {
			for (int si = 0; si <= n - slide - 1; si++) {
				int ei = si + slide;

				// copy
				int min = Integer.MAX_VALUE;
				if (ispalindrome(s, si, ei)) {
					strg[si][ei] = 0;
					continue;
				}
				for (int k = si; k < ei; k++) {

					int fp = strg[si][k];
					int sp = strg[k + 1][ei];

					int total = fp + sp + 1;
					if (total < min) {
						min = total;
					}

				}
				strg[si][ei] = min;

			}

		}
		return strg[0][n - 1];
	}

	public static boolean ispalindrome(String s, int si, int ei) {
		int l = si;
		int r = ei;
		while (l <= r) {
			if (s.charAt(l) != s.charAt(r)) {
				return false;
			}

			l++;
			r--;
		}
		return true;
	}

}
