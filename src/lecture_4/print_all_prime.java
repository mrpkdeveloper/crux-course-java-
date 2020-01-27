package lecture_4;

import java.util.Scanner;

public class print_all_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int lo = scn.nextInt();
		int hi = scn.nextInt();
		isprime(hi,lo);

	}
	
public static void isprime(int hi,int lo)
{ int n=lo;
   while(n<=hi)
   {
	   boolean res=checkprime(n);
	   if(res)
		   System.out.println(n+" ");
	   
	   n++;
   }
	
}
public static boolean checkprime(int n) {
	int div=2,flag=0;
	while(div<=n/2)
	{
		if(n%div==0)
			{flag++;
			break;}
		
		else
			flag=0;
		div++;	
	}
	if(flag!=0)
		return false;
	else
		return true;
}

}
