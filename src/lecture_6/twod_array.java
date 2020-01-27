package lecture_6;

import java.util.Scanner;

public class twod_array {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 1, 2, 3 }, { 4, 5, 6 } };
		// input(arr);
		display(arr);
		System.out.println();
		// verticaldisp(arr);
		// System.out.println();
		// wavedisp(arr);
		spiraldisp(arr);
	}

	public static void input(int[][] arr) {
		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[r].length; c++) {
				System.out.print("[" + r + "]" + "[" + c + "]");
				arr[r][c] = scn.nextInt();
			}
		}
	}

	public static void display(int[][] arr) {
		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[r].length; c++) {
				System.out.print(arr[r][c] + " ");
			}
			System.out.println();
		}
	}

	public static void verticaldisp(int[][] arr) {
		for (int c = 0; c < arr[0].length; c++) {
			for (int r = 0; r < arr.length; r++) {
				System.out.print(arr[r][c] + " ");
			}
			System.out.println();
		}
	}

	public static void wavedisp(int[][] arr) {
		for (int c = 0; c < arr[0].length; c++) {
			if (c % 2 == 0) {
				for (int r = 0; r < arr.length; r++) {
					System.out.print(arr[r][c] + " ");
				}

				System.out.println();
			} else {
				for (int r = arr.length - 1; r >= 0; r--) {
					System.out.print(arr[r][c] + " ");
				}

				System.out.println();
			}

		}
	}

	public static void spiraldisp(int[][] arr) {
		int mincol = 0;
		int maxcol = arr[0].length - 1;
		int minrow = 0;
		int maxrow = arr.length - 1;
		int r = 0;
		int c = 0;
		int count = 0, nel = arr.length * arr[0].length;
		while (count < nel) {
			// first col
			c = mincol;
			for (r = minrow; r <= maxrow && count < nel; r++)
				{System.out.print(arr[r][c]);
				count++;
				}
			mincol++;

			// last row
			r = maxrow;
			for (c = mincol; c <= maxcol&& count < nel; c++)
				{System.out.print(arr[r][c]);
				count++;}
			maxrow--;

			// last col
			c = maxcol;
			for (r = maxrow; r >= minrow&& count < nel; r--)
				{System.out.print(arr[r][c]);
				count++;}

			maxcol--;

			// first row
			r = minrow;
			for (c = maxcol; c >= mincol&& count < nel; c--)
				{System.out.print(arr[r][c]);
				count++;}
			minrow++;
		}
	}
}
