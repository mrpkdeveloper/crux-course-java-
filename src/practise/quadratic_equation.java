package practise;

import java.util.Scanner;

public class quadratic_equation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();

		if (a != 0) {
			int d = ((b) * (b)) - 4 * a * c;
			if (d > 0) {
				System.out.println("Real and Distinct");
				int r1 = (-(b) - (int)Math.pow(d, 0.5))/(2*a);
				int r2 = (-(b) + (int)Math.pow(d, 0.5))/(2*a);
				System.out.println(r1 + " " + r2);
			} else if (d == 0) {
				System.out.println("Real and Equal");
				int r1 = (-(b) + (int)Math.pow(d, 0.5))/(2*a);
				System.out.println(r1 + " " + r1);
			} else
				System.out.print("Imaginary");
		}

	}

}
