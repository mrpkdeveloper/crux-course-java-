/*

AGGRESSIVE COWS
Farmer John has built a new long barn, with N (2 <= N <= 100,000) stalls. The stalls are located along a straight line at positions x1,…,xN (0 <= xi <= 1,000,000,000).

His C (2 <= C <= N) cows don't like this barn layout and become aggressive towards each other once put into a stall. To prevent the cows from hurting each other, FJ wants to assign the cows to the stalls, such that the minimum distance between any two of them is as large as possible. What is the largest minimum distance?


Input Format:
First line contains N and C, separated by a single space, representing the total number of stalls and number of cows respectively. The next line contains N integers containing the indexes of stalls.

Output Format:
Print one integer: the largest minimum distance.

Sample Input:
5 3
1 2 8 4 9
Sample Output:
3
Explanation:
Problem Credits (Spoj)[http://www.spoj.com/problems/AGGRCOW/
*/



package practise;

import java.util.Arrays;
import java.util.Scanner;

public class array_aggresive_cows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int nos = scn.nextInt();
		int noc = scn.nextInt();
		int[] arr = new int[nos];
		for (int j = 0; j < arr.length; j++) {
			arr[j] = scn.nextInt();
		}
		Arrays.sort(arr);
		int lo = 0, fmid = 0,hi= arr[arr.length - 1] - arr[0];
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (possible(arr, noc, mid)) {
				fmid = mid;
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}

		}
		System.out.println(fmid);
	}

	public static boolean possible(int[] arr, int noc, int mid) {
		int cowsPlaced = 1;
		int pos = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] - pos >= mid) {
				cowsPlaced++;
				pos = arr[i];
				
				
				if(cowsPlaced == noc) {
					return true ;
				}
			}

		}

		return false;

	}
}

