package lecture1;
import java.util.Scanner;

public class prime {

	public static void main(String[] args) {

		System.out.println(" enter a number ");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int count = 2,flag=0;
		while (count <= n / 2) {
			if (n % count == 0)
			{ flag =1;
				break;
				}
			count++;
			}
		if(flag==0)
	      System.out.println("prime");
		else System.out.println("Not Prime");

	}

}
