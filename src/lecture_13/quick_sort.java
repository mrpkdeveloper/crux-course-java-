package lecture_13;

public class quick_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 900, 80, 70, 60, 560, 2 };
		quick_sort(arr, 0, arr.length - 1);

		for (int val : arr) {
			System.out.println(val);
		}
	}

	public static void quick_sort(int[] arr, int lo, int hi) {

		// base case
		if (lo >= hi) {
			return;
		}

		// Portioning
		int mid = (lo + hi) / 2;
		int p = arr[mid];

		int l = lo, r = hi;

		while (l <= r) {

			while (arr[l] < p) {
				l++;
			}

			while (arr[r] > p) {
				r--;
			}

			if (l <= r) {
				int temp = arr[r];
				arr[r] = arr[l];
				arr[l] = temp;
				l++;
				r--;
			}

		}
		quick_sort(arr, lo, r);
		quick_sort(arr, l, hi);

	}

}
