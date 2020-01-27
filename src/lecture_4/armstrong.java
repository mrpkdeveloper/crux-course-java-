package lecture_4;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int lo = scn.nextInt();
		int hi = scn.nextInt();
		isarmstrong(hi, lo);

	}

	public static void isarmstrong(int hi, int lo) {
		int n = lo;
		while (n <= hi) {
			int nod = nod(n);
			int num = digit(n);
			if (num == n)
				System.out.print(num + " ");
			n++;

		}

	}

	public static int digit(int n) {
		int sum = 0, nod = nod(n);
		while (n != 0) {
			int rem = n % 10;
			n = n / 10;

			sum = sum + (int) Math.pow(rem, nod);
		}
		return sum;
	}

	public static int nod(int n) {
		int nod = 0;
		while (n != 0) {
			int rem = n % 10;
			n = n / 10;
			nod++;
		}
		return nod;
	}

}
