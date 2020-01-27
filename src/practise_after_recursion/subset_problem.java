package practise_after_recursion;

import java.util.Scanner;

public class subset_problem {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scn.nextInt();
		}
		int tgt = scn.nextInt();
		Targetsum(arr,0,tgt, "");
		System.out.println();
		System.out.println(count);
	}

	public static void Targetsum(int[] arr, int vidx, int target, String ans) {
		if (target == 0) {
			++count;
			System.out.print(ans);
			System.out.print(" ");
			return;
		}
		if (target < 0 || vidx >= arr.length) {
			return;
		}

		Targetsum(arr, vidx + 1, target - arr[vidx], ans + arr[vidx] + " ");
		Targetsum(arr, vidx + 1, target, ans);

	}

}
