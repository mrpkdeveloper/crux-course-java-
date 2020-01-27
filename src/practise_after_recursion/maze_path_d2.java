package practise_after_recursion;

import java.util.Scanner;

public class maze_path_d2 {
	static int c = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		maze_path_d2(0, 0, n, "");
		System.out.println("\n" + c);

	}

	public static void maze_path_d2(int cr, int cc, int fr, String ans) {
		if (cr == fr - 1 && cc == fr - 1) {
			System.out.print(ans + " ");
			c++;
			return;
		}
		if (cr >= fr || cc >= fr) {
			return;
		}
		// vertical
		maze_path_d2(cr + 1, cc, fr, ans + "V");
		// horizontal
		maze_path_d2(cr, cc + 1, fr, ans + "H");
		// Diagonal
		if (cc == cr || cc+cr==fr-1)
			maze_path_d2(cr + 1, cc + 1, fr, ans + "D");
	}

}