package practise;

import java.util.Scanner;

public class ms_bhavana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int  t= scn.nextInt();
        for(int i =0 ; i<t;i++) {
          int n = scn.nextInt();
          print_binarry(n);
          
        }
	}
	
	public static void print_binarry(int n) {
		for(int i=1;i<=n;i++) {
			int temp=i,ans=0,c=0;
			while(temp!=0){
				int rem = temp%2;
				temp=temp/2;
				ans=ans+rem*(int)Math.pow(10,c);
				c++;
			}
			System.out.print(ans + " ");
		}
	}

}
