package heap;

import interfaces.car;

public class heap_generics_ccl {

	public static void main(String[] args) {
		heap_generics<car> list = new heap_generics<>();
		car[] car = new car[5];
		car[0] = new car(10, 200, "black");
		car[1] = new car(20, 100, "black");
		car[2] = new car(50, 50, "black");
		car[3] = new car(80, 60, "black");
		car[4] = new car(5, 500, "black");

		for (int i = 0; i < 5; i++) {
			list.add(car[i]);
		}

		while (!list.isempty()) {
			System.out.println(list.remove());
		}

	}

}
