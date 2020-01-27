package lecture_10_recursion_print;

import java.util.Scanner;

public class recursion_print_valid_paraenthisis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        valid_paraenthisis(n,"",0,0);
	}
	public static void valid_paraenthisis(int n ,String ans ,int o , int c) {
		
		if(o>n || c > n || c>o) {
			return;
		}
		if(o==n && c==n) {
			System.out.println(ans);
			return;
		}
		
		valid_paraenthisis(n,ans + ")",o,c+1);
		valid_paraenthisis(n,ans + "(",o+1,c);
		
		
		
		
	}

}
