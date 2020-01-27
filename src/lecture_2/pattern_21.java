package lecture_2;

import java.util.Scanner;

public class pattern_21 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1, nsp = 2 * n - 3, nst = 1;

		while (row <= n) {
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			if (nst==n)
				cst = 2;
			else
				cst=1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}
			//prep
			row++;
			nst++;
			nsp = nsp - 2;
			System.out.println();
		}

	}

}
