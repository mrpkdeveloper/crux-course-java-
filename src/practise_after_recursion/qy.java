package practise_after_recursion;

public class qy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ps("A1B2", "");
	}

	public static void ps(String q, String ans) {
		if (q.length() == 0) {
			System.out.println(ans);
			return;
		}

		String roq = q.substring(1);
		char ch = q.charAt(0);

		if (Character.isDigit(ch)) {
			ps(roq, ans + ch);
		}

		if (Character.isLowerCase(ch)) {
			ps(roq, ans + ch);
			ps(roq, ans + Character.toUpperCase(ch));
		}
		if (Character.isUpperCase(ch)) {
			ps(roq, ans + ch);
			ps(roq, ans + Character.toLowerCase(ch));
		}

	}

}
