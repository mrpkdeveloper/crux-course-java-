package practise;

import java.util.Scanner;

public class van_loves_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int not = scn.nextInt();
		int c=1;

		while(c<=not){
		int n = scn.nextInt();  
		int ans=0,count=0;
		while(n!=0)
		{   
		    int rem=n%10;
		    n=n/10;
		    ans=ans+rem*(int)Math.pow(2,count);
		    count++;
		}
		System.out.println(ans);
		c++;
		}

	}

}
