package dynamic_programming;

//same as of mcm
public class harry_potter_smoke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 40, 60, 20, 30};
		System.out.println(smoke(arr, 0, arr.length - 1));
		System.out.println(smokeTD(arr, 0, arr.length - 1, new int[arr.length][arr.length]));
		System.out.println(smokeBU(arr));
	}

	public static int color(int[] arr, int si, int ei) {
		int color = 0;
		for (int i = si; i <= ei; i++) {
			color += arr[i];
		}
		return color % 100;
	}

	public static int smoke(int[] arr, int si, int ei) {
		if (si == ei) {
			return 0;
		}

		int min = Integer.MAX_VALUE;
		for (int k = si; k < ei; k++) {

			int fp = smoke(arr, si, k);
			int sp = smoke(arr, k + 1, ei);
			int sw = color(arr, si, k) * color(arr, k + 1, ei);

			int smoke = fp + sp + sw;
			if (smoke < min) {
				min = smoke;
			}

		}
		return min;
	}

	public static int smokeTD(int[] arr, int si, int ei, int[][] strg) {
		if (si == ei) {
			return 0;
		}
		if (strg[si][ei] != 0) {
			return strg[si][ei];
		}
		int min = Integer.MAX_VALUE;
		for (int k = si; k < ei; k++) {

			int fp = smokeTD(arr, si, k, strg);
			int sp = smokeTD(arr, k + 1, ei, strg);
			int sw = color(arr, si, k) * color(arr, k + 1, ei);

			int smoke = fp + sp + sw;
			if (smoke < min) {
				min = smoke;
			}

		}
		strg[si][ei] = min;
		return min;
	}

    //Diagonally filling
	public static int smokeBU(int[] arr) {
		int n = arr.length;
		int[][] strg = new int[n][n];

		for (int slide = 1; slide <= n - 1; slide++) {
			for (int si = 0; si <= n - slide - 1; si++) {
				int ei = si + slide;
				// copy
				int min = Integer.MAX_VALUE;
				for (int k = si; k < ei; k++) {

					int fp = strg[si][k];
					int sp = strg[k + 1][ei];
					int sw = color(arr, si, k) * color(arr, k + 1, ei);

					int smoke = fp + sp + sw;
					if (smoke < min) {
						min = smoke;
					}

				}
				strg[si][ei] = min;

			}
		}
		return strg[0][n - 1];
	}

}
