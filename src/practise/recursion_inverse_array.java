package practise;

import java.util.Scanner;

public class recursion_inverse_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int[] narr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			narr[arr[i]] = i;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(narr[i] + " ");
		}

	}

}
