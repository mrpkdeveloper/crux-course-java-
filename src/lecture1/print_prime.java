package lecture1;
import java.util.Scanner;

public class print_prime {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		/*
		 * int count = 2,flag=0,n=3; System.out.println(count); while(n<=20) {while
		 * (count <= n/2) { if (n % count == 0) flag = 1; count++; }
		 * 
		 * if(flag==0) System.out.println(n); n++; flag=0; count=2; }
		 */
        System.out.println("enter a number");
		int n = scn.nextInt();
		for (int prime = 2; prime < n; prime++) {
			int flag=0;
			for (int j = 2; j <= prime / 2; j++) {
                if(prime%j == 0)
                	{flag=1;
                	break;}}
			if(flag==0)
				System.out.println(prime);

		}

	}

}
