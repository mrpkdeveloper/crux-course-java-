package lecture_11_recursion_backtracking;

public class permutation_no_duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permutation2("abac", "");
	}

	public static void permutation2(String q, String ans) {
		if (q.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < q.length(); i++) {
			char ch = q.charAt(i);
			int flag = 0;
			String roq = q.substring(0, i) + q.substring(i + 1);
			for (int j = i + 1; j < q.length(); j++) {
				if (ch == q.charAt(j))
					flag++;
			}
			if (flag == 0)
				permutation2(roq, ans + ch);

		}
	}
}
