package practise;

import java.util.Scanner;

public class pattern_mountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1, nst = 1, nsp = n + 1;

		while (row <= n) {

			int val = 1;
			int cst = 1;
			while (cst <= nst) {
				System.out.print(val);
				System.out.print("\t");
				val++;
				cst++;
			}

			int csp = 1;
			while (csp <= nsp) {
				System.out.print("\t");
				csp++;
			}
			if (row == n)
				cst = 2;
			else
				cst = 1;
			while (cst <= nst) {
				System.out.print(val);
				System.out.print("\t");
				--val;
				cst++;
			}
			// prep
			System.out.println();

			nst = nst + 1;
			nsp = nsp - 2;
			row++;
		}
	}
}
