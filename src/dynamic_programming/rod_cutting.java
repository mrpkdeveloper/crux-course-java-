package dynamic_programming;

public class rod_cutting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 2, 10, 20, 11, 12, 13 };
		System.out.println(rod_cutting(arr, arr.length - 1));
		System.out.println(rod_cuttingTD(arr, arr.length - 1, new int[arr.length]));
		System.out.println(rod_cuttingBU(arr));
	}

	public static int rod_cutting(int[] arr, int len) {
		int max = arr[len];
		int left = 1;
		int right = len - 1;
		while (left <= right) {

			int fp = rod_cutting(arr, left);
			int sp = rod_cutting(arr, right);
			int total = fp + sp;

			if (total > max) {
				max = total;
			}

			left++;
			right--;
		}
		return max;
	}

	public static int rod_cuttingTD(int[] arr, int len, int[] strg) {
		if (strg[len] != 0) {
			return strg[len];
		}
		int max = arr[len];
		int left = 1;
		int right = len - 1;

		while (left <= right) {

			int fp = rod_cuttingTD(arr, left, strg);
			int sp = rod_cuttingTD(arr, right, strg);
			int total = fp + sp;

			if (total > max) {
				max = total;
			}

			left++;
			right--;
		}
		strg[len] = max;
		return max;
	}

	public static int rod_cuttingBU(int[] arr) {
		int[] strg = new int[arr.length];
		for (int len = 0; len < arr.length; len++) {
			int max = arr[len];
			int left = 1;
			int right = len - 1;

			while (left <= right) {

				int fp = strg[left];
				int sp = strg[right];
				int total = fp + sp;

				if (total > max) {
					max = total;
				}

				left++;
				right--;
			}
			strg[len] = max;
		}
		return strg[arr.length - 1];
	}
}
