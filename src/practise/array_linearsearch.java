package practise;

import java.util.Scanner;

public class array_linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int m = scn.nextInt();
		int c=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == m) {
				c=i;
				break;}
			}
		if (arr[c] == m) 
			 System.out.println(c);
			else
				System.out.println(-1);
}

}
