package lecture_3;

import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int ans=0 , mult=1;
		while(n!=0)
		{
			int rem=n%10;
			n=n/10;
			ans=ans+rem*mult;
			mult=mult*2;
			
			
		}
System.out.println(ans);

	}

}
