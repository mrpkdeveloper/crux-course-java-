package lecture_6;

import java.util.Scanner;

public class selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int[] arr = { 60, 50, 40, 30, 90, 10 };
		selection_sort(arr);
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
		
		
	}
	public static void selection_sort(int[] arr) {
		int n = arr.length;
		for (int c = 0; c <= n - 2; c++) {
			int min=c;
			for (int j = c+1; j <= n - 1; j++) {
				if (arr[j] < arr[min]) {
					int temp = arr[min];
					arr[min] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
