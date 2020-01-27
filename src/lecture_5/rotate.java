package lecture_5;

import java.util.Scanner;

public class rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = { 2, 10, 3, 4, 1 };
		rotate(arr, n);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public static void rotate(int[] arr, int n) {
		n = n % arr.length;
		if (n < 0)
			n = n + arr.length;
		for (int r = 0; r < n; r++) {
			int temp = arr[arr.length - 1];
			for (int i = arr.length - 1; i >= 1; i--) {
				arr[i] = arr[i - 1];
			}
			arr[0] = temp;
		}

	}

}
