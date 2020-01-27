package heap;

public class k_largest_element {

	public static void main(String[] args) {
		int[] arr = { 200, 5, 13, 6, 7, 5, 100 };
		klargest(arr, 3);

	}

	public static void klargest(int[] arr, int k) {
		heap heap = new heap();
		for (int i = 0; i < k; i++) {
			heap.add(arr[i]);
		}

		for (int i = k; i < arr.length; i++) {
			int weak = heap.get();
			if (weak < arr[i]) {
				heap.remove();
				heap.add(arr[i]);
			}

		}

		while (!heap.isempty()) {
			System.out.println(heap.remove());
		}
	}

}
