package lecture_11_recursion_backtracking;

public class lexicographically_counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lexi(0, 1000);
	}

	public static void lexi(int c, int e) {

		if (c > e) {
			return;
		}
		System.out.println(c);
		int i = 0;
		if (c == 0) {
			i = 1;
		}
		for (; i <= 9; i++) {
			lexi(c * 10 + i, e);
		}

	}

}
