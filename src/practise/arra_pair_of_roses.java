package practise;

import java.util.Arrays;
import java.util.Scanner;

public class arra_pair_of_roses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scn.nextInt();
			int[] arr = new int[n];
			for (int j = 0; j < arr.length; j++) {
				arr[j] = scn.nextInt();
			}
			Arrays.sort(arr);
			int tgt = scn.nextInt(), sum = 0,fj=0,fk=0;
			int j = 0, k = arr.length - 1;
			while (j < k) {
				sum = arr[j] + arr[k];
				if (sum > tgt) {
					k--;
				} else if (sum < tgt) {
					j++;
				} else {
					fj=j;
					fk=k;
					
					j++;
					k--;
				}
			}
			System.out.println("Deepak should buy roses whose prices are " + arr[fj] +" and " + arr[fk] + ".");       

		}

	}

}
