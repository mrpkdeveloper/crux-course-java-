package lecture_9_recursion_2;

import java.util.ArrayList;
import java.util.Scanner;

public class recursion_subsequence_ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String s  = "1123";
		System.out.println(gss(s));

	}
	
	
	public static ArrayList<String> gss(String s){
		//base case
		if(s.length()==0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("\n");
			return br;
		}
		
		char ch = s.charAt(0);
		String ros = s.substring(1);
		// smaller problem
		ArrayList<String> rr = gss(ros);
		ArrayList<String> mr = new ArrayList<>();
		//self work
		for(String val : rr) {
			mr.add(val);
			mr.add(ch+val);
	//		mr.add((int)ch+val);
		}
		return mr;
		
	}

}
