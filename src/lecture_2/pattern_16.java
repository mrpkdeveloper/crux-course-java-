package lecture_2;

import java.util.Scanner;

public class pattern_16 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int row = 1, nst = n, nsp = n - 1;

		while (row <= 2 * n - 1) {

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
			if (row <= n - 1) {
				nsp = nsp - 1;
				nst--;
			} else {
				nsp = nsp + 1;
				nst++;
			}
			row++;

		}

	}

}
