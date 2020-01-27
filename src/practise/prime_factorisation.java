package practise;

import java.util.Scanner;

public class prime_factorisation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		factor(n);

	}

	public static void factor(int n) {

		while (n % 2 == 0) {
			System.out.println(2);
			n /= 2;
		}

		for (int i = 3; i <= n / 2; i += 2) {
			while (n % i == 0) {
				n /= i;
				System.out.println(i);
				System.out.println("*");
			}
		}

		if (n > 2) {
			System.out.println(n);
		}
	}

}
