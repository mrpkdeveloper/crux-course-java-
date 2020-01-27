package practise_after_recursion;

import java.util.Scanner;

public class n_knight {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		n_knight(new boolean[n][n], 0, 0, n, 0, "");
		System.out.println("\n" + count);
	}

	public static void n_knight(boolean[][] board, int cc, int cr, int tk, int kpsf, String ans) {
		if (kpsf == tk) {
			System.out.print(ans + " ");
			count++;
			return;
		}
		if (cc == board[0].length) {
			cr++;
			cc = 0;
		}
		if (cr == board.length) {
			return;
		}

		if (isitsafe(board, cr, cc)) {
			// placed
			board[cr][cc] = true;
			n_knight(board, cc + 1, cr, tk, kpsf + 1, ans + "{" + cr + "-" + cc + "} ");
			board[cr][cc] = false;
		}
		// not placed
		n_knight(board, cc + 1, cr, tk, kpsf, ans);

	}

	public static boolean isitsafe(boolean[][] board, int cr, int cc) {
		int r = cr;
		int c = cc;
			if (r-2>=0&&c-1>=0&&board[r - 2][c - 1]) {
				return false;
			}
			if (r-2>=0&&c+1<board[0].length&&board[r - 2][c + 1]) {
				return false;
			}
			if (r-1>=0&&c-2>=0&&board[r - 1][c - 2]) {
				return false;
			}
			if (r-1>=0&&c+2<board[0].length&&board[r - 1][c + 2]) {
				return false;
			}
		return true;
	}
}
