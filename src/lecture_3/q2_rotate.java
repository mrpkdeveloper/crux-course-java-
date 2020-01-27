package lecture_3;

import java.util.Scanner;

public class q2_rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int r = scn.nextInt();
		int c = 0, a = n, fans = 0;
		while (a != 0) {
			int rem = a % 10;
			a = a / 10;
			c++;
		}

		r = r % c;
		if (r < 0)
			r = r + c;

		int cst = 1;
		while (cst <= r) {
			int rem = n % 10;
			n = n / 10;
			int ans = rem * (int) Math.pow(10, c - 1);
			fans = ans + n;
			cst++;
			n = fans;
		}
		System.out.println(fans);
	}

}
