package practise;

import java.util.Scanner;

public class pc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = 7;
		int row = 1, nst = 1, nspi = 2 * n - 2;

		while (row <= n) {
			int val=nst;
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
			
			// Preparation
			System.out.println();
			if (row <= n / 2) {
				nst++;
				nspi = nspi - 4;
				}

			else {
				nst--;
				nspi = nspi + 4;

			}

			row++;
		}

	}

}
