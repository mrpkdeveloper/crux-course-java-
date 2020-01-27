package lecture_5;

import java.util.Scanner;

public class linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int n = scn.nextInt();
		System.out.println(linear_search(arr, n));
	}

	public static int linear_search(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n)
				return i;
		}
		return -1;
	}

}
