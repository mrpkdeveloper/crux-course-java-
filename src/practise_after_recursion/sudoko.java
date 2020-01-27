package practise_after_recursion;

import java.util.Scanner;

public class sudoko {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j]=scn.nextInt();
			}
		}
		sudoko(arr, 0, 0);

	}

	public static void sudoko(int[][] arr, int cr, int cc) {
		if (cc == arr[0].length) {
			cc = 0;
			cr++;
		}
		
		// base case
		if (cr == arr.length) {
			display(arr);
			return;
		}

		if (arr[cr][cc] != 0) {
			sudoko(arr, cr, cc + 1);
			return;
		}
		for (int i = 1; i <= 9; i++) {
			if (isitpossible(arr, cr, cc, i)) {
				arr[cr][cc] = i;
				sudoko(arr, cr, cc + 1);
				arr[cr][cc] = 0;
			}

		}
	}

	private static boolean isitpossible(int[][] arr, int cr, int cc, int i) {
		// TODO Auto-generated method stub
		// column check
		for (int j = 0; j < arr[0].length; j++) {
			if (arr[cr][j] == i) {
				return false;
			}
		}
		// row check
		for (int j = 0; j < arr.length; j++) {
			if (arr[j][cc] == i) {
				return false;
			}
		}

		// box check
		for (int j = cr -cr % 3; j < cr - cr % 3 + 3; j++) {
			for (int k = cc - cc % 3; k < cc - cc % 3 + 3; k++) {
				if (arr[j][k] == i) {
					return false;
				}
			}
		}

		return true;

	}

	public static void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
