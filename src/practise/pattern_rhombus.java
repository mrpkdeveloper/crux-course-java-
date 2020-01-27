package practise;

import java.util.Scanner;

public class pattern_rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = 3;
		int row = 1, nst = 1, nsp = n - 1, val = 1;

		while (row <= 2 * n - 1) {
			if (row <= n)
				val = row;
			
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("\t");
				csp++;
			}
			int cst = 1;
			while (cst <= nst) {
				System.out.print(val);
				System.out.print("\t");
				if (cst < nst/2 + 1)
					val++;
				else
					val--;
				cst++;
			}

			System.out.println();
			if (row < n ) {
				nst = nst + 2;
				nsp--;

			}

			else {
				nst = nst - 2;
				nsp++;

			}

			row++;
		}

	}

}
