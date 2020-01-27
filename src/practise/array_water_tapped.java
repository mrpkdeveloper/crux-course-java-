/*RAIN WATER TRAPPING
You are given an input array whose each element represents the height of a line towers. The width of every tower is 1. It starts raining. Water is filled between the gap of towers if possible. You need to find how much water filled between these given towers.



Input Format:
The first line consists of number of test cases T. Each test case consists an integer N as number of towers and next line contains the N space separated integers.

Constraints:
1 <= N <= 1000000
1 <= t <= 10
0 <= A[i] <= 10000000

Output Format:
Print how much unit of water collected among towers for each test case.

Sample Input:
2
6
3  0  0  2  0  4
12
0  1  0  2  1  0  1  3  2  1  2  1
Sample Output:
10
6*/
package practise;

import java.util.Scanner;

public class array_water_tapped {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for (int i = 0; i < t; i++) {
			int not = scn.nextInt();
			int[] arr = new int[not];
			for (int j = 0; j < arr.length; j++) {
				arr[j] = scn.nextInt();
			}
			int[] rarr = new int[not];
			rarr[rarr.length - 1] = arr[arr.length - 1];
			for (int j = arr.length - 2; j >= 0; j--) {
				rarr[j] = Math.max(rarr[j + 1], arr[j]);
			}
			
			int[] larr = new int[not];
			larr[0] = arr[0];
			for (int j = 1; j<arr.length; j++) {
				larr[j] = Math.max(larr[j - 1], arr[j]);
			}
			
			int fans = 0 ; 
			for(int  k= 0 ; k < arr.length ; k++) {
				fans=fans+Math.min(larr[k], rarr[k])-arr[k];
			}
			System.out.println(fans);
			
			

		}

	}

}
