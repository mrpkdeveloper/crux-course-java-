package practise;

import java.util.Scanner;

public class form_biggest_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scn.nextInt();
			int[] arr = new int[n];
			for (int j = 0; j < arr.length; j++) {
				arr[j] = scn.nextInt();
			}

			// bubble sort logic
			for (int c = 0; c < arr.length - 1; c++) {
				for (int j = 0; j < arr.length - 1 - c; j++) {
					if (compare(arr[j], arr[j + 1])) {
						int temp = arr[j + 1];
						arr[j + 1] = arr[j];
						arr[j] = temp;
					}
				}
			}

			for (int val : arr) {
				System.out.print(val);

			}
			
			System.out.println();

		}

	}

	public static boolean compare(int i, int j) {
		// TODO Auto-generated method stub
		String nm1s = i + "" + j;
		String nm2s = j + "" + i;
		int nm1i = Integer.parseInt(nm1s);
		int nm2i = Integer.parseInt(nm2s);
		if (nm1i > nm2i) {
			return false;
		} else
			return true;

	}

}
