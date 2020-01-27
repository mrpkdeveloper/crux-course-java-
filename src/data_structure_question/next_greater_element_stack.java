package data_structure_question;

import data_Structures.dynamic_Stack;

public class next_greater_element_stack {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int[] arr = { 30, 20, 10, 5, 25, 15, 45, 37, 28, 42 };
		// print_nge(arr);
		int[] ans = print_nge2(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " -> " + ans[i]);
		}
}

// this has a complexity of n 
	public static void print_nge(int[] arr) throws Exception {
		dynamic_Stack d = new dynamic_Stack();

		for (int i = 0; i < arr.length; i++) {
			while (!d.isEmpty() && d.top() < arr[i]) {
				System.out.println(d.pop() + "-> " + arr[i]);
			}
			d.push(arr[i]);
		}

		while (!d.isEmpty()) {
			System.out.println(d.pop() + "-> -1");
		}
	}

	// this has a complexity of n
	public static int[] print_nge2(int[] arr) throws Exception {
		dynamic_Stack d = new dynamic_Stack();
		int[] ans = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			while (!d.isEmpty() && arr[d.top()] < arr[i]) {
				ans[d.pop()] = arr[i];
			}
			d.push(i);
		}

		while (!d.isEmpty()) {
			ans[d.pop()] = -1;
		}

		return ans;
	}

}
