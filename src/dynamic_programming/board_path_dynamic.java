package dynamic_programming;

public class board_path_dynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(board_path_topdown(0, 10, new int[11]));
		System.out.println(board_path_bottomup(0, 10));
		System.out.println(board_path_bottomup_sizeeff(0, 10));
	}

	public static int board_path_topdown(int cp, int ep, int[] strg) {
		if (cp == ep) {
			return 1;
		}
		if (cp > ep) {
			return 0;
		}
		if (strg[cp] != 0) {
			return strg[cp];
		}
		int c = 0;
		for (int dice = 1; dice <= 6 && cp + dice <= ep; dice++) {
			c += board_path_topdown(cp + dice, ep, strg);
			strg[cp] = c;
		}

		return c;
	}

	public static int board_path_bottomup(int cp, int ep) {
		int[] strg = new int[ep + 6];

		strg[ep] = 1;
		for (int i = strg.length - 1; i >= 6; i--) {
			strg[i - 6] = strg[i] + strg[i - 1] + strg[i - 2] + strg[i - 3] + strg[i - 4] + strg[i - 5];
		}

		return strg[0];
	}

	public static int board_path_bottomup_sizeeff(int cp, int ep) {
		int[] strg = new int[6];

		strg[0] = 1;
		int sum = 0;
		while (ep != 0) {
			sum = strg[0] + strg[1] + strg[2] + strg[3] + strg[4] + strg[5];
			strg[5] = strg[4];
			strg[4] = strg[3];
			strg[3] = strg[2];
			strg[2] = strg[1];
			strg[1] = strg[0];
			strg[0] = sum;
			ep--;

		}

		return strg[0];
	}

}
