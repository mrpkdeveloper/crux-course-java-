package practise;

import java.util.Scanner;

public class chewbacca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong();
		int pos = 0;
		long ans = 0;
		int a = nod(n);
			while (n != 0) {
				long rem = n % 10;
				n /= 10;
				if (pos != a - 1 && rem >= 5)
					rem = 9 - rem;
				else if (pos == a - 1 && rem >= 5 && rem != 9)
					rem = 9 - rem;

				ans = ans + rem * (long) Math.pow(10, pos);
				pos++;
			}
		System.out.println(ans);
	}

	public static int nod(long n) {
		int c = 0;
		long temp = n;
		while (temp != 0) {
			long rem = temp % 10;
			temp /= 10;
			c++;
		}
		return c;
	}

}
