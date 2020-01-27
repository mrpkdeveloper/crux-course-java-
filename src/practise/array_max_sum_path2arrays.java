/*MAXIMUM SUM PATH IN TWO ARRAYS
You are provided two sorted arrays. You need to find the maximum length of bitonic subsequence. You need to find the sum of the maximum sum path to reach from beginning of any array to end of any of the two arrays. You can switch from one array to another array only at common elements.


Input Format:
First line contains integer t which is number of test case. For each test case, it contains two integers n and m which is the size of arrays and next two lines contains n and m space separated integers respectively.

Constraints:
1<=t<=100
1<=n,m<=100000

Output Format:
Print the maximum path.

Sample Input:
1
8 8
2 3 7 10 12 15 30 34
1 5 7 8 10 15 16 19
Sample Output:
122
Explanation:
122 is sum of 1, 5, 7, 8, 10, 12, 15, 30, 34

*/
package practise;

import java.util.Scanner;

public class array_max_sum_path2arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for (int k = 0; k < t; k++) {
			int n = scn.nextInt();
			int m = scn.nextInt();
			int[] arr1 = new int[n];
			for (int j = 0; j < arr1.length; j++) {
				arr1[j] = scn.nextInt();
			}
			int[] arr2 = new int[m];
			for (int j = 0; j < arr2.length; j++) {
				arr2[j] = scn.nextInt();
			}
			int s1 = 0, s2 = 0, fans = 0, i = 0, j = 0;

			while (i < arr1.length && j < arr2.length) {
				if (arr1[i] > arr2[j]) {
					s2 += arr2[j];
					j++;
				} else if (arr1[i] < arr2[j]) {
					s1 += arr1[i];
					i++;
				} else {
					fans += Math.max(s1, s2) + arr1[i];
					i++;
					j++;
					s1=0;
					s2=0;
				}

			}

			if (i == arr1.length) {
				while (j < arr2.length) {
					s2 += arr2[j];
					j++;
				}
			}

			if (j == arr2.length) {
				while (i < arr1.length) {
					s1 += arr1[i];
					i++;
				}

			}
			fans += Math.max(s1, s2);
			System.out.println(fans);
		}

	}

}
