package lecture1;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a = 0, b = 1, c = 0, row = 1, nst = 1;

		while (row <= n) {

			int cst = 1;
			while (cst <= nst) {

				System.out.print(a + " ");
				c = a + b;
				a = b;
				b = c;
				cst++;
			}
			System.out.println();
			nst++;
			row++;
		}

	}

}
