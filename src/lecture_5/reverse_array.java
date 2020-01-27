package lecture_5;

import java.util.Scanner;

public class reverse_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int[] arr = { 11, 30, 60, 20, 50, 65 };
		reverse(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public static void reverse(int[] arr) {
		int temp = 0, c = 1;
		for (int i = 0; i <= (arr.length - 1) / 2; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - c];
			arr[arr.length - c] = temp;
			c++;
		}
	}

}
