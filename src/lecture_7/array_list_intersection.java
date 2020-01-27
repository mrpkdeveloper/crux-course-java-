package lecture_7;

import java.util.ArrayList;

public class array_list_intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 10, 10, 20, 30, 30, 40, 50, 50, 50, 70 };
		int[] arr2 = { 5, 10,10, 30,50, 50, 80, 90 };
		ArrayList<Integer> list = new ArrayList<>();
		int j = 0, i = 0;
		while (i < arr1.length && j < arr2.length) {

			if (arr1[i] < arr2[j]) {
				i++;
			} else if (arr1[i] > arr2[j]) {
				j++;
			} else {
				list.add(arr1[i]);
				i++;
				j++;
			}
		}

		System.out.println(list);

	}

}
