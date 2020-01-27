package practise_after_recursion;

import data_Structures.queue_cicular;

public class importance_of_time {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int[] orig_order = { 5, 2, 1, 4, 3 };
		queue_cicular q = new queue_cicular();
		q.enqueue(5);
		q.enqueue(4);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(1);
		System.out.println(ImpofTime(q, orig_order));

	}

	public static int ImpofTime(queue_cicular q, int[] orig_order) throws Exception {

		int time = 0;
		for (int i = 0; i < orig_order.length;) {
			if (orig_order[i] == q.getfront()) {
				time += 1;
				q.dequeue();
				i++;
			} else {

				while (i < orig_order.length && orig_order[i] != q.getfront()) {

					int temp = q.dequeue();
					q.enqueue(temp);
					time += 1;

				}
				time += 1;
				q.dequeue();
				i++;
			}
		}

		return time;

	}

}
