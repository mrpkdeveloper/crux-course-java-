package practise;

import java.util.Scanner;

public class doublesiddedarrw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1, nst = 1, nspi = 2 * n - 2, nsp = 0;

		while (row <= n) {
			int val = nst;
			// first spaces
			int csp = 1;
			while (csp <= nspi) {
				System.out.print(" ");
				csp++;
			}
			// star
			int cst = 1;
			while (cst <= nst) {
				System.out.print(val);
				val--;
				if (cst < nst)
					System.out.print(" ");
				cst++;
			}

			// middle spaces
			csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}

			// star
			val = 1;
			cst = 1;
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
				nspi = nspi - 4;
				nsp += 4;
			}

			else {
				nst--;
				nspi = nspi + 4;
				nsp -= 4;

			}

			row++;
		}

	}

}
