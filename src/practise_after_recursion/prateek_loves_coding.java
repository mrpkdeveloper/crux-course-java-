package practise_after_recursion;

import java.util.Scanner;
import java.util.Stack;


public class prateek_loves_coding {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stack stack = new Stack();
		int q = s.nextInt();
		Calculate(stack, q);


	}
	
	
	
	public static void Calculate(Stack stack, int q) throws Exception {
		 
		for (int i = 0; i <q; i++) {
			int n = s.nextInt();
			if(n==1) {
				if(stack.isEmpty()) {
					System.out.println("No Code");
				}
				else {
					System.out.println(stack.pop());
				}
			}else if(n==2){
				int price = s.nextInt();
				stack.push(price);
			}
		}
		
	
	
	}
	
	

}
