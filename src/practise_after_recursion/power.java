package practise_after_recursion;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(2, 4));
	}

	public static int power(int x, int n) {
		if (n == 0) {
			return 1;
		}
		// smaller problem
		int rr = power(x, n / 2);
		// sw
		if (n % 2 == 0)
			return rr * rr;
		else
			return rr * rr * x;

	}
}
