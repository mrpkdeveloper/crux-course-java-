package dynamic_programming;

public class knapsnack {

	public static void main(String[] args) {

		int[] wt = { 1, 3, 4, 5 };
		int[] p = { 1, 4, 5, 7 };
		System.out.println(knapsack(wt, p, 7, 0));
		System.out.println(knapsackTD(wt, p, 7, 0, new int[wt.length][8]));
		System.out.println(knapsackBU(wt, p, 7));
	}

	public static int knapsack(int[] wt, int[] p, int cap, int vdx) {

		if (vdx == wt.length) {
			return 0;
		}

		int ans = 0;
		int exclude = knapsack(wt, p, cap, vdx + 1);
		int include = 0;
		if (cap >= wt[vdx]) {
			include = knapsack(wt, p, cap - wt[vdx], vdx + 1) + p[vdx];
		}

		ans = Math.max(include, exclude);
		return ans;
	}

	public static int knapsackTD(int[] wt, int[] p, int cap, int vdx, int[][] strg) {

		if (vdx == wt.length) {
			return 0;
		}
		if (strg[vdx][cap] != 0) {
			return strg[vdx][cap];
		}
		int ans = 0;
		int exclude = knapsackTD(wt, p, cap, vdx + 1, strg);
		int include = 0;
		if (cap >= wt[vdx]) {
			include = knapsackTD(wt, p, cap - wt[vdx], vdx + 1, strg) + p[vdx];
		}

		ans = Math.max(include, exclude);
		strg[vdx][cap] = ans;
		return ans;
	}

	public static int knapsackBU(int[] wt, int[] p, int cap) {
		int[][] strg = new int[wt.length + 1][cap + 1];

		for (int r = strg.length - 2; r >= 0; r--) {
			for (int c = 1; c < strg[0].length; c++) {

				int ans = 0;
				int exclude = strg[r + 1][c];
				int include = 0;
				if (c >= wt[r]) {
					include = strg[r + 1][c - wt[r]] + p[r];
				}

				ans = Math.max(include, exclude);
				strg[r][c] = ans;

			}
		}
		return strg[0][cap];
	}

}