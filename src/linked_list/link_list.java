package linked_list;

public class link_list {

	private class node {
		int data;
		node next;

		public node() {

		}

		public node(int item) {
			data = item;
		}
	}

	private node tail;
	private node head;
	private int size;

	public boolean isempty() {
		return size == 0;
	}

	public void addfirst(int item) {
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

	public void addlast(int item) {
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

	public int getfirst() throws Exception {
		if (size == 0) {
			throw new Exception("list is empty");
		}
		node temp = head;
		return temp.data;

	}

	public int getlast() throws Exception {
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
//2nd method for (int i = 0; i < size; i++) {
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println(".");
		System.out.println("---------------");

	}

	public void addat(int item, int idx) throws Exception {
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

	public int removefirst() throws Exception {
		if (size == 0) {
			throw new Exception("empty list");
		}
		int temp = head.data;
		if (size == 1) {
			head = tail = null;
			size--;
		} else {

			head = head.next;
			size--;

		}
		return temp;
	}

	public int removelast() throws Exception {
		if (size == 0) {
			throw new Exception("empty list");
		}
		int temp = tail.data;
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

	public int removeat(int idx) throws Exception {
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

	public void reverseDataI(link_list list) throws Exception {

		for (int i = 0; i <= size / 2; i++) {
			node templ = list.getnodeat(size - i - 1);
			node tempf = list.getnodeat(i);
			node temp = new node();
			temp.data = templ.data;
			templ.data = tempf.data;
			tempf.data = temp.data;
		}
	}

	public void reversepointerI() throws Exception {
		node prev = head;
		node curr = head.next;
		while (curr != null) {
			node ahead = curr.next;
			curr.next = prev;
			prev = curr;
			curr = ahead;
		}
		node temp = head;
		head = tail;
		tail = temp;

//		tail.next = null;

	}

	public void reversepointer_r() {
		reversepointer_R(head, head.next);
		node temp = head;
		head = tail;
		tail = temp;
		tail.next = null;
	}

	private void reversepointer_R(node prev, node curr) {
		if (curr == null) {
			return;
		}
		reversepointer_R(curr, curr.next);
		curr.next = prev;

	}

	public void rdr() {
		rdr(head, head, 0);
	}

	private node rdr(node left, node right, int c) {
		if (right == null) {
			return left;
		}

		node cl = rdr(left, right.next, c + 1);
		if (c >= size / 2) {
			int temp = cl.data;
			cl.data = right.data;
			right.data = temp;
		}

		return cl.next;

	}

	private class mover {
		node left;
	}

	public void rdrhm() {
		mover mover = new mover();
		mover.left = head;
		rdrhm(mover, head, 0);
	}

	private void rdrhm(mover mover, node right, int c) {
		if (right == null) {
			return;
		}

		rdrhm(mover, right.next, c + 1);
		if (c >= size / 2) {
			int temp = mover.left.data;
			mover.left.data = right.data;
			right.data = temp;
		}

		mover.left = mover.left.next;

	}

	public void fold() {
		fold(head, head, 0);
	}

	// fold question
	private node fold(node left, node right, int c) {

		if (right == null) {
			return left;
		}

		left = fold(left, right.next, c + 1);
		node temp = null;
		if (c > size / 2) {
			temp = left.next;
			left.next = right;
			right.next = temp;
		}

		if (c == size / 2) {
			tail = right;
			tail.next = null;
		}

		return temp;

	}

	public int midnode() {
		node x = head;
		node x2 = head;

		while (x2.next != null && x2.next.next != null) {
			x = x.next;
			x2 = x2.next.next;
		}
		return x.data;

	}

	public int kthfromlast(int k) {
		node slow = head;
		node fast = head;

		for (int i = 0; i < k; i++) {
			fast = fast.next;
		}

		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}

		return slow.data;
	}

	public int findcommonnode() {
		node a1 = new node(10);
		node a2 = new node(20);
		node a3 = new node(30);
		node a4 = new node(40);
		node a5 = new node(50);
		node a6 = new node(60);

		node b1 = new node(70);
		node b2 = new node(80);
		node b3 = new node(90);
		node b4 = new node(100);
		node b5 = new node(110);
		node b6 = new node(120);
		a1.next = a2;
		a2.next = a3;
		a3.next = a4;
		a4.next = a5;
		a5.next = a6;
		b1.next = b2;
		b2.next = b3;
		b3.next = b4;
		b4.next = b5;
		b5.next = b6;
		b6.next = a3;
		node fp = a1;
		node sp = b1;
		while (fp != sp) {

			if (fp == null) {
				fp = b1;
			} else {
				fp = fp.next;
			}

			if (sp == null) {
				sp = a1;
			} else {
				sp = sp.next;
			}

		}
		return fp.data;

	}

	public void create_dummy_list() {
		node a1 = new node(10);
		node a2 = new node(20);
		node a3 = new node(30);
		node a4 = new node(40);
		node a5 = new node(50);
		node a6 = new node(60);
		node a7 = new node(70);
		node a8 = new node(80);
		a1.next = a2;
		a2.next = a3;
		a3.next = a4;
		a4.next = a5;
		a5.next = a6;
		a6.next = a7;
		a7.next = a3;
		head = a1;
	}

	public boolean detectloop() {

		node slow = head;
		node fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (fast == slow) {
				break;
			}
		}

		if (fast == slow) {
			node f = head;
			node l = fast;
			while (f.next != l.next) {
				f = f.next;
				l = l.next;
			}
			l.next = null;
			return true;
		} else {
			return false;
		}

	}

	public void kreverse(int k) throws Exception {
		link_list prev = null;

		while (size != 0) {
			link_list curr = new link_list();

			for (int i = 0; i < k && size != 0; i++) {
				curr.addfirst(this.removefirst());
			}

			if (prev == null) {
				prev = curr;
			} else {
				prev.tail.next = curr.head;
				prev.tail = curr.tail;
				prev.size += curr.size;
			}

		}
		head = prev.head;
		tail = prev.tail;
		size = prev.size;
	}

	public void kappend(int k) throws Exception {
		link_list prev = null;
		if (k > size) {
			k = k % size;
		}
		link_list curr = new link_list();

		for (int i = 0; i < k && size != 0; i++) {
			curr.addfirst(this.removelast());
		}
		curr.tail.next = this.head;
		curr.size += this.size;

		head = curr.head;
		tail = curr.tail;
		size = curr.size;
	}

	public int getat(int idx) throws Exception {
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

	public boolean isPalindrome() throws Exception {
		for (int i = 0; i < size / 2; i++) {
			if (getat(i) != getat(size - i - 1)) {
				return false;
			}
		}

		return true;
	}

	public void mergesortedll(link_list other) throws Exception {
		link_list ans = new link_list();

		while (this.size != 0 && other.size != 0) {
			if (this.getfirst() < other.getfirst()) {
				ans.addlast(this.removefirst());

			} else {
				ans.addlast(other.removefirst());

			}
		}
		if (this.size != 0) {
			while (this.size != 0) {
				ans.addlast(this.removefirst());
			}
		} else {
			while (other.size != 0) {
				ans.addlast(other.removefirst());
			}
		}

		ans.disp();
	}

	public void partition() throws Exception {
		link_list odd = new link_list();
		link_list even = new link_list();

		while (this.size != 0) {
			if (getfirst() % 2 != 0) {
				odd.addlast(removefirst());
			} else {
				even.addlast(removefirst());
			}
		}
		if (odd.head != null) {
			odd.tail.next = even.head;
			head = odd.head;
		}
		else {
			head = even.head;
		}
	}
}
