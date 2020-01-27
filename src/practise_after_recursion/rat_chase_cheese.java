package practise_after_recursion;

import java.util.Scanner;

public class rat_chase_cheese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int r = scn.nextInt();
		int c = scn.nextInt();
		char[][] arr = new char[r][c];
		for (int i = 0; i < arr.length; i++) {
			String str = scn.next();
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = str.charAt(j);
			}

		}

		int[][] ans = new int[arr.length][arr[0].length];

		if (ratchase(arr, 0, 0, ans)) {
			for (int i = 0; i < ans.length; i++) {
				for (int j = 0; j < ans[0].length; j++) {
					System.out.print(ans[i][j]);
				}
				System.out.println();

			}
		} else {
			System.out.println("NO PATH FOUND");
		}

	}

	public static boolean ratchase(char[][] arr, int cr, int cc, int[][] ans) {

		if (cr == arr.length - 1 && cc == arr[0].length - 1) {
			ans[cr][cc] = 1;
			return true;
		}
		if (cr >= arr.length || cc >= arr[0].length || cr < 0 || cc < 0 || ans[cr][cc] == 1 || arr[cr][cc] == 'X') {
			return false;
		}

		ans[cr][cc] = 1;
		// left
		if (ratchase(arr, cr, cc + 1, ans))
			return true;
		// right
		if (ratchase(arr, cr, cc - 1, ans))
			return true;
		// up
		if (ratchase(arr, cr - 1, cc, ans))
			return true;
		// down
		if (ratchase(arr, cr + 1, cc, ans))
			return true;
		ans[cr][cc] = 0;
		return false;

	}

}
