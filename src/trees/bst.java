package trees;

public class bst {
	private class node {
		int data;
		node left;
		node right;

	}

	private node root;

	public bst() {
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		root = construct(arr, 0, arr.length - 1);

	}

	private node construct(int[] arr, int lo, int hi) {
		if (lo > hi) {
			return null;
		}
		int mid = (lo + hi) / 2;
		node nn = new node();
		nn.data = arr[mid];
		nn.left = construct(arr, lo, mid - 1);
		nn.right = construct(arr, mid + 1, hi);
		return nn;
	}

	public void disp() {
		System.out.println("----------------");
		disp(root);
		System.out.println("----------------");
	}

	private void disp(node node) {

		if (node == null) {
			return;
		}

		String str = " ";
		if (node.left == null) {
			str += ". ->";
		} else {
			str += node.left.data + "->";
		}

		str += node.data;

		if (node.right == null) {
			str += "-> .";
		} else {
			str += "-> " + node.right.data;
		}
		System.out.println(str);
		disp(node.left);
		disp(node.right);

	}

	public int size() {
		return size(root);
	}

	private int size(node node) {
		int c = 0;
		if (node == null) {
			return 0;
		}
		c += size(node.left);
		c += size(node.right);

		return c + 1;

	}

	public int max() {
		return max(root);
	}

	private int max(node node) {
		if (node.right == null) {
			return node.data;
		}

		return max(node.right);
	}

	public boolean find(int item) {
		return find(root, item);
	}

	private boolean find(node node, int item) {
		if (node == null) {
			return false;
		}
		if (node.data == item) {
			return true;
		} else if (item > node.data) {
			return find(node.right, item);
		} else if (item < node.data) {
			return find(node.left, item);
		}

		return false;
	}

	public int height() {
		return height(root);
	}

	private int height(node node) {
		if (node == null) {
			return -1;
		}

		int lh = height(node.left);
		int rh = height(node.right);

		return Math.max(lh, rh) + 1;
	}

	public void printinrange(int lo, int hi) {
		printinrange(root, lo, hi);
	}

	private void printinrange(node node, int lo, int hi) {
		if (node == null) {
			return;
		}

		if (node.data < lo) {
			printinrange(node.right, lo, hi);
		} else if (node.data > hi) {
			printinrange(node.left, lo, hi);

		} else {
			printinrange(node.left, lo, hi);
			System.out.println(node.data);
			printinrange(node.right, lo, hi);
		}

	}

	public void replacewithlarger() {
		replacewithlarger(root, new int[1]);
	}

	private void replacewithlarger(node node, int[] sum) {
		if (node == null) {
			return;
		}

		replacewithlarger(node.right, sum); // L
		int temp = node.data;
		node.data = sum[0];
		sum[0] += temp;
		replacewithlarger(node.left, sum); // R

	}

	public void add(int item) {
		root = add(root, item);
	}

	private node add(node node, int item) {
		if (node == null) {
			node nn = new node();
			nn.data = item;
			return nn;
		}

		if (node.data < item) {
			node.right = add(node.right, item);

		} else if (node.data > item) {
			node.left = add(node.left, item);

		}

		return node;

	}

	public void remove(int item) {
		remove(null, root, item);
	}

	private void remove(node parent, node node, int item) {
		if (node == null) {
			return;
		}

		if (node.data < item) {
			remove(node, node.right, item);
		} else if (node.data > item) {
			remove(node, node.left, item);
		} else {

			if (node.left == null && node.right == null) {
				if (parent.data >= item) {
					parent.left = null;
				} else {
					parent.right = null;
				}

			} else if (node.left != null && node.right == null) {
				if (parent.data >= item) {
					parent.left = node.left;
				} else {
					parent.right = node.left;
				}
			} else if (node.right != null && node.left == null) {
				if (parent.data >= item) {
					parent.left = node.right;
				} else {
					parent.right = node.right;
				}
			} else {

				int temp = max(node.left);
				remove(node, node.left, temp);
				node.data = temp;

			}

		}

	}

	public void removereturn(int item) {
		root = removereturn(root, item);
	}

	private node removereturn(node node, int item) {
		if (node == null) {
			return null;
		}
		if (node.data == item) {

			if (node.left == null) {
				return node.right;
			} else if (node.right == null) {
				return node.left;
			} else {

				int m = max(node.left);
				node.left = removereturn(node.left, m);
				node.data = m;
				return node;
			}

		} else if (node.data < item) {
			node.right = removereturn(node.right, item);
		} else {
			node.left = removereturn(node.left, item);
		}

		return node;

	}

	private class bstpair {
		boolean bst = true;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
	}

	public boolean istreebst() {
		return istreebst(root).bst;
	}

	private bstpair istreebst(node node) {
		if (node == null) {
			return new bstpair();
		}
		bstpair lb = istreebst(node.left);
		bstpair rb = istreebst(node.right);

		bstpair sb = new bstpair();

		if (lb.bst && rb.bst && node.data > lb.max && node.data < rb.min) {
			sb.bst = true;
		} else {
			sb.bst = false;
		}

		
		sb.max = Math.max(node.data, Math.max(lb.max, rb.max));
		sb.min = Math.min(node.data, Math.min(lb.min, rb.min));

		return sb;

	}

}
