package lecture_6;

import java.util.Scanner;

public class insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int[] arr = { 60, 50, 40, 30, 90, 20 };
		insertion_sort(arr);
		display(arr);

	}

	public static void insertion_sort(int[] arr) {
		int n = arr.length;
		for (int c = 1; c <= n - 1; c++) {
			int j = c - 1;
			int temp = arr[j + 1];
			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}

	}

	public static void display(int[] arr) {

		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}

}
