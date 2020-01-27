package lecture_3;

import java.util.Scanner;

public class temp_conv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int step = scn.nextInt();
		int maxf = scn.nextInt();
		int minf = scn.nextInt();
		
		int temp=minf;
		while(temp<=maxf)
		{
			int c = (int)((5.0/9)*(temp-32));
			temp=temp+step;
			System.out.println(temp + "\t" + c);
		}
	}

}
