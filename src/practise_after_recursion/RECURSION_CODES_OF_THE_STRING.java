/*RECURSION-CODES OF THE STRING
Take as input str, a string. Assume that value of a=1, b=2, c=3, d=4, …. z=26. Write a recursive function (return type Arraylist) to print all possible codes for the string. E.g. for “1123” possible codes are aabc, kbc, alc, aaw, kw.


Input Format:
Enter a number

Constraints:
None

Output Format:
Display all the possible codes

Sample Input:
1125
Sample Output:
[aabe, aay, ale, kbe, ky]*/


package practise_after_recursion;

import java.util.ArrayList;

public class RECURSION_CODES_OF_THE_STRING {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> r = new ArrayList<>();
		System.out.println(pp("1123", "", r));
	}

	public static ArrayList<String> pp(String q, String ans, ArrayList<String> r) {
		if (q.length() == 0) {
			// System.out.println(ans);
			r.add(ans);
			return r;
		}
		for (int i = 1; i <= q.length(); i++) {
			String part = q.substring(0, i);
			String roq = q.substring(i);
			int n = Integer.parseInt(part);
			if (n <= 26) {
				pp(roq, ans + (char)(n+96), r);
			}
		}
		return r;
	}

}
