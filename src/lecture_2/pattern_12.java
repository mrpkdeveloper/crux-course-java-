package lecture_2;

import java.util.Scanner;

public class pattern_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1, nsp = n - 1, nst = 1;

		while (row <= n) {
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			int cst = 1;
			while (cst <= nst) {
				if (cst % 2 == 0)
					System.out.print("!");
				else
					System.out.print("*");
				cst++;
			}

			System.out.println();
			row++;
			nsp--;
			nst = nst + 2;

		}

	}

}
