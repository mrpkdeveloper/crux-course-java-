package lecture_9_recursion_2;

import java.util.Scanner;
import java.util.ArrayList;

public class recusion_coin_toss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
	//	int n = scn.nextInt();
		System.out.println(toss(2));
		
	}
	
	public static ArrayList<String> toss(int n) {
		// base case
		if (n == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		
		ArrayList<String> rr = toss(n-1);
		ArrayList<String> mr = new ArrayList<>();
		//self work
		for(String val : rr) {
			mr.add("H"+val);
			mr.add("T"+val);
			
		}
		return mr;



}
}