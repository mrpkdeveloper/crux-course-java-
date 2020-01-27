package heap;

import java.util.ArrayList;

public class merge_k_sorted_list {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

		lists.add(new ArrayList<>());
		lists.add(new ArrayList<>());
		lists.add(new ArrayList<>());
		lists.add(new ArrayList<>());
		lists.get(0).add(1);
		lists.get(0).add(8);
		lists.get(0).add(9);
		lists.get(0).add(10);
		lists.get(0).add(12);
		
		lists.get(1).add(5);
		lists.get(1).add(15);
		lists.get(1).add(20);
		
		lists.get(2).add(7);
		lists.get(2).add(13);
		lists.get(2).add(25);
		lists.get(2).add(30);
		
		lists.get(3).add(2);
		lists.get(3).add(3);
		System.out.println(merge(lists));

	}

	public static class pair implements Comparable<pair> {

		int data;
		int listno;
		int idxno;

		@Override
		public int compareTo(pair o) {
			return o.data - this.data;
		}

	}

	public static ArrayList<Integer> merge(ArrayList<ArrayList<Integer>> list) {
		ArrayList<Integer> ans = new ArrayList<>();
		heap_generics<pair> heap = new heap_generics<>();
		for (int i = 0; i < list.size(); i++) {
			pair np = new pair();
			np.data = list.get(i).get(0);
			np.idxno = 0;
			np.listno = i;
			heap.add(np);
		}

		while (!heap.isempty()) {
			pair rp = heap.remove();
			ans.add(rp.data);

			rp.idxno++;
			if (rp.idxno < list.get(rp.listno).size()) {
				rp.data = list.get(rp.listno).get(rp.idxno);
				heap.add(rp);
			}
		}

		return ans;

	}

}
