package practise;

import java.util.Scanner;

public class array_target_sum_pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int  i =0 ; i<arr.length;i++)
			arr[i]=scn.nextInt();
			
		int tgt = scn.nextInt();
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				int sum = arr[i] + arr[j];
				if (sum == tgt) {
					if(arr[i]<arr[j])
					System.out.println(arr[i] + " and " + arr[j]);
					else
						System.out.println(arr[j] + " and " + arr[i]);
				}
					
			}
		}
	}

}
