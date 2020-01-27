package lecture_10_recursion_print;

public class recursion_coin_toss_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		coin_toss(2, "");
	}

	public static void coin_toss(int n, String ans) {
		// base case
		if (n == 0) {
			System.out.print(ans + " ");
			return;
		}
		coin_toss(n - 1, "H" + ans);
		coin_toss(n - 1, "T" + ans);

	}

}
