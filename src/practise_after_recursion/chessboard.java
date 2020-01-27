package practise_after_recursion;

import java.util.Scanner;

public class chessboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn  = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println("\n" + chess(n, 0, 0, "{0-0}"));

	}

	public static int chess(int fr, int cr, int cc, String ans) {
		if (cr > fr-1 || cc > fr-1) {
			return 0;
		}

		if (cr == fr-1 && cc == fr-1) {
			System.out.print(ans + " ");

			return 1;
		}
		int c = 0;
		// knight
		c += chess(fr, cr + 2, cc + 1, ans + "K{" + (cr + 2) + "-" + (cc + 1) + "}");
		c += chess(fr, cr + 1, cc + 2, ans + "K{" + (cr + 1) + "-" + (cc + 2) + "}");

		if (cc == 0 || cc == fr-1 || cr == 0 || cr == fr-1) {
			// rook
			for (int i = 1; i <fr; i++) {
				c += chess(fr, cr, cc + i, ans + "R{" + (cr) + "-" + (cc + i) + "}");

			}
			for (int i = 1; i < fr; i++) {
				c += chess(fr, cr + i, cc, ans + "R{" + (cr + i) + "-" + (cc) + "}");

			}

		}

		if (cc == cr || cc + cr == fr-1) {
			// bishop
			for (int i = 1; i < fr; i++) {
				c += chess(fr, cr + i, cc + i, ans + "B{" + (cr + i) + "-" + (cc + i) + "}");
			}
		}

		return c;
	}

}
