package practise_after_recursion;

import java.util.Scanner;

public class form_minium_didi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for (int i = 0; i < t; i++) {
			String str = scn.next();
			char[] arr = str.toCharArray();
			min(arr);			
		}

	}

	public static void min(char[] arr) {
		int num = 1;
		int[] ans = new int[arr.length + 1];

		for (int i = 0; i <= arr.length; i++) {
			if (i == arr.length || arr[i] == 'I') {
				ans[i] = num++;

				for (int j = i - 1; j >= 0 && arr[j] != 'I'; j--) {
					ans[j] = num++;
				}
			}
		}

		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]);
		}
		System.out.println();

	}

}
