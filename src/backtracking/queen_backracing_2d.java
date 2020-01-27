package backtracking;

public class queen_backracing_2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nqueen(new boolean[5][5], 0, 0, 0, 5, "");
	}

	public static void nqueen(boolean[][] board, int col, int row, int qsf, int tq, String ans) {
		if (qsf == tq) {
			System.out.println(ans);
			return;
		}
		if (col == board[0].length) {
			row++;
			col = 0;
		}
		if (row == board.length) {
			return;
		}

		if (isitsafe(board, row, col)) {
			// placed
			board[row][col] = true;
			nqueen(board, col + 1, row, qsf + 1, tq, ans + "[" + row + "-" + col + "]" + " ");
			board[row][col] = false;
		}

		// not placed
		nqueen(board, col + 1, row, qsf, tq, ans);

	}

	public static boolean isitsafe(boolean[][] board, int row, int col) {

		// horizontally left
		int r = row;
		int c = col - 1;
		while (c >= 0) {
			if (board[r][c]) {
				return false;
			}
			c--;
		}

		// vertically up
		r = row - 1;
		c = col;
		while (r >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
		}

		// Diagonally left
		r = row - 1;
		c = col - 1;
		while (r >= 0 && c >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c--;
		}

		// Diagonally right
		r = row - 1;
		c = col + 1;
		while (r >= 0 && c < board[0].length) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c++;
		}

		return true;

	}

}
