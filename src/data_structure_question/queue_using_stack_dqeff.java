package data_structure_question;

import data_Structures.dynamic_Stack;

public class queue_using_stack_dqeff {

	dynamic_Stack stack = new dynamic_Stack();

	public void enqueue(int item) throws Exception {
		try {
			dynamic_Stack ns = new dynamic_Stack();
			while (!stack.isEmpty()) {
				ns.push(stack.pop());
			}
			stack.push(item);
			while (!ns.isEmpty()) {
				stack.push(ns.pop());
			}
		} catch (Exception e) {
			throw new Exception("queue is full");
		}

	}

	public int dequeue() throws Exception {
		return stack.pop();
	}

	public void disp() throws Exception {
		stack.disp();
	}
}
