package practise;

import java.util.Scanner;

public class pattern_mirror {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1, nst = 1, nsp = n/2;
		while (row <= n) {
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("\t");
				csp++;
			}
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				System.out.print("\t");
				cst++;
			}

			System.out.println();
			if (row <= n / 2) {
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
