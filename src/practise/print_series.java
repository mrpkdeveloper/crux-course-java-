package practise;

import java.util.Scanner;

public class print_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		int n = 1;
		while(n1!=0) {
			if((3*n+2)%n2!=0) {
				System.out.println(3*n+2);
				n1--;
			}
			n++;
			}
	}

}
