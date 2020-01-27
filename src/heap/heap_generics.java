package heap;

import java.util.ArrayList;

public class heap_generics<t extends Comparable<t>> {
	private ArrayList<t> data = new ArrayList<>();

	public int size() {
		return data.size();
	}

	public boolean isempty() {
		return data.size() == 0;
	}

	public void display() {
		System.out.println(data);
	}

	public void add(t item) {
		data.add(item);
		upheapfy(data.size() - 1);
	}

	private void upheapfy(int i) {

		int ci = i;
		int pi = (ci - 1) / 2;

		if (data.get(ci).compareTo(data.get(pi))>0) {
			swap(ci, pi);
			upheapfy(pi);
		}

	}

	private void swap(int ci, int pi) {

		t ith = data.get(ci);
		t pth = data.get(pi);
		data.set(ci, pth);
		data.set(pi, ith);

	}

	public t remove() {
		t temp = data.get(0);
		swap(0, data.size() - 1);
		data.remove(data.size() - 1);
		downheapfy(0);
		return temp;

	}

	private void downheapfy(int pi) {
		int mini = pi;
		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;

		if (lci < data.size() && data.get(lci).compareTo(data.get(mini))>0) {
			mini = lci;
		}

		if (rci < data.size() && data.get(rci).compareTo(data.get(mini))>0) {
			mini = rci;
		}

		if (mini != pi) {
			swap(pi, mini);
			downheapfy(mini);
		}

	}

	public t get() {
		return data.get(0);
	}

}
