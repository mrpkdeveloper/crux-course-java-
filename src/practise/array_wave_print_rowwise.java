package practise;

import java.util.Scanner;

public class array_wave_print_rowwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		int n = scn.nextInt();
		int[][] arr = new int[m][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = scn.nextInt();
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr[0].length; j++) {
                   System.out.print(arr[i][j] + ", ");
				}
			}
			else
				for (int j =arr[0].length-1; j >=0; j--) {
	                   System.out.print(arr[i][j] + ", ");
					}
		}
		System.out.print("END");

	}

}
