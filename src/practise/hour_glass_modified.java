package practise;

import java.util.Scanner;

public class hour_glass_modified {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1, nst = 2 * n + 1, nsp = 0, val = n;
		while (row <= 2 * n + 1) {
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			int cst = 1;
			while (cst <= nst) {
				System.out.print(val);
				System.out.print(" ");
				if (cst <= nst / 2)
					val--;
				else if (cst < nst)
					val++;
				cst++;
			}

			System.out.println();
			if (row <= n) {
				nst = nst - 2;
				nsp = nsp + 2;
				val--;

			}

			else {
				nst = nst + 2;
				nsp = nsp - 2;
				val++;

			}
			row++;
		}

		
	}

}
