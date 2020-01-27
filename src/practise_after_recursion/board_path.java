package practise_after_recursion;

import java.util.Scanner;

public class board_path {
static int c = 0 ; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); //board size
        int m = scn.nextInt(); //faces of dice
        board_path(0,n,m, "");
        System.out.println("\n"+c);
	}

	public static void board_path(int cp, int ep,int m , String ans) {
		if (cp == ep) {
			System.out.print(ans+" ");
			c++;
			return;
		}

		for (int dice = 1; dice <= m && cp + dice <= ep; dice++) {
			board_path(cp + dice, ep,m, ans + dice);
		}
	}

}
