package practise_after_recursion;

import java.util.Scanner;

public class n_queen {
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		n_queen(new boolean[n][n], n, 0, 0, 0, "");
		System.out.println("\n"+count);
		
		
	}

	public static void n_queen(boolean[][] board, int tq, int qpsf, int cr, int cc, String ans) {
		if (qpsf == tq) {
			System.out.print(ans + " ");
			count++;
			return;

		}

		if (cc == board[0].length) {
			cc = 0;
			cr++;
		}
		if (cr == board.length) {
			return;
		}

		if (isPossible(board, cr, cc)) {
			// placed
			board[cr][cc] = true;
			n_queen(board, tq, qpsf + 1, cr, cc + 1, ans + "{" + (cr + 1) + "-" + (cc + 1) + "} ");
			board[cr][cc] = false;
		}
		// not placed
		n_queen(board, tq, qpsf, cr, cc + 1, ans);

	}

	public static boolean isPossible(boolean[][] board, int cr, int cc) {

		// row check
		for (int i = 0; i < cc; i++) {
			if (board[cr][i] == true) {
				return false;
			}
		}

		// column check
		for (int i = 0; i < cr; i++) {
			if (board[i][cc] == true) {
				return false;
			}
		}

		// left diagonal
		for (int i = cr, j = cc; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j] == true) {
				return false;

			}
		}

		// right diagonal
		for (int i = cr, j = cc; i >= 0 && j < board[0].length; i--, j++) {
			if (board[i][j] == true) {
				return false;

			}
		}
		return true;

	}
	

}
