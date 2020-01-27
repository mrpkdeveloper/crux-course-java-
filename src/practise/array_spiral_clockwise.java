package practise;

import java.util.Scanner;

public class array_spiral_clockwise {

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

		int minr = 0, minc = 0, maxr = arr.length - 1, maxc = arr[0].length - 1, c = 1;
		while (c <= (m * n)) {

			for (int i = minc;i <=maxc && c <= (m * n); i++) {
				System.out.print(arr[minr][i] + ", ");
				c++;
			}
			minr++;

			for (int i = minr;i <=maxr && c <= (m * n); i++) {
				System.out.print(arr[i][maxc] + ", ");
				c++;
			}
			maxc--;

			for (int i = maxc;i >= minc && c <= (m * n); i--) {
				System.out.print(arr[maxr][i] + ", ");
				c++;
			}
			maxr--;

			for (int i = maxr;i >= minr && c <= (m * n); i--) {
				System.out.print(arr[i][minc] + ", ");
				c++;
			}
			minc++;
		}
		System.out.print("END");

	}

}
