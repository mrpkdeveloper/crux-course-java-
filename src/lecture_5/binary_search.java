package lecture_5;

import java.util.Scanner;

public class binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int[] arr = { 10, 20, 30, 40, 50 };
		int n = scn.nextInt();
		System.out.println(binary_search(arr, n));
	}

	public static int binary_search(int[] arr, int n) {
		int lo = 0, hi = arr.length - 1;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			
			if (arr[mid] > n) {
				hi = mid-1;
			} else if (arr[mid] < n) {
				lo = mid + 1;
			} else
				return mid;
		}
		return -1;
	}

}
