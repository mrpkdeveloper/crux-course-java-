package data_structure_question;

import data_Structures.dynamic_Stack;

public class stock_span {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int[] arr = { 50, 30, 35, 40, 38, 35 };
		int[] ans = stock(arr);
		for (int i = 1; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
		System.out.println("END");

	}

	public static int[] stock(int[] arr) throws Exception {
		dynamic_Stack stack = new dynamic_Stack();
		int[] ans = new int[arr.length];

		ans[0] = 1;
		stack.push(0);

		for (int i = 1; i < arr.length; i++) {

			while (!stack.isEmpty() && arr[stack.top()] < arr[i]) {
				stack.pop();
			}

			if (stack.isEmpty()) {
				ans[i] = i+1 ;
			} else {
				ans[i] = i - stack.top();
			}

			stack.push(i);
		}

		return ans;

	}

}
