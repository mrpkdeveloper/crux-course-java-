package link_list_generics;

public class link_link_generics <t>{

	private class node {
		t data;
		node next;

		public node() {

		}

		public node(t item) {
			data = item;
		}
	}

	private node tail;
	private node head;
	private int size;

	public boolean isempty() {
		return size == 0;
	}

	public void addfirst(t item) {
		// create a new node
		node nn = new node();
		nn.data = item;

		// attach
		nn.next = head;

		// update
		if (size > 0) {
			head = nn;
			size++;
		} else {
			head = tail = nn;
			size++;
		}

	}

	public void addlast(t item) {
		// create a new node
		node nn = new node();
		nn.data = item;

		// attach
		if (size > 0)
			tail.next = nn;

		// update
		if (size > 0) {
			tail = nn;
			size++;
		} else {
			head = tail = nn;
			size++;
		}

	}

	public t getfirst() throws Exception {
		if (size == 0) {
			throw new Exception("list is empty");
		}
		node temp = head;
		return temp.data;

	}

	public t getlast() throws Exception {
		if (size == 0) {
			throw new Exception("list is empty");
		}
		node temp = tail;
		return temp.data;

	}

	private node getnodeat(int idx) throws Exception {
		if (size == 0) {
			throw new Exception("list is empty");
		}
		if (idx < 0 || idx >= size) {
			throw new Exception("invalid idx");
		}

		node temp = head;

		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}

		return temp;
	}

	public void disp() {
		node temp = head;
		// 2nd method for (int i = 0; i < size; i++) {
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println(".");
		System.out.println("---------------");

	}

	public void addat(t item, int idx) throws Exception {
		if (idx < 0 || idx > size) {
			throw new Exception("invalid index");
		}

		if (idx == 0) {
			addfirst(item);
		} else if (idx == size) {
			addlast(item);
		} else {
			node nm1 = getnodeat(idx - 1);
			node np1 = nm1.next;

			node nn = new node();
			nm1.next = nn;
			nn.data = item;
			nn.next = np1;
			size++;

		}

	}

	public t removefirst() throws Exception {
		if (size == 0) {
			throw new Exception("empty list");
		}
		t temp = head.data;
		if (size == 1) {
			head = tail = null;
			size--;
		} else {

			head = head.next;
			size--;

		}
		return temp;
	}

	public t removelast() throws Exception {
		if (size == 0) {
			throw new Exception("empty list");
		}
		t temp = tail.data;
		if (size == 1) {
			head = tail = null;
			size--;
		} else {
			node nm1 = getnodeat(size - 2);
			nm1.next = null;
			tail = nm1;
			size--;

		}
		return temp;
	}

	public t removeat(int idx) throws Exception {
		if (idx < 0 || idx >= size) {
			throw new Exception("invalid index");
		}

		if (idx == 0) {
			return removefirst();
		} else if (idx == size - 1) {
			return removelast();
		} else {
			node nm1 = getnodeat(idx - 1);
			node np = nm1.next;
			node np1 = np.next;

			nm1.next = np1;
			np.next = null;
			size--;
			return np.data;

		}

	}

	public t getat(int idx) throws Exception {
		if (size == 0) {
			throw new Exception("list is empty");
		}
		if (idx < 0 || idx >= size) {
			throw new Exception("invalid idx");
		}

		node temp = head;

		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}

		return temp.data;
	}

}
