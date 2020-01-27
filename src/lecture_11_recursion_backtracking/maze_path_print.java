package lecture_11_recursion_backtracking;

import java.util.Scanner;

public class maze_path_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		maze_path(0, 0, 2, 2, "");

	}

	private static void maze_path(int cr, int cc, int er, int ec, String ans) {
		// TODO Auto-generated method stub

		if (cr == er && cc == ec) {
			System.out.println(ans);
			return;
		}
		if (cr + 1 <= er) {
			maze_path(cr + 1, cc, er, ec, "H" + ans);
		}
		if (cc + 1 <= ec) {
			maze_path(cr, cc + 1, er, ec, "V" + ans);
		}
		if (cr + 1 <= er && cc + 1 <= ec) {
			maze_path(cr + 1, cc + 1, er, ec, "D" + ans);
		}

	}

}
