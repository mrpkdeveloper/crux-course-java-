package practise;

import java.util.Scanner;

public class pascal_triangal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[][] pat = new int[n][n];
		int r = 0;
		while (r < n) {
             int c= 0 ;
			while (c <= r) {
				if (c == 0) {
					pat[r][c] = 1;
				} else
					pat[r][c] = pat[r - 1][c - 1] + pat[r - 1][c];
				c++;
			}
			r++;

		}
		
		for (int i = 0; i < pat.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(pat[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
