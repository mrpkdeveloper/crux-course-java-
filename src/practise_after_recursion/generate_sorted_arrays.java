package practise_after_recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class generate_sorted_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();

		int[] arr1 = new int[n];
		int[] arr2 = new int[m];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = scn.nextInt();
		}

		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = scn.nextInt();
		}

		generateSortedArray(arr1, arr2, new int[arr1.length + arr2.length], 0, 0, 0, false);

	}

	public static void generateSortedArray(int[] arr1, int[] arr2, int[] ans, int i, int j, int len, boolean islast1) {

		if (!islast1) {
			if (len != 0)
				display(ans, len);
			for (int k = i; k < arr1.length; k++) {
				if (len == 0) {
					ans[len] = arr1[k];
					generateSortedArray(arr1, arr2, ans, k + 1, j, len, true);

				} else {
					if (ans[len] < arr1[k]) {
						ans[len + 1] = arr1[k];
						generateSortedArray(arr1, arr2, ans, k + 1, j, len + 1, true);
					}
				}

			}
		} else {

			for (int k = j; k < arr2.length; k++) {
				if (ans[len] < arr2[k]) {
					ans[len + 1] = arr2[k];
					generateSortedArray(arr1, arr2, ans, i, k + 1, len + 1, false);

				}

			}

		}

	}

	public static void display(int[] C, int len) {

		for (int i = 0; i <= len; i++) {

			System.out.print(C[i] + " ");
		}

		System.out.println();
	}

}
