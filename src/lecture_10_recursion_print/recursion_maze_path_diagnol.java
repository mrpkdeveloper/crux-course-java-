package lecture_10_recursion_print;

import java.util.ArrayList;
import java.util.Scanner;

public class recursion_maze_path_diagnol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print(maze_path(0,0,2,2));

	}

	public static ArrayList<String> maze_path(int cr, int cc, int fr, int fc) {
		if (cr == fr && cc == fc) {
			ArrayList<String> br = new ArrayList<>();
			br.add("\n");
			return br;
		}

		ArrayList<String> mr = new ArrayList<>();
		if (cr+1 <= fr) {
			ArrayList<String> hr = maze_path(cr + 1, cc, fr, fc);
			// self work
			for (String val : hr) {
				mr.add("H" + val);
			}
		} if (cc+1 <= fc) {
			ArrayList<String> vr = maze_path(cr, cc + 1, fr, fc);
			// self work
			for (String val : vr) {
				mr.add("V" + val);
			}
		}
		if(cc+1<=fc && cr+1<=fr) {
			ArrayList<String> dr = maze_path(cr + 1, cc+1, fr, fc);
			// self work
			for (String val : dr) {
				mr.add("D" + val);
			}
		}
		
		

		return mr;

		
		

	}

}
