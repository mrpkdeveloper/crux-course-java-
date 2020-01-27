package interfaces;

import java.util.Comparator;

public class demoo {

	public static void main(String[] args) {

		car[] car = new car[5];
		car[0] = new car(10, 200, "black");
		car[1] = new car(20, 100, "black");
		car[2] = new car(50, 50, "black");
		car[3] = new car(80, 60, "black");
		car[4] = new car(5, 500, "black");

		bubble_sort(car, new carspeedcomparator());
		display(car);
		System.out.println();
		System.out.println();
		bubble_sort(car, new carpricecomparator());
		display(car);		
		

	}

	public static <t> void display(t[] arr) {
		for (t val : arr) {
			System.out.println(val);
		}
	}

	public static <t> void bubble_sort(t[] arr, Comparator<t> comp) {
		int n = arr.length;
		for (int c = 0; c <= n - 2; c++) {
			for (int j = 0; j <= n - c - 2; j++) {
				if (comp.compare(arr[j], arr[j + 1]) > 1) {
					t temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

}
