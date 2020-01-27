package practise;

import java.util.Arrays;
import java.util.Scanner;

public class array_target_sum_triplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++)
			arr[i] = scn.nextInt();
		Arrays.sort(arr);

		int tgt = scn.nextInt();

		for (int i = 0; i<arr.length-2 && arr[i] <= tgt - 2; i++) {
			for (int j = i + 1;j<arr.length-1 && arr[j] <= tgt - 2; j++) {
				for (int k = j + 1;k<arr.length && arr[k] <= tgt - 2; k++) {
					int sum = 0;
					sum = arr[i] + arr[j] + arr[k];
					if (sum == tgt) {
						System.out.println(arr[i] + ", " + arr[j] + " and " + arr[k]);
					}
				}
			}
		}
	}

}
