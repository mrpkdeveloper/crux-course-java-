package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

import linked_list.link_list;

public class graph {

	int numv;
	int[][] mat;

	public graph() {
		this(5);
	}

	public graph(int n) {
		numv = n;
		mat = new int[n + 1][n + 1];
	}

	public void addedge(int u, int v, int c) {
		// directed
		mat[u][v] = c;
		mat[v][u] = c;
	}

	public int removeedge(int u, int v) {
		int temp = mat[u][v];
		mat[u][v] = 0;
		mat[v][u] = 0;
		return temp;
	}

	@Override
	public String toString() {

		for (int i = 1; i <= numv; i++) {
			System.out.print(i + " -> ");
			for (int j = 1; j <= numv; j++) {
				if (mat[i][j] != 0) {
					System.out.print(j + "[" + mat[i][j] + "],");
				}

			}
			System.out.println();
		}

		return "";

	}

	public int numedges() {
		int c = 0;
		for (int i = 1; i <= numv; i++) {
			for (int j = 1; j <= numv; j++) {
				if (mat[i][j] != 0) {
					c++;
				}

			}
		}
		return c / 2;
	}

	public boolean containsedge(int u, int v) {

		if (mat[u][v] != 0) {
			return true;
		}
		return false;
	}

	public boolean haspath(int u, int v) {
		HashMap<Integer, Boolean> map = new HashMap<>();
		return haspath(u, v, map);

	}

	private boolean haspath(int src, int dst, HashMap<Integer, Boolean> map) {

		if (containsedge(src, dst)) {
			return true;
		}

		map.put(src, true);
		for (int nbr = 1; nbr < mat[0].length; nbr++) {

			if (!map.containsKey(nbr) && mat[src][nbr] != 0) {
				boolean ans = haspath(nbr, dst, map);
				if (ans) {
					return true;
				}
			}

		}

		return false;

	}

	public void hasALLpath(int u, int v) {
		HashMap<Integer, Boolean> map = new HashMap<>();
		haspathALL(u, v, map, "");

	}

	private void haspathALL(int src, int dst, HashMap<Integer, Boolean> map, String ans) {

		if (src == dst) {
			System.out.println(ans + dst);
			return;
		}

		map.put(src, true);
		for (int nbr = 1; nbr < mat[0].length; nbr++) {

			if (!map.containsKey(nbr) && mat[src][nbr] != 0) {
				haspathALL(nbr, dst, map, ans + src);
			}

		}
		map.remove(src);
	}

	class pair {
		int data;
		String ans;
		String color;

		pair(int d, String s) {
			data = d;
			ans = s;
		}

		pair(int d, String s, String color) {
			data = d;
			ans = s;
			this.color = color;
		}

	}

//breadth first search 
// this tell shortest path to destination
	public boolean bfs(int src, int dst) {

		LinkedList<pair> q = new LinkedList<>();
		HashMap<Integer, Boolean> map = new HashMap<>();

		pair np = new pair(src, "");
		q.addLast(np);
		while (!q.isEmpty()) {
			// remove from queue
			pair rp = q.removeFirst();

			// check for cycle
			if (map.containsKey(rp.data)) {
				continue;
			}
			// check if edge exist
			if (containsedge(rp.data, dst)) {
				System.out.println(rp.ans + rp.data + dst);
				return true;
			}
			// put in hashmap
			map.put(rp.data, true);

			// put nbr pair
			for (int nbr = 1; nbr <= numv; nbr++) {
				if (mat[rp.data][nbr] != 0 && !map.containsKey(nbr)) {
					q.addLast(new pair(nbr, rp.ans + rp.data));
				}

			}

		}
		return false;
	}

	public void bfT() {

		LinkedList<pair> q = new LinkedList<>();
		HashMap<Integer, Boolean> map = new HashMap<>();

		for (int src = 1; src <= numv; src++) {
			if (map.containsKey(src)) {
				continue;
			}
			pair np = new pair(src, "");
			q.addLast(np);

			while (!q.isEmpty()) {
				// remove from queue
				pair rp = q.removeFirst();

				// check for cycle
				if (map.containsKey(rp.data)) {
					continue;
				}
				// check if edge exist
				System.out.println(rp.ans + rp.data);
				// put in hashmap
				map.put(rp.data, true);

				// put nbr pair
				for (int nbr = 1; nbr <= numv; nbr++) {
					if (mat[rp.data][nbr] != 0 && !map.containsKey(nbr)) {
						q.addLast(new pair(nbr, rp.ans + rp.data));
					}

				}

			}
		}
	}

	public boolean dfs(int src, int dst) {

		LinkedList<pair> q = new LinkedList<>();
		HashMap<Integer, Boolean> map = new HashMap<>();

		pair np = new pair(src, "");
		q.addFirst(np);
		while (!q.isEmpty()) {
			// remove from queue
			pair rp = q.removeFirst();

			// check for cycle
			if (map.containsKey(rp.data)) {
				continue;
			}
			// check if edge exist
			if (containsedge(rp.data, dst)) {
				System.out.println(rp.ans + rp.data + dst);
				return true;
			}
			// put in hashmap
			map.put(rp.data, true);

			// put nbr pair
			for (int nbr = 1; nbr <= numv; nbr++) {
				if (mat[rp.data][nbr] != 0 && !map.containsKey(nbr)) {
					q.addFirst(new pair(nbr, rp.ans + rp.data));
				}

			}

		}
		return false;
	}

