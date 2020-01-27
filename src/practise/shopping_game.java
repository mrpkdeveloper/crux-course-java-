package practise;

import java.util.Scanner;

public class shopping_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for (int i = 1; i <= t; i++) {
			int m = scn.nextInt();
			int n = scn.nextInt();
			check(m, n);
		}

	}

	public static void check(int m, int n) {
		int a = 1, h = 2, asum = 0, hsum = 0;
		if(h<=n)
		while (asum <= m && hsum <= n) {
			a = a + 2;
			h = h + 2;
			asum = asum + a;
			hsum = hsum + h;
		}
		
		if (asum > m)
			System.out.println("Harshit");
		else
			System.out.println("Aayush");

	}

}
