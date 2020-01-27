package practise;

import java.util.Scanner;

public class binarry_search_ass {
	static Scanner scn = new Scanner(System.in);

	public static void main(String args[]) {
		int n = scn.nextInt();
		int[] arr = new int[n];
		input(arr);
		int m = scn.nextInt();
		System.out.println(binary(arr, m));

	}

	public static void input(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
	}

	public static int binary(int[] arr, int m) {
		int lo = 0, hi = arr.length - 1;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (arr[mid] == m)
				return mid;
			else if (m > arr[mid])
				lo = mid + 1;
			else
				hi = mid - 1;

		}
		return -1;

	}
}