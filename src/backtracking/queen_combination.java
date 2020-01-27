package backtracking;

public class queen_combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queenCombination(new boolean[4], 0, 2, "", 0);
	}

	public static void queenCombination(boolean[] board, int qpsf, int tq, String ans, int lastbox) {

		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}

		for (int i = lastbox; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;
				queenCombination(board, qpsf + 1, tq, ans + "q" + qpsf + "b" + i + "", i);
				board[i] = false;
			}
		}

	}
}