package practise_after_recursion;

import java.util.Scanner;

public class coin_change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int[] arr = new int[m];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		coin(arr,n,0, "");

	}

	public static void coin(int[] arr, int sum,int cp, String ans) {
		if (cp==sum) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < arr.length && cp+arr[i]<=sum; i++) {
			coin(arr,sum,cp+arr[i], ans + arr[i]);

		}

	}
}
