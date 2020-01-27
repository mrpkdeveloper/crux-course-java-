package practise_after_recursion;

import java.util.Scanner;

public class link_list_kthfromlast {

	private class node {
		int data;
		node next;
	}

	private node tail;
	private node head;
	private int size;

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		link_list_kthfromlast list = new link_list_kthfromlast();
		Scanner scn = new Scanner(System.in);
		while (true) {
			int item = scn.nextInt();
			if (item == -1) {
				break;
			}
			list.addlast(item);
		}
		System.out.println(list.kthfromlast(scn.nextInt()));

	}

}
