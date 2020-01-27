/*PAINTER'S PARTITION PROBLEM
Given K painters to paint N boards where each painter takes 1 unit of time to paint 1 unit of boards i.e. if the length of a particular board is 5, it will take 5 units of time to paint the board. Compute the minimum amount of time to paint all the boards.

Note that:

Every painter can paint only contiguous segments of boards.
A board can only be painted by 1 painter at maximum.

Input Format:
First line contains K which is the number of painters. Second line contains N which indicates the number of boards. Third line contains N space separated integers representing the length of each board.

Constraints:
1 <= K <= 10
1 <= N <= 10
1<= Length Of Each Board <= 10^8

Output Format:
Output the minimum time required to paint the board.

Sample Input:
2
2
1 10
Sample Output:
10*/
package practise;

import java.util.Scanner;

public class array_painters_partition {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int nop = scn.nextInt();
		int nob = scn.nextInt();
		int[] arr = new int[nob];
		int hi = 0;
		for (int j = 0; j < arr.length; j++) {
			arr[j] = scn.nextInt();
			hi = hi + arr[j];
		}
		int lo = 0, fmid = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (possible(arr, nop, mid)) {
				fmid = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}

		}
		System.out.println(fmid);
	}

	public static boolean possible(int[] arr, int nop, int mid) {
		int time = 0, p = 1;
		for (int i = 0; i < arr.length;) {
			
			if (time + arr[i] <= mid) {
				time += arr[i];
				i++;
			} else {
				p++;
				time = 0;
			}
			if (p > nop) {
				return false;
			}
		}

		return true;
	}

}
