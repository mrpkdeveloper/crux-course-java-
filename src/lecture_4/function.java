package lecture_4;

import java.util.Scanner;

public class function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner scn = new Scanner(System.in);
	int not = scn.nextInt();
	int count=1;
	while(count<=not) {
	int n = scn.nextInt();
	int even =0,odd=0;
	while(n!=0) {
		int rem=n%10;
		n=n/10;
		if(rem%2==0) {
			even=even+rem;}
		else
			odd=odd+rem;
		}
	if(even%4==0 || odd%3==0)
		System.out.println("Yes");
	else
		System.out.println("No");
	count++;
	}
	
	}
}
