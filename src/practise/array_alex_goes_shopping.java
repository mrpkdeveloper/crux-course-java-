package practise;

import java.util.Scanner;

public class array_alex_goes_shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int j = 0; j < arr.length; j++) {
			arr[j] = scn.nextInt();
		}
		int q = scn.nextInt();
		for (int i = 0; i < q; i++) {
			int money = scn.nextInt();
			int noi = scn.nextInt();
			if (compare(arr, money, noi)) {
				System.out.println("yes");
			} else
				System.out.println("No");
		}

	}

	public static boolean compare(int[] arr, int money, int noi) {
		int count = 0;
		for (int j = 0; j < arr.length; j++) {

			if (money % arr[j] == 0) {
				count++;
			}

		}
		if (count >= noi) {
			return true;
		} else
			return false;
	}

}
