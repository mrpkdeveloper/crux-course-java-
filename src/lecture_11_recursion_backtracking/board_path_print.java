package lecture_11_recursion_backtracking;

public class board_path_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		board_path(0, 10, "");
	}

	public static void board_path(int cp, int ep, String ans) {
		if (cp == ep) {
			System.out.println(ans);
			return;
		}

		for (int dice = 1; dice <= 6 && cp + dice <= ep; dice++) {
			board_path(cp+dice, ep,ans+dice);
		}
	}

}
