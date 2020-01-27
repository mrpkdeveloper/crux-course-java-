package practise;

import java.util.Scanner;

public class replace_them_all {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong();
		int count=0;
		long ans=0;
		if(n==0)
		 System.out.print(5);
		else{ 
		while(n!=0)
		{
		    long rem=n%10;
		    n=n/10;
		    if(rem==0)
		      rem=5;
		    ans=ans+rem*(long)Math.pow(10,count);
		    count++;
		    
		}
		System.out.print(ans);
		    
		}
		
	}

}
