package backtracking;

public class blocked_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] board = { { 0, 1, 0, 0 }, { 0, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 1, 0 } };
		blocked_path(board, "", 0, 0, 3, 3, new boolean[4][4]);
	}

	public static void blocked_path(int[][] arr, String ans, int cr, int cc, int fr, int fc, boolean[][] visited) {
		if (cr == fr && cc == fc) {
			System.out.println(ans);
			return;
		}

		if (cr == arr.length || cc == arr[0].length || cr < 0 || cc < 0 || visited[cr][cc] || arr[cr][cc] == 1) {
			return;
		}

		visited[cr][cc] = true;
		// down
		blocked_path(arr, ans + "D", cr + 1, cc, fr, fc, visited);
		// up
		blocked_path(arr, ans + "T", cr - 1, cc, fr, fc, visited);
		// right
		blocked_path(arr, ans + "R", cr, cc + 1, fr, fc, visited);
		// left
		blocked_path(arr, ans + "L", cr, cc - 1, fr, fc, visited);
		visited[cr][cc] = false;
	}

}
