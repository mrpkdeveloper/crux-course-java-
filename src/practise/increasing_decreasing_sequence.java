package practise;

import java.util.Scanner;

public class increasing_decreasing_sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int big = Integer.MAX_VALUE, flag = 0;
		//decreasing
		while (n != 0) {
			int a = scn.nextInt();
			if (a < big) {
				big = a;
			}else {n--;
				break;}
			n--;
		}
        //increasing
		while (n != 0) {
			int a = scn.nextInt();
			if (a > big) {
				big = a;
			} else {
				flag = 1;
				System.out.println(false);
				break;
			}
			n--;
		}
		if (flag==0)
			System.out.println("true");

	}

}
