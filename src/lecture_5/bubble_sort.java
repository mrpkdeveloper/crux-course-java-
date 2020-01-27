package lecture_5;

import java.util.Scanner;

public class bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int[] arr = { 60, 50, 40, 30, 20, 10 };
		bubble_sort(arr);
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

	}

	public static void bubble_sort(int[] arr) {
		int n = arr.length;
		for (int c = 0; c <= n - 2; c++) {
			for (int j = 0; j <= n - c - 2; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

}
