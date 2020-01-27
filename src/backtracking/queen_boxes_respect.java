package backtracking;

public class queen_boxes_respect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queen_box(new boolean[4], 0, "", 0, 2);
	}

	public static void queen_box(boolean[] board, int col, String ans, int qpsf, int tq) {
		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}
		if (col == board.length) {
			return;
		}

		// placed
		board[col] = true;
		queen_box(board, col + 1, ans + "b" + col, qpsf + 1, tq);
		board[col] = false;

		// not placed
		queen_box(board, col + 1, ans, qpsf, tq);
	}

}
