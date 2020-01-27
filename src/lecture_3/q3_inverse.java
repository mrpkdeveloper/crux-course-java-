package lecture_3;

import java.util.Scanner;

public class q3_inverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int pos = 1, rem = 0, ans = 0;
		while (n != 0) {
			rem = n % 10;
			n = n / 10;
			ans = ans + pos * (int) Math.pow(10, rem - 1);
			pos++;
		}
		System.out.println(ans);

	}

}
