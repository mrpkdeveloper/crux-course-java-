package dynamic_programming;

public class fibonacci_dynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibotopdown(7, new int[8]));
		System.out.println(fibobotomup(7));
		System.out.println(fibobotomup_sizeeff(7));

	}

	public static int fibotopdown(int n, int[] strg) {
		if (n == 0 || n == 1) {
			return n;
		}

		if (strg[n] != 0) {
			return strg[n];
		}

		int f1 = fibotopdown(n - 1, strg);
		int f2 = fibotopdown(n - 2, strg);

		int ans = f1 + f2;
		strg[n] = ans;
		return ans;

	}

	public static int fibobotomup(int n) {
		int[] strg = new int[n + 1];
		strg[0] = 0;
		strg[1] = 1;
		for (int i = 2; i < strg.length; i++) {
			strg[i] = strg[i - 1] + strg[i - 2];
		}
		return strg[n];
	}

	public static int fibobotomup_sizeeff(int n) {
		int[] strg = new int[2];
		strg[0] = 0;
		strg[1] = 1;
		while(n-1!=0) {
			int temp = strg[0];
			strg[0]=strg[1];
			strg[1] = strg[1] + temp;
			n--;
		}
		return strg[1];
	}

}
