package practise;

import java.util.Scanner;

public class aray_book_allocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for (int i = 0; i < t; i++) {
			int hi = 0;
			int nob = scn.nextInt();
			int s = scn.nextInt();
			int[] nop = new int[nob];
			for (int j = 0; j < nop.length; j++) {
				nop[j] = scn.nextInt();
				hi = hi + nop[j];
			}
			int lo = 0, fmid = 0;
			while (lo <= hi) {
				int mid = (lo + hi) / 2;
				if (possible(nop, s, mid)) {
					fmid = mid;
					hi = mid - 1;
				} else {
					lo = mid + 1;
				}
			}
			System.out.println(fmid);

		}

	}

	public static boolean possible(int[] nop, int s, int mid) {
		int pr = 0, nos = 1;
		for (int i = 0; i < nop.length;) {
			
			if (pr + nop[i] <= mid) {
				pr = pr + nop[i];
				i++;
			} else {
				nos++;
				pr = 0;
			}
			if (nos > s)
				return false;

		}

		return true;
	}

}