	public void dfT() {

		LinkedList<pair> q = new LinkedList<>();
		HashMap<Integer, Boolean> map = new HashMap<>();

		for (int src = 1; src <= numv; src++) {
			if (map.containsKey(src)) {
				continue;
			}
			pair np = new pair(src, "");
			q.addFirst(np);

			while (!q.isEmpty()) {
				// remove from queue
				pair rp = q.removeFirst();

				// check for cycle
				if (map.containsKey(rp.data)) {
					continue;
				}
				// check if edge exist
				System.out.println(rp.ans + rp.data);
				// put in hashmap
				map.put(rp.data, true);

				// put nbr pair
				for (int nbr = 1; nbr <= numv; nbr++) {
					if (mat[rp.data][nbr] != 0 && !map.containsKey(nbr)) {
						q.addFirst(new pair(nbr, rp.ans + rp.data));
					}

				}

			}
		}
	}

	public boolean iscyclic() {
		int count = 0;
		LinkedList<pair> q = new LinkedList<>();
		HashMap<Integer, Boolean> map = new HashMap<>();

		for (int src = 1; src <= numv; src++) {
			if (map.containsKey(src)) {
				continue;
			}
			pair np = new pair(src, "");
			q.addLast(np);

			while (!q.isEmpty()) {
				// remove from queue
				pair rp = q.removeFirst();

				// check for cycle
				if (map.containsKey(rp.data)) {
					count++;
					continue;
				}
				// check if edge exist
				// put in hashmap
				map.put(rp.data, true);

				// put nbr pair
				for (int nbr = 1; nbr <= numv; nbr++) {
					if (mat[rp.data][nbr] != 0 && !map.containsKey(nbr)) {
						q.addLast(new pair(nbr, rp.ans + rp.data));
					}

				}

			}
		}
		if (count > 0) {
			System.out.println(count);
			return true;
		} else {
			return false;
		}

	}

	public boolean isconnected() {

		LinkedList<pair> q = new LinkedList<>();
		HashMap<Integer, Boolean> map = new HashMap<>();
		int c = 0;
		for (int src = 1; src <= numv; src++) {
			if (map.containsKey(src)) {
				continue;
			}
			c++;
			pair np = new pair(src, "");
			q.addLast(np);

			while (!q.isEmpty()) {
				// remove from queue
				pair rp = q.removeFirst();

				// check for cycle
				if (map.containsKey(rp.data)) {
					continue;
				}
				// check if edge exis
				// put in hashmap
				map.put(rp.data, true);

				// put nbr pair
				for (int nbr = 1; nbr <= numv; nbr++) {
					if (mat[rp.data][nbr] != 0 && !map.containsKey(nbr)) {
						q.addLast(new pair(nbr, rp.ans + rp.data));
					}

				}

			}
		}
		return c <= 1;
	}

	public boolean istree() {
		return !iscyclic() && isconnected();

	}

	public void get_conected_comp() {

		LinkedList<pair> q = new LinkedList<>();
		HashMap<Integer, Boolean> map = new HashMap<>();
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		for (int src = 1; src <= numv; src++) {
			ArrayList<Integer> comp = new ArrayList<>();
			if (map.containsKey(src)) {
				continue;
			}
			pair np = new pair(src, "");
			q.addLast(np);

			while (!q.isEmpty()) {
				// remove from queue
				pair rp = q.removeFirst();

				// check for cycle
				if (map.containsKey(rp.data)) {
					continue;
				}
				// check if edge exist
				comp.add(rp.data);
				// put in hashmap
				map.put(rp.data, true);

				// put nbr pair
				for (int nbr = 1; nbr <= numv; nbr++) {
					if (mat[rp.data][nbr] != 0 && !map.containsKey(nbr)) {
						q.addLast(new pair(nbr, rp.ans + rp.data));
					}

				}

			}
			ans.add(comp);
		}
		System.out.println(ans);
	}

//two colourable
	public boolean is_bipertite() {

		LinkedList<pair> q = new LinkedList<>();
		HashMap<Integer, String> map = new HashMap<>();

		for (int src = 1; src <= numv; src++) {
			if (map.containsKey(src)) {
				continue;
			}
			pair np = new pair(src, "");
			q.addLast(np);

			while (!q.isEmpty()) {
				// remove from queue
				pair rp = q.removeFirst();

				// check for cycle
				if (map.containsKey(rp.data)) {
					String oc = map.get(rp.data);
					String nc = rp.color;
					if (!oc.equals(nc)) {
						return false;
					}
					continue;

				}
				// check if edge exist
				// put in hashmap
				map.put(rp.data, rp.color);

				// put nbr pair
				for (int nbr = 1; nbr <= numv; nbr++) {
					if (mat[rp.data][nbr] != 0 && !map.containsKey(nbr)) {
						String newcolor = rp.color == "R" ? "G" : "R";
						q.addLast(new pair(nbr, rp.ans + rp.data, newcolor));
					}

				}

			}
		}

		return true;

	}

}
