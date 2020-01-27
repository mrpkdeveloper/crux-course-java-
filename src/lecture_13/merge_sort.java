package lecture_13;

public class merge_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 90, 80, 70, 60, 560, 2 };
		int[] arr1 = { 1,2,3,7,8 };
		int[] arr2 = { 4,5,6,9};
	//	int[] ans =mergeTwoArray(arr1, arr2);
		
	int[] ans = merge_sort(arr, 0 ,arr.length-1);
		
		for(int val : ans) {
			System.out.println(val);
		}
		
		

	}

	public static int[] mergeTwoArray(int[] arr1, int[] arr2) {

		int i = 0, j = 0, k = 0;
		int[] ans = new int[arr1.length + arr2.length];
		for (; i < arr1.length && j <arr2.length;) {
			if (arr1[i] < arr2[j]) {
				ans[k] = arr1[i];
				i++;
				k++;

			} else {
				ans[k] = arr2[j];
				j++;
				k++;
			}
					
			
		}
		if (i == arr1.length) {
			for (; j < arr2.length; j++) {
				ans[k] = arr2[j];
				k++;
			}
		}

		if (j == arr2.length) {
			for (; i < arr1.length; i++) {
				ans[k] = arr1[i];
				k++;
			}
		}



		return ans;
	}

	public static int[] merge_sort(int[] arr, int lo, int hi) {
		if (lo == hi) {
			int[] br = new int[1];
			br[0] = arr[lo];
			return br;
		}

		int mid = (lo + hi) / 2;

		int[] fh = merge_sort(arr, lo, mid);
		int[] sh = merge_sort(arr, mid + 1, hi);

		// self work
		int[] ans = mergeTwoArray(fh, sh);
		return ans;
	}

}
