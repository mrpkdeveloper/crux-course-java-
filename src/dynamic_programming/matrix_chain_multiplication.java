package dynamic_programming;

import java.util.Arrays;

public class matrix_chain_multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5 };
		int[][] strg = new int[arr.length][arr.length];
		for (int i = 0; i < strg.length; i++) {
			Arrays.fill(strg[i], -1);
		}
		System.out.println(mcmTD(arr, 0, arr.length - 1, strg));
		System.out.println(mcmBU(arr));
	}

	public static int mcmTD(int[] arr, int si, int ei, int[][] strg) {
		int min = Integer.MAX_VALUE;
		if (ei == si + 1) {
			return 0;
		}
		if (strg[si][si] != -1) {
			return strg[si][si];
		}
		for (int k = si + 1; k <= ei - 1; k++) {

			int fp = mcmTD(arr, si, k, strg);
			int sp = mcmTD(arr, k, ei, strg);
			int sw = arr[si] * arr[k] * arr[ei];
			int sum = fp + sp + sw;
			if (sum < min) {
				min = sum;
			}
		}
		strg[si][ei] = min;
		return min;
	}

	// Diagonally filling
	public static int mcmBU(int[] arr) {
		int n = arr.length;
		int[][] strg = new int[n][n];

		for (int slide = 1; slide <= n - 2; slide++) {
			for (int si = 0; si <= n - slide - 2; si++) {
				int ei = si + slide + 1;

				// copy
				int min = Integer.MAX_VALUE;
				for (int k = si + 1; k <= ei - 1; k++) {

					int fp = strg[si][k];
					int sp = strg[k][ei];
					int sw = arr[si] * arr[k] * arr[ei];
					int sum = fp + sp + sw;
					if (sum < min) {
						min = sum;
					}
				}
				strg[si][ei] = min;

			}
		}

		return strg[0][n - 1];

	}

}
