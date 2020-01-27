package lecture_8_recursion;

public class recursion_fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(fib2(7));
	}
	
	public static int fib(int n) {
		//base work
		if(n==0||n==1)
			return n;
		//sp
		int a=fib(n-1);
		int b=fib(n-2);
		int c=a+b;
		return c;
	}
	public static int fib2(int n) {
		//base work
		if(n==0||n==1)
			return n;
		//sp
		int c=fib2(n-1)+fib2(n-2);
		return c;
	}	
	
	
	

}
