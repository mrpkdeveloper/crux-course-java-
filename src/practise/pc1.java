package practise;

import java.util.Scanner;

public class pc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = 7;
		int row = 1, nst = 1, nsp = 0;

		while (row <= n) {
			int val = 1;
			// middle spaces

			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			// star
			int cst = 1;
			if (nst == 1)
				cst = 2;
			while (cst <= nst) {
				System.out.print(val);
				val++;
				System.out.print(" ");
				cst++;
			}

			// Preparation
			System.out.println();
			if (row <= n / 2) {
				nst++;
				nsp = nsp + 2;

			}

			else {
				nst--;
				nsp = nsp - 2;

			}

			row++;
		}

	}

}
