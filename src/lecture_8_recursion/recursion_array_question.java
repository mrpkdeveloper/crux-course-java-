package lecture_8_recursion;

public class recursion_array_question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 30, 900, 30, 30, 80, 30 };
		// display(arr, 0);
		System.out.println(max(arr, 0));
		// System.out.println(fio(arr, 0, 900));
		// System.out.println(lio(arr, 0, 30));
		// display(fai(arr,0,30,0),0);
	}

	public static void display(int[] arr, int vi) {
		if (vi == arr.length) {
			return;
		}
		System.out.println(arr[vi]);
		display(arr, vi + 1);
	}

	public static int max(int[] arr, int vi) {
		if (vi == arr.length)
			return 0;

		int big = max(arr, vi + 1);
		if (big < arr[vi])
			big = arr[vi];

		return big;

	}

	// fio=first index occurence
	public static int fio(int[] arr, int vi, int n) {
		if (vi == arr.length)
			return -1;
		int c = fio(arr, vi + 1, n);
		if (arr[vi] == n)
			c = vi;
		return c;
	}

	public static int lio(int[] arr, int vi, int n) {
		if (vi == arr.length)
			return -1;
		int index = lio(arr, vi + 1, n);
		if (n == arr[vi] && index == -1) {
			return vi;
		}

		return index;
	}

	// find all index of occurrence
	public static int[] fai(int[] arr, int vid, int item, int c) {
		if (vid == arr.length) {
			int[] br = new int[c];
			return br;
		}
		int[] rr;

		if (arr[vid] == item) {
			rr = fai(arr, vid + 1, item, c + 1);
			rr[c] = vid;
		} else {
			rr = fai(arr, vid + 1, item, c);
		}
		return rr;
	}

}
