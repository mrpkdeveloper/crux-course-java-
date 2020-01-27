package lecture_5;

import java.util.Scanner;

public class subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int[] arr = { 10, 20, 30 ,40};
		subset(arr);

	}

	public static void subset(int[] arr) {

		int limit = (int) Math.pow(2, arr.length);
		
		for (int n = 0; n < limit; n++) {
			int temp = n;
			for (int c = 0; c < arr.length; c++) {
				int rem = temp % 2;
				if (rem == 1)
					System.out.print(arr[c] + " ");
				temp = temp / 2;
			}
			System.out.println();
		}
	}

}
