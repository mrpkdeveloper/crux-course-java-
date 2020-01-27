package trees;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

import practise.aray_book_allocation;

public class binary_tree {
	private Scanner scn = new Scanner(System.in);

	private class node {
		int data;
		node left;
		node right;

	}

	private node root;

	public binary_tree() {

		root = construct(null, false);

	}

	public binary_tree(int[] pre, int[] in) {
		root = construct(pre, 0, pre.length - 1, in, 0, in.length - 1);
	}

	private node construct(int[] pre, int plo, int phi, int[] in, int ilo, int ihi) {
		if (plo > phi || ilo > ihi) {
			return null;
		}

		node nn = new node();
		nn.data = pre[plo];

		int c = 0;
		int si = 0;
		for (int i = ilo; i < ihi; i++) {
			if (in[i] == pre[plo]) {
				si = i;
				c = c + 1;
				break;
			}
		}

		nn.left = construct(pre, plo + 1, plo + c, in, ilo, si - 1);
		nn.right = construct(pre, plo + c + 1, phi, in, si + 1, ihi);

		return nn;

	}

	private node construct(node parent, boolean ilc) {
		// TODO Auto-generated method stub
		if (parent == null) {
			System.out.println("enter data for root node ");
		} else {

			if (ilc) {
				System.out.println("enter data for" + parent.data + "left child");
			} else {
				System.out.println("enter data for" + parent.data + "right child");
			}

		}

		int item = scn.nextInt();
		node nn = new node();
		nn.data = item;

		System.out.println(nn.data + "has left child ? ");
		boolean hlc = scn.nextBoolean();
		if (hlc) {
			nn.left = construct(nn, true);
		}
		System.out.println(nn.data + "has right child ? ");
		boolean hrc = scn.nextBoolean();
		if (hrc) {
			nn.right = construct(nn, false);
		}

		return nn;
	}

