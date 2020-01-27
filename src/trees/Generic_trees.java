package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Generic_trees {
	Scanner scn = new Scanner(System.in);

	private class node {
		int data;
		ArrayList<node> children = new ArrayList<>();
	}

	private node root;

	public Generic_trees() {
		root = construct(null, -1);
	}

	private node construct(node parent, int ith) {

		if (parent == null) {
			System.out.println("enter data for parent node");
		} else {
			System.out.println("enter data for " + parent.data + " for " + ith + " children");
		}

		int item = scn.nextInt();
		node nn = new node();
		nn.data = item;

		System.out.println(" how many childrens for " + nn.data);
		int noc = scn.nextInt();

		for (int i = 0; i < noc; i++) {

			node child = construct(nn, i);
			nn.children.add(child);
		}

		return nn;

	}

	public void display() {
		System.out.println("-------------------");
		display(root);
		System.out.println("-------------------");
	}

	private void display(node node) {
		String str = node.data + "->";
		for (node val : node.children) {
			str += val.data + ",";
		}
		str += ".";
		System.out.println(str);

		for (node val : node.children) {
			display(val);
		}

	}

	public int size() {
		return size(root);
	}

	private int size(node node) {
		int t = 0;

		for (node val : node.children) {
			t += size(val);
		}

		return t + 1;
	}

	public int max() {
		return max(root);
	}

	private int max(node node) {
		// TODO Auto-generated method stub

		int max = node.data;

		for (node val : node.children) {
			int temp = max(val);
			if (temp > max) {
				max = temp;
			}
		}

		return max;
	}

	public boolean find(int item) {
		return find(root, item);
	}

	private boolean find(node node, int item) {
		if (node.data == item) {
			return true;
		}
		for (node val : node.children) {
			boolean temp = find(val, item);
			if (temp) {
				return true;
			}
		}

		return false;
	}

	public int height() {
		return height(root);
	}

	private int height(node node) {

		int ht = -1;

		for (node val : node.children) {
			int ch = height(val);
			if (ch > ht) {
				ht = ch;
			}
		}

		return ht + 1;

	}

	public void mirror() {
		mirror(root);
	}

	private void mirror(node node) {
		// TODO Auto-generated method stub

		for (node val : node.children) {
			mirror(val);
		}

		// self work
		int l = 0;
		int r = node.children.size() - 1;
		while (l < r) {

			node ln = node.children.get(l);
			node rn = node.children.get(r);

			node.children.set(l, rn);
			node.children.set(r, ln);

			l++;
			r--;
		}

	}

	public void printatlevel(int level) {
		printatlevel(root, level, 0);
	}

	private void printatlevel(node node, int level, int c) {
		if (c == level) {
			System.out.println(node.data);
			return;
		}

		for (node val : node.children) {
			printatlevel(val, level, c + 1);
		}

	}

	public void linear() {
		linear(root);
	}

	private void linear(node node) {

		for (node val : node.children) {
			linear(val);
		}

		while (node.children.size() > 1) {
			node temp = node.children.remove(1);
			node tail = gettail(node.children.remove(0));
			tail.children.add(temp);

		}
	}

	private node gettail(node node) {
		if (node.children.size() == 0) {
			return node;
		}
		return gettail(node.children.get(0));
	}

	public void preorder() {
		preorder(root);
	}

	private void preorder(node node) {
		System.out.println(node.data);
		for (node val : node.children) {
			preorder(val);
		}
	}

	public void postorder() {
		postorder(root);
	}

	private void postorder(node node) {

		for (node val : node.children) {
			postorder(val);
		}
		System.out.println(node.data);
	}

	public void levelOrder() {
		LinkedList<node> queue = new LinkedList<>();
		queue.addLast(root);

		while (!queue.isEmpty()) {
			node rn = queue.removeFirst();
			System.out.print(rn.data + " ");

			for (node val : rn.children) {
				queue.addLast(val);
			}

		}

	}

	public void levelOrderLw1() {
		LinkedList<node> queue = new LinkedList<>();
		queue.addLast(root);
		queue.addLast(null);

		while (!queue.isEmpty()) {

			node rn = queue.removeFirst();
			if (rn == null) {

				if (queue.isEmpty())
					break;

				System.out.println();
				queue.addLast(null);
				continue;
			}

			System.out.print(rn.data + " ");

			for (node val : rn.children) {
				queue.addLast(val);
			}

		}

	}

	public void levelOrderLw2() {
		LinkedList<node> queue = new LinkedList<>();
		LinkedList<node> helper = new LinkedList<>();
		queue.addLast(root);

		while (!queue.isEmpty()) {

			node rn = queue.removeFirst();

			System.out.print(rn.data + " ");

			for (node val : rn.children) {
				helper.addLast(val);
			}

			if (queue.isEmpty()) {
				System.out.println();
				queue = helper;
				helper = new LinkedList<>();
			}

		}

	}

	public void levelOrderzigzag() {
		LinkedList<node> primarys = new LinkedList<>();
		LinkedList<node> helpers = new LinkedList<>();
		primarys.addLast(root);
		int c = 0;
		while (!primarys.isEmpty()) {

			node rn = primarys.removeFirst();

			System.out.print(rn.data + " ");

			if (c % 2 == 0) {
				for (node val : rn.children) {
					helpers.addFirst(val);

				}
			} else {
				for (int i = rn.children.size() - 1; i >= 0; i--) {
					helpers.addFirst(rn.children.get(i));
				}
			}

			if (primarys.isEmpty()) {
				c++;
				System.out.println();
				primarys = helpers;
				helpers = new LinkedList<>();
			}

		}

	}
	
	
	
	public boolean identical(Generic_trees other) {
		return identical(this.root,other.root) ;
	}

	private boolean identical(node node1, node node2) {
	    if(node1==null && node2==null) {
	    	return true;
	    }
	    
	    if(node1==null || node2==null) {
	    	return false;
	    }	    
	    
	    if(node1.data!=node2.data) {
	    	return false;
	    }
	    
	    boolean ans = false;
	    for(int i = 0 ; i <node1.children.size() && i <node2.children.size();i++) {
	    	ans = identical(node1.children.get(i),node2.children.get(i));
	    }
		
		
		
		return ans;
	}
	
	
	
	
	
	
	
	
	

}
