package lecture_9_recursion_2;

import java.util.ArrayList;
import java.util.Scanner;

public class rcursion_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String s = "1123";
		System.out.println(permutation(s));

	}

	public static ArrayList<String> permutation(String s){
		//base case
		if(s.length()==0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		
		char ch = s.charAt(0);
		String ros = s.substring(1);
		// smaller problem
		ArrayList<String> rr = permutation(ros);
		ArrayList<String> mr = new ArrayList<>();
		//self work
		 
		for(String val : rr) {
			for(int i = 0 ; i<=val.length();i++) {
			String ans = val.substring(0,i) + ch + val.substring(i);
			mr.add(ans);
					}
		}
		return mr;
		
	}

}
