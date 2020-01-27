package practise_after_recursion;

import data_Structures.stack;

public class balanced_paraenthesis_stack {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String str = "(())";
		System.out.println(isBalanced(str, new stack()));
		

	}

	public static boolean isBalanced(String str, stack stack) throws Exception {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '[' || ch == '{' || ch == '(') {
				stack.push(ch);
			} else {
				if (!stack.isEmpty()) {
					char o = (char) stack.pop();
					if (ch == ']' && o != '[') {
						return false;
					}
					if (ch == '}' && o != '{') {
						return false;
					}
					if (ch == ')' && o != '(') {
						return false;
					}
				}else {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

}
