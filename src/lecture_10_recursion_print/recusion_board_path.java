package lecture_10_recursion_print;

import java.util.ArrayList;
import java.util.Scanner;

public class recusion_board_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print(board_path(0,10));
		

	}
	
	public static ArrayList<String> board_path(int cp , int ep){
		
		if(cp==ep) {
		ArrayList<String> br = new ArrayList<>();
		br.add("\n");
		return br;
		}
		ArrayList<String> mr = new ArrayList<>();
		for(int dice = 1 ; dice <= 6 && cp+dice<=ep; dice++) {
			ArrayList<String> rr =board_path(cp+dice,ep);
			
			for(String val : rr) {
				mr.add(dice + val);
			}
		}
		return mr;
		
}

}
