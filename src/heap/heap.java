package heap;

import java.util.ArrayList;

public class heap {

	private ArrayList<Integer> data = new ArrayList<>();

	public int size() {
		return data.size();
	}

	public boolean isempty() {
		return data.size() == 0;
	}

	public void display() {
		System.out.println(data);
	}

	public void add(int item) {
		data.add(item);
		upheapfy(data.size() - 1);
	}

	private void upheapfy(int i) {

		int ci = i;
		int pi = (ci - 1) / 2;

		if (data.get(ci) < data.get(pi)) {
			swap(ci, pi);
			upheapfy(pi);
		}

	}

	private void swap(int ci, int pi) {

		int ith = data.get(ci);
		int pth = data.get(pi);
		data.set(ci, pth);
		data.set(pi, ith);

	}

	public int remove() {
		int temp = data.get(0);
		swap(0, data.size() - 1);
		data.remove(data.size() - 1);
		downheapfy(0);
		return temp;

	}

	private void downheapfy(int pi) {
		int mini = pi;
		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;

		if (lci < data.size() && data.get(mini) > data.get(lci)) {
			mini = lci;
		}

		if (rci < data.size() && data.get(mini) > data.get(rci)) {
			mini = rci;
		}

		if (mini != pi) {
			swap(pi, mini);
			downheapfy(mini);
		}

	}

	public int get() {
		return data.get(0);
	}

}
