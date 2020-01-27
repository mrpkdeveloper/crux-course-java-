package practise_after_recursion;

import java.util.Scanner;

public class splitt_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scn.nextInt();
		}
		System.out.println(split(arr, 0, 0, "", 0, ""));

	}

	public static int split(int[] arr, int vidx, int sum1, String ans1, int sum2, String ans2) {
		int c=0;
		if (vidx == arr.length) {
			if (sum1 == sum2) {
				System.out.println(ans1 + "and " + ans2);
				return 1;
			}
			return 0;
		}
		
		
		c += split(arr, vidx + 1, sum1 + arr[vidx], ans1 + arr[vidx] + " ", sum2, ans2);
		c += split(arr, vidx + 1, sum1, ans1, sum2 + arr[vidx], ans2 + arr[vidx] + " ");

		return c;
		

	}
}
