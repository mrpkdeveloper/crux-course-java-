package lecture_10_recursion_print;

public class recursion_print_kpc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kpc("145", "");
	}

	public static String getCode(char ch) {

		if (ch == '1')
			return "abc";
		else if (ch == '2')
			return "def";
		else if (ch == '3')
			return "ghi";
		else if (ch == '4')
			return "jk";
		else if (ch == '5')
			return "lmno";
		else if (ch == '6')
			return "pqr";
		else if (ch == '7')
			return "stu";
		else if (ch == '8')
			return "vwx";
		else if (ch == '9')
			return "yz";
		else if (ch == '0')
			return "@#";
		else
			return "";
	}

	public static void kpc(String q, String ans) {
		if (q.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = q.charAt(0);
		String roq = q.substring(1);
		String k = getCode(ch);
		for (int i = 0; i < k.length(); i++) {
			kpc(roq, ans + k.charAt(i));
		}
	}

}
