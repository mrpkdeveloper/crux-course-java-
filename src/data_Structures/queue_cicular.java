package data_Structures;

public class queue_cicular {

	protected int[] data;
	protected int front;
	protected int size;

	public queue_cicular() {
		data = new int[5];
	}

	public queue_cicular(int cap) {
		data = new int[cap];
	}

	public void enqueue(int item) throws Exception {
		if(isfull()) {
			throw new Exception("statck overflow");
		}
		int idx = (front + size) % data.length;
		data[idx] = item;
		size++;
	}

	public int dequeue() throws Exception {
		if(isEmpty()) {
			throw new Exception("statck underflow");
		}
		int temp = data[front];
		data[front] = 0;
		front = (front + 1)%data.length;
		size--;
		return temp;
	}

	public int getfront() throws Exception {
		if(size==0) {
			throw new Exception("statck underflow");
		}
		return data[front];
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public boolean isfull() {
		return size() == data.length;
	}

	public void disp() {
		System.out.println("----------");
		for( int i=0;i<size; i++) {
			int idx = (i+front)%data.length;
			System.out.print(data[idx] + " ");
		}  
		System.out.println();
		System.out.println("----------");

	}
}