	public void disp() {
		disp(root);
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

		if (node == null) {
			return Integer.MIN_VALUE;
		}
		int max = node.data;
		int t1 = max(node.left);
		int t2 = max(node.right);

		return Math.max(max, Math.max(t1, t2));

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
		}
		boolean l = find(node.left, item);
		if (l) {
			return true;
		}
		boolean r = find(node.right, item);
		if (r) {
			return true;
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

	int ans = 0;

	public int dia1() {
		dia1(root);
		return ans;
	}

	private int dia1(node node) {
		if (node == null) {
			return -1;
		}

		int lh = dia1(node.left);
		int rh = dia1(node.right);
		int p = lh + rh + 2;
		if (p > ans) {
			ans = p;
		}

		return Math.max(lh, rh) + 1;
	}

	public int dia() {
		return dia(root);
	}

	private int dia(node node) {
		if (node == null) {
			return 0;
		}

		int lh = dia(node.left);
		int rh = dia(node.right);
		int sp = height(node.left) + height(node.right) + 2;

		return (int) Math.max(sp, Math.max(lh, rh));
	}

	private class diapair {
		int d = 0;
		int h = -1;
	}

	public int diapair() {
		return diapair(root).d;
	}

	private diapair diapair(node node) {
		if (node == null) {
			return new diapair();
		}

		diapair lh = diapair(node.left);
		diapair rh = diapair(node.right);
		diapair sp = new diapair();
		sp.h = (int) Math.max(lh.h, rh.h) + 1;
		sp.d = (int) Math.max(sp.h + 2, Math.max(lh.d, rh.d));

		return sp;
	}

	public boolean balancetree() {
		return balancetree(root);
	}

	private boolean balancetree(node node) {
		if (node == null) {
			return true;
		}

		boolean lh = balancetree(node.left);
		boolean rh = balancetree(node.right);
		int bf = height(node.left) - height(node.right);

		if ((bf == 0 || bf == 1 || bf == -1) && lh && rh) {
			return true;
		} else {
			return false;
		}
	}

	private class balancepair {
		boolean b = true;
		int h = -1;
	}

	public boolean balancetreepair() {
		return balancetreepair(root).b;
	}

	private balancepair balancetreepair(node node) {
		if (node == null) {
			return new balancepair();
		}

		balancepair lhp = balancetreepair(node.left);
		balancepair rhp = balancetreepair(node.right);

		boolean lh = lhp.b;
		boolean rh = rhp.b;
		balancepair s = new balancepair();
		int bf = lhp.h - rhp.h;

		if ((bf == 0 || bf == 1 || bf == -1) && lh && rh) {
			s.b = true;
		} else {
			s.b = false;
		}

		return s;
	}

	public boolean flipequ(binary_tree n) {
		return flipequ(this.root, n.root);
	}

	private boolean flipequ(node n1, node n2) {
		if (n1 == null && n2 == null) {
			return true;
		}
		if (n1 == null || n2 == null) {
			return false;
		}

		if (n1.data != n2.data) {
			return false;
		}

		boolean o1 = flipequ(n1.left, n2.left);
		boolean o2 = flipequ(n1.right, n2.right);

		boolean o3 = flipequ(n1.left, n2.right);
		boolean o4 = flipequ(n1.right, n2.left);

		return (o1 && o2) || (o3 && o4);
	}

	private class pair {
		node n;
		boolean sd;
		boolean ld;
		boolean rd;
	}

	public void preorderI() {
		Stack<pair> stack = new Stack<>();
		pair nn = new pair();
		nn.n = root;
		stack.push(nn);

		while (!stack.isEmpty()) {

			pair tp = stack.peek();

			if (tp.sd == false) {
				System.out.println(tp.n.data);
				tp.sd = true;
			} else if (tp.ld == false) {
				pair np = new pair();
				np.n = tp.n.left;
				if (np.n != null)
					stack.push(np);
				tp.ld = true;

			} else if (tp.rd == false) {
				pair np = new pair();
				np.n = tp.n.right;
				if (np.n != null)
					stack.push(np);
				tp.rd = true;

			} else {
				stack.pop();
			}

		}

	}

	private class sumpair {
		int maxsubtreesum = Integer.MIN_VALUE;
		int sum = 0;
	}

	public int maxsubtree() {
		return maxsubtree(root).maxsubtreesum;

	}

	private sumpair maxsubtree(node node) {
		if (node == null) {

			return new sumpair();
		}

		sumpair lh = maxsubtree(node.left);
		sumpair rh = maxsubtree(node.right);
		sumpair sh = new sumpair();
		sh.sum = lh.sum + rh.sum + node.data;
		sh.maxsubtreesum = Math.max(sh.sum, Math.max(lh.maxsubtreesum, rh.maxsubtreesum));
		return sh;

	}

	int maxsum = 0;

	public int maxsubtree1() {
		maxsubtree1(root);
		return maxsum;
	}

	private int maxsubtree1(node node) {
		if (node == null) {

			return 0;
		}

		int lh = maxsubtree1(node.left);
		int rh = maxsubtree1(node.right);
		int sh = lh + rh + node.data;
		maxsum = Math.max(maxsum, sh);
		return sh;

	}

	private class bstpair {
		boolean bst = true;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		node islargest;
		int size;
	}

	public boolean istreebst() {

		System.out.println(istreebst(root).islargest.data);
		System.out.println(istreebst(root).size);
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
			sb.islargest = node;
			sb.size = lb.size + rb.size + 1;

		} else {

			sb.bst = false;
			if (lb.size > sb.size) {
				sb.islargest = lb.islargest;
				sb.size = lb.size;
			} else {
				sb.islargest = rb.islargest;
				sb.size = rb.size;
			}

		}

		sb.max = Math.max(node.data, Math.max(lb.max, rb.max));
		sb.min = Math.min(node.data, Math.min(lb.min, rb.min));

		return sb;

	}

	private class vopair implements Comparable<vopair> {
		int val;
		int hlevel;
		int vlevel;

		public vopair(int val, int hlevel, int vlevel) {
			this.val = val;
			this.hlevel = hlevel;
			this.vlevel = vlevel;

		}

		@Override
		public int compareTo(vopair other) {
			return this.hlevel - other.hlevel;
		}

		@Override
		public String toString() {
			return val + "";
		}

	}

	public void vertical_disp() {
		HashMap<Integer, ArrayList<vopair>> map = new HashMap<>();
		vertical_disp(root, map, 0, 0);
		ArrayList<Integer> allkeys = new ArrayList<>(map.keySet());
		Collections.sort(allkeys);
		for (int key : allkeys) {
			ArrayList<vopair> list = map.get(key);
			Collections.sort(list);

			System.out.println(key + "-->" + list);
		}

	}

	private void vertical_disp(node node, HashMap<Integer, ArrayList<vopair>> map, int vl, int hl) {
		if (node == null) {
			return;
		}

		ArrayList<vopair> temp = new ArrayList<>();
		if (!map.containsKey(vl)) {
			map.put(vl, temp);
		}

		vopair np = new vopair(node.data, hl, vl);
		temp.add(np);
		vertical_disp(node.left, map, vl - 1, hl + 1);
		vertical_disp(node.right, map, vl + 1, hl + 1);

	}

}
