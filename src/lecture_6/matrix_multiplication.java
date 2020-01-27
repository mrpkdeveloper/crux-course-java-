package lecture_6;

import java.util.Scanner;

public class matrix_multiplication {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr1= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] arr2= {{1,2,3},{4,5,6},{7,8,9}};
		display(multiply(arr1,arr2));
	}
	
	
	public static int[][] multiply(int[][] arr1,int[][] arr2) {
		int r1=arr1.length;
		int r2=arr2.length;
		int c1=arr1[0].length;
		int c2=arr2[0].length;
		int[][] narr= new int[r1][c2]; 
		if(c1==r2) {
			for(int r=0;r<narr.length;r++) {
				for(int c=0;c<narr[0].length;c++) {
					int sum=0;
					for(int k=0;k<c1;k++) {
						sum=sum+arr1[r][k]*arr2[k][c];
					}
					narr[r][c]=sum;
					
				}
			}
		}
		return narr;
	}
	
	public static void display(int[][] arr) {
		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[r].length; c++) {
				System.out.print(arr[r][c] + "  ");
			}
			System.out.println();
		}
	}
}
