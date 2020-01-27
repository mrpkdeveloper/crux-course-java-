package lecture_5;

import java.util.Scanner;

public class inverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int[] arr = { 2, 0, 3, 4, 1 };
		int[] narr = inverse(arr);
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println(narr[i]);
		}

	}

	public static int[] inverse(int[] arr) {
		int[] inverse = new int[arr.length];
		for (int i = 0; i <= arr.length - 1; i++) {
			inverse[arr[i]] = i;
		}
		return inverse;

	}

}
