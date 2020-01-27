package practise;

import java.util.Scanner;

public class array_next_smaller_next_greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scn.nextInt();
			int[] arr = new int[n];
			for (int j = 0; j < arr.length; j++) {
				arr[j] = scn.nextInt();
			}
			int big = 0, in = 0;
			// next bigger
			for (int c = 0; c < arr.length; c++) {
				for (int j = c + 1; j < arr.length; j++) {
					big = arr[c];
					if (arr[c] < arr[j]) {
						big = arr[j];
						in = j;
						break;
					} else
						big = -1;
				}
				// next smaller
				int small = -1;
				for (int k = in + 1; k < arr.length; k++) {
					if (big > arr[k]) {
						small = arr[k];
						break;
					}
				}

				System.out.print(small + " ");

			}
			System.out.println();

		}
	}
}
