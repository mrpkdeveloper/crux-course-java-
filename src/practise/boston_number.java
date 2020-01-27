package practise;

import java.util.Scanner;

public class boston_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		boolean ans=checkprime(n);
		if (ans)
			System.out.println(0);
		else {
			int sof = 0, sod = 0;
			sof = sof(n);
			sod = sod(n);
			if (sod == sof)
				System.out.println(1);
			else
				System.out.println(0);
		}
	}

	public static int sof(int n) {
		int sum = 0;
		while (n % 2 == 0) {
			n /= 2;
			sum += 2;
		}

		for (int i = 3; i <= n / 2; i += 2) {
			while (n % i == 0) {
				n /= i;
				sum += sod(i);
			}
		}

		if (n > 2) {
			sum += sod(n);
		}

		return sum;
	}

	public static int sod(int n) {
		int sod = 0;
		while (n != 0) {
			int rem = n % 10;
			n /= 10;
			sod += rem;
		}
		return sod;
	}

	public static boolean checkprime(int n) {
		int count = 2, flag = 0;
		while (count <= n / 2) {
			if (n % count == 0) {
				flag = 1;
				break;
			}
			count++;
		}
		if (flag == 0)
			return true;
		else
			return false;
	}

}
