package dynamic_programming;

import java.util.Arrays;

public class maze_path_dynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maze_path_topdown(0, 0, 2, 2, new int[3][3]));
		System.out.println(maze_path_bottomup(0, 0, 2, 2));
		System.out.println(maze_path_bottomup_sizeeff(0, 0, 2, 2));

	}

	private static int maze_path_topdown(int cr, int cc, int er, int ec, int[][] strg) {
		// TODO Auto-generated method stub

		if (cr == er && cc == ec) {
			return 1;
		}
		if (strg[cr][cc] != 0) {
			return strg[cr][cc];
		}
		int c = 0;
		if (cr + 1 <= er) {
			c += maze_path_topdown(cr + 1, cc, er, ec, strg);
		}
		if (cc + 1 <= ec) {
			c += maze_path_topdown(cr, cc + 1, er, ec, strg);
		}
		strg[cr][cc] = c;

		return c;
	}

	private static int maze_path_bottomup(int cr, int cc, int er, int ec) {
		// TODO Auto-generated method stub
		int strg[][] = new int[er + 2][ec + 2];

		for (int r = er; r >= 0; r--) {
			for (int c = ec; c >= 0; c--) {
				if (r == er && c == ec) {
					strg[r][c] = 1;
					continue;
				}
				strg[r][c] = strg[r + 1][c] + strg[r][c + 1];
			}

		}
		return strg[0][0];
	}

	private static int maze_path_bottomup_sizeeff(int cr, int cc, int er, int ec) {
		int strg[] = new int[ec + 1];
		Arrays.fill(strg, 1);
		for (int slide = er - 1; slide >= 0; slide--) {

			for (int c = ec - 1; c >= 0; c--) {
				strg[c] = strg[c] + strg[c + 1];
			}

		}

		return strg[0];
	}

}
