package practise_after_recursion;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class plyaing_with_cards_stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int q = scn.nextInt();
		ArrayList<Stack<Integer>> A = new ArrayList<>();
		ArrayList<Stack<Integer>> B = new ArrayList<>();
		Stack<Integer> temp = new Stack<>();
		for (int i = 0; i < n; i++) {
			temp.add(scn.nextInt());
		}
		A.add(temp);
		playingwithcards(A, q, B);

	}

	public static void playingwithcards(ArrayList<Stack<Integer>> A, int q, ArrayList<Stack<Integer>> B) {
		for (int i = 1; i <= q; i++) {

			Stack temp = A.get(i - 1);
			Stack<Integer> tempb = new Stack<>();
			Stack<Integer> tempa = new Stack<>();
			B.add(tempb);
			A.add(tempa);

			while (temp.size() != 0) {
				int cno = (int) temp.pop();
				if (cno % ithprime(i) == 0) {
					tempb.push(cno);
				} else {
					tempa.push(cno);
				}
			}
		}

		for (int i = 0; i < q; i++) {
			Stack temp = B.get(i);
			while (temp.size() != 0) {
				System.out.println(temp.pop());
			}

		}

		Stack temp = A.get(q);
		while (temp.size() != 0) {
			System.out.println(temp.pop());
		}

	}

	public static int ithprime(int i) {
		int c = 0;
		int n = 2;
		while (c != i) {
			if (isprime(n)) {
				c++;
			}
			n++;
		}
		return n - 1;
	}

	public static boolean isprime(int n) {
		int i = 2;
		while (i * i <= n) {
			if (n % i == 0) {
				return false;
			}

			i++;
		}
		return true;
	}

}
