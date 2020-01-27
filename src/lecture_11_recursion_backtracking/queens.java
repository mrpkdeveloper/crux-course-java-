package lecture_11_recursion_backtracking;

public class queens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] board = new boolean[4];
		queen(board, 0, 2, "");

	}

	public static void queen(boolean[] board, int qpsf, int tq, String ans) {

		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;
				queen(board, qpsf + 1, tq, ans + "q" + qpsf + "b" + i + "");
				board[i] = false;
			}
		}

	}

}
