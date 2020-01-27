package practise;

import java.util.Scanner;

public class array_wave_print_column {

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

		for (int j = 0; j < arr[0].length; j++) {
			if (j % 2 == 0) {
				for (int i = 0; i < arr.length; i++) {
                   System.out.print(arr[i][j] + ", ");
				}
			}
			else
				for (int i =arr.length-1; i >=0; i--) {
	                   System.out.print(arr[i][j] + ", ");
					}
		}
		System.out.print("END");
	}

}
