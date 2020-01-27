package lecture_5;

import java.util.Scanner;

public class subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int[] arr = {  10, 20, 30, 40 };
		subarray(arr);

	}
	
	public static void subarray(int[] arr) {
		for(int si =0;si<arr.length;si++) {
			for(int ei=si;ei<arr.length;ei++) {
				for(int k=si;k<=ei;k++) {
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
		}
	}

}
