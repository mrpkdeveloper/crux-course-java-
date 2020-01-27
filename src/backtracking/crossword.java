package backtracking;

public class crossword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] arr = { { 'a', 'b', 'c', 'd' }, 
				{ 'e', 'f', 'c', 'd' },
				{ 'a', 'b', 'e', 'd' },
				{ 'a', 's', 'c', 'd' } };

		boolean ans = false;
		boolean[][] visited = new boolean[arr.length][arr[0].length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				ans = ans || crosword(arr, "sce", i, j, visited, 0);
			}
		}
		System.out.println(ans);

	}

	public static boolean crosword(char[][] arr, String q, int cr, int cc, boolean[][] visited, int idx) {

		if (idx == q.length()) {
			return true;
		}

		if (cr < 0 || cr == arr.length || cc < 0 || cc == arr[0].length || visited[cr][cc] || idx >= q.length()) {
			return false;
		}

		if (arr[cr][cc] != q.charAt(idx)) {
			return false;
		}

		visited[cr][cc] = true;
		// top
		boolean t = crosword(arr, q, cr - 1, cc, visited, idx + 1);
		// left
		boolean l = crosword(arr, q, cr, cc - 1, visited, idx + 1);
		// right
		boolean r = crosword(arr, q, cr, cc + 1, visited, idx + 1);
		// bottom
		boolean b = crosword(arr, q, cr + 1, cc, visited, idx + 1);
		visited[cr][cc] = false;

		return t || r || l || b;
	}

}
