package practise_after_recursion;

import java.util.Scanner;

public class maze_path {
static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		maze_path( 0, 0, n1, n2, "");
		System.out.println("\n"+count);
	}

	public static void maze_path(int cr, int cc, int fr, int fc, String ans) {

		if(cr==fr-1 && cc==fc-1) {
			System.out.print(ans +" ");
			count++;
			return;
		}
		if(cr==fr || cc==fc) {
			return;
		}
		
		// V
		maze_path(cr + 1, cc, fr, fc, ans + "V");
		// h
		maze_path(cr , cc+1, fr, fc, ans + "H");
		// d
		maze_path(cr + 1, cc+1, fr, fc, ans + "D");

	}

}
