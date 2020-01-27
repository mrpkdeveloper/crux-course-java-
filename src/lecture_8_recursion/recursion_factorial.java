package lecture_8_recursion;

public class recursion_factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(5));

	}
	public static int fact(int n) {
		//base case
		if(n==1)
			return 1;
		//sp
		int fnm1 = fact(n-1);
		//sw
		int fact = fnm1*n;
		return fact;
	}

}
