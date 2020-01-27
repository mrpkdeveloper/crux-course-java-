package practise;
import java.util.Scanner;

public class inverted_hour_glass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = 7;
		int row = 1, nst = 1, nsp = 4 * n - 2;

		while (row <= 2 * n + 1) {

			int val = n;

			int cst = 1;
			while (cst <= nst) {
				System.out.print(val);
				if (cst < nst) {
					System.out.print(" ");
					val--;
				}
				cst++;
			}

			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}

			if (row == n + 1) {
				cst = 2;
				val++;
			} else
				cst = 1;
			while (cst <= nst) {
				System.out.print(" ");
				System.out.print(val);
				val++;
				cst++;
			}

			System.out.println();
			if (row <= n) {
				nst++;
				nsp = nsp - 4;
				val--;

			}

			else {
				nst--;
				nsp = nsp + 4;
				val++;

			}
			row++;
		}
	}

}
