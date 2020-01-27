package lecture_11_recursion_backtracking;

public class palindrome_partition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pp("nitin", "");
	}

	public static boolean pallindrome(String s) {
		int l = 0, r = s.length() - 1;
		while (l < r) {
			if (s.charAt(l) != s.charAt(r))
				return false;
			l++;
			r--;
		}
		return true;
	}

	public static void pp(String q, String ans) {
		if (q.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 1; i <= q.length(); i++) {
			String part = q.substring(0, i);
			String roq = q.substring(i);
			if (pallindrome(part))
				pp(roq, ans + part + " ");
		}
	}

}
