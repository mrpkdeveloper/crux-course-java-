package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class hashmapq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaaabbdcceffffffffffaaaaaaaaaaaaaaaaaaa";
		// System.out.println();
		// System.out.println(maxfreqstring(s));
	//	int[] arr = { 2, 12, 9, 10, 16, 5, 3, 20, 25, 1, 8, 6, 11 };
	//	largest_conseutive(arr);
		int[] arr1 = { 1, 2, 3, 1, 2, 6, 5, 3, 2 };
		int[] arr2 = { 11, 21, 3, 1, 2, 6, 5, 3, 2 };
	//	ArrayList<Integer> ans = intersection(arr1, arr2);
	//	System.out.println(ans);
	}

	public static char maxfreqstring(String str) {
		HashMap<Character, Integer> map = new HashMap<>();
		int maxfreq = 0;
		char maxfreqchar = ' ';

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);

			} else {
				map.put(ch, 1);
			}

			if (maxfreq < map.get(ch)) {
				maxfreq = map.get(ch);
				maxfreqchar = ch;
			}

		}
		return maxfreqchar;
	}

	public static ArrayList<Integer> intersection(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> ans = new ArrayList<>();
		for (int i = 0; i < arr1.length; i++) {
			if (map.containsKey(arr1[i])) {
				map.put(arr1[i], map.get(arr1[i]) + 1);
			} else {
				map.put(arr1[i], 1);
			}
		}
		int c = 0;
		for (int j = 0; j < arr2.length; j++) {

			if (map.containsKey(arr2[j])) {
				ans.add(arr2[j]);
				map.put(arr2[j], map.get(arr2[j]) - 1);
				if (map.get(arr2[j]) == 0) {
					map.remove(arr2[j]);
				}
			}

		}

		return ans;

	}

	public static void largest_conseutive(int[] arr) {
		HashMap<Integer, Boolean> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i] - 1)) {
				map.put(arr[i], false);
			} else {
				map.put(arr[i], true);
			}

			if (map.containsKey(arr[i] + 1)) {
				map.put(arr[i] + 1, false);
			}
		}

		int start = 0, max = 0;
		for (int key : map.keySet()) {

			if (map.get(key)) {
				int c = 0;
				while (map.containsKey(key + c)) {
					c++;
				}
				if (max < c) {
					max = c;
					start = key;
				}
			}

		}

		for (int i = 0; i < max; i++) {
			System.out.println(start + i);
		}

	}

}