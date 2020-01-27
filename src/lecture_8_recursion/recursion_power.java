package lecture_8_recursion;

public class recursion_power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(3, 3));
	}

	public static int power(int x, int n) {
		// base case
		if (n == 1)
			return x;
		// sp
		int pnm1 = power(x, n - 1);
		// sw
		int p =x*pnm1;
		return p;

	}

}
