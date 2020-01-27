package backtracking;

public class coin_change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 5, 6 };
		int amt = 10;
		coin_change(arr,amt,0,"");
	}

	public static void coin_change(int[] arr, int amt, int last, String ans) {
		if (amt == 0) {
			System.out.println(ans);
			return;
		}

		if (amt < 0) {
			return;
		}

		for (int i = last; i < arr.length; i++) {
			coin_change(arr, amt - arr[i], i, ans + arr[i]);
		}
	}

}
