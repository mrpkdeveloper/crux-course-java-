package lecture_2;

import java.util.Scanner;

public class pattern_6 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int nst = n, nsp = 0;

		while (row <= n) {

			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}

			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}
			System.out.println();
			row++;
			nsp = nsp + 2;
			nst--;

		}

	}

}
