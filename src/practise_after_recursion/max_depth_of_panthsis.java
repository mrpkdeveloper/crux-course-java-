package practise_after_recursion;

import data_Structures.stack;

public class max_depth_of_panthsis {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String str = "((y()))";
		System.out.println(isBalanced(str, new stack()));
	}

	public static int isBalanced(String str, stack stack) throws Exception {
		int max = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '[' || ch == '{' || ch == '(') {
				stack.push(ch);
				int s = stack.size();
				if (s > max) {
					max = s;
				}
			} else if (ch == ']' || ch == '}' || ch == ')') {
				if (!stack.isEmpty()) {
					char o = (char) stack.pop();
					if (ch == ']' && o != '[') {
						return -1;
					}
					if (ch == '}' && o != '{') {
						return -1;
					}
					if (ch == ')' && o != '(') {
						return -1;
					}
				} else {
					return -1;
				}
			}
		}
		if (stack.isEmpty()) {
			return max;
		}
		return -1;
	}
}
