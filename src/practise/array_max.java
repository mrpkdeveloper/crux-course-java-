package practise;

import java.util.Scanner;

public class array_max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		int big = Integer.MIN_VALUE;
		for (int i = 0; i <n; i++) {
			arr[i] = scn.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (arr[i] > big)
				big = arr[i];
		}
		System.out.println(big);

	}

}
