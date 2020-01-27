package practise_after_recursion;

import java.util.Scanner;

public class k_swap_max {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nos = scn.nextInt();
		String str = Integer.toString(n);
		char[] arr = str.toCharArray();
		System.out.println(kswap(arr, 0, nos));

	}

	public static int kswap(char[] arr, int vidx, int nos) {
		int max = Integer.parseInt(new String(arr));
		if (nos == 0) {
			return max;
		}

		for (int i = vidx; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					swap(arr, i, j);
					int ans = kswap(arr, i + 1, nos - 1);
					max = Math.max(ans, max);
					swap(arr, i, j);
				}
			}

		}
		return max;
	}

	public static void swap(char[] arr, int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
