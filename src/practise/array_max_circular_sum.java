/*MAXIMUM CIRCULAR SUM
You are provided n numbers (both +ve and -ve). Numbers are arranged in a circular form. You need to find the maximum sum of consecutive number.


Input Format:
First line contains integer t which is number of test case. For each test case, it contains an integer n which is the size of numbers and next line contains n space separated integers.

Constraints:
1<=t<=100
1<=n<=1000

Output Format:
Print the maximum sum.

Sample Input:
1
7
8 -8 9 -9 10 -11 12
Sample Output:
22
Explanation:
Maximum Sum = 22 (12 + 8 - 8 + 9 - 9 + 10)*/

package practise;

import java.util.Scanner;

public class array_max_circular_sum {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for (int k = 0; k < t; k++) {
			int n = scn.nextInt();
			int[] arr = new int[n];
			for (int j = 0; j < arr.length; j++) {
				arr[j] = scn.nextInt();
			}
			int fans = 0;

			for (int si = 0; si < arr.length; si++) {

				int sum = 0;

				for (int ei = 0; ei < arr.length; ei++) {

					int i = (si + ei) % arr.length;
					System.out.print(arr[i] + " ");
					sum += arr[i];
					

					if (sum > fans) {
						fans = sum;
					}

				}
				System.out.println("  " + fans);

			}

			System.out.println(fans);
		}

	}
}
