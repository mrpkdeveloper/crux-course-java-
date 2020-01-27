package time_comp;

import java.util.Arrays;

public class sieve_of_eratosthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		soe(50);
	}

	public static void soe(int n) {
		boolean[] prime = new boolean[n + 1];
		Arrays.fill(prime, true);
		prime[0] = prime[1] = false;
		for (int table = 2; table * table <= n; table++) {
			if (prime[table] == false) {
				continue;
			}
			for (int mult = 2; table * mult <= n; mult++) {
				
				prime[table * mult] = false;
			}
		}

		for (int i = 0; i < prime.length; i++) {
			if (prime[i])
				System.out.println(i);
		}

	}
}
