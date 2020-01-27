package lecture_4;

import java.util.Scanner;

public class max {
	static Scanner scn = new Scanner(System.in);
static	int size = 5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {10,20,30,70,50};
		// takeinput(array);
		//display(array);
		System.out.println(max(array));
		

	}

	public static int[] takeinput(int[] arr) {
		for (int i = 0; i < size; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}

	public static void display(int[] arr) {
		for (int val : arr) {
			System.out.print(val + " ");
		}

	}
	
	public static int max(int[]arr) {
		int n =Integer.MIN_VALUE ;
		for(int i = 0 ; i<arr.length ;i++)
		{ if(arr[i]>n)
			n=arr[i];
			
		}
		return n;
	}
}
