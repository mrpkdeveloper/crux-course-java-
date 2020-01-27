package dynamic_programming;

public class wine_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = { 2, 3, 5, 1, 4 };
		System.out.println(wine_prob(prices, 0, prices.length - 1));
		System.out.println(wine_probTD(prices, 0, prices.length - 1, new int[prices.length][prices.length]));
		System.out.println(wine_probBU(prices));
	}

	public static int wine_prob(int[] arr, int si, int ei) {
		int yr = arr.length - ei + si;

		if (si == ei) {
			return arr[si] * yr;
		}

		int startsell = wine_prob(arr, si + 1, ei) + arr[si] * yr;
		int endsell = wine_prob(arr, si, ei - 1) + arr[ei] * yr;

		int ans = Math.max(startsell, endsell);

		return ans;

	}

	public static int wine_probTD(int[] arr, int si, int ei, int[][] strg) {
		int yr = arr.length - ei + si;

		if (si == ei) {
			return arr[si] * yr;
		}
		if (strg[si][ei] != 0) {
			return strg[si][si];
		}
		int startsell = wine_probTD(arr, si + 1, ei, strg) + arr[si] * yr;
		int endsell = wine_probTD(arr, si, ei - 1, strg) + arr[ei] * yr;

		int ans = Math.max(startsell, endsell);
		strg[si][ei] = ans;
		return ans;

	}

	public static int wine_probBU(int[] arr) {
		int n = arr.length;
		int[][] strg = new int[n][n];
		for (int slide = 0; slide <= n - 1; slide++) {
			for (int si = 0; si <= n - slide - 1; si++) {
				int ei = si + slide;
				int yr = arr.length - ei + si;
				
				if (si == ei) {
					strg[si][ei] = arr[si] * yr;
					continue;
				}

				int startsell = strg[si + 1][ei] + arr[si] * yr;
				int endsell = strg[si][ei - 1] + arr[ei] * yr;

				strg[si][ei] = Math.max(startsell, endsell);

			}
		}
		return strg[0][n - 1];

	}
	

}
