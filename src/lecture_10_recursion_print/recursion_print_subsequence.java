package lecture_10_recursion_print;

public class recursion_print_subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ss("abc","");
	}

	public static void ss(String q, String ans) {
		if (q.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = q.charAt(0);
		String roq = q.substring(1);
		ss(roq, ans);// no
		ss(roq, ans + ch);// yes

	}

}
