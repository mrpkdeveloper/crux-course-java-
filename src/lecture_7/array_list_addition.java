package lecture_7;

import java.util.ArrayList;

public class array_list_addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {9,9,9,9};
		int[] arr2 = { 9,9,9 };
		ArrayList<Integer> list = new ArrayList<>();
		int i =arr1.length-1,j=arr2.length-1;
		int carry = 0;
		while(i>=0 || j>=0) {
		int sum = carry;
		if(i>=0) {
			sum=sum+arr1[i];
		}
		
		if(j>=0) {
			sum=sum+arr2[j];
		}
		int rem =sum%10;
		carry=sum/10;
		list.add(0,rem);
		i--;j--;
		}
		if(carry>0)
			list.add(0,carry);
		System.out.print(list);
		
	}

}
