package practise_after_recursion;

import java.util.Scanner;

public class link_list_fold {

	private class node {
		int data;
		node next;

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

	private node tail;
	private node head;
	private int size;

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

	public void disp() {
		node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t > 0) {
			link_list_fold list = new link_list_fold();
			int n = scn.nextInt();
			for (int i = 0; i < n; i++) {
				list.addlast(scn.nextInt());
			}
			list.fold();
			list.disp();
			t--;
		}

	}
	

}
