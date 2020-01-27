package lecture_9_recursion_2;

import java.util.ArrayList;
import java.util.Scanner;

public class recursion_maize_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print(maze_path(0,0,2,2));

	}

	public static ArrayList<String> maze_path(int cr, int cc, int fr, int fc) {
		if (cr == fr && cc == fc) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
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

		return mr;

	}

}
