package dynamic_programming;

import java.util.Arrays;

public class longest_common_subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcd";
		String s2 = "agcfd";
		int[][] strg = new int[s1.length() + 1][s2.length() + 1];
		for (int i = 0; i < strg.length; i++) {
			Arrays.fill(strg[i], -1);
		}
		System.out.println(lcsTD(s1, s2, strg));
		System.out.println(lcsBU(s1, s2));

	}

//o(m*n)
	public static int lcsTD(String s1, String s2, int[][] strg) {
		if (s1.length() == 0 || s2.length() == 0) {
			return 0;
		}

		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);
		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);
		// use
		if (strg[s1.length()][s2.length()] != -1) {
			return strg[s1.length()][s2.length()];
		}

		int ans = 0;
		if (ch1 == ch2) {
			ans = lcsTD(ros1, ros2, strg) + 1;
		} else {
			int o1 = lcsTD(s1, ros2, strg);
			int o2 = lcsTD(ros1, s2, strg);
			ans = Math.max(o1, o2);

		}
		strg[s1.length()][s2.length()] = ans;
		return ans;
	}

	public static int lcsBU(String s1, String s2) {
		int[][] strg = new int[s1.length() + 1][s2.length() + 1];
//		char ch1 = s1.charAt(0);
//		char ch2 = s2.charAt(0);
//		String ros1 = s1.substring(1);
//		String ros2 = s2.substring(1);
//		
		for (int r = strg.length - 2; r >= 0; r--) {
			for (int c = strg[0].length - 2; c >= 0; c--) {
				char ch1 = s1.charAt(r);
				char ch2 = s2.charAt(c);
				if (ch1 == ch2) {
					strg[r][c] = strg[r + 1][c + 1] + 1;
				} else {
					int o1 = strg[r][c + 1];
					int o2 = strg[r + 1][c];
					strg[r][c] = Math.max(o1, o2);
				}

			}
		}

		return strg[0][0];

	}
	
	
	
	
	

}
