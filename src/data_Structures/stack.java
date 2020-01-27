package data_Structures;

public class stack {

	protected int[] data;
	protected int tos;

	public stack() {
		data = new int[5];
		tos = -1;
	}

	public stack(int cap) {
		data = new int[cap];
		tos = -1;
	}

	public void push(int item) throws Exception {
		if(isFull()) {
			throw new Exception("Stack is full");
		}
		tos++;
		data[tos] = item;
	}

	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack is empty");
		}
		int temp = data[tos];
		data[tos] = 0;
		tos--;
		return temp;
	}

	public int top() throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack is empty");
		}
		return data[tos];
	}

	public int size() {
		return tos + 1;
	}

	public boolean isEmpty() {
		return size() == 0;

	}

	public boolean isFull() {
		return size() == data.length;
	}

	public void disp() {
		System.out.println("---------------");
		for (int i = tos; i >= 0; i--) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
		System.out.println("---------------");
	}
	
	

}